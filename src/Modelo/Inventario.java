
package Modelo;

import java.util.Date;


public class Inventario {
    private int IdInventario;
    private String Nombre;
    private Date FechaCompra;
    private Date FechaMantenimiento;
    private int IdInsumo;
    private int IdProveedor;
    private int IdMaterial;

    
   
    
    public int getIdInventario() {
        return IdInventario;
    }

    public void setIdInventario(int IdInventario) {
        this.IdInventario = IdInventario;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public Date getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(Date FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public Date getFechaMantenimiento() {
        return FechaMantenimiento;
    }

    public void setFechaMantenimiento(Date FechaMantenimiento) {
        this.FechaMantenimiento = FechaMantenimiento;
    }
    
    public int getIdInsumo() {
        return IdInsumo;
    }

    public void setIdInsumo(int IdInsumo) {
        this.IdInsumo = IdInsumo;
    }

    public int getIdProveedor() {
        return IdProveedor;
    }

    public void setIdProveedor(int IdProveedor) {
        this.IdProveedor = IdProveedor;
    }
    
    
    public int getIdMaterial() {
        return IdMaterial;
    }

    public void setIdMaterial(int IdMaterial) {
        this.IdMaterial = IdMaterial;
    }
}
