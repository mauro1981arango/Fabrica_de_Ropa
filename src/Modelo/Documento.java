
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Diego Arango
 */
public class Documento {
    private int IdDocumento;
    private String TipoDocumento;

    public Documento() {
    }

    public int getIdDocumento() {
        return IdDocumento;
    }

    public void setIdDocumento(int IdDocumento) {
        this.IdDocumento = IdDocumento;
    }

    public String getTipoDocumento() {
        return TipoDocumento;
    }

    public void setTipoDocumento(String TipoDocumento) {
        this.TipoDocumento = TipoDocumento;
    }

    public Documento(int IdDocumento, String TipoDocumento) {
        this.IdDocumento = IdDocumento;
        this.TipoDocumento = TipoDocumento;
    }

    public Documento(int IdDocumento) {
        this.IdDocumento = IdDocumento;
    }
    
    @Override
    public String toString() {
        return this.getTipoDocumento();//TipoDocumento + "";
    }
    
    public ArrayList<Documento> getDocumento() {
        Connection con = Conexion.getConexion();
        Statement stm;
        ResultSet result;
        ArrayList<Documento> listaDocumento = new ArrayList<>();
        try {
            stm = con.createStatement();
            result = stm.executeQuery("SELECT * FROM documentos");
            while (result.next()) {
                Documento documento = new Documento();
                documento.setIdDocumento(result.getInt("IdDocumento"));
                documento.setTipoDocumento(result.getString("TipoDocumento"));
                
                listaDocumento.add(documento);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Documento.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaDocumento;
    }
}
