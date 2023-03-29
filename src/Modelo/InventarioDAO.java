package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class InventarioDAO {

    Conexion con = new Conexion();

    public DefaultTableModel getInventario() {

        DefaultTableModel inventario = new DefaultTableModel();
        try {

            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            //Para relizar consultas a la base de datos necesitaremos las siguietes variables
            Connection cn = con.getConexion();
            //Creamos una variable de tipo String que realiza la consulta a la base de datos.
            String sql = "SELECT inv.IdInventario, inv.Nombre, inv.FechaCompra, inv.FechaMantenimiento, mp.RefArticulo, pro.NombreEmpresa, cat.Tipo FROM inventario inv INNER JOIN materia_prima mp ON inv.IdInsumo=mp.IdInsumo INNER JOIN proveedores pro ON inv.IdProveedor=pro.IdProveedor INNER JOIN categoria_material cat ON inv.IdMaterial=cat.IdMaterial WHERE IdInventario=IdInventario";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            //Aquí ponemos los encabezados de las columnas de la tabla Inventario.
            inventario.addColumn("Id");
            inventario.addColumn("Nombre");
            inventario.addColumn("Fecha de Compra");
            inventario.addColumn("Fecha de Mantenimiento");
            inventario.addColumn("Referencia");
            inventario.addColumn("Nombre Empresa");
            inventario.addColumn("Tipo");

            //Utilozamos un while pata recorrer los datos de la consulta.
            while (rs.next()) {
                //El modelo de la tabla va requerir de objetos Object.
                Object[] elementos = {rs.getInt("IdInventario"),rs.getString("Nombre"), rs.getDate("FechaCompra"), rs.getDate("FechaMantenimiento"), rs.getString("RefArticulo"), rs.getString("NombreEmpresa"), rs.getString("Tipo")};
                inventario.addRow(elementos);
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
        return inventario;
    }

//    public List<String[]> CargarComboBox_materia_prima() {
//
//        List<String[]> lista = new ArrayList();
//        try {
//            //Metodo cargar ComboBox cbxRefArticulo desde la tabla materia_prima.
//            Connection con = Conexion.getConexion();
//            PreparedStatement preparacion = con.prepareStatement("SELECT * FROM materia_prima WHERE IdInsumo");
//            ResultSet resultado = preparacion.executeQuery();
//            while (resultado.next()) {
//                String[] materia_prima = new String[2];
//                materia_prima[0] = resultado.getString("IdInsumo");
//                materia_prima[1] = resultado.getString("RefArticulo");
//                lista.add(materia_prima);
//            }
//        } catch (SQLException e) {
//            System.out.println("e");
//        }
//        return lista;
//    }
    public void ListarMateriaPrima(JComboBox materiales) {
        String sql = "SELECT * FROM materia_prima";
        try {
            Connection cn = con.getConexion();
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                materiales.addItem(rs.getString("RefArticulo"));
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
    
    public void ListarCategoriaMaterial(JComboBox categoria) {
        String sql = "SELECT * FROM categoria_material";
        try {
            Connection cn = con.getConexion();
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
               categoria.addItem(rs.getString("Tipo"));
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

//    public List<Proveedores[]> CargarComboBox_proveedores() {
//
//        List<lista[]> lista = new ArrayList();
//        try {
//            //Metodo cargar ComboBox cbxNitProveedor desde la tabla proveedores.
//            Connection con = Conexion.getConexion();
//            PreparedStatement preparacion = con.prepareStatement("SELECT IdProveedor, NitProveedor FROM proveedores WHERE IdProveedor");
//            ResultSet resultado = preparacion.executeQuery();
//            while (resultado.next()) {
//                String[] proveedores = new String[2];
//                proveedores[0] = resultado.getString("IdProveedor");
//                proveedores[1] = resultado.getString("NitProveedor");
//                lista.add(lista);
//            }
//        } catch (SQLException e) {
//            System.out.println("e");
//        }
//        return lista;
//    }

//    public List<String[]> CargarComboBox_categoria_material() {
//
//        List<String[]> lista = new ArrayList();
//        try {
//            //Metodo cargar ComboBox cbxIdMaterial2 desde la tabla categoria_material.
//            Connection con = Conexion.getConexion();
//            PreparedStatement preparacion = con.prepareStatement("SELECT * FROM categoria_material WHERE IdMaterial = IdMaterial");
//            ResultSet resultado = preparacion.executeQuery();
//            while (resultado.next()) {
//                String[] categoria_material = new String[2];
//                categoria_material[0] = resultado.getString("IdMaterial");
//                categoria_material[1] = resultado.getString("Tipo");
//                lista.add(categoria_material);
//            }
//        } catch (SQLException e) {
//            System.out.println("e");
//        }
//        return lista;
//    }
    
}
