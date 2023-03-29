package Controlador;

import Modelo.ConsultasNomina;
import Modelo.Nomina;
import Modelo.NominaDAO;
import Vista.frmNomina;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public final class CtrlNomina implements ActionListener {

    private Nomina modelPago;
    private ConsultasNomina consultasPago;
    private final frmNomina vistaPago;
    private final NominaDAO pagosDAO = new NominaDAO();

    public CtrlNomina(frmNomina vista_nomina) {
        vistaPago = vista_nomina;
        cargarTabla();
        iniciar();
    }

    public CtrlNomina(Nomina modelPago, ConsultasNomina consultasPago, frmNomina vistaPago) {
        this.modelPago = modelPago;
        this.consultasPago = consultasPago;
        this.vistaPago = vistaPago;
        this.vistaPago.btnRegistrar.addActionListener(this);
        this.vistaPago.btnEliminar.addActionListener(this);
        this.vistaPago.btnModificar.addActionListener(this);
        this.vistaPago.btnLimpiar.addActionListener(this);
        this.vistaPago.btnBuscar.addActionListener(this);
        cargarTabla();
        iniciar();

    }

    public void iniciar() {
        vistaPago.setTitle("Pago de Nomina");
        vistaPago.setLocationRelativeTo(null);
        vistaPago.txtIdPago.setVisible(false);
        
        vistaPago.cbxIdMes.removeAllItems();
        AutoCompleteDecorator.decorate(vistaPago.cbxIdMes);
        pagosDAO.ListarMeses(vistaPago.cbxIdMes);
        
        vistaPago.cbxIdRhumanos.removeAllItems();
        AutoCompleteDecorator.decorate(vistaPago.cbxIdRhumanos);
        pagosDAO.ListarRhumanos(vistaPago.cbxIdRhumanos);
        
        vistaPago.cbxIdSalario.removeAllItems();
        AutoCompleteDecorator.decorate(vistaPago.cbxIdSalario);
        pagosDAO.ListarSalarios(vistaPago.cbxIdSalario);
    }

    public void cargarTabla() {

        vistaPago.tblNomina.setModel(pagosDAO.getNomina());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == vistaPago.btnRegistrar) {
            modelPago.setIdMes(vistaPago.cbxIdMes.getSelectedIndex() + 1);
            SimpleDateFormat foramtoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = foramtoFecha.format(vistaPago.jDateFecha.getDate());
            modelPago.setFecha(vistaPago.jDateFecha.getDate());
            modelPago.setIdRhumanos(vistaPago.cbxIdRhumanos.getSelectedIndex() + 1);
            modelPago.setIdSalario(vistaPago.cbxIdSalario.getSelectedIndex() + 1);

            if (consultasPago.Registar(modelPago)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                cargarTabla();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos" + e);
                limpiar();
            }
        }
        if (e.getSource() == vistaPago.btnModificar) {
            modelPago.setIdMes(vistaPago.cbxIdMes.getSelectedIndex() + 1);
            SimpleDateFormat foramtoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = foramtoFecha.format(vistaPago.jDateFecha.getDate());
            modelPago.setFecha(vistaPago.jDateFecha.getDate());
            modelPago.setIdRhumanos(vistaPago.cbxIdRhumanos.getSelectedIndex() + 1);
            modelPago.setIdSalario(vistaPago.cbxIdSalario.getSelectedIndex() + 1);
            modelPago.setIdPago(Integer.parseInt(vistaPago.txtIdPago.getText()));
            if (consultasPago.Modificar(modelPago)) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
                cargarTabla();
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error " + e.toString());
                limpiar();
            }
        }
        if (e.getSource() == vistaPago.btnEliminar) {
            modelPago.setIdPago(Integer.parseInt(vistaPago.txtBuscar.getText()));
            if (consultasPago.Eliminar(modelPago)) {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                limpiar();
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos" + e);
                limpiar();
            }
        }
        if (e.getSource() == vistaPago.btnBuscar) {
            modelPago.setIdPago(Integer.parseInt(vistaPago.txtBuscar.getText()));
            if (consultasPago.Buscar(modelPago)) {
                vistaPago.txtIdPago.setText(String.valueOf(modelPago.getIdPago()));
                vistaPago.cbxIdMes.setSelectedIndex(modelPago.getIdMes() - 1);
                vistaPago.jDateFecha.setDate(modelPago.getFecha());
                vistaPago.cbxIdRhumanos.setSelectedIndex(modelPago.getIdRhumanos() - 1);
                vistaPago.cbxIdSalario.setSelectedIndex(modelPago.getIdSalario() - 1);
               
            }
            if (consultasPago.Buscar(modelPago)) {
            } else {
                JOptionPane.showMessageDialog(null, "Mensaje " + e.toString());
                limpiar();
            }
        }
        if (e.getSource() == vistaPago.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        vistaPago.txtIdPago.setText(null);
        vistaPago.cbxIdMes.setSelectedIndex(0);
        vistaPago.jDateFecha.setDate(null);
        vistaPago.cbxIdRhumanos.setSelectedIndex(0);
        vistaPago.cbxIdSalario.setSelectedIndex(0);
        vistaPago.txtBuscar.setText(null);
    }
}
