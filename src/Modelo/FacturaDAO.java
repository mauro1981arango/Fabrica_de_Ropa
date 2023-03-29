package Modelo;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class FacturaDAO {

   Conexion con = new Conexion();
   Connection cn;
   PreparedStatement ps;
   ResultSet rs;
   int respuesta = 0;


   public String idFactura() {
      String idv = "";
      String sql = "SELECT max(IdFactura) FROM factura";
      try {
         cn = Conexion.getConexion();
         ps = cn.prepareStatement(sql);
         rs = ps.executeQuery();
         while (rs.next()) {
            idv = rs.getString(1);
         }
      } catch (SQLException ex) {
         JOptionPane.showMessageDialog(null, ex);
      }
      return idv;
   }

   public int GuardarFactura(Factura fac) {
      
      String sql = "INSERT INTO factura(Fecha, IdCliente, IdUsuario, NroFactura, MontoPago, MontoCambio, Total) VALUES (?,?,?,?,?,?,?)";
      try {

         cn = Conexion.getConexion();
         ps = cn.prepareStatement(sql);
         ps.setString(1, fac.getFecha());
         ps.setInt(2, fac.getIdCliente());
         ps.setInt(3, fac.getIdUsuario());
         ps.setString(4, fac.getNroFactura());
         ps.setDouble(5, fac.getMontoPago());
         ps.setDouble(6, fac.getMontoCambio());
         ps.setDouble(7, fac.getTotal());
         respuesta = ps.executeUpdate();
      } catch (SQLException ex) {
         java.util.logging.Logger.getLogger(FacturaDAO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
      }
      return respuesta;
   }

   public int GuardarDetalleFactura(DetalleFactura df) {
      DetalleFactura dfactura = new DetalleFactura();
      String sql = "INSERT INTO detalle_factura(IdFactura, IdProducto, PrecioVenta, Cantidad, SubTotal) VALUES (?,?,?,?,?)";
      try {
         cn = Conexion.getConexion();
         ps = cn.prepareStatement(sql);
         ps.setInt(1, df.getIdFactura());
         ps.setInt(2, df.getIdProducto());
         ps.setDouble(3, df.getPrecioVenta());
         ps.setInt(4, df.getCantidad());
         ps.setDouble(5, df.getSubTotal());
         respuesta = ps.executeUpdate();
      } catch (SQLException e) {
         System.err.println("Datos no  guardados " + e);
      }
      return respuesta;
   }
   
}
