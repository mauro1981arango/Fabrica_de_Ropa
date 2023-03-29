package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class ProveedoresDAO {

    Conexion con = new Conexion();
    

    public DefaultTableModel getProveedores() {
        DefaultTableModel proveedor = new DefaultTableModel();
        try {

            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            //Para relizar consultas a la base de datos necesitaremos las siguietes variables
            Connection cn = Conexion.getConexion();
            //Creamos una variable de tipo String que realiza la consulta a la base de datos.
            String sql = "SELECT prov.IdProveedor, prov.NitProveedor, prov.NombreEmpresa, prov.Direccion, prov.Correo, prov.Telefono, ciu.Ciudad, prov.CuentaBancaria, cb.TipoCuenta "
                    + "FROM proveedores prov "
                    + "INNER JOIN ciudades ciu ON ciu.IdCiudad = prov.IdCiudad "
                    + "INNER JOIN cuentas_bancarias cb ON cb.IdCuenta = prov.IdCuenta "
                    + "WHERE IdProveedor = IdProveedor";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            //Aquí ponemos los encabezados de las columnas de la tabla Inventario.
            proveedor.addColumn("Id");
            proveedor.addColumn("Nit");
            proveedor.addColumn("Nombre Empresa");
            proveedor.addColumn("Direccion");
            proveedor.addColumn("Correo");
            proveedor.addColumn("Telefono");
            proveedor.addColumn("Ciudad");
            proveedor.addColumn("Número Cuenta");
            proveedor.addColumn("Tipo");
            while (rs.next()) {
                //El modelo de la tabla va requerir de objetos Object.
                Object[] proveedores = {rs.getInt("IdProveedor"), rs.getString("NitProveedor"), rs.getString("NombreEmpresa"), rs.getString("Direccion"), rs.getString("Correo"), rs.getString("Telefono"), rs.getString("Ciudad"), rs.getString("CuentaBancaria"), rs.getString("TipoCuenta")};
                proveedor.addRow(proveedores);
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
        return proveedor;
    }

    public void ListarCiudades(JComboBox ciudades) {
        String sql = "SELECT * FROM ciudades";
        try {
            Connection cn = con.getConexion();
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                ciudades.addItem(rs.getString("Ciudad"));
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }
    
    public void ListarTipoCuenta(JComboBox cuentas_bancarias) {
        String sql = "SELECT * FROM cuentas_bancarias";
        try {
            Connection cn = con.getConexion();
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                cuentas_bancarias.addItem(rs.getString("TipoCuenta"));
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }
}
