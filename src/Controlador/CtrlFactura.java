package Controlador;

import Controlador.CtrlClientes;
import Modelo.ConsultasClientes;
import Modelo.ClienteDAO;
import Modelo.Clientes;
import Modelo.ColorCeldaTabla;
import Modelo.Conexion;
import Modelo.Factura;
import Modelo.DetalleFactura;
import Modelo.FacturaDAO;
import Modelo.GenerarCorrelativo;
import Modelo.RopaTerminada;
import Modelo.RopaTerminadaDAO;
import Modelo.Usuarios;
import Vista.frmCliente;

import Vista.frmFactura;
import Vista.frmRopaTerminada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public final class CtrlFactura implements ActionListener {

    int Idp;
    int cant;
    String cod;
    String desc;
    int item;
    double total;
    double precio;
    double totalapagar;
    final private frmFactura vistaFactura;
    final private Factura factura;
    final private FacturaDAO fDAO;
    final private DetalleFactura df;
    private DefaultTableModel modelo;
    final private Clientes cliente;
    final private ClienteDAO cliDao;
    private RopaTerminada pro;
    final private RopaTerminadaDAO proDAO;
    Usuarios us = new Usuarios();

    public CtrlFactura(frmFactura vistaFactura, Factura factura, FacturaDAO fDAO, DetalleFactura df, DefaultTableModel modelo, Clientes cliente, ClienteDAO cliDao, RopaTerminada pro, RopaTerminadaDAO proDAO) {
        this.vistaFactura = vistaFactura;
        this.factura = factura;
        this.fDAO = fDAO;
        this.df = df;
        this.modelo = modelo;
        this.cliente = cliente;
        this.cliDao = cliDao;
        this.pro = pro;
        this.proDAO = proDAO;
        this.vistaFactura.btnBuscarCliente.addActionListener(this);
        this.vistaFactura.btnBuscarRopaTerminada.addActionListener(this);
        this.vistaFactura.btnAgregarRopa.addActionListener(this);
        this.vistaFactura.btnRegistrarVenta.addActionListener(this);
        this.vistaFactura.btnCancelar.addActionListener(this);
        this.vistaFactura.btnBuscar.addActionListener(this);

    }

    public void iniciar() {
        vistaFactura.setTitle("Registro de Factura");
        vistaFactura.setLocationRelativeTo(null);
        vistaFactura.txtIdFactura.setVisible(false);
        vistaFactura.cbxIdCliente.setVisible(true);
        llenarUsuarios();
        cargarCodigo();

    }

//    public void cargarTabla() {
//
//        vistaFactura.TblFactura.setModel(facturaDAO.getFactura());
//    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaFactura.btnRegistrarVenta) {

            if (vistaFactura.txtTotal.getText().equals("")) {
                JOptionPane.showConfirmDialog(null, "Debe ingresar datos");
            } else {
                factura.setFecha(vistaFactura.txtFecha.getText());
                factura.setIdCliente(Integer.parseInt(vistaFactura.txtIdCliente.getText()));
                //factura.setIdUsuario(vistaFactura.cbxUsuario.getSelectedIndex() + 1);
                factura.setNroFactura(vistaFactura.txtNroFactura.getText());
                factura.setMontoPago(Double.parseDouble(vistaFactura.txtMontoPago.getText()));
                factura.setMontoCambio(Double.parseDouble(vistaFactura.txtMontoCambio.getText()));
                factura.setTotal(Double.parseDouble(vistaFactura.txtTotal.getText()));
                guardarFactura();
                guardarDetalle();
                actualizarStock();
                limpiar();
                JOptionPane.showConfirmDialog(null, "Factura generada exitosamente");

            }
        }
        if (e.getSource() == vistaFactura.btnAgregarRopa) {
            agregarProducto();
        }
        if (e.getSource() == vistaFactura.btnBuscarCliente) {
            if (vistaFactura.txtIdCliente.getText().equals("")) {
                JOptionPane.showConfirmDialog(null, "Debe ingresar un id de un cliente");
            } else {
                vistaFactura.txtNombresCliente.getText();
                vistaFactura.txtApellidos.getText();
                buscarClientes();
            }
        }
        if (e.getSource() == vistaFactura.btnBuscarRopaTerminada) {
            buscarProducto();
        }
    }

    public void guardarFactura() {
        String fecha = vistaFactura.txtFecha.getText();
        int idCliente = (Integer.parseInt(vistaFactura.txtIdCliente.getText()));
        int idUsuario = (Integer.parseInt(vistaFactura.lblIdUsuarioVendedor.getText()));
        String numeroFactura = vistaFactura.txtNroFactura.getText();
        double pagocon = Double.parseDouble(vistaFactura.txtMontoPago.getText());
        double devolucion = Double.parseDouble(vistaFactura.txtMontoCambio.getText());
        total = Double.parseDouble(vistaFactura.txtTotal.getText());//totalapagar

        factura.setFecha(fecha);
        factura.setIdCliente(idCliente);
        factura.setIdUsuario(idUsuario);
        factura.setNroFactura(numeroFactura);
        factura.setMontoPago(pagocon);
        factura.setMontoCambio(devolucion);
        factura.setTotal(total);
        fDAO.GuardarFactura(factura);

    }

    public void guardarDetalle() {
        String idf = fDAO.idFactura();
        int idv = Integer.parseInt(idf);
        for (int i = 0; i < vistaFactura.tblDetalle.getRowCount(); i++) {
            int idprod = Integer.parseInt(vistaFactura.tblDetalle.getValueAt(i, 1).toString());
            double pventa = Double.parseDouble(vistaFactura.tblDetalle.getValueAt(i, 4).toString());
            int cantidad = Integer.parseInt(vistaFactura.tblDetalle.getValueAt(i, 5).toString());
            double subtotal = Double.parseDouble(vistaFactura.tblDetalle.getValueAt(i, 6).toString());
            df.setIdFactura(idv);
            df.setIdProducto(idprod);
            df.setPrecioVenta(pventa);
            df.setCantidad(cantidad);
            df.setSubTotal(subtotal);
            fDAO.GuardarDetalleFactura(df);
        }
    }

    public void agregarProducto() {
        modelo = (DefaultTableModel) vistaFactura.tblDetalle.getModel();
        item = item + 1;
        pro = proDAO.listarID(Idp);
        cod = vistaFactura.txtCodigoProducto.getText();
        desc = vistaFactura.txtDescripcion.getText();
        int Stock = Integer.parseInt(vistaFactura.txtStock.getText());
        precio = Double.parseDouble(vistaFactura.txtPrecioVenta.getText());
        cant = Integer.parseInt(vistaFactura.txtCantidad.getValue().toString());
        total = cant * precio;
        ArrayList lista = new ArrayList();
        if (Stock > 0) {
            lista.add(item);
            lista.add(Idp);
            lista.add(cod);
            lista.add(desc);
            lista.add(precio);
            lista.add(cant);
            lista.add(total);
            Object[] obj = new Object[7];
            obj[0] = lista.get(0);
            obj[1] = lista.get(1);
            obj[2] = lista.get(2);
            obj[3] = lista.get(3);
            obj[4] = lista.get(4);
            obj[5] = lista.get(5);
            obj[6] = lista.get(6);
            modelo.addRow(obj);
            vistaFactura.tblDetalle.setModel(modelo);
            calcularTotal();
            limpiarProducto();
        } else {
            JOptionPane.showConfirmDialog(null, "Stock no disponible, agregue produtos");
        }
    }

    public void calcularTotal() {
        totalapagar = 0;
        for (int i = 0; i < vistaFactura.tblDetalle.getRowCount(); i++) {
            cant = Integer.parseInt(vistaFactura.tblDetalle.getValueAt(i, 5).toString());
            precio = Double.parseDouble(vistaFactura.tblDetalle.getValueAt(i, 4).toString());
            totalapagar = totalapagar + cant * precio;
        }
        vistaFactura.txtTotal.setText("" + totalapagar);
    }

    public void buscarProducto() {
        int respuesta = 0;
        Idp = Integer.parseInt(vistaFactura.txtIdProducto.getText());
        if (vistaFactura.txtIdProducto.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe selecionar un id de un Producto");
        }
        RopaTerminada vestuario = proDAO.listarID(Idp);
        if (vestuario.getCodigo() != null) {
            vistaFactura.txtCodigoProducto.setText(vestuario.getCodigo());
            vistaFactura.txtDescripcion.setText(vestuario.getDescripcion());
            vistaFactura.txtStock.setText("" + vestuario.getStock());
            vistaFactura.txtTalla.setText(vestuario.getTalla());
            vistaFactura.txtColor.setText(vestuario.getColor());
            vistaFactura.txtPrecioVenta.setText("" + vestuario.getPrecioVenta());
            vistaFactura.txtCantidad.requestFocus();
        } else {
            JOptionPane.showConfirmDialog(null, "Producto no registrado, ¿Desea registrar?");
            if (respuesta == 0) {
                frmRopaTerminada vistapro = new frmRopaTerminada();
                vistapro.setVisible(true);
            }
        }
    }

    public void buscarClientes() {
        int respuesta = 0;
        int Id = Integer.parseInt(vistaFactura.txtIdCliente.getText());
        if (vistaFactura.txtIdCliente.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Debe selecionar un id de un cliente");
        }
        Clientes clientes = cliDao.listarIdCliente(Id);
        if (cliente.getClientes() != null) {
            vistaFactura.txtIdCliente.getText();
            vistaFactura.txtNombresCliente.setText(clientes.getNombres());
            vistaFactura.txtApellidos.setText(clientes.getApellidos());
            vistaFactura.txtIdProducto.requestFocus();
            //JOptionPane.showMessageDialog(null, "Selecionó la opción " + Id);

        } else {
            JOptionPane.showConfirmDialog(null, "Cliente no registrado, ¿Desea registrar?");
            if (respuesta == 0) {
                frmCliente fCli = new frmCliente();
                Clientes cli = new Clientes();
                ConsultasClientes consulcli = new ConsultasClientes();
                ClienteDAO cliDAO = new ClienteDAO();
                ColorCeldaTabla color = new ColorCeldaTabla();
                CtrlClientes ctrl = new CtrlClientes(cli, consulcli, fCli, color);

                ctrl.iniciar();
                fCli.setVisible(true);
            }
        }
    }

    public void actualizarStock() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            RopaTerminada pr = new RopaTerminada();
            cod = vistaFactura.tblDetalle.getValueAt(i, 2).toString();
            cant = Integer.parseInt(vistaFactura.tblDetalle.getValueAt(i, 5).toString());
            pr = proDAO.listarID(Idp);
            int stockactual = pr.getStock() - cant;
            proDAO.actualizarStock(stockactual, cod);
        }
    }

    //Con este método se limpian las cajas de texto despues de guardar un registro,
    //o si por el contario ocurre un error también se lipiarán las cajas de texto automaticamente 
    public void limpiar() {
        limpiarTabla();
        vistaFactura.txtApellidos.setText("");
        // vistaFactura.txtCantidad.setValue("");
        vistaFactura.txtCodigoProducto.setText("");
        vistaFactura.txtColor.setText("");
        vistaFactura.txtDescripcion.setText("");
        vistaFactura.txtIdCliente.setText("");
        vistaFactura.txtIdFactura.setText("");
        vistaFactura.txtIdProducto.setText("");
        vistaFactura.txtMontoCambio.setText("");
        vistaFactura.txtMontoPago.setText("");
        //vistaFactura.txtNombreUsuario.setText("");
        vistaFactura.txtNombresCliente.setText("");
        vistaFactura.txtPrecioVenta.setText("");
        vistaFactura.txtStock.setText("");
        vistaFactura.txtTalla.setText("");
        vistaFactura.txtTotal.setText("");
        vistaFactura.txtIdCliente.requestFocus();
    }

    void limpiarProducto() {
        vistaFactura.txtCodigoProducto.setText("");
        vistaFactura.txtColor.setText("");
        vistaFactura.txtDescripcion.setText("");
        //vistaFactura.txtCantidad.setValue("");
        vistaFactura.txtIdProducto.setText("");
        vistaFactura.txtPrecioVenta.setText("");
        vistaFactura.txtStock.setText("");
        vistaFactura.txtTalla.setText("");
        vistaFactura.txtCantidad.remove(vistaFactura);
        vistaFactura.txtIdProducto.requestFocus();
    }

    public void llenarClientes() {
        Clientes modClientes = new Clientes();
        ArrayList<Clientes> listaclientes = modClientes.getClientes();
        vistaFactura.cbxIdCliente.removeAllItems();
        //vistaFactura.cbxIdCliente.addItem("Selecione");
        for (int i = 0; i < listaclientes.size(); i++) {
            vistaFactura.cbxIdCliente.addItem(new Clientes(listaclientes.get(i).getIdCliente(), listaclientes.get(i).getNombres()));

        }
    }

    public void llenarUsuarios() {
        Usuarios modUsuarios = new Usuarios();
        ArrayList<Usuarios> listausuarios = modUsuarios.getUsuarios();
        //vistaFactura.cbxUsuario.removeAllItems();
        //vistaFactura.cbxUsuarios.addItem("Selecione");
        for (int i = 0; i < listausuarios.size(); i++) {
            //vistaFactura.cbxUsuario.addItem(new Usuarios(listausuarios.get(i).getIdUsuario(), listausuarios.get(i).getNombre()));

        }
    }

    public void limpiarTabla() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void cargarCodigo() {
        Connection con = Conexion.getConexion();
        int j;
        String c = "";
        String sql = "SELECT max(NroFactura) FROM factura";

        try {
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if (rs.next()) {
                c = rs.getString(1);
            }
            if (c == null) {
                vistaFactura.txtNroFactura.setText("CD00001");
            } else {
                char r1 = c.charAt(2);
                char r2 = c.charAt(3);
                char r3 = c.charAt(4);
                char r4 = c.charAt(5);
                String r;
                r = "" + r1 + r2 + r3 + r4;
                j = Integer.parseInt(r);
                GenerarCorrelativo corr = new GenerarCorrelativo();
                corr.generar(j);
                vistaFactura.txtNroFactura.setText("CD" + corr.serie());
            }
        } catch (NumberFormatException | SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(frmFactura.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
