package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class NominaDAO {

    Conexion con = new Conexion();

    public DefaultTableModel getNomina() {
        DefaultTableModel tabla_nomina = new DefaultTableModel();
        try {

            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            Connection cn = con.getConexion();
            String sql = "SELECT nomina.IdPago, meses.Mes, nomina.Fecha, recursos_humanos.Nombres, salario.ValorSalario FROM `nomina` INNER JOIN meses ON nomina.IdMes=meses.IdMes INNER JOIN recursos_humanos ON nomina.IdRhumanos=recursos_humanos.IdRhumanos INNER JOIN salario ON nomina.IdSalario=salario.IdSalario";
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            tabla_nomina.addColumn("Id");
            tabla_nomina.addColumn("Mes");
            tabla_nomina.addColumn("Fecha");
            tabla_nomina.addColumn("Nombres");
            tabla_nomina.addColumn("Salario");
            

            while (rs.next()) {
                //Crearemos una variable de while for para ir agregando los resultados de la consulta.
                //El modelo de la tabla va requerir de objetos Object.
                Object[] nomina = {rs.getInt("IdPago"), rs.getString("Mes"), rs.getDate("Fecha"), rs.getString("Nombres"), rs.getDouble("ValorSalario")};
                tabla_nomina.addRow(nomina);
            }
        } catch (SQLException e) {
            System.out.println("Error" + e.toString());
        }
        return tabla_nomina;
    }
    public void ListarMeses(JComboBox mes) {
        String sql = "SELECT * FROM meses";
        try {
            Connection cn = con.getConexion();
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                mes.addItem(rs.getString("Mes"));
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }
    
    public void ListarRhumanos(JComboBox rh) {
        String sql = "SELECT * FROM recursos_humanos";
        try {
            Connection cn = con.getConexion();
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                rh.addItem(rs.getString("Nombres"));
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }

    public void ListarSalarios(JComboBox pago) {
        String sql = "SELECT * FROM salario";
        try {
            Connection cn = con.getConexion();
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                pago.addItem(rs.getString("ValorSalario"));
            }
        } catch (SQLException e) {
            System.err.println(e.toString());
        }
    }
//    public List<String[]> CargarComboBox_meses() {
//        List<String[]> lista = new ArrayList();
//        try {
//            //Metodo cargar ComboBox cbxMes desde la tabla meses.
//            Connection con = Conexion.getConexion();
//            PreparedStatement preparacion = con.prepareStatement("SELECT Mes FROM meses WHERE IdMes");
//            ResultSet resultado = preparacion.executeQuery();
//            while (resultado.next()) {
//                String[] mes = new String[1];
//                mes[0] = resultado.getString("Mes");
//                lista.add(mes);
//            }
//        } catch (SQLException e) {
//            System.out.println("e");
//        }
//        return lista;
//    }

//    public List<String[]> CargarComboBox_cedula() {
//        List<String[]> lista = new ArrayList();
//        try {
//            //Metodo cargar ComboBox cbxIdCedula desde la tabla recursos_humanos.
//            Connection con = Conexion.getConexion();
//            PreparedStatement preparacion = con.prepareStatement("SELECT IdCedula FROM recursos_humanos WHERE IdCedula");
//            ResultSet resultado = preparacion.executeQuery();
//            while (resultado.next()) {
//                String[] recursos_humanos = new String[1];
//                recursos_humanos[0] = resultado.getString("IdCedula");
//                lista.add(recursos_humanos);
//            }
//        } catch (SQLException e) {
//            System.out.println("e");
//        }
//        return lista;
//    }

//    public List<String[]> CargarComboBox_sueldos() {
//        List<String[]> lista = new ArrayList();
//        try {
//            //Metodo cargar ComboBox cbxValorSalario desde la tabla salario.
//            Connection con = Conexion.getConexion();
//            PreparedStatement preparacion = con.prepareStatement("SELECT IdSalario, ValorSalario FROM salario WHERE IdSalario");
//            ResultSet resultado = preparacion.executeQuery();
//            while (resultado.next()) {
//                String[] salario = new String[2];
//                salario[0] = resultado.getString("IdSalario");
//                salario[1] = resultado.getString("ValorSalario");
//                lista.add(salario);
//            }
//        } catch (SQLException e) {
//            System.out.println("e");
//        }
//        return lista;
//    }
}
