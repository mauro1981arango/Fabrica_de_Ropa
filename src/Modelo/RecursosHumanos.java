
package Modelo;

import java.util.Date;


public class RecursosHumanos {
    private int IdRhumanos;
    private int Cedula;
    private String Nombres;
    private String Apellidos;
    private Date FechaNacimiento;
    private int IdRH;
    private String Telefono;
    private String Direccion;
    private String Correo;
    private int IdSalario;
    private int IdCuenta;
    private String NroCuenta;

    public RecursosHumanos() {
    }

    public RecursosHumanos(int IdRhumanos) {
        this.IdRhumanos = IdRhumanos;
    }

    public RecursosHumanos(int IdRhumanos, String Nombres) {
        this.IdRhumanos = IdRhumanos;
        this.Nombres = Nombres;
    }

    public RecursosHumanos(int IdRhumanos, int Cedula, String Nombres, String Apellidos, Date FechaNacimiento, int IdRH, String Telefono, String Direccion, String Correo, int IdSalario, int IdCuenta, String NroCuenta) {
        this.IdRhumanos = IdRhumanos;
        this.Cedula = Cedula;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.FechaNacimiento = FechaNacimiento;
        this.IdRH = IdRH;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.IdSalario = IdSalario;
        this.IdCuenta = IdCuenta;
        this.NroCuenta = NroCuenta;
    }

    public int getIdRhumanos() {
        return IdRhumanos;
    }

    public void setIdRhumanos(int IdRhumanos) {
        this.IdRhumanos = IdRhumanos;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public Date getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(Date FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getIdRH() {
        return IdRH;
    }

    public void setIdRH(int IdRH) {
        this.IdRH = IdRH;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public int getIdSalario() {
        return IdSalario;
    }

    public void setIdSalario(int IdSalario) {
        this.IdSalario = IdSalario;
    }

    public int getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(int IdCuenta) {
        this.IdCuenta = IdCuenta;
    }

    public String getNroCuenta() {
        return NroCuenta;
    }

    public void setNroCuenta(String NroCuenta) {
        this.NroCuenta = NroCuenta;
    }

    @Override
    public String toString() {
        return IdRhumanos + " - " + Nombres;
    }  
   
}
