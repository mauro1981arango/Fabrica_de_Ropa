package Controlador;

import Modelo.ConsultasRecursosHumanos;
import Modelo.RecursosHumanos;
import Modelo.RecursosHumanosDAO;
import Vista.frmRecursosHumanos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public final class CtrlRecursosHumanos implements ActionListener {

    private RecursosHumanos modelo_rh;
    private ConsultasRecursosHumanos consultas_rh;
    private final frmRecursosHumanos formulario_vista;
    private final RecursosHumanosDAO rhDAO = new RecursosHumanosDAO();

    public CtrlRecursosHumanos(frmRecursosHumanos vista_rh) {
        formulario_vista = vista_rh;
        cargarTabla();
        iniciar();

    }

    public CtrlRecursosHumanos(RecursosHumanos modelo_rh, ConsultasRecursosHumanos consultas_rh, frmRecursosHumanos formulario_vista) {
        this.modelo_rh = modelo_rh;
        this.consultas_rh = consultas_rh;
        this.formulario_vista = formulario_vista;
        this.formulario_vista.BtnGuardar.addActionListener(this);
        this.formulario_vista.BtnEliminar.addActionListener(this);
        this.formulario_vista.BtnModificar.addActionListener(this);
        this.formulario_vista.BtnLimpiar.addActionListener(this);
        this.formulario_vista.BtnBuscar.addActionListener(this);
        cargarTabla();
        iniciar();

    }

    public void iniciar() {

        formulario_vista.setTitle("Recursos Humanos");
        formulario_vista.setLocationRelativeTo(null);
        
        formulario_vista.txtIdRhumanos.setVisible(false);

        formulario_vista.CbxIdRH.removeAllItems();
        AutoCompleteDecorator.decorate(formulario_vista.CbxIdRH);
        rhDAO.ListarTipoSangre(formulario_vista.CbxIdRH);

        formulario_vista.CbxIdSalario.removeAllItems();
        AutoCompleteDecorator.decorate(formulario_vista.CbxIdSalario);
        rhDAO.ListarSalarios(formulario_vista.CbxIdSalario);

        formulario_vista.cbxTipoCuenta.removeAllItems();
        AutoCompleteDecorator.decorate(formulario_vista.cbxTipoCuenta);
        rhDAO.ListarTipoCuenta(formulario_vista.cbxTipoCuenta);
    }

    public void cargarTabla() {

        formulario_vista.TblRecursosHumanos.setModel(rhDAO.getRecursosHumanos());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == formulario_vista.BtnGuardar) {
            modelo_rh.setCedula(Integer.parseInt(formulario_vista.txtCedula.getText()));
            modelo_rh.setNombres(formulario_vista.TxtNombres.getText());
            modelo_rh.setApellidos(formulario_vista.TxtApellidos.getText());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = formatoFecha.format(formulario_vista.jDateCFechaNacimiento.getDate());
            modelo_rh.setFechaNacimiento(formulario_vista.jDateCFechaNacimiento.getDate());
            modelo_rh.setIdRH(formulario_vista.CbxIdRH.getSelectedIndex() + 1);
            modelo_rh.setTelefono(formulario_vista.txtTelefono.getText());
            modelo_rh.setDireccion(formulario_vista.TxtDireccion.getText());
            modelo_rh.setCorreo(formulario_vista.TxtCorreo.getText());
            modelo_rh.setIdSalario(formulario_vista.CbxIdSalario.getSelectedIndex() + 1);
            modelo_rh.setIdCuenta(formulario_vista.cbxTipoCuenta.getSelectedIndex() + 1);
            modelo_rh.setNroCuenta(formulario_vista.TxtNroCuenta.getText());

            if (consultas_rh.Registrar(modelo_rh)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
                cargarTabla();
            } else {

                JOptionPane.showMessageDialog(null, "Error al guardar los datos" + e);
                limpiar();
            }
        }

        if (e.getSource() == formulario_vista.BtnModificar) {
            modelo_rh.setCedula(Integer.parseInt(formulario_vista.txtCedula.getText()));
            modelo_rh.setNombres(formulario_vista.TxtNombres.getText());
            modelo_rh.setApellidos(formulario_vista.TxtApellidos.getText());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = formatoFecha.format(formulario_vista.jDateCFechaNacimiento.getDate());
            modelo_rh.setFechaNacimiento(formulario_vista.jDateCFechaNacimiento.getDate());
            modelo_rh.setIdRH(formulario_vista.CbxIdRH.getSelectedIndex() + 1);
            modelo_rh.setTelefono(formulario_vista.txtTelefono.getText());
            modelo_rh.setDireccion(formulario_vista.TxtDireccion.getText());
            modelo_rh.setCorreo(formulario_vista.TxtCorreo.getText());
            modelo_rh.setIdSalario(formulario_vista.CbxIdSalario.getSelectedIndex() + 1);
            modelo_rh.setIdCuenta(formulario_vista.cbxTipoCuenta.getSelectedIndex() + 1);
            modelo_rh.setNroCuenta(formulario_vista.TxtNroCuenta.getText());
            modelo_rh.setIdRhumanos(Integer.parseInt(formulario_vista.txtIdRhumanos.getText()));
            if (consultas_rh.Modificar(modelo_rh)) {

                JOptionPane.showMessageDialog(null, "Actualización exitosa!!");
                limpiar();
                cargarTabla();
            } else {

                JOptionPane.showMessageDialog(null, "Error al actualizar los datos" + e);
                limpiar();
            }
        }

        if (e.getSource() == formulario_vista.BtnEliminar) {
            modelo_rh.setIdRhumanos(Integer.parseInt(formulario_vista.TxtBuscar.getText()));

            if (consultas_rh.Eiminar(modelo_rh)) {

                JOptionPane.showMessageDialog(null, "Registros eliminado");
                cargarTabla();
                limpiar();
            } else {

                JOptionPane.showMessageDialog(null, "Error al eliminar el registro selecionado" + e);
                limpiar();
            }

        }
        if (e.getSource() == formulario_vista.BtnBuscar) {
            modelo_rh.setCedula(Integer.parseInt(formulario_vista.TxtBuscar.getText()));
            if (consultas_rh.Buscar(modelo_rh)) {
                formulario_vista.txtCedula.setText(String.valueOf(modelo_rh.getCedula()));
                formulario_vista.TxtNombres.setText(modelo_rh.getNombres());
                formulario_vista.TxtApellidos.setText(modelo_rh.getApellidos());
                formulario_vista.jDateCFechaNacimiento.setDate(modelo_rh.getFechaNacimiento());
                formulario_vista.CbxIdRH.setSelectedIndex(modelo_rh.getIdRH() - 1);        
                formulario_vista.txtTelefono.setText(modelo_rh.getTelefono());
                formulario_vista.TxtDireccion.setText(modelo_rh.getDireccion());
                formulario_vista.TxtCorreo.setText(modelo_rh.getCorreo());
                formulario_vista.CbxIdSalario.setSelectedIndex(modelo_rh.getIdSalario() - 1); 
                formulario_vista.cbxTipoCuenta.setSelectedIndex(modelo_rh.getIdCuenta() - 1);
                formulario_vista.TxtNroCuenta.setText(modelo_rh.getNroCuenta());
                formulario_vista.txtIdRhumanos.setText(String.valueOf(modelo_rh.getIdRhumanos()));
            } else {

                JOptionPane.showMessageDialog(null, "No se encontró el resultado de tu bósqueda" + e);
                limpiar();
            }
        }
        if (e.getSource() == formulario_vista.BtnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        formulario_vista.TxtBuscar.setText(null);
        formulario_vista.txtIdRhumanos.setText(null);
        formulario_vista.txtCedula.setText(null);
        formulario_vista.TxtNombres.setText(null);
        formulario_vista.TxtApellidos.setText(null);
        formulario_vista.jDateCFechaNacimiento.setDate(null);
        formulario_vista.CbxIdRH.setSelectedIndex(0);
        formulario_vista.txtTelefono.setText(null);
        formulario_vista.TxtDireccion.setText(null);
        formulario_vista.TxtCorreo.setText(null);
        formulario_vista.TxtNroCuenta.setText(null);
        formulario_vista.CbxIdSalario.setSelectedIndex(0);
        formulario_vista.cbxTipoCuenta.setSelectedIndex(0);

    }

}
