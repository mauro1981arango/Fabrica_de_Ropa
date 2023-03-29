package Controlador;

import Modelo.ConsultasMateriaPrima;
import Modelo.MateriaPrima;
import Modelo.MateriaPrimaDAO;
import Vista.frmMateriaPrima;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public final class CtrlMateriaPrima implements ActionListener {

    private MateriaPrima modelMaterial;
    private ConsultasMateriaPrima consultasMaterial;
    private final frmMateriaPrima frmMaterial;
    private final MateriaPrimaDAO materia_primaDao = new MateriaPrimaDAO();

    public CtrlMateriaPrima(frmMateriaPrima vista_matetia_prima) {
        frmMaterial = vista_matetia_prima;
        cargarTabla();
        iniciar();
    }

    public CtrlMateriaPrima(MateriaPrima modelMaterial, ConsultasMateriaPrima consultasMaterial, frmMateriaPrima frmMaterial) {
        this.modelMaterial = modelMaterial;
        this.consultasMaterial = consultasMaterial;
        this.frmMaterial = frmMaterial;
        this.frmMaterial.btnRegistrar.addActionListener(this);
        this.frmMaterial.btnEliminar.addActionListener(this);
        this.frmMaterial.btnModificar.addActionListener(this);
        this.frmMaterial.btnLimpiar.addActionListener(this);
        this.frmMaterial.btnBuscar.addActionListener(this);
        cargarTabla();
        iniciar();

    }

    public void iniciar() {
        frmMaterial.setTitle("Materia Prima");
        frmMaterial.setLocationRelativeTo(null);
        frmMaterial.setVisible(true);

        frmMaterial.cbxTipo.addItem("Seleccione una opcion");
        frmMaterial.cbxNombreEmpresa.addItem("Seleccione una opcion");
        frmMaterial.txtIdInsumo.setVisible(false);
        frmMaterial.cbxTipo.removeAllItems();
        materia_primaDao.ListarCategoriaMaterial(frmMaterial.cbxTipo);
        frmMaterial.cbxNombreEmpresa.removeAllItems();
        materia_primaDao.ListarProveedores(frmMaterial.cbxNombreEmpresa);
        
        cargarTabla();
        limpiar();
    }

    public void cargarTabla() {

        frmMaterial.tblMateriaPrima.setModel(materia_primaDao.getMateriaPrima());
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frmMaterial.btnRegistrar) {
            modelMaterial.setRefArticulo(frmMaterial.txtRefArticulo.getText());
            modelMaterial.setIdMaterial(frmMaterial.cbxTipo.getSelectedIndex() + 1);
            modelMaterial.setIdProveedor(frmMaterial.cbxNombreEmpresa.getSelectedIndex() + 1);
            modelMaterial.setCantidad(Integer.parseInt(frmMaterial.txtCantidad.getText()));
            modelMaterial.setColor(frmMaterial.txtColor.getText());
            modelMaterial.setPrecioUnitario(Double.parseDouble(frmMaterial.txtPrecioUnitario.getText()));
            modelMaterial.setValorTotal(Double.parseDouble(frmMaterial.txtValorTotal.getText()));
           

            if (consultasMaterial.Registrar(modelMaterial)) {
                JOptionPane.showMessageDialog(null, "Registro guardado");
                limpiar();
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar los datos" + e);
                limpiar();
            }
        }
        if (e.getSource() == frmMaterial.btnModificar) {
            modelMaterial.setRefArticulo(frmMaterial.txtRefArticulo.getText());
            modelMaterial.setIdMaterial(frmMaterial.cbxTipo.getSelectedIndex() + 1);
            modelMaterial.setIdProveedor(frmMaterial.cbxNombreEmpresa.getSelectedIndex() + 1);
            modelMaterial.setCantidad(Integer.parseInt(frmMaterial.txtCantidad.getText()));
            modelMaterial.setColor(frmMaterial.txtColor.getText());
            modelMaterial.setPrecioUnitario(Double.parseDouble(frmMaterial.txtPrecioUnitario.getText()));
            modelMaterial.setValorTotal(Double.parseDouble(frmMaterial.txtValorTotal.getText()));
            modelMaterial.setIdInsumo(Integer.parseInt(frmMaterial.txtIdInsumo.getText()));

            if (consultasMaterial.Modificar(modelMaterial)) {
                JOptionPane.showMessageDialog(null, "Registro actualizado");
                limpiar();
                cargarTabla();
            } else {
                JOptionPane.showMessageDialog(null, "No fue posible actualizar" + e);
                limpiar();
            }
        }
        if (e.getSource() == frmMaterial.btnEliminar) {
            modelMaterial.setIdInsumo(Integer.parseInt(frmMaterial.txtBuscar.getText()));
            if (consultasMaterial.Eliminar(modelMaterial)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar los datos" + e);
                limpiar();
            }
        }
        if (e.getSource() == frmMaterial.btnBuscar) {
            modelMaterial.setIdInsumo(Integer.parseInt(frmMaterial.txtBuscar.getText()));
            if (consultasMaterial.Buscar(modelMaterial)) {
                frmMaterial.txtIdInsumo.setText(String.valueOf(modelMaterial.getIdInsumo()));
                frmMaterial.txtRefArticulo.setText(modelMaterial.getRefArticulo());
                frmMaterial.cbxTipo.setSelectedIndex(modelMaterial.getIdMaterial() - 1);
                frmMaterial.cbxNombreEmpresa.setSelectedIndex(modelMaterial.getIdProveedor() - 1);
                frmMaterial.txtCantidad.setText(String.valueOf(modelMaterial.getCantidad()));
                frmMaterial.txtColor.setText(modelMaterial.getColor());
                frmMaterial.txtPrecioUnitario.setText(String.valueOf(modelMaterial.getPrecioUnitario()));
                frmMaterial.txtValorTotal.setText(String.valueOf(modelMaterial.getValorTotal()));
                
            }
            if (consultasMaterial.Buscar(modelMaterial)) {
                JOptionPane.showMessageDialog(null, "Aquí están los datos");

            } else {
                JOptionPane.showMessageDialog(null, "Error sin resultados" + e.toString());
                limpiar();
            }
        }
        if (e.getSource() == frmMaterial.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        frmMaterial.txtRefArticulo.setText(null);
        frmMaterial.cbxTipo.setSelectedIndex(0);
        frmMaterial.cbxNombreEmpresa.setSelectedIndex(0);
        frmMaterial.txtCantidad.setText(null);
        frmMaterial.txtColor.setText(null);
        frmMaterial.txtPrecioUnitario.setText(null);
        frmMaterial.txtValorTotal.setText(null);
        frmMaterial.txtBuscar.setText(null);

    }
   
}
