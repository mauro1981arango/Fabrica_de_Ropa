package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class mLogin extends Conexion {

    
    private int IdUsuario;
    private String Nombre;
    private String Usuario;
    private String Contraseña;
    private String Correo;
    private int IdTipo;

    public mLogin() {
    }

    public mLogin(int IdUsuario, String Nombre, String Usuario, String Contraseña, String Correo, int IdTipo) {
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

    public Connection getCon() {
        return con;
    }

    public void setCon(Connection con) {
        this.con = con;
    }
    

    public boolean ingresar() {
        mLogin lg = new mLogin();
        try {

            Connection cnn = getConexion();
            String sql = "SELECT IdUsuario, Nombre, Usuario, Contraseña, Correo, IdTipo FROM usuarios WHERE Usuario=? and Contraseña=?";
            PreparedStatement ps = cnn.prepareStatement(sql);
            ps.setString(1, this.Usuario);
            ps.setString(2, this.Contraseña);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                //return true;
                lg.setIdUsuario(rs.getInt("IdUsuario"));
                lg.setNombre(rs.getString("Nombre"));
                lg.setUsuario(rs.getString("Usuario"));
                lg.setContraseña(rs.getString("Contraseña"));
                lg.setCorreo(rs.getString("Correo"));
                lg.setIdTipo(rs.getInt("IdTipo"));
                return true;
            }

        } catch (SQLException ex) {
            Logger.getLogger(mLogin.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
}
