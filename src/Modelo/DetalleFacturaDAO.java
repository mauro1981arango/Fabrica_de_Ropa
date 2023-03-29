package Modelo;

import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

public class DetalleFacturaDAO {

    Conexion con = new Conexion();

    public DefaultTableModel getDetalleFactura() {
        DefaultTableModel detalle_factura = new DefaultTableModel();
        try {

            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            //Para relizar consultas a la base de datos necesitaremos las siguietes variables
            Connection cn = con.getConexion();
            //Creamos una variable de tipo String que realiza la consulta a la base de datos.
            String sql = "SELECT df.IdDetalle,ropa.Descripcion,ropa.Codigo,rt.Talla,rt.Color,df.ValorUnitario, df.Cantidad, df.ValorTotal, fac.IdFactura "
                    + "FROM detalle_factura df "
                    + "INNER JOIN referencias_ropa ropa ON ropa.IdVestuario = df.IdVestuario "
                    + "INNER JOIN factura fac ON fac.IdFactura = df.IdFactura "
                    + "INNER JOIN ropa_terminada rt ON rt.IdProducto = df.IdProducto "
                    + "WHERE IdDetalle = IdDetalle";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();

            //Aquí ponemos los encabezados de las columnas de la tabla Inventario.
            detalle_factura.addColumn("Id");
            detalle_factura.addColumn("Descripcion");
            detalle_factura.addColumn("Codigo");
            detalle_factura.addColumn("Talla");
            detalle_factura.addColumn("Color");
            detalle_factura.addColumn("ValorUnitario");
            detalle_factura.addColumn("Cantidad");
            detalle_factura.addColumn("ValorTotal");
            detalle_factura.addColumn("IdFactura");

            //Utilozamos un while pata recorrer los datos de la consulta.
            while (rs.next()) {
                //El modelo de la tabla va requerir de objetos Object.
                Object[] detalle = {rs.getInt("IdDetalle"), rs.getString("Descripcion"), rs.getString("Codigo"), rs.getString("Talla"), rs.getString("Color"), rs.getDouble("ValorUnitario"), rs.getInt("Cantidad"), rs.getDouble("ValorTotal"), rs.getInt("IdFactura")};
                detalle_factura.addRow(detalle);
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
        return detalle_factura;

    }
    
}
