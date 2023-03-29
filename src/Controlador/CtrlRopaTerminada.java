package Controlador;

import Modelo.ConsultasRopaTerminada;
import Modelo.RopaTerminada;
import Modelo.RopaTerminadaDAO;
import Vista.frmRopaTerminada;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public final class CtrlRopaTerminada implements ActionListener {

    private RopaTerminada modelVestuario;
    private ConsultasRopaTerminada modelConsultaVestuario;
    private final frmRopaTerminada frmVestuario;
    private final RopaTerminadaDAO productosDAO = new RopaTerminadaDAO();

    public CtrlRopaTerminada(frmRopaTerminada vista_productos) {
        frmVestuario = vista_productos;
        cargarTabla();
        iniciar();
    }

    public CtrlRopaTerminada(RopaTerminada modelVestuario, ConsultasRopaTerminada modelConsultaVestuario, frmRopaTerminada frmVestuario) {
        this.modelVestuario = modelVestuario;
        this.modelConsultaVestuario = modelConsultaVestuario;
        this.frmVestuario = frmVestuario;
        this.frmVestuario.btnRegistrar.addActionListener(this);
        this.frmVestuario.btnEliminar.addActionListener(this);
        this.frmVestuario.btnModificar.addActionListener(this);
        this.frmVestuario.btnLimpiar.addActionListener(this);
        this.frmVestuario.btnBuscar.addActionListener(this);
        cargarTabla();
        iniciar();

    }

    public void iniciar() {
        frmVestuario.setTitle("Productos para la venta");
        frmVestuario.setLocationRelativeTo(null);
        frmVestuario.setVisible(true);
        frmVestuario.txtId.setVisible(false);
        
    }

    public void cargarTabla() {

        frmVestuario.tblRopaTerminada.setModel(productosDAO.getProductos());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmVestuario.btnRegistrar) {
            modelVestuario.setCodigo(frmVestuario.txtCodigo.getText());
            modelVestuario.setDescripcion(frmVestuario.txtDescripcion.getText());
            modelVestuario.setTalla(frmVestuario.txtTalla.getText());
            modelVestuario.setColor(frmVestuario.txtColor.getText());
            modelVestuario.setStock(Integer.parseInt(frmVestuario.txtStock.getText()));
            modelVestuario.setPrecioElaboracion(Double.parseDouble(frmVestuario.txtPrecioElaboracion.getText()));
            modelVestuario.setPrecioVenta(Double.parseDouble(frmVestuario.txtPrecioVenta.getText()));

            if (modelConsultaVestuario.Registrar(modelVestuario)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos" + e);
                limpiar();
            }
        }
        if (e.getSource() == frmVestuario.btnModificar) {
            
            modelVestuario.setCodigo(frmVestuario.txtCodigo.getText());
            modelVestuario.setDescripcion(frmVestuario.txtDescripcion.getText());
            modelVestuario.setTalla(frmVestuario.txtTalla.getText());
            modelVestuario.setColor(frmVestuario.txtColor.getText());
            modelVestuario.setStock(Integer.parseInt(frmVestuario.txtStock.getText()));
            modelVestuario.setPrecioElaboracion(Double.parseDouble(frmVestuario.txtPrecioElaboracion.getText()));
            modelVestuario.setPrecioVenta(Double.parseDouble(frmVestuario.txtPrecioVenta.getText()));
            modelVestuario.setIdProducto(Integer.parseInt(frmVestuario.txtId.getText()));

            if (modelConsultaVestuario.Modificar(modelVestuario)) {
                JOptionPane.showMessageDialog(null, "Actualizado con éxito !!");
                cargarTabla();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar los datos" + e);
                limpiar();
            }
        }
        if (e.getSource() == frmVestuario.btnEliminar) {
            modelVestuario.setIdProducto(Integer.parseInt(frmVestuario.txtBuscar.getText()));
            if (modelConsultaVestuario.Eliminar(modelVestuario)) {
                JOptionPane.showMessageDialog(null, "Eliminado con éxito!!");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar" + e);
                limpiar();
            }
        }
        if (e.getSource() == frmVestuario.btnBuscar) {
            modelVestuario.setIdProducto(Integer.parseInt(frmVestuario.txtBuscar.getText()));
            if (modelConsultaVestuario.Buscar(modelVestuario)) {
                frmVestuario.txtId.setText(String.valueOf(modelVestuario.getIdProducto()));
                frmVestuario.txtCodigo.setText(modelVestuario.getCodigo());
                frmVestuario.txtDescripcion.setText(modelVestuario.getDescripcion());
                frmVestuario.txtTalla.setText(String.valueOf(modelVestuario.getTalla()));
                frmVestuario.txtColor.setText(modelVestuario.getColor());
                frmVestuario.txtStock.setText(String.valueOf(modelVestuario.getStock()));
                frmVestuario.txtPrecioElaboracion.setText(String.valueOf(modelVestuario.getPrecioElaboracion()));
                frmVestuario.txtPrecioVenta.setText(String.valueOf(modelVestuario.getPrecioVenta()));
            }
            if (modelConsultaVestuario.Buscar(modelVestuario)) {
                JOptionPane.showMessageDialog(null, "Aquí está todo !!");
                
            } else {
                JOptionPane.showMessageDialog(null, "Error, por favor realice de nuevo la búsqueda" + e);
                limpiar();
            }
        }
        if (e.getSource() == frmVestuario.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        frmVestuario.txtId.setText(null);
        frmVestuario.txtTalla.setText(null);
        frmVestuario.txtCodigo.setText(null);
        frmVestuario.txtDescripcion.setText(null);
        frmVestuario.txtColor.setText(null);
        frmVestuario.txtStock.setText(null);
        frmVestuario.txtPrecioElaboracion.setText(null);
        frmVestuario.txtPrecioVenta.setText(null);
        frmVestuario.txtBuscar.setText(null);

    }
}
