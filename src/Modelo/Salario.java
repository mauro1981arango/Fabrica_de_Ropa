
package Modelo;

/**
 *
 * @author godie
 */
public class Salario {
    private int IdSalario;
    private double ValorSalario;
    private String Ocupacion;

    public Salario() {
    }

    public Salario(int IdSalario, double ValorSalario, String Ocupacion) {
        this.IdSalario = IdSalario;
        this.ValorSalario = ValorSalario;
        this.Ocupacion = Ocupacion;
    }

    public Salario(int IdSalario) {
        this.IdSalario = IdSalario;
    }

    public int getIdSalario() {
        return IdSalario;
    }

    public void setIdSalario(int IdSalario) {
        this.IdSalario = IdSalario;
    }

    public double getValorSalario() {
        return ValorSalario;
    }

    public void setValorSalario(double ValorSalario) {
        this.ValorSalario = ValorSalario;
    }

    public String getOcupacion() {
        return Ocupacion;
    }

    public void setOcupacion(String Ocupacion) {
        this.Ocupacion = Ocupacion;
    }

    @Override
    public String toString() {
        return  IdSalario + " - " + ValorSalario;
    }
    
}
