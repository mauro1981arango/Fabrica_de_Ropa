
package Modelo;

/**
 *
 * @author godie
 */
public class GruposSanguineos {
    private int IdRH;
    private String TipoSangre;

    public GruposSanguineos() {
    }

    public GruposSanguineos(int IdRH) {
        this.IdRH = IdRH;
    }

    public GruposSanguineos(int IdRH, String TipoSangre) {
        this.IdRH = IdRH;
        this.TipoSangre = TipoSangre;
    }

    public int getIdRH() {
        return IdRH;
    }

    public void setIdRH(int IdRH) {
        this.IdRH = IdRH;
    }

    public String getTipoSangre() {
        return TipoSangre;
    }

    public void setTipoSangre(String TipoSangre) {
        this.TipoSangre = TipoSangre;
    }

    @Override
    public String toString() {
        return IdRH + " - " + TipoSangre;
    }
    
}
