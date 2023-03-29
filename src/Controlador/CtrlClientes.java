package Controlador;

import Modelo.ClienteDAO;
import Modelo.Clientes;
import Modelo.ColorCeldaTabla;
import Modelo.ConsultasClientes;
import Vista.frmCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public final class CtrlClientes implements ActionListener {

    private Clientes cli_model;
    private ConsultasClientes modelConsultas;
    private final frmCliente frm_vista;
    private final ClienteDAO cliDAO = new ClienteDAO();
    private ColorCeldaTabla color = new ColorCeldaTabla();

    public CtrlClientes(frmCliente vista_cliente) {
        frm_vista = vista_cliente;
        cargarTabla();
        iniciar();
        habilitarBotonGuardar();
    }

    public CtrlClientes(Clientes model, ConsultasClientes modelConsultas, frmCliente frm_vista, ColorCeldaTabla color) {

        this.cli_model = model;
        this.modelConsultas = modelConsultas;
        this.frm_vista = frm_vista;
        this.color = color;
        this.frm_vista.BtnGuardar.addActionListener(this);
        this.frm_vista.BtnEliminar.addActionListener(this);
        this.frm_vista.BtnModificar.addActionListener(this);
        this.frm_vista.BtnLimpiar.addActionListener(this);
        this.frm_vista.BtnBuscar.addActionListener(this);
        cargarTabla();
        iniciar();
        //habilitarBotonGuardar();
    }

    public void iniciar() {
        frm_vista.setTitle("Registro de Clientes");
        frm_vista.setLocationRelativeTo(null);
        frm_vista.setVisible(true);
        frm_vista.CbxCiudad.setVisible(false);
        frm_vista.TxtIdCliente.setVisible(false);
        frm_vista.CbxCiudad.addItem("Seleccione una opcion");
        frm_vista.CbxIdCiudad.addItem("Seleccione una opcion");

        cliDAO.CargarComboBox_ciudades();
        cliDAO.CargarComboBox_ciudades().stream().map(municipio -> {
            frm_vista.CbxCiudad.addItem(municipio[1]);
            return municipio;
        }).forEachOrdered(municipio -> {
            frm_vista.CbxIdCiudad.addItem(municipio[0]);
        });

    }

    public void cargarTabla() {
        frm_vista.TblClientes.setModel(cliDAO.getClientes());
        for (int i = 0; i < frm_vista.TblClientes.getColumnCount(); i++) {
            frm_vista.TblClientes.getColumnModel().getColumn(i).setCellRenderer(color);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == frm_vista.BtnGuardar) {
            cli_model.setNombres(frm_vista.TxtNombres.getText());
            cli_model.setApellidos(frm_vista.TxtApellidos.getText());
            cli_model.setTelefono(frm_vista.TxtTelefono.getText());
            cli_model.setDireccion(frm_vista.TxDireccion.getText());
            String IdC = frm_vista.CbxCiudad.getItemAt(frm_vista.CbxIdCiudad.getSelectedIndex());
            cli_model.setIdCiudad(Integer.parseInt(IdC));

            if (modelConsultas.Registrar(cli_model)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Registro no guardado" + e);
                limpiar();

            }

        }
        if (e.getSource() == frm_vista.BtnModificar) {
            cli_model.setNombres(frm_vista.TxtNombres.getText());
            cli_model.setApellidos(frm_vista.TxtApellidos.getText());
            cli_model.setTelefono(frm_vista.TxtTelefono.getText());
            cli_model.setDireccion(frm_vista.TxDireccion.getText());
            String IdC = frm_vista.CbxCiudad.getItemAt(frm_vista.CbxIdCiudad.getSelectedIndex());
            cli_model.setIdCiudad(Integer.parseInt(IdC));
            cli_model.setIdCliente(Integer.parseInt(frm_vista.TxtIdCliente.getText()));
            if (modelConsultas.Modificar(cli_model)) {
                JOptionPane.showMessageDialog(null, "Actualización exitosa!!");
                limpiar();
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "No se pudo actualizar");
                limpiar();
                cargarTabla();
            }
        }

        if (e.getSource()
                == frm_vista.BtnEliminar) {
            cli_model.setIdCliente(Integer.parseInt(frm_vista.txtBuscar.getText()));
            if (modelConsultas.Eiminar(cli_model)) {
                JOptionPane.showMessageDialog(null, "Registro eliminado");
                limpiar();
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar el registro selecionado");
                limpiar();
            }
        }

        if (e.getSource()
                == frm_vista.BtnBuscar) {
            cli_model.setNombres(frm_vista.txtBuscar.getText());

            if (modelConsultas.Buscar(cli_model)) {
                frm_vista.TxtIdCliente.setText(String.valueOf(cli_model.getIdCliente()));
                frm_vista.TxtNombres.setText(cli_model.getNombres());
                frm_vista.TxtApellidos.setText(cli_model.getApellidos());
                frm_vista.TxtTelefono.setText(String.valueOf(cli_model.getTelefono()));
                frm_vista.TxDireccion.setText(cli_model.getDireccion());
                frm_vista.CbxIdCiudad.setSelectedIndex(cli_model.getIdCiudad());
                frm_vista.CbxCiudad.setSelectedIndex(cli_model.getIdCiudad());

            } else {
                JOptionPane.showMessageDialog(null, "No existe un cliente con este nombre");
                limpiar();
            }
        }

        if (e.getSource()
                == frm_vista.BtnLimpiar) {
            limpiar();
        }

    }

//Con este método se limpian las cajas de texto despues de guardar un registro,
//o si por el contario ocurre un error también se lipiarán las cajas de texto automaticamente 
    public void limpiar() {
        frm_vista.TxtIdCliente.setText(null);
        frm_vista.TxtNombres.setText(null);
        frm_vista.TxtApellidos.setText(null);
        frm_vista.TxtTelefono.setText(null);
        frm_vista.TxDireccion.setText(null);
        frm_vista.txtBuscar.setText(null);
        frm_vista.CbxIdCiudad.setSelectedIndex(0);
    }

    public void habilitarBotonGuardar() {
        if (frm_vista.BtnGuardar.getText().isEmpty()
                || frm_vista.TxtNombres.getText().isEmpty()
                || frm_vista.TxtApellidos.getText().isEmpty()
                || frm_vista.TxtTelefono.getText().isEmpty()
                || !frm_vista.CbxCiudad.getToolTipText().isEmpty()) {

            frm_vista.BtnGuardar.setEnabled(true);
        } else {
            frm_vista.BtnGuardar.setEnabled(false);
        }
    }
    
}
