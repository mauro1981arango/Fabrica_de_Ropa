package Modelo;

import Vista.frmFactura;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

public class RopaTerminadaDAO {
   int r;
   Conexion con = new Conexion();
   PreparedStatement ps;
   ResultSet rs ;

   public DefaultTableModel getProductos() {
      DefaultTableModel tabla_productos = new DefaultTableModel();
      try {
         Connection cn = con.getConexion();
         String sql = "SELECT * FROM ropa_terminada";
         ps = cn.prepareStatement(sql);
         rs = ps.executeQuery();
         tabla_productos.addColumn("Id");
         tabla_productos.addColumn("Código");
         tabla_productos.addColumn("Descripcion");
         tabla_productos.addColumn("Talla");
         tabla_productos.addColumn("Color");
         tabla_productos.addColumn("Stock");
         tabla_productos.addColumn("Precio Elaboracion");
         tabla_productos.addColumn("Precio Venta");
         while (rs.next()) {
            //Crearemos una variable de tipo for para ir agregando los resultados de la consulta.
            //El modelo de la tabla va requerir de objetos Object.
            Object[] ropa_terminada = {rs.getInt("IdProducto"), rs.getString("Codigo"), rs.getString("Descripcion"), rs.getString("Talla"), rs.getString("Color"), rs.getInt("Stock"), rs.getDouble("PrecioElaboracion"), rs.getDouble("PrecioVenta")};
            tabla_productos.addRow(ropa_terminada);
         }
      } catch (SQLException e) {
         System.err.println(e.toString());
      }
      return tabla_productos;
   }

   public List<String[]> CargarComboBox_referencias_ropa() {
      List<String[]> lista = new ArrayList();
      try {
         //Metodo cargar ComboBox cbxMes desde la tabla referencias_ropa.
         Connection con = Conexion.getConexion();
         PreparedStatement preparacion = con.prepareStatement("SELECT * FROM referencias_ropa");
         ResultSet resultado = preparacion.executeQuery();
         while (resultado.next()) {
            String[] referencias = new String[1];
            referencias[0] = resultado.getString("IdCodigo");
            lista.add(referencias);
         }
      } catch (SQLException e) {
         System.out.println("e");
      }
      return lista;
   }

   public RopaTerminada listarID(int Id) {
      
      RopaTerminada pro = new RopaTerminada();
      String sql = "SELECT * FROM ropa_terminada WHERE IdProducto=?";
      try {
         Connection con = Conexion.getConexion();
         ps = con.prepareStatement(sql);
         ps.setInt(1, Id);
         rs = ps.executeQuery();
         while (rs.next()) {
            pro.setIdProducto(rs.getInt("IdProducto"));
            pro.setCodigo(rs.getString("Codigo"));
            pro.setDescripcion(rs.getString("Descripcion"));
            pro.setTalla(rs.getString("Talla"));
            pro.setColor(rs.getString("Color"));
            pro.setStock(rs.getInt("Stock"));
            pro.setPrecioElaboracion(rs.getDouble("PrecioElaboracion"));
            pro.setPrecioVenta(rs.getDouble("PrecioVenta"));
         }
      } catch (SQLException ex) {
         //JOptionPane.showMessageDialog(null, "No se encontró producto");
         Logger.getLogger(frmFactura.class.getName()).log(Level.SEVERE, null, ex);
      }
      return pro;
   }
   public boolean actualizarStock(int cant, String Codigo){
      String sql = "UPDATE ropa_terminada SET Stock=? WHERE Codigo=?";
      try {
         Connection con = Conexion.getConexion();
         ps = con.prepareStatement(sql);
         ps.setInt(1, cant);
         ps.setString(2, Codigo);
         ps.execute();
         return true;
      } catch (SQLException e) {
         Logger.getLogger(RopaTerminadaDAO.class.getName()).log(Level.SEVERE, null, e);
         return false;
      }
   }
}
