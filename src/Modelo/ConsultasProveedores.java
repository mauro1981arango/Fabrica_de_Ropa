package Modelo;

import java.sql.*;

public class ConsultasProveedores extends Conexion {

   PreparedStatement ps = null;
   ResultSet rs;

   public boolean Registrar(Proveedores prov) {

      Connection con = getConexion();
      String sql = "INSERT INTO proveedores(NitProveedor, NombreEmpresa, Direccion, Correo, Telefono, IdCiudad, CuentaBancaria, IdCuenta) VALUES (?,?,?,?,?,?,?,?)";
      try {
         ps = con.prepareStatement(sql);

         ps.setString(1, prov.getNitProveedor());
         ps.setString(2, prov.getNombreEmpresa());
         ps.setString(3, prov.getDireccion());
         ps.setString(4, prov.getCorreo());
         ps.setString(5, prov.getTelefono());
         ps.setInt(6, prov.getIdCiudad());
         ps.setString(7, prov.getCuentaBancaria());
         ps.setInt(8, prov.getIdCuenta());
         int resultado = ps.executeUpdate();
         return resultado > 0;

      } catch (SQLException e) {
         System.err.println("Datos no  guardados" + e);
         return false;
      } finally {
         try {
            con.close();
         } catch (SQLException e) {
            System.err.println("Conexion cerrada" + e);
         }
      }

   }

   public boolean Modificar(Proveedores prov) {
      PreparedStatement ps = null;
      Connection con = getConexion();
      String sql = "UPDATE proveedores SET NitProveedor=?, NombreEmpresa=?, Direccion=?, Correo=?, Telefono=?,IdCiudad=?, CuentaBancaria=?, IdCuenta=? WHERE  IdProveedor=?";
      try {
         ps = con.prepareStatement(sql);
         ps.setString(1, prov.getNitProveedor());
         ps.setString(2, prov.getNombreEmpresa());
         ps.setString(3, prov.getDireccion());
         ps.setString(4, prov.getCorreo());
         ps.setString(5, prov.getTelefono());
         ps.setInt(6, prov.getIdCiudad());
         ps.setString(7, prov.getCuentaBancaria());
         ps.setInt(8, prov.getIdCuenta());
         ps.setInt(9, prov.getIdProveedor());

         int resultado = ps.executeUpdate();
         return resultado > 0;

      } catch (SQLException e) {
         System.err.println("Datos no actualizados" + e);
         return false;
      } finally {
         try {
            con.close();
         } catch (SQLException e) {
            System.err.println("Conexion no cerrada" + e);
         }
      }

   }

   public boolean Eliminar(Proveedores prov) {
      PreparedStatement ps = null;
      Connection con = getConexion();
      String sql = "DELETE FROM proveedores WHERE IdProveedor=?";
      try {
         ps = con.prepareStatement(sql);
         ps.setInt(1, prov.getIdProveedor());
         ps.execute();
         return true;

      } catch (SQLException e) {
         System.err.println("Datos no  guardados" + e);
         return false;
      } finally {
         try {
            con.close();
         } catch (SQLException e) {
            System.err.println("Conexion no cerrada" + e);
         }
      }
   }

   public boolean Buscar(Proveedores prov) {
      PreparedStatement ps = null;
      ResultSet rs = null;
      Connection con = getConexion();
      String sql = "SELECT * FROM proveedores WHERE NombreEmpresa=?";
      try {
         ps = con.prepareStatement(sql);
         ps.setString(1, prov.getNombreEmpresa());
         rs = ps.executeQuery();
         if (rs.next()) {
            prov.setIdProveedor(Integer.parseInt(rs.getString("IdProveedor")));
            prov.setNitProveedor(rs.getString("NitProveedor"));
            prov.setNombreEmpresa(rs.getString("NombreEmpresa"));
            prov.setDireccion(rs.getString("Direccion"));
            prov.setCorreo(rs.getString("Correo"));
            prov.setTelefono(rs.getString("Telefono"));
            prov.setIdCiudad(Integer.parseInt(rs.getString("IdCiudad")));
            prov.setCuentaBancaria(rs.getString("CuentaBancaria"));
            prov.setIdCuenta(Integer.parseInt(rs.getString("IdCuenta")));
            return true;
         }
      } catch (SQLException e) {
         System.err.println("Datos no  encontrados" + e);
         return false;
      } finally {
         try {
            con.close();
         } catch (SQLException e) {
            System.err.println("Conexion no cerrada" + e);
         }
      }
      return false;

   }
}
