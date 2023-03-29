package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Usuarios {

    private int IdUsuario;
    private String Nombre;
    private String Usuario;
    private String Contraseña;
    private String Correo;
    private int IdTipo;
    
    public Usuarios() {
    }


    public Usuarios(int IdUsuario, String Nombre, String Usuario, String Contraseña, String Correo, int IdTipo) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.Correo = Correo;
        this.IdTipo = IdTipo;
    }
    
    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getIdTipo() {
        return IdTipo;
    }

    public void setIdTipo(int IdTipo) {
        this.IdTipo = IdTipo;
    }

    
    public Usuarios(int IdUsuario, String Nombre) {
        this.IdUsuario = IdUsuario;
        this.Nombre = Nombre;
    }

    public Usuarios(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    
    @Override
    public String toString() {
        return Nombre + "  " ;
    }
    
    public ArrayList<Usuarios> getUsuarios(){
        Connection con = Conexion.getConexion();
        Statement stm;
        ResultSet result;
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        try {
            stm = con.createStatement();
            result = stm.executeQuery("SELECT * FROM usuarios");
            while(result.next() ){
                Usuarios usuarios = new Usuarios();
                usuarios.setIdUsuario(result.getInt("IdUsuario"));
                usuarios.setNombre(result.getString("Nombre"));
                usuarios.setUsuario(result.getString("Usuario"));
                usuarios.setContraseña(result.getString("Contraseña"));
                usuarios.setCorreo(result.getString("Correo"));
                usuarios.setIdTipo(result.getInt("IdTipo"));
                listaUsuarios.add(usuarios);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsuarios;
    }
}
