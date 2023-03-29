package Modelo;

import static Modelo.Conexion.getConexion;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;

public class ConsultasInventario extends Conexion {
    //Creamos el método registrar

    public boolean Registrar(Inventario inven) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "INSERT INTO inventario (Nombre, FechaCompra, FechaMantenimiento, IdInsumo, IdProveedor, IdMaterial) VALUES (?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, inven.getNombre());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fechacompra = formatoFecha.format(inven.getFechaCompra());
            String fecha_mantenimiento = formatoFecha.format(inven.getFechaMantenimiento());
            ps.setString(2, fechacompra);
            ps.setString(3, fecha_mantenimiento);
            ps.setInt(4, inven.getIdInsumo());
            ps.setInt(5, inven.getIdProveedor());
            ps.setInt(6, inven.getIdMaterial());
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

    public boolean Modificar(Inventario inven) {
        PreparedStatement ps = null;
        con = getConexion();
        String sql = "UPDATE inventario SET Nombre=?,FechaCompra=?,FechaMantenimiento=?,IdInsumo=?,IdProveedor=?,IdMaterial=? WHERE IdInventario=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, inven.getNombre());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fechacompra = formatoFecha.format(inven.getFechaCompra());
            String fecha_mantenimiento = formatoFecha.format(inven.getFechaMantenimiento());
            ps.setString(2, fechacompra);
            ps.setString(3, fecha_mantenimiento);
            ps.setInt(4, inven.getIdInsumo());
            ps.setInt(5, inven.getIdProveedor());
            ps.setInt(6, inven.getIdMaterial());
            ps.setInt(7, inven.getIdInventario());
            int resultado = ps.executeUpdate();
            return resultado > 0;
                
        } catch (SQLException e) {
            System.err.println("Error al actualizar los datos" + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Registro actualizado con éxito!" + e);
            }
        }

    }

    public boolean Eiminar(Inventario inven) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM inventario WHERE IdInventario=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, inven.getIdInventario());
            ps.execute();
            return true;

        } catch (SQLException e) {
            System.err.println("Registro eliminado" + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Error al eliminar " + e);
            }
        }

    }

    public boolean Buscar(Inventario inven) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();

        String sql = "SELECT * FROM inventario WHERE Nombre=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, inven.getNombre());
            rs = ps.executeQuery();

            if (rs.next()) {

                inven.setIdInventario(Integer.parseInt(rs.getString("IdInventario")));
                inven.setNombre(rs.getString("Nombre"));
                inven.setFechaCompra(rs.getDate("FechaCompra"));
                inven.setFechaMantenimiento(rs.getDate("FechaMantenimiento"));
                inven.setIdInsumo(Integer.parseInt(rs.getString("IdInsumo")));
                inven.setIdProveedor(Integer.parseInt(rs.getString("IdProveedor")));
                inven.setIdMaterial(Integer.parseInt(rs.getString("IdMaterial")));
                return true;
            }
        } catch (SQLException e) {
            System.err.println("No se encontró ningún resultado" + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("" + e);
            }
        }
        return false;

    }

}
