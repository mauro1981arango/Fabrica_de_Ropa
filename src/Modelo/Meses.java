
package Modelo;

/**
 *
 * @author godie
 */
public class Meses {
    private int IdMes;
    private String Mes;

    public Meses() {
    }

    public Meses(int IdMes, String Mes) {
        this.IdMes = IdMes;
        this.Mes = Mes;
    }
    public Meses(int IdMes) {
        this.IdMes = IdMes;
    }

    public int getIdMes() {
        return IdMes;
    }

    public void setIdMes(int IdMes) {
        this.IdMes = IdMes;
    }

    public String getMes() {
        return Mes;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    @Override
    public String toString() {
        return IdMes + " - " + Mes ;
    }
    
}
