package Modelo;

import static Modelo.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultasMateriaPrima extends Conexion {

    public boolean Registrar(MateriaPrima material) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO materia_prima(RefArticulo, IdMaterial, IdProveedor, Cantidad, Color, PrecioUnitario, ValorTotal) VALUES (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, material.getRefArticulo());
            ps.setInt(2, material.getIdMaterial());
            ps.setInt(3, material.getIdProveedor());
            ps.setInt(4, material.getCantidad());
            ps.setString(5, material.getColor());
            ps.setDouble(6, material.getPrecioUnitario());
            ps.setDouble(7, material.getValorTotal());
            int resultado = ps.executeUpdate();
            return resultado > 0;
        } catch (SQLException e) {
            System.err.println("Datos nos guardados" + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Conexion no cerrada" + e);
            }
        }

    }

    public boolean Modificar(MateriaPrima material) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE materia_prima SET RefArticulo=?,IdMaterial=?,IdProveedor=?,Cantidad=?,Color=?,PrecioUnitario=?,ValorTotal=? WHERE IdInsumo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, material.getRefArticulo());
            ps.setInt(2, material.getIdMaterial());
            ps.setInt(3, material.getIdProveedor());
            ps.setInt(4, material.getCantidad());
            ps.setString(5, material.getColor());
            ps.setDouble(6, material.getPrecioUnitario());
            ps.setDouble(7, material.getValorTotal());
            ps.setInt(8, material.getIdInsumo());
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

    public boolean Eliminar(MateriaPrima material) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM materia_prima WHERE IdInsumo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, material.getIdInsumo());
        } catch (SQLException e) {
            System.err.println("Datos no eliminados" + e);
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

    public boolean Buscar(MateriaPrima material) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM materia_prima WHERE IdInsumo=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, material.getIdInsumo());
            rs = ps.executeQuery();

            if (rs.next()) {
                material.setIdInsumo(Integer.parseInt(rs.getString("IdInsumo")));
                material.setRefArticulo(rs.getString("RefArticulo"));
                material.setIdMaterial(Integer.parseInt(rs.getString("IdMaterial")));
                material.setIdProveedor(Integer.parseInt(rs.getString("IdProveedor")));
                material.setCantidad(Integer.parseInt(rs.getString("Cantidad")));
                material.setColor(rs.getString("Color"));
                material.setPrecioUnitario(Double.parseDouble(rs.getString("PrecioUnitario")));
                material.setValorTotal(Double.parseDouble(rs.getString("ValorTotal")));
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Nigún resultado para la búsqueda" + e);
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
