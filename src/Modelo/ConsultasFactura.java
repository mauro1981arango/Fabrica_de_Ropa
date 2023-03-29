package Modelo;

import java.sql.*;
import java.text.SimpleDateFormat;

public class ConsultasFactura extends Conexion {

    PreparedStatement ps = null;
    ResultSet rs;

    public boolean Guardar(Factura venta) {

        Connection con = getConexion();
        String sql = "INSERT INTO factura(Fecha, IdCliente, IdUsuario, NroFactura, MontoPago, MontoCambio, Total) VALUES (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
//            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
//            String fecha = formatoFecha.format(venta.getFecha());
            ps.setString(1, venta.getFecha());
            ps.setInt(2, venta.getIdCliente());
            ps.setInt(3, venta.getIdUsuario());
            //ps.setInt(4, venta.getIdDocumento());
            ps.setString(4, venta.getNroFactura());
            ps.setDouble(5, venta.getMontoPago());
            ps.setDouble(6, venta.getMontoCambio());
            ps.setDouble(7, venta.getTotal());
            int resultado = ps.executeUpdate();
            return resultado > 0;
        } catch (SQLException e) {
            System.err.println("Datos no  guardados, inténtalo nuevamente " + e);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Conexion no cerrada" + e);
            }
        }
        return false;
    }

    public boolean Modificar(Factura venta) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE factura SET`Fecha=?,Total=?,IdCliente=?,IdUsuario, NroFactura=?, MontoPago=?, MontoCambio=?, getTotal=? WHERE IdFactura=?";
        try {
            ps = con.prepareStatement(sql);
//            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
//            String fecha = formatoFecha.format(venta.getFecha());
            ps.setString(1, venta.getFecha());
            ps.setInt(2, venta.getIdCliente());
            ps.setInt(3, venta.getIdUsuario());           
            //ps.setInt(4, venta.getIdDocumento());
            ps.setString(4, venta.getNroFactura());
            ps.setDouble(5, venta.getMontoPago());
            ps.setDouble(6, venta.getMontoCambio());
            ps.setDouble(7, venta.getTotal());
            ps.setInt(8, venta.getIdFactura());
            int resultado = ps.executeUpdate();
            return resultado > 0;
        } catch (SQLException e) {
            System.err.println("No se pudo realizar la actualización " + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Conexion no cerrada" + e);
            }
        }

    }

    public boolean Eliminar(Factura venta) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM factura WHERE IdFactura=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, venta.getIdFactura());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("No se pudo eliminar el regisstro " + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Conexion no cerrada" + e);
            }
        }

    }

    public boolean Buscar(Factura venta) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM factura WHERE IdFactura=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, venta.getIdFactura());
            rs = ps.executeQuery();
            if (rs.next()) {
                venta.setIdFactura(Integer.parseInt(rs.getString("IdFactura")));
                venta.setFecha(rs.getString("Fecha"));
                venta.setIdCliente(rs.getInt("IdCliente"));
                venta.setIdUsuario(rs.getInt("IdUsuario"));
                //venta.setIdDocumento(rs.getInt("IdDocumento"));
                venta.setNroFactura(rs.getString("NroFactura"));
                venta.setMontoPago(Double.parseDouble(rs.getString("MontoPago")));
                venta.setMontoCambio(Double.parseDouble(rs.getString("MontoCambio")));
                venta.setTotal(Double.parseDouble(rs.getString("Total")));
                return true;
            }
        } catch (SQLException e) {
            System.err.println("El registro no existe, Inténtalo nuevamnte " + e);
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
