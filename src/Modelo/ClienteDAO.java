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

public class ClienteDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    
    public Clientes listarIdCliente(int Id){
        Clientes cli = new Clientes();
        String sql = "SELECT * FROM clientes WHERE IdCliente=?";
        try {
            Connection con = Conexion.getConexion();
            ps = con.prepareStatement(sql);
            ps.setInt(1, Id);
            rs = ps.executeQuery();
            while(rs.next()){
               cli.setIdCliente(rs.getInt("IdCliente"));
               cli.setNombres(rs.getString("Nombres"));
               cli.setApellidos(rs.getString("Apellidos"));
               cli.setTelefono(rs.getString("Telefono"));
               cli.setDireccion(rs.getString("Direccion"));
               cli.setIdCiudad(rs.getInt("IdCiudad"));
            }
        } catch (SQLException ex) {
           Logger.getLogger(frmFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cli;
        
    }

    public DefaultTableModel getClientes() {
        //Dentro del try catch iniciamos declarando las variagles que vamos a utilzar para el DefaultTableModel.
        DefaultTableModel tabla = new DefaultTableModel();
        try {
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            //Para relizar consultas a la base de datos necesitaremos las siguietes variables
            Connection cn = Conexion.getConexion();
            //Creamos una variable de tipo String que realiza la consulta a la base de datos.
            String sql = "SELECT clientes.IdCliente, clientes.Nombres, clientes.Apellidos, clientes.Telefono, clientes.Direccion, ciudades.Ciudad FROM `clientes` INNER JOIN ciudades on clientes.IdCiudad=ciudades.IdCiudad";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            //Aquí ponemos los encabezados de las columnas de la tabla Clientes.
            tabla.addColumn("Id");
            tabla.addColumn("Nombres");
            tabla.addColumn("Apellidos");
            tabla.addColumn("Teléfono");
            tabla.addColumn("Direccion");
            tabla.addColumn("Ciudad");

            //Utilozamos un while pata recorrer los datos de la consulta.
            while (rs.next()) {
                //Crearemos una variable de tipo for para ir agregando los resultados de la consulta.
                //El modelo de la tabla va requerir de objetos Object.
                Object[] clientes = {rs.getInt("IdCliente"), rs.getString("Nombres"), rs.getString("Apellidos"), rs.getBigDecimal("Telefono"), rs.getString("Direccion"), rs.getString("Ciudad")};
                tabla.addRow(clientes);
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
        return tabla;

    }

    public List<String[]> CargarComboBox_ciudades() {

        List<String[]> lista = new ArrayList();
        try {
            //Metodo cargar ComboBox CbxCiudad desde la tabla ciudades.
            Connection con = Conexion.getConexion();
            PreparedStatement preparacion = con.prepareStatement("SELECT * FROM ciudades");
            ResultSet resultado = preparacion.executeQuery();

            while (resultado.next()) {
                String[] ciudad = new String[2];
                ciudad[0] = resultado.getString("Ciudad");
                ciudad[1] = resultado.getString("IdCiudad");
                lista.add(ciudad);
            }
        } catch (SQLException ex) {
            System.err.println("ex");
        }
        return lista;
    }
    
}
