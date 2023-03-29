
package Modelo;

import java.util.Date;

public class Nomina {
    private int IdPago;
    private int IdMes;
    private Date Fecha;
    private int IdRhumanos;
    private int IdSalario;

    public Nomina() {
    }

    public Nomina(int IdPago, int IdMes, Date Fecha, int IdRhumanos, int IdSalario) {
        this.IdPago = IdPago;
        this.IdMes = IdMes;
        this.Fecha = Fecha;
        this.IdRhumanos = IdRhumanos;
        this.IdSalario = IdSalario;
    }

    public int getIdPago() {
        return IdPago;
    }

    public void setIdPago(int IdPago) {
        this.IdPago = IdPago;
    }

    public int getIdMes() {
        return IdMes;
    }

    public void setIdMes(int IdMes) {
        this.IdMes = IdMes;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date Fecha) {
        this.Fecha = Fecha;
    }

    public int getIdRhumanos() {
        return IdRhumanos;
    }

    public void setIdRhumanos(int IdRhumanos) {
        this.IdRhumanos = IdRhumanos;
    }

    public int getIdSalario() {
        return IdSalario;
    }

    public void setIdSalario(int IdSalario) {
        this.IdSalario = IdSalario;
    }
    
}
