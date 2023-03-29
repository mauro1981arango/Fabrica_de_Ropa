package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComboBox;
import javax.swing.table.DefaultTableModel;

public class RecursosHumanosDAO {

   Conexion con = new Conexion();

   public DefaultTableModel getRecursosHumanos() {
      //Dentro del try catch iniciamos declarando las variagles que vamos a utilzar para el DefaultTableModel.
      DefaultTableModel tabla_personal = new DefaultTableModel();
      try {

         java.sql.PreparedStatement ps = null;
         java.sql.ResultSet rs = null;
         //Para relizar consultas a la base de datos necesitaremos la siguiete variable de tipo Connection
         Connection cn = con.getConexion();
         //Creamos una variable de tipo String que realiza la consulta a la base de datos en la tabla llamada recursos_humanos, en la consulta utilizamos los INNER JOIN para unir varias tablas y mostramos solo los datos que necesitamos que el cliente vea.
         String sql = "SELECT recursos_humanos.IdRhumanos, recursos_humanos.Cedula, recursos_humanos.Nombres, recursos_humanos.Apellidos, recursos_humanos.FechaNacimiento, grupos_sanguineos.TipoSangre, recursos_humanos.Telefono, recursos_humanos.Direccion, recursos_humanos.Correo, salario.ValorSalario, cuentas_bancarias.TipoCuenta, recursos_humanos.NroCuenta FROM `recursos_humanos` INNER JOIN grupos_sanguineos ON recursos_humanos.IdRH=grupos_sanguineos.IdRH INNER JOIN salario ON recursos_humanos.IdSalario=salario.IdSalario INNER JOIN cuentas_bancarias ON recursos_humanos.IdCuenta=cuentas_bancarias.IdCuenta";
         ps = cn.prepareStatement(sql);
         rs = ps.executeQuery();
         //Aquí ponemos los encabezados de las columnas de la tabla RecursosHumanos.
         tabla_personal.addColumn("Id");
         tabla_personal.addColumn("Cédula");
         tabla_personal.addColumn("Nombres");
         tabla_personal.addColumn("Apellidos");
         tabla_personal.addColumn("Fecha de Nacimineto");
         tabla_personal.addColumn("Tipo de Sangre");
         tabla_personal.addColumn("Teléfono");
         tabla_personal.addColumn("DIrección");
         tabla_personal.addColumn("Correo");
         tabla_personal.addColumn("Salario");
         tabla_personal.addColumn("Tipo Cuenta");
         tabla_personal.addColumn("Número de Cuenta");
         //Utilozamos un while pata recorrer los datos de la consulta.
         while (rs.next()) {

            Object[] recursos_humanos = {rs.getInt("IdRhumanos"), rs.getInt("Cedula"), rs.getString("Nombres"), rs.getString("Apellidos"), rs.getString("FechaNacimiento"), rs.getString("TipoSangre"), rs.getString("Telefono"), rs.getString("Direccion"), rs.getString("Correo"), rs.getString("ValorSalario"), rs.getString("TipoCuenta"), rs.getString("NroCuenta")};
            tabla_personal.addRow(recursos_humanos);
         }
      } catch (SQLException e) {
         System.err.println(e.toString());
      }
      return tabla_personal;
   }

//   public List<String[]> CargarComboBox_grupos_sanguineos() {
//
//      List<String[]> lista = new ArrayList();
//      try {
//         //Metodo cargar ComboBox CbxTipoSangre desde la tabla grupoos sanguineos.
//         Connection con = Conexion.getConexion();
//         PreparedStatement preparacion = con.prepareStatement("SELECT * FROM grupos_sanguineos");
//         ResultSet resultado = preparacion.executeQuery();
//         while (resultado.next()) {
//            String[] grupos_sanguineos = new String[2];
//            grupos_sanguineos[0] = resultado.getString("IdRH");
//            grupos_sanguineos[1] = resultado.getString("TipoSangre");
//            lista.add(grupos_sanguineos);
//         }
//
//      } catch (SQLException e) {
//         System.out.println("e");
//      }
//      return lista;
//
//   }

//   public List<String[]> CargarComboBox_cargos() {
//
//      List<String[]> lista = new ArrayList();
//      try {
//         //Metodo cargar ComboBox CbxOcupacion desde la tabla cargos.
//         Connection con = Conexion.getConexion();
//         PreparedStatement preparacion = con.prepareStatement("SELECT * FROM cargos");
//         ResultSet resultado = preparacion.executeQuery();
//         while (resultado.next()) {
//            String[] cargos = new String[2];
//            cargos[0] = resultado.getString("IdOcupacion");
//            cargos[1] = resultado.getString("Ocupacion");
//            lista.add(cargos);
//         }
//
//      } catch (SQLException e) {
//         System.out.println("e");
//      }
//      return lista;
//   }

//   public List<String[]> CargarComboBox_salario() {
//
//      List<String[]> lista = new ArrayList();
//      try {
//         //Metodo cargar ComboBox CbxValorSalario desde la tabla salario.
//         Connection con = Conexion.getConexion();
//         PreparedStatement preparacion = con.prepareStatement("SELECT IdSalario, ValorSalario FROM salario WHERE IdSalario");
//         ResultSet resultado = preparacion.executeQuery();
//         while (resultado.next()) {
//            String[] salario = new String[2];
//            salario[0] = resultado.getString("IdSalario");
//            salario[1] = resultado.getString("ValorSalario");
//
//            lista.add(salario);
//         }
//
//      } catch (SQLException e) {
//         System.out.println("e");
//      }
//      return lista;
//   }

//   public List<String[]> CargarComboBox_cuentas_bancarias() {
//
//      List<String[]> lista = new ArrayList();
//      try {
//         //Metodo cargar ComboBox CbxTipoCuenta desde la tabla cuentas_bancarias.
//         Connection con = Conexion.getConexion();
//         PreparedStatement preparacion = con.prepareStatement("SELECT * FROM cuentas_bancarias");
//         ResultSet resultado = preparacion.executeQuery();
//         while (resultado.next()) {
//            String[] cuentas_bancarias = new String[2];
//            cuentas_bancarias[0] = resultado.getString("IdCuenta");
//            cuentas_bancarias[1] = resultado.getString("TipoCuenta");
//            lista.add(cuentas_bancarias);
//         }
//
//      } catch (SQLException e) {
//         System.out.println("e");
//      }
//      return lista;
//   }
   
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
   
   public void ListarTipoSangre(JComboBox grupos_sanguineos) {
        String sql = "SELECT * FROM grupos_sanguineos";
        try {
            Connection cn = con.getConexion();
            java.sql.PreparedStatement ps = null;
            java.sql.ResultSet rs = null;
            cn = Conexion.getConexion();
            ps = cn.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                grupos_sanguineos.addItem(rs.getString("TipoSangre"));
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
}
