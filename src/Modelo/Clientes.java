//En esta clase creamos los métodos get y set de nuestra clase Cliente
package Modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Clientes {

    //Declaramos las propiedades de nuestra clase Cliente
    private int IdCliente;
    private String Nombres;
    private String Apellidos;
    private String Telefono;
    private String Direccion;
    private int IdCiudad;

    public Clientes() {
    }

    public Clientes(int IdCliente, String Nombres, String Apellidos, String Telefono, String Direccion, int IdCiudad) {
        this.IdCliente = IdCliente;
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Telefono = Telefono;
        this.Direccion = Direccion;
        this.IdCiudad = IdCiudad;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
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

    public int getIdCiudad() {
        return IdCiudad;
    }

    public void setIdCiudad(int IdCiudad) {
        this.IdCiudad = IdCiudad;
    }

    public Clientes(int IdCliente, String Nombres) {
        this.IdCliente = IdCliente;
        this.Nombres = Nombres;
    }
    public Clientes(int IdCliente) {
        this.IdCliente = IdCliente;
    }
    
    @Override
    public String toString() {
        return   Nombres + "  " ;
    }
    
    public ArrayList<Clientes> getClientes(){
        Connection con = Conexion.getConexion();
        Statement stm = null;
        ResultSet result = null;
        ArrayList<Clientes> listaClientes = new ArrayList<>();
        try {
            stm = con.createStatement();
            result = stm.executeQuery("SELECT * FROM clientes");
            while(result.next() ){
                Clientes cliente = new Clientes();
                cliente.setIdCliente(result.getInt("IdCliente"));
                cliente.setNombres(result.getString("Nombres"));
                cliente.setApellidos(result.getString("Apellidos"));
                cliente.setTelefono(result.getString("Telefono"));
                cliente.setDireccion(result.getString("Direccion"));
                cliente.setIdCiudad(result.getInt("IdCiudad"));
                listaClientes.add(cliente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listaClientes;
    }
}
