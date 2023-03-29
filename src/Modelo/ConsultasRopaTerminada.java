package Modelo;

import java.sql.*;

public class ConsultasRopaTerminada extends Conexion {

    PreparedStatement ps = null;
    ResultSet rs;

    public boolean Registrar(RopaTerminada vestuario) {
        
        Connection con = getConexion();
        String sql = "INSERT INTO ropa_terminada(Codigo, Descripcion, Talla, Color, Stock, PrecioElaboracion, PrecioVenta) VALUES (?,?,?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, vestuario.getCodigo());
            ps.setString(2, vestuario.getDescripcion());
            ps.setString(3, vestuario.getTalla());
            ps.setString(4, vestuario.getColor());
            ps.setInt(5, vestuario.getStock());
            ps.setDouble(6, vestuario.getPrecioElaboracion());
            ps.setDouble(7, vestuario.getPrecioVenta());
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

    public boolean Modificar(RopaTerminada vestuario) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE ropa_terminada SET Codigo=?, Descripcion=?, Talla=?, Color=?, Stock=?,          PrecioElaboracion=?, PrecioVenta=? WHERE IdProducto=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, vestuario.getCodigo());
            ps.setString(2, vestuario.getDescripcion());
            ps.setString(3, vestuario.getTalla());
            ps.setString(4, vestuario.getColor());
            ps.setInt(5, vestuario.getStock());
            ps.setDouble(6, vestuario.getPrecioElaboracion());
            ps.setDouble(7, vestuario.getPrecioVenta());
            ps.setInt(8, vestuario.getIdProducto());
            int resultado = ps.executeUpdate();
            return resultado > 0;
        } catch (SQLException e) {
            System.err.println("No se pudo actualizar " + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Conexion no cerrada" + e);
            }
        }
    }

    public boolean Eliminar(RopaTerminada vestuario) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM ropa_terminada WHERE IdProducto=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, vestuario.getIdProducto());
            ps.execute();
            return true;
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

    public boolean Buscar(RopaTerminada vestuario) {
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM ropa_terminada WHERE IdProducto=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, vestuario.getIdProducto());
            rs = ps.executeQuery();
            if (rs.next()) {
                
                vestuario.setCodigo(rs.getString("Codigo"));
                vestuario.setDescripcion(rs.getString("Descripcion"));
                vestuario.setTalla(rs.getString("Talla"));
                vestuario.setColor(rs.getString("Color"));
                vestuario.setStock(Integer.parseInt(rs.getString("Stock")));
                vestuario.setPrecioElaboracion(Double.parseDouble(rs.getString("PrecioElaboracion")));
                vestuario.setPrecioVenta(Double.parseDouble(rs.getString("PrecioVenta")));
                vestuario.setIdProducto(Integer.parseInt(rs.getString("IdProducto")));
                return true;
            }
        } catch (SQLException e) {
            System.err.println("No se encontró ningún resultado" + e);
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
