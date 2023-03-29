package Modelo;

public class DetalleFactura {

   private int IdDetalle;
   private int IdFactura;
   private int IdProducto;
   private double PrecioVenta;
   private int Cantidad;
   private double SubTotal;

   public DetalleFactura() {
   }

   public DetalleFactura(int IdDetalle, int IdFactura, int IdProducto, double PrecioVenta, int Cantidad, double SubTotal) {
      this.IdDetalle = IdDetalle;
      this.IdFactura = IdFactura;
      this.IdProducto = IdProducto;
      this.PrecioVenta = PrecioVenta;
      this.Cantidad = Cantidad;
      this.SubTotal = SubTotal;
   }

   public int getIdDetalle() {
      return IdDetalle;
   }

   public void setIdDetalle(int IdDetalle) {
      this.IdDetalle = IdDetalle;
   }

   public int getIdFactura() {
      return IdFactura;
   }

   public void setIdFactura(int IdFactura) {
      this.IdFactura = IdFactura;
   }

   public int getIdProducto() {
      return IdProducto;
   }

   public void setIdProducto(int IdProducto) {
      this.IdProducto = IdProducto;
   }

   public double getPrecioVenta() {
      return PrecioVenta;
   }

   public void setPrecioVenta(double PrecioVenta) {
      this.PrecioVenta = PrecioVenta;
   }

   public int getCantidad() {
      return Cantidad;
   }

   public void setCantidad(int Cantidad) {
      this.Cantidad = Cantidad;
   }

   public double getSubTotal() {
      return SubTotal;
   }

   public void setSubTotal(double SubTotal) {
      this.SubTotal = SubTotal;
   }

}
