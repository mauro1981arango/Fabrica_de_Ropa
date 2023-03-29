
package Modelo;


public class Ciudades {
    private int IdCiudad;
    private String Ciudad;

    public Ciudades() {
    }

   public Ciudades(int IdCiudad, String Ciudad) {
      this.IdCiudad = IdCiudad;
      this.Ciudad = Ciudad;
   }
   
   public Ciudades(int IdCiudad) {
      this.IdCiudad = IdCiudad;
   }

   public int getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(int IdCiudad) {
        this.IdCiudad = IdCiudad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

   @Override
   public boolean equals(Object obj) {
      return this.IdCiudad == ((Ciudades) obj).IdCiudad;
   }
   
    
//    public ArrayList<Ciudades> getCiudades(){
//        Connection con = Conexion.getConexion();
//        Statement stm = null;
//        ResultSet result = null;
//        ArrayList<Ciudades> listaCiudades = new ArrayList<>();
//        try {
//            stm = con.createStatement();
//            result = stm.executeQuery("SELECT * FROM ciudades");
//            while(result.next() ){
//                Ciudades ciudad = new Ciudades();
//                ciudad.setIdCiudad(result.getInt("IdCiudad"));
//                ciudad.setCiudad(result.getString("Ciudad"));
//                listaCiudades.add(ciudad);
//            }
//        } catch (SQLException ex) {
//            Logger.getLogger(Ciudades.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return listaCiudades;
//    } 
}
