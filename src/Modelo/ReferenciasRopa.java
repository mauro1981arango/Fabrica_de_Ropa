
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReferenciasRopa {
   private int IdVestuario; 
   private String Codigo;
   private String Descripcion;

    public int getIdVestuario() {
        return IdVestuario;
    }

    public void setIdVestuario(int IdVestuario) {
        this.IdVestuario = IdVestuario;
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

    public ReferenciasRopa() {
    }

    public ReferenciasRopa(int IdVestuario, String Codigo, String Descripcion) {
        this.IdVestuario = IdVestuario;
        this.Codigo = Codigo;
        this.Descripcion = Descripcion;
    }

    public ReferenciasRopa(int IdVestuario) {
        this.IdVestuario = IdVestuario;
    }

    public ReferenciasRopa(int IdVestuario, String Codigo) {
        this.IdVestuario = IdVestuario;
        this.Codigo = Codigo;
    }
    
    @Override
    public String toString() {
        return   Codigo + "  " ;
    }
    
    public ArrayList<ReferenciasRopa> getReferenciasRopa(){
        Connection con = Conexion.getConexion();
        Statement stm = null;
        ResultSet result = null;
        ArrayList<ReferenciasRopa> listaReferenciasRopa = new ArrayList<>();
        try {
            stm = con.createStatement();
            result = stm.executeQuery("SELECT * FROM referencias_ropa");
            while(result.next() ){
                ReferenciasRopa referencias = new ReferenciasRopa();
                referencias.setIdVestuario(result.getInt("IdVestuario"));
                referencias.setCodigo(result.getString("Codigo"));
                referencias.setDescripcion(result.getString("Descripcion"));
                listaReferenciasRopa.add(referencias);
            }
        } catch (SQLException ex) {
            Logger.getLogger(ReferenciasRopa.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaReferenciasRopa;
    }
}
