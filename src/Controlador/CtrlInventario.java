package Controlador;

import Modelo.ConsultasInventario;
import Modelo.Inventario;
import Modelo.InventarioDAO;
import Modelo.MateriaPrima;
import Vista.frmInventario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public final class CtrlInventario implements ActionListener {

    private Inventario modelinv;
    private ConsultasInventario modelconsultain;
    private final frmInventario inventario_vista;
    private final InventarioDAO inventario_dao = new InventarioDAO();

    public CtrlInventario(frmInventario vista_inventario) {
        inventario_vista = vista_inventario;
        cargarTabla();
        iniciar();
    }

    public CtrlInventario(Inventario modelinv, ConsultasInventario modelconsultain, frmInventario inventario_vista) {
        this.modelinv = modelinv;
        this.modelconsultain = modelconsultain;
        this.inventario_vista = inventario_vista;
        this.inventario_vista.btnGuardar.addActionListener(this);
        this.inventario_vista.btnEiminar.addActionListener(this);
        this.inventario_vista.btnModificar.addActionListener(this);
        this.inventario_vista.btnLimpiar.addActionListener(this);
        this.inventario_vista.btnBuscar.addActionListener(this);
        cargarTabla();
        iniciar();

    }

    public void iniciar() {
        inventario_vista.setTitle("Registro de Inventario");
        inventario_vista.setLocationRelativeTo(null);
        inventario_vista.txtIdInventario.setVisible(true);
        inventario_vista.cbxIdMateriaPrima.setVisible(true);
        
        inventario_vista.cbxIdMateriaPrima.removeAllItems();
        inventario_dao.ListarMateriaPrima(inventario_vista.cbxIdMateriaPrima);
        
        inventario_vista.cbxNitProveedor.removeAllItems();
        inventario_dao.ListarProveedores(inventario_vista.cbxNitProveedor);
        
        inventario_vista.cbxCategoriaMaterial.removeAllItems();
        inventario_dao.ListarCategoriaMaterial(inventario_vista.cbxCategoriaMaterial);
        //getMateriaPrima();
        //inventario_dao.CargarComboBox_materia_prima();
//        inventario_dao.CargarComboBox_materia_prima().stream().map(combo -> {
//            inventario_vista.cbxIdInsumo.addItem(combo[0]);
//            return combo;
//        }).forEachOrdered(combo -> {
//            inventario_vista.cbxRefArticulo.addItem(combo[1]);
//        });

//        inventario_dao.CargarComboBox_proveedores();
//        inventario_dao.CargarComboBox_proveedores().stream().map(combo -> {
//            inventario_vista.cbxIdProveedor.addItem(combo[0]);
//            return combo;
//        }).forEachOrdered(combo -> {
//            inventario_vista.cbxNitProveedor.addItem(combo[1]);
//        });
//        inventario_dao.CargarComboBox_categoria_material();
//        inventario_dao.CargarComboBox_categoria_material().stream().map(combo -> {
//            inventario_vista.cbxIdMateriaPrima.addItem(combo[0]);
//            return combo;
//        }).forEachOrdered(combo -> {
//            inventario_vista.cbxCategoriaMaterial.addItem(combo[1]);
//        });
    }

    public void cargarTabla() {

        inventario_vista.TblInventario.setModel(inventario_dao.getInventario());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == inventario_vista.btnGuardar) {
            modelinv.setNombre(inventario_vista.txtNombre.getText());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = formatoFecha.format(inventario_vista.jDateFechaCompra.getDate());
            modelinv.setFechaCompra(inventario_vista.jDateFechaCompra.getDate());
            modelinv.setFechaMantenimiento(inventario_vista.jDateFechaMantenimiento.getDate());
            modelinv.setIdInsumo(inventario_vista.cbxIdMateriaPrima.getSelectedIndex()  + 1);
            modelinv.setIdProveedor(inventario_vista.cbxNitProveedor.getSelectedIndex()  + 1);
            modelinv.setIdMaterial(inventario_vista.cbxCategoriaMaterial.getSelectedIndex()  + 1);
            if (modelconsultain.Registrar(modelinv)) {

                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos" + e);
                limpiar();
            }
        }
        if (e.getSource() == inventario_vista.btnModificar) {
            modelinv.setNombre(inventario_vista.txtNombre.getText());
            SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
            String fecha = formatoFecha.format(inventario_vista.jDateFechaCompra.getDate());
            modelinv.setFechaCompra(inventario_vista.jDateFechaCompra.getDate());
            modelinv.setFechaMantenimiento(inventario_vista.jDateFechaMantenimiento.getDate());
            modelinv.setIdInsumo(inventario_vista.cbxIdMateriaPrima.getSelectedIndex() + 1);
            modelinv.setIdProveedor(inventario_vista.cbxNitProveedor.getSelectedIndex() + 1);
            modelinv.setIdMaterial(inventario_vista.cbxCategoriaMaterial.getSelectedIndex() + 1);
            modelinv.setIdInventario(Integer.parseInt(inventario_vista.txtIdInventario.getText()));
            if (modelconsultain.Modificar(modelinv)) {

                JOptionPane.showMessageDialog(null, "Registro actualizado correctamente");
                cargarTabla();
                limpiar();
            } else {

                JOptionPane.showMessageDialog(null, "Error al actaualizar" + e);
                limpiar();
            }
        }
        if (e.getSource() == inventario_vista.btnEiminar) {
            modelinv.setIdInventario(Integer.parseInt(inventario_vista.txtBuscar.getText()));
            if (modelconsultain.Eiminar(modelinv)) {

                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();
                cargarTabla();
            } else {

                JOptionPane.showMessageDialog(null, "Error, no se pudo eliminar" + e);
                limpiar();
            }
        }
        if (e.getSource() == inventario_vista.btnBuscar) {
            modelinv.setNombre(inventario_vista.txtBuscar.getText());
            if (modelconsultain.Buscar(modelinv)) {
                inventario_vista.txtIdInventario.setText(String.valueOf(modelinv.getIdInventario()));
                inventario_vista.txtNombre.setText(modelinv.getNombre());
                inventario_vista.jDateFechaCompra.setDate(modelinv.getFechaCompra());
                inventario_vista.jDateFechaMantenimiento.setDate(modelinv.getFechaMantenimiento());
                inventario_vista.cbxIdMateriaPrima.setSelectedItem(modelinv.getIdInsumo());
                inventario_vista.cbxNitProveedor.setSelectedItem(modelinv.getIdProveedor());
                inventario_vista.cbxCategoriaMaterial.setSelectedItem(modelinv.getIdMaterial());
            }

            if (modelconsultain.Buscar(modelinv)) {

                JOptionPane.showMessageDialog(null, "Aquí están los datos de tu búsqueda");

            } else {

                JOptionPane.showMessageDialog(null, "No se encontró ningún resultado para tu búsqueda  " + e);
                limpiar();
            }
        }
        if (e.getSource() == inventario_vista.btnLimpiar) {
            limpiar();
        }
    }
    //Con este método se limpian las cajas de texto despues de guardar un registro,
    //o si por el contario ocurre un error también se lipiarán las cajas de texto automaticamente 

    public void limpiar() {

        inventario_vista.txtIdInventario.setText(null);
        inventario_vista.txtNombre.setText(null);
        inventario_vista.jDateFechaCompra.setDate(null);
        inventario_vista.jDateFechaMantenimiento.setDate(null);
        inventario_vista.cbxIdMateriaPrima.setSelectedIndex(0);
        inventario_vista.cbxCategoriaMaterial.setSelectedIndex(0);
        inventario_vista.cbxNitProveedor.setSelectedIndex(0);
        inventario_vista.txtBuscar.setText(null);
    }
}
