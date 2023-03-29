
package Modelo;


public class Proveedores {
    private int IdProveedor;
    private String NitProveedor;
    private String NombreEmpresa;
    private String Direccion;
    private String Correo;
    private String Telefono;
    private int IdCiudad;
    private String CuentaBancaria;
    private int IdCuenta;

    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    public String getNitProveedor() {
        return NitProveedor;
    }

    public void setNitProveedor(String NitProveedor) {
        this.NitProveedor = NitProveedor;
    }

    public String getNombreEmpresa() {
        return NombreEmpresa;
    }

    public void setNombreEmpresa(String NombreEmpresa) {
        this.NombreEmpresa = NombreEmpresa;
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public int getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(int IdCiudad) {
        this.IdCiudad = IdCiudad;
    }

    public String getCuentaBancaria() {
        return CuentaBancaria;
    }

    public void setCuentaBancaria(String CuentaBancaria) {
        this.CuentaBancaria = CuentaBancaria;
    }

    public int getIdCuenta() {
        return IdCuenta;
    }

    public void setIdCuenta(int IdCuenta) {
        this.IdCuenta = IdCuenta;
    }

    public Proveedores(int IdProveedor, String NitProveedor, String NombreEmpresa, String Direccion, String Correo, String Telefono, int IdCiudad, String CuentaBancaria, int IdCuenta) {
        this.IdProveedor = IdProveedor;
        this.NitProveedor = NitProveedor;
        this.NombreEmpresa = NombreEmpresa;
        this.Direccion = Direccion;
        this.Correo = Correo;
        this.Telefono = Telefono;
        this.IdCiudad = IdCiudad;
        this.CuentaBancaria = CuentaBancaria;
        this.IdCuenta = IdCuenta;
    }

    public Proveedores() {
    }
    
    public Proveedores(int IdProveedor, String NombreEmpresa) {
        this.IdProveedor = IdProveedor;
        this.NombreEmpresa = NombreEmpresa;
    }
    
    public Proveedores(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }

    @Override
    public String toString() {
        return  IdProveedor + " - " + NombreEmpresa;
    }   
}