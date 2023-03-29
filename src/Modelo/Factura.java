package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Factura {

    private int IdFactura;
    private String Fecha;
    private int IdCliente;
    private int IdUsuario;
    private String NroFactura;
    private double MontoPago;
    private double MontoCambio;
    private double Total;

    public int getIdFactura() {
        return IdFactura;
    }

    public void setIdFactura(int IdFactura) {
        this.IdFactura = IdFactura;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    
    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdUsuario() {
        return IdUsuario;
    }

    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }

    public String getNroFactura() {
        return NroFactura;
    }

    public void setNroFactura(String NroFactura) {
        this.NroFactura = NroFactura;
    }

    public double getMontoPago() {
        return MontoPago;
    }

    public void setMontoPago(double MontoPago) {
        this.MontoPago = MontoPago;
    }

    public double getMontoCambio() {
        return MontoCambio;
    }

    public void setMontoCambio(double MontoCambio) {
        this.MontoCambio = MontoCambio;
    }
    
    public double getTotal() {
        return Total;
    }

    public void setTotal(double Total) {
        this.Total = Total;
    }
    
    public Factura() {
    }

    public Factura(int IdFactura, String Fecha, int IdCliente, int IdUsuario, String NroFactura, double MontoPago, double MontoCambio, double Total) {
        this.IdFactura = IdFactura;
        this.Fecha = Fecha;
        this.IdCliente = IdCliente;
        this.IdUsuario = IdUsuario;
        this.MontoPago = MontoPago;
        this.MontoCambio = MontoCambio;
        this.Total = Total;
    }

    public Factura(int IdFactura, String Fecha) {
        this.IdFactura = IdFactura;
        this.Fecha = Fecha;
    }
    
    public Factura(int IdFactura) {
        this.IdFactura = IdFactura;
    }

    @Override
    public String toString() {
        return Fecha + "  ";
    }

    public ArrayList<Factura> getFactura() {
        Connection con = Conexion.getConexion();
        Statement stm = null;
        ResultSet result = null;
        ArrayList<Factura> listaFactura = new ArrayList<>();
        try {
            stm = con.createStatement();
            result = stm.executeQuery("SELECT * FROM factura");
            while (result.next()) {
                Factura factura = new Factura();
                factura.setIdFactura(result.getInt("IdFactura"));
                factura.setFecha(result.getString("Fecha"));
                factura.setIdCliente(result.getInt("IdCliente"));
                factura.setIdUsuario(result.getInt("IdUsuario"));
                factura.setNroFactura(result.getString("NroFactura"));
                factura.setMontoPago(result.getDouble("MontoPago"));
                factura.setMontoCambio(result.getDouble("MontoCambio"));
                factura.setTotal(result.getDouble("Total"));
                listaFactura.add(factura);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Factura.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaFactura;
    }
}
