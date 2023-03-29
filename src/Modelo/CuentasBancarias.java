
package Modelo;


/**
 *
 * @author Diego Arango
 */
public class CuentasBancarias {
   private int IdCuenta;
   private String TipoCuenta;

   public CuentasBancarias() {
   }

   public CuentasBancarias(int IdCuenta, String TipoCuenta) {
      this.IdCuenta = IdCuenta;
      this.TipoCuenta = TipoCuenta;
   }
   
   public CuentasBancarias(int IdCuenta) {
      this.IdCuenta = IdCuenta;
   }

   public int getIdCuenta() {
      return IdCuenta;
   }

   public void setIdCuenta(int IdCuenta) {
      this.IdCuenta = IdCuenta;
   }

   public String getTipoCuenta() {
      return TipoCuenta;
   }

   public void setTipoCuenta(String TipoCuenta) {
      this.TipoCuenta = TipoCuenta;
   }
   

   @Override
   public String toString() {
      return  IdCuenta + " - " + TipoCuenta;
   }
   
//   public int toInt() {
//      return IdCuenta;
//   }
//   public ArrayList<CuentasBancarias> getCuentasBancarias(){
//        Connection con = Conexion.getConexion();
//        Statement stm = null;
//        ResultSet result = null;
//        ArrayList<CuentasBancarias> listaCuentasBancarias = new ArrayList<>();
//        try {
//            stm = con.createStatement();
//            result = stm.executeQuery("SELECT * FROM cuentas_bancarias");
//            while(result.next() ){
//                CuentasBancarias tipoCuenta = new CuentasBancarias();
//                tipoCuenta.setIdCuenta(result.getInt("IdCuenta"));
//                tipoCuenta.setTipoCuenta(result.getString("TipoCuenta"));
//                listaCuentasBancarias.add(tipoCuenta);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(CuentasBancarias.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listaCuentasBancarias;
//    } 

    
}
