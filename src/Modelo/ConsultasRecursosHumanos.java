package Modelo;

import static Modelo.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class ConsultasRecursosHumanos extends Conexion {
   //Creamos el método registrar

   PreparedStatement ps = null;
   ResultSet rs;

   public boolean Registrar(RecursosHumanos rh) {

      Connection con = getConexion();
      String sql = "INSERT INTO `recursos_humanos`(`Cedula`, `Nombres`, `Apellidos`, `FechaNacimiento`, `IdRH`, `Telefono`, `Direccion`, `Correo`, `IdSalario`, `IdCuenta`, `NroCuenta`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
      try {
         ps = con.prepareStatement(sql);
         ps.setInt(1, rh.getCedula());
         ps.setString(2, rh.getNombres());
         ps.setString(3, rh.getApellidos());
         SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
         String fechanacimiento = formatoFecha.format(rh.getFechaNacimiento());
         ps.setString(4, fechanacimiento);
         ps.setInt(5, rh.getIdRH());
         ps.setString(6, rh.getTelefono());
         ps.setString(7, rh.getDireccion());
         ps.setString(8, rh.getCorreo());
         ps.setInt(9, rh.getIdSalario());
         ps.setInt(10, rh.getIdCuenta());
         ps.setString(11, rh.getNroCuenta());
         int resultado = ps.executeUpdate();
         return resultado > 0;

      } catch (SQLException e) {
         System.err.println("Datos no guardados" + e);

      } finally {
         try {
            con.close();
         } catch (SQLException e) {
            System.err.println("Conexion cerrada" + e);
         }
      }
      return false;
   }

   public boolean Modificar(RecursosHumanos rh) {
      PreparedStatement ps = null;
      Connection con = getConexion();
      String sql = "UPDATE recursos_humanos SET Cedula=?, Nombres=?, Apellidos=?, FechaNacimiento=?, IdRH=?, Telefono=?, Direccion=?, Correo=?, IdSalario=?, IdCuenta=?, NroCuenta=? WHERE IdRhumanos=?";
      try {
         ps = con.prepareStatement(sql);
         ps.setInt(1, rh.getCedula());
         ps.setString(2, rh.getNombres());
         ps.setString(3, rh.getApellidos());
         SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
         String fechanacimiento = formatoFecha.format(rh.getFechaNacimiento());
         ps.setString(4, fechanacimiento);
         ps.setInt(5, rh.getIdRH());
         ps.setString(6, rh.getTelefono());
         ps.setString(7, rh.getDireccion());
         ps.setString(8, rh.getCorreo());
         ps.setInt(9, rh.getIdSalario());
         ps.setInt(10, rh.getIdCuenta());
         ps.setString(11, rh.getNroCuenta());
         ps.setInt(12, rh.getIdRhumanos());
         int resultado = ps.executeUpdate();
         return resultado > 0;

      } catch (SQLException e) {
         System.err.println("No se pudo actualizar! " + e.toString());
         return false;
      } finally {
         try {
            con.close();
         } catch (SQLException e) {
            System.err.println("Conexion cerrada " + e);
         }
      }

   }

   public boolean Eiminar(RecursosHumanos rh) {
      PreparedStatement ps = null;
      Connection con = getConexion();
      String sql = "DELETE FROM recursos_humanos  WHERE IdRhumanos=?";
      try {
         ps = con.prepareStatement(sql);
         ps.setInt(1, rh.getIdRhumanos());
         ps.execute();
         return true;

      } catch (SQLException e) {
         System.err.println("Registro eliminado" + e);
         return false;
      } finally {
         try {
            con.close();
         } catch (SQLException e) {
            System.err.println("Error al eliminar " + e);
         }
      }

   }

   public boolean Buscar(RecursosHumanos rh) {
      PreparedStatement ps = null;
      ResultSet rs = null;
      Connection con = getConexion();

      String sql = "SELECT * FROM recursos_humanos WHERE Cedula=?";
      try {
         ps = con.prepareStatement(sql);
         ps.setInt(1, rh.getCedula());
         rs = ps.executeQuery();

         if (rs.next()) {
            rh.setIdRhumanos(Integer.parseInt(rs.getString("IdRhumanos")));
            rh.setCedula(Integer.parseInt(rs.getString("Cedula")));
            rh.setNombres(rs.getString("Nombres"));
            rh.setApellidos(rs.getString("Apellidos"));
            rh.setFechaNacimiento(rs.getDate("FechaNacimiento"));
            rh.setIdRH(Integer.parseInt(rs.getString("IdRH")));
            rh.setTelefono(rs.getString("Telefono"));
            rh.setDireccion(rs.getString("Direccion"));
            rh.setCorreo(rs.getString("Correo"));
            rh.setIdSalario(Integer.parseInt(rs.getString("IdSalario")));
            rh.setIdCuenta(Integer.parseInt(rs.getString("IdCuenta")));
            rh.setNroCuenta(rs.getString("NroCuenta"));
            return true;
         }
      } catch (SQLException e) {
         System.err.println("No se encontró ningún resultado" + e);
         return false;
      } finally {
         try {
            con.close();
         } catch (SQLException e) {
            System.err.println("" + e);
         }
      }
      return false;

   }

}
