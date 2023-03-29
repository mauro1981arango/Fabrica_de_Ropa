package Modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

//Con extendes aplicamos la herencia de la clase Conexion. Para utiilizar directamenta la
//Conexion sin la necesidad de hacer objetos de Conexion.
public class ConsultasClientes extends Conexion {

    //Creamos el método registrar
    PreparedStatement ps = null;
    ResultSet rs;

    public boolean Registrar(Clientes cli) {

        Connection con = getConexion();
        String sql = "INSERT INTO clientes (Nombres, Apellidos, Telefono, Direccion, IdCiudad) VALUES (?,?,?,?,?)";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombres());
            ps.setString(2, cli.getApellidos());
            ps.setString(3, cli.getTelefono());
            ps.setString(4, cli.getDireccion());
            ps.setInt(5, cli.getIdCiudad());
            int resultado = ps.executeUpdate();
            return resultado > 0;
            
        } catch (SQLException e) {
            System.out.println("Datos guardados");

        } finally {
            try {
                con.close();
            } catch (SQLException ex) {
                Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
            }         
        }   
       return false;
    }

    public boolean Modificar(Clientes cli)  {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "UPDATE clientes SET Nombres=?, Apellidos=?, Telefono=?, Direccion=?, IdCiudad=? WHERE IdCliente=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombres());
            ps.setString(2, cli.getApellidos());
            ps.setString(3, cli.getTelefono());
            ps.setString(4, cli.getDireccion());
            ps.setInt(5, cli.getIdCiudad());
            ps.setInt(6, cli.getIdCliente());
            
            int resultado = ps.executeUpdate();
            return resultado > 0;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultasClientes.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Error al actualizar los datos" + e);
                
            }
        }
        return false;

    }

    public boolean Eiminar(Clientes cli) {
        PreparedStatement ps = null;
        Connection con = getConexion();
        String sql = "DELETE FROM clientes  WHERE IdCliente=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cli.getIdCliente());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.out.println("Registro eliminado" + e);
            return false;
        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Error al eliminar" + e);
            }
        }

    }

    public ConsultasClientes() {
    }

    public boolean Buscar(Clientes cli) {
        
        PreparedStatement ps = null;
        ResultSet rs = null;
        Connection con = getConexion();
        String sql = "SELECT * FROM clientes  WHERE Nombres=?";
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, cli.getNombres());
            rs = ps.executeQuery();

            if (rs.next()) {
                cli.setIdCliente(rs.getInt("IdCliente"));
                cli.setNombres(rs.getString("Nombres"));
                cli.setApellidos(rs.getString("Apellidos"));
                cli.setTelefono(rs.getString("Telefono"));
                cli.setDireccion(rs.getString("Direccion"));
                cli.setIdCiudad(rs.getInt("IdCiudad"));
                
                return true;
            }
            else{
                return false;
            }
        } catch (SQLException e) {
            System.err.println("No se encontró ningún resultado" + e);

        } finally {
            try {
                con.close();
            } catch (SQLException e) {
                System.err.println("Tu búsqueda ha sido exitosa" + e);
            }
        }
        return false;
    }
}
