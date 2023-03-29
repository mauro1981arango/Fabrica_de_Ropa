
package Modelo;

import static Modelo.Conexion.getConexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;


public class ConsultasNomina extends Conexion {
    public boolean Registar(Nomina pago){
         PreparedStatement ps = null;
         Connection con = getConexion();
         String sql = "INSERT INTO nomina(IdMes, Fecha, IdRhumanos, IdSalario) VALUES (?,?,?,?)";
         try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pago.getIdMes());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = formatoFecha.format(pago.getFecha());
            ps.setString(2, fecha);
            ps.setInt(3, pago.getIdRhumanos());
            ps.setInt(4, pago.getIdSalario());
            int resultado = ps.executeUpdate();
            return resultado > 0;
        } catch (SQLException e) {
            System.err.println("Datos no guardados " + e);
            return false;
        }finally{
            try {
               con.close();
            } catch (SQLException e) {
                System.err.println("Conexion no cerrada" + e);
            }
        }
    }
    public boolean Modificar(Nomina pago){
         PreparedStatement ps = null;
         Connection con = getConexion();
         String sql = "UPDATE nomina SET IdMes=?, Fecha=?, IdRhumanos=?, IdSalario=? WHERE IdPago=?";
         try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pago.getIdMes());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = formatoFecha.format(pago.getFecha());
            ps.setString(2, fecha);
            ps.setInt(3, pago.getIdRhumanos());
             ps.setInt(4, pago.getIdSalario());
            ps.setInt(5, pago.getIdPago());
            int resultado = ps.executeUpdate();
            return resultado > 0;
        } catch (SQLException e) {
            System.err.println("Registro no actualizado " + e);
            return false;
        }finally{
            try {
               con.close();
            } catch (SQLException e) {
                System.err.println("Conexion no cerrada" + e);
            }
        }
    }
     public boolean Eliminar(Nomina pago){
         PreparedStatement ps = null;
         Connection con = getConexion();
         String sql = "DELETE FROM nomina WHERE IdPago=?";
         try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pago.getIdPago());
            ps.execute();
            return true;
        } catch (SQLException e) {
            System.err.println("No se pudo completar la operacion " + e);
            return false;
        }finally{
            try {
               con.close();
            } catch (SQLException e) {
                System.err.println("Conexion no cerrada" + e);
            }
        }
    }
      public boolean Buscar(Nomina pago){
         PreparedStatement ps = null;
         ResultSet rs = null;
         Connection con = getConexion();
         String sql = "SELECT * FROM nomina WHERE IdPago=?";
         try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, pago.getIdPago());
            rs = ps.executeQuery();
            if(rs.next()){
                pago.setIdPago(Integer.parseInt(rs.getString("IdPago")));
                pago.setIdMes(Integer.parseInt(rs.getString("IdMes")));
                pago.setFecha(rs.getDate("Fecha"));
                pago.setIdRhumanos(rs.getInt("IdRhumanos"));
                pago.setIdSalario(Integer.parseInt(rs.getString("IdSalario")));
                
                return true;
            }
        } catch (SQLException e) {
            System.err.println("Registro no Encontrado " + e.toString());
            return false;
        }finally{
            try {
               con.close();
            } catch (SQLException e) {
                System.err.println("Conexion no cerrada" + e);
            }
        }
        return false;
    }
}
