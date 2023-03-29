
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MateriaPrimaDAO {
    Conexion con = new Conexion();
    
    public DefaultTableModel getMateriaPrima(){
        
        DefaultTableModel materia_prima = new DefaultTableModel();
        //Dentro del try catch iniciamos declarando las variagles que vamos a utilzar para el DefaultTableModel.
         try {
            
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;    
            Connection cn = Conexion.getConexion();
            String sql = "SELECT materia_prima.IdInsumo, materia_prima.RefArticulo, categoria_material.Tipo, proveedores.NombreEmpresa, materia_prima.Cantidad, materia_prima.Color, materia_prima.PrecioUnitario, materia_prima.ValorTotal FROM materia_prima INNER JOIN categoria_material ON materia_prima.IdMaterial=categoria_material.IdMaterial INNER JOIN proveedores ON materia_prima.IdProveedor=proveedores.IdProveedor";
            ps= cn.prepareStatement(sql);
            rs = ps.executeQuery();
            //Aquí ponemos los encabezados de las columnas de la tabla materia_prima.
            materia_prima.addColumn("Id");
            materia_prima.addColumn("Refencia");
            materia_prima.addColumn("Material");
            materia_prima.addColumn("Empresa");
            materia_prima.addColumn("Cantidad");
            materia_prima.addColumn("Color");
            materia_prima.addColumn("Precio Unitario");
            materia_prima.addColumn("Total");
            while(rs.next()){
                Object[] material = {rs.getInt("IdInsumo"),rs.getString("RefArticulo"), rs.getString("Tipo"), rs.getString("NombreEmpresa"), rs.getInt("Cantidad"), rs.getString("Color"), rs.getDouble("PrecioUnitario"), rs.getDouble("ValorTotal")};
                materia_prima.addRow(material);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return materia_prima;
    }
    
    public void ListarCategoriaMaterial(JComboBox material) {
        String sql = "SELECT * FROM categoria_material";
        try {
            Connection cn = con.getConexion();
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                material.addItem(rs.getString("Tipo"));
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
   }
    
    public void ListarProveedores(JComboBox proveedor) {
        String sql = "SELECT * FROM proveedores";
        try {
            Connection cn = con.getConexion();
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                proveedor.addItem(rs.getString("NombreEmpresa"));
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
   }
//    public List<String[]> CargarComboBox_proveedores() {
//
//        List<String[]> lista = new ArrayList();
//        try {
//            //Metodo cargar ComboBox cbxNitProveedor desde la tabla proveedores.
//            Connection con = Conexion.getConexion();
//            PreparedStatement preparacion = con.prepareStatement("SELECT IdProveedor, NombreEmpresa FROM proveedores WHERE IdProveedor");
//            ResultSet resultado = preparacion.executeQuery();
//            while (resultado.next()) {
//                String[] proveedores = new String[2];
//                proveedores[0] = resultado.getString("IdProveedor");
//                proveedores[1] = resultado.getString("NombreEmpresa");
//                lista.add(proveedores);
//            }
//        } catch (SQLException e) {
//            System.out.println("e");
//        }
//        return lista;
//    }
}
