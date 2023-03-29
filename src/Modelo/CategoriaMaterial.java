package Modelo;

/**
 *
 * @author Diego Arango
 */
public class CategoriaMaterial {

   private int IdMaterial;
   private String Tipo;

   public CategoriaMaterial() {
   }

   public CategoriaMaterial(int IdMaterial, String Tipo) {
      this.IdMaterial = IdMaterial;
      this.Tipo = Tipo;
   }

   public int getIdMaterial() {
      return IdMaterial;
   }

   public void setIdMaterial(int IdMaterial) {
      this.IdMaterial = IdMaterial;
   }

   public String getTipo() {
      return Tipo;
   }

   public void setTipo(String Tipo) {
      this.Tipo = Tipo;
   }

   public CategoriaMaterial(int IdMaterial) {
      this.IdMaterial = IdMaterial;
   }

   public CategoriaMaterial(String Tipo) {
      this.Tipo = Tipo;
   }

   @Override
   public String toString() {
      return Tipo;
   }

}
