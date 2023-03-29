
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;


public class RopaTerminada {
    private int IdProducto;
    private String Codigo;
    private String Descripcion;
    private String Talla;
    private String Color;
    private int Stock;
    private double PrecioElaboracion;
    private double PrecioVenta;

    public int getIdProducto() {
        return IdProducto;
    }

    public void setIdProducto(int IdProducto) {
        this.IdProducto = IdProducto;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }
    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public String getTalla() {
        return Talla;
    }

    public void setTalla(String Talla) {
        this.Talla = Talla;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public int getStock() {
        return Stock;
    }

    public void setStock(int Stock) {
        this.Stock = Stock;
    }

    public double getPrecioElaboracion() {
        return PrecioElaboracion;
    }

    public void setPrecioElaboracion(double PrecioElaboracion) {
        this.PrecioElaboracion = PrecioElaboracion;
    }

    public double getPrecioVenta() {
        return PrecioVenta;
    }

    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }

    public RopaTerminada() {
    }

    public RopaTerminada(int IdProducto, String Codigo, String Descripcion, String Talla, String Color, int Stock, double PrecioElaboracion, double PrecioVenta) {
        this.IdProducto = IdProducto;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
        this.Talla = Talla;
        this.Color = Color;
        this.Stock = Stock;
        this.PrecioElaboracion = PrecioElaboracion;
        this.PrecioVenta = PrecioVenta;
    }

    
    
    public RopaTerminada(int IdProducto, String Descripcion) {
        this.IdProducto = IdProducto;
        this.Descripcion = Descripcion;
    }

    public RopaTerminada(int IdProducto) {
        this.IdProducto = IdProducto;
    }
    

    @Override
    public String toString() {
        return   Descripcion + "  " ;
    }
   public ArrayList<RopaTerminada> getRopaTerminada(){
        Connection con = Conexion.getConexion();
        Statement stm = null;
        ResultSet result = null;
        ArrayList<RopaTerminada> listaRopaTerminada = new ArrayList<>();
        try {
            stm = con.createStatement();
            result = stm.executeQuery("SELECT * FROM ropa_terminada");
            while(result.next() ){
                RopaTerminada producto = new RopaTerminada();
                producto.setIdProducto(result.getInt("IdProducto"));
                producto.setCodigo(result.getString("Codigo"));
                producto.setDescripcion(result.getString("Descripcion"));
                producto.setTalla(result.getString("Talla"));
                producto.setColor(result.getString("Color"));
                producto.setStock(result.getInt("Stock"));
                producto.setPrecioElaboracion(result.getDouble("PrecioElaboracion"));
                producto.setPrecioVenta(result.getDouble("PrecioVenta"));
                listaRopaTerminada.add(producto);
            }
        } catch (SQLException ex) {
            Logger.getLogger(RopaTerminada.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaRopaTerminada;
    } 
}
