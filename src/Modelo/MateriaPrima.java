package Modelo;


public class MateriaPrima {

   private int IdInsumo;
   private String RefArticulo;
   private int IdMaterial;
   private int IdProveedor;
   private int Cantidad;
   private String Color;
   private double PrecioUnitario;
   private double ValorTotal;

   public int getIdInsumo() {
      return IdInsumo;
   }

   public void setIdInsumo(int IdInsumo) {
      this.IdInsumo = IdInsumo;
   }

   public String getRefArticulo() {
      return RefArticulo;
   }

   public void setRefArticulo(String RefArticulo) {
      this.RefArticulo = RefArticulo;
   }

   public int getIdMaterial() {
      return IdMaterial;
   }

   public void setIdMaterial(int IdMaterial) {
      this.IdMaterial = IdMaterial;
   }

   public int getIdProveedor() {
      return IdProveedor;
   }

   public void setIdProveedor(int IdProveedor) {
      this.IdProveedor = IdProveedor;
   }

   public int getCantidad() {
      return Cantidad;
   }

   public void setCantidad(int Cantidad) {
      this.Cantidad = Cantidad;
   }

   public String getColor() {
      return Color;
   }

   public void setColor(String Color) {
      this.Color = Color;
   }

   public double getPrecioUnitario() {
      return PrecioUnitario;
   }

   public void setPrecioUnitario(double PrecioUnitario) {
      this.PrecioUnitario = PrecioUnitario;
   }

   public double getValorTotal() {
      return ValorTotal;
   }

   public void setValorTotal(double ValorTotal) {
      this.ValorTotal = ValorTotal;
   }

   public MateriaPrima() {
   }

   public MateriaPrima(int IdInsumo, String RefArticulo, int IdMaterial, int IdProveedor, int Cantidad, String Color, double PrecioUnitario, double ValorTotal) {
      this.IdInsumo = IdInsumo;
      this.RefArticulo = RefArticulo;
      this.IdMaterial = IdMaterial;
      this.IdProveedor = IdProveedor;
      this.Cantidad = Cantidad;
      this.Color = Color;
      this.PrecioUnitario = PrecioUnitario;
      this.ValorTotal = ValorTotal;
   }

   public MateriaPrima(int IdInsumo, String RefArticulo) {
      this.IdInsumo = IdInsumo;
      this.RefArticulo = RefArticulo;
   }

   public MateriaPrima(int IdInsumo) {
      this.IdInsumo = IdInsumo;
   }

   public MateriaPrima(String RefArticulo) {
      this.RefArticulo = RefArticulo;
   }

   @Override
   public String toString() {
      return RefArticulo;
   }
//   public ArrayList<MateriaPrima> getMateriaPrima() {
//      Connection con = Conexion.getConexion();
//      Statement stm;
//      ResultSet result;
//      ArrayList<MateriaPrima> listaMateriaPrima = new ArrayList<>();
//      try {
//         stm = con.createStatement();
//         result = stm.executeQuery("SELECT IdInsumo, Nombre FROM materia_prima WHERE IdInsumo = IdInsumo");
//         while (result.next()) {
//            MateriaPrima material = new MateriaPrima();
//            material.setIdInsumo(result.getInt("IdInsumo"));
//            material.setNombre(result.getString("Nombre"));
//
//            listaMateriaPrima.add(material);
//         }
//      } catch (SQLException ex) {
//         java.util.logging.Logger.getLogger(MateriaPrima.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//      }
//      return listaMateriaPrima;
//   }
}
