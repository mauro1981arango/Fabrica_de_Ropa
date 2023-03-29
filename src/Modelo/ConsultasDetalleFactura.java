package Modelo;

import static Modelo.Conexion.getConexion;
import java.sql.*;

public class ConsultasDetalleFactura extends Conexion {

    public boolean Registrar(DetalleFactura detalle) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO detalle_factura(Cantidad, ValorUnitario, ValorTotal, IdVestuario, IdFactura, IdProducto) VALUES (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, detalle.getCantidad());
//            ps.setDouble(2, detalle.getValorUnitario());
//            ps.setDouble(3, detalle.getValorTotal());
//            ps.setInt(4, detalle.getIdVestuario());
            ps.setInt(5, detalle.getIdFactura());
            ps.setInt(6, detalle.getIdProducto());
            int resultado = ps.executeUpdate();
            return resultado > 0;
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

    public boolean Modificar(DetalleFactura detalle) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE detalle_factura SET Cantidad=?,ValorUnitario=?,ValorTotal=?,                              IdVestuario=?,IdFactura=?,IdProducto=? WHERE IdDetalle=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, detalle.getCantidad());
//            ps.setDouble(2, detalle.getValorUnitario());
//            ps.setDouble(3, detalle.getValorTotal());
//            ps.setInt(4, detalle.getIdVestuario());
            ps.setInt(5, detalle.getIdFactura());
            ps.setInt(6, detalle.getIdProducto());
            ps.setInt(7, detalle.getIdDetalle());
            int resultado = ps.executeUpdate();
            return resultado > 0;
        } catch (SQLException e) {
            System.err.println("No fue posible actualizar" + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Conexion no cerrada" + e);
            }
        }
    }

    public boolean Eliminar(DetalleFactura detalle) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM detalle_factura WHERE IdDetalle=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, detalle.getIdDetalle());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("No se pudo eliminar el registro" + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Conexion no cerrada" + e);
            }
        }
    }

    public boolean Buscar(DetalleFactura detalle) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM detalle_factura WHERE IdDetalle=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, detalle.getIdDetalle());
            rs = ps.executeQuery();
            if (rs.next()) {
                detalle.setIdDetalle(Integer.parseInt(rs.getString("IdDetalle")));
                detalle.setCantidad(Integer.parseInt(rs.getString("Cantidad")));
//                detalle.setValorUnitario(Double.parseDouble(rs.getString("ValorUnitario")));
//                detalle.setValorTotal(Double.parseDouble(rs.getString("ValorTotal")));
//                detalle.setIdVestuario(Integer.parseInt(rs.getString("IdVestuario")));
                detalle.setIdFactura(Integer.parseInt(rs.getString("IdFactura")));
                detalle.setIdProducto(Integer.parseInt(rs.getString("IdProducto")));
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Datos no encontrados" + e);
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
