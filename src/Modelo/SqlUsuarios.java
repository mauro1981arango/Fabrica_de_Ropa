package Modelo;

import static Modelo.Conexion.getConexion;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SqlUsuarios extends Conexion {

    public boolean registrar(Usuarios usr) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO usuarios(Nombre, Usuario, Contraseña, Correo, IdTipo) VALUES (?,?,?,?,?)";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, usr.getNombre());
            ps.setString(2, usr.getUsuario());
            ps.setString(3, usr.getContraseña());
            ps.setString(4, usr.getCorreo());
            ps.setInt(5, usr.getIdTipo());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Modelo.SqlUsuarios.registrar()" + e);
        }
        return false;
    }

    //Método para validar si un usuario ya está registrado en la base de datos.
    public int existeUsuario(String Usuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT count(IdUsuario) FROM usuarios WHERE Usuario";

        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, Usuario);
            rs = ps.executeQuery();
            //Con un if verificamos si la consulta nos está trayendo datos.
            if (rs.next()) {
                return rs.getInt(1);
            }
            return 1;
        } catch (SQLException e) {
            System.out.println("Modelo.SqlUsuarios.registrar()" + e);
        }
        return 1;
    }
     //Validar que el campo correo electrónico sea el formato correcto
    public boolean esEmail(String correo){
     Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
     
      Matcher mather = pattern.matcher(correo);
       return mather.find();
       
    }
   public ArrayList<Usuarios> getUsuarios(){
        Statement stm = null;
        ResultSet rs = null;
        Connection con = getConexion();
        ArrayList<Usuarios> listaUsuarios = new ArrayList<>();
        try {
            stm = con.createStatement();
            rs = stm.executeQuery("SELECT * FROM usuarios");
            while (rs.next()) {
                Usuarios usuarios = new Usuarios();
                usuarios.setIdUsuario(rs.getInt("IdUsuario"));
                usuarios.setNombre(rs.getString("Nombre"));
                usuarios.setContraseña(rs.getString("Contraseña"));
                usuarios.setCorreo(rs.getString("Correo"));
                usuarios.setIdTipo(rs.getInt("IdTipo"));
                listaUsuarios.add(usuarios);
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SqlUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaUsuarios;
    
    }
   
}
