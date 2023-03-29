package Controlador;

import Modelo.Ciudades;
import Modelo.ConsultasProveedores;
import Modelo.CuentasBancarias;
import Modelo.Proveedores;
import Modelo.ProveedoresDAO;
import Vista.frmProveedores;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

public final class CtrlProveedores implements ActionListener {

   private Proveedores modelPro;
   private ConsultasProveedores consultaPro;
   private final frmProveedores frmPro;
   private final ProveedoresDAO proveedores_dao = new ProveedoresDAO();

   public CtrlProveedores(frmProveedores vista_proveedor) {
      frmPro = vista_proveedor;
      cargarTabla();
      iniciar();
      //habilitarBotonGuardar();

   }

   public CtrlProveedores(Proveedores modelPro, ConsultasProveedores consultaPro, frmProveedores frmPro) {
      this.modelPro = modelPro;
      this.consultaPro = consultaPro;
      this.frmPro = frmPro;
      this.frmPro.btnBuscar.addActionListener(this);
      this.frmPro.btnEliminar.addActionListener(this);
      this.frmPro.btnGuardar.addActionListener(this);
      this.frmPro.btnLimpiar.addActionListener(this);
      this.frmPro.btnModificar.addActionListener(this);
      cargarTabla();
      iniciar();
      //habilitarBotonGuardar();
   }

   public void iniciar() {
      frmPro.setTitle("Registro de Proveedores");
      frmPro.setLocationRelativeTo(null);
      frmPro.setVisible(true);
      frmPro.txtIdProveedor.setVisible(false);
      frmPro.cbxNombreCiudad.removeAllItems();
      AutoCompleteDecorator.decorate(frmPro.cbxNombreCiudad);
      proveedores_dao.ListarCiudades(frmPro.cbxNombreCiudad);
      frmPro.cbxTipoCuenta.removeAllItems();
      AutoCompleteDecorator.decorate(frmPro.cbxTipoCuenta);
      proveedores_dao.ListarTipoCuenta(frmPro.cbxTipoCuenta);
      //listarCiudades();
      //listarCuentasBancarias();
  }

   public void cargarTabla() {

      frmPro.tblProveedores.setModel(proveedores_dao.getProveedores());

   }

   @Override
   public void actionPerformed(ActionEvent e) {
      if (e.getSource() == frmPro.btnGuardar) {
         modelPro.setNitProveedor(frmPro.txtNitProveedor.getText());
         modelPro.setNombreEmpresa(frmPro.txtNombreEmpresa.getText());
         modelPro.setDireccion(frmPro.txtDireccion.getText());
         modelPro.setCorreo(frmPro.txtCorreo.getText());
         modelPro.setTelefono(frmPro.txtTelefono.getText());
         modelPro.setIdCiudad(frmPro.cbxNombreCiudad.getSelectedIndex() + 1);
         modelPro.setCuentaBancaria(frmPro.txtCuentaBancaria.getText());
         modelPro.setIdCuenta(frmPro.cbxTipoCuenta.getSelectedIndex() + 1);
         if (consultaPro.Registrar(modelPro)) {
            JOptionPane.showMessageDialog(null, "Registro guardado");
            cargarTabla();
            limpiar();

         } else {
            JOptionPane.showMessageDialog(null, "Error al guardar los datos" + e);
            limpiar();
         }
      }
      if (e.getSource() == frmPro.btnModificar) {
         modelPro.setIdProveedor(Integer.parseInt(frmPro.txtIdProveedor.getText()));
         modelPro.setNitProveedor(frmPro.txtNitProveedor.getText());
         modelPro.setNombreEmpresa(frmPro.txtNombreEmpresa.getText());
         modelPro.setDireccion(frmPro.txtDireccion.getText());
         modelPro.setCorreo(frmPro.txtCorreo.getText());
         modelPro.setTelefono(frmPro.txtTelefono.getText());
         modelPro.setIdCiudad(frmPro.cbxNombreCiudad.getSelectedIndex() + 1);
         modelPro.setCuentaBancaria(frmPro.txtCuentaBancaria.getText());
         modelPro.setIdCuenta(frmPro.cbxTipoCuenta.getSelectedIndex() + 1);
         
         if (consultaPro.Modificar(modelPro)) {
            JOptionPane.showMessageDialog(null, "Registro actualizado");
            cargarTabla();
            limpiar();
         } else {
            JOptionPane.showMessageDialog(null, "Error al actualizar los datos" + e);
            limpiar();
         }
      }
      if (e.getSource() == frmPro.btnEliminar) {
         modelPro.setNombreEmpresa(frmPro.txtBuscar.getText());
         if (consultaPro.Eliminar(modelPro)) {
            JOptionPane.showMessageDialog(null, "Proveedor Eliminado");
            limpiar();
            cargarTabla();
         } else {
            JOptionPane.showMessageDialog(null, "No se pudo eliminar" + e);
            limpiar();
         }
      }
      if (e.getSource() == frmPro.btnBuscar) {
         modelPro.setNombreEmpresa(frmPro.txtBuscar.getText());

         if (consultaPro.Buscar(modelPro)) {
            frmPro.txtIdProveedor.setText(String.valueOf(modelPro.getIdProveedor()));
            frmPro.txtNitProveedor.setText(modelPro.getNitProveedor());
            frmPro.txtNombreEmpresa.setText(modelPro.getNombreEmpresa());
            frmPro.txtDireccion.setText(modelPro.getDireccion());
            frmPro.txtCorreo.setText(modelPro.getCorreo());
            frmPro.txtTelefono.setText(modelPro.getTelefono());
            frmPro.cbxNombreCiudad.setSelectedIndex(modelPro.getIdCiudad() - 1);
            frmPro.txtCuentaBancaria.setText(modelPro.getCuentaBancaria());
            frmPro.cbxTipoCuenta.setSelectedIndex(modelPro.getIdCuenta() - 1);
            if (consultaPro.Buscar(modelPro)) {
               JOptionPane.showMessageDialog(null, "Aquí está lo que buscabas");

            } else {
               JOptionPane.showMessageDialog(null, "Registro no encontrado" + e);
               limpiar();
            }
         }
      }

      if (e.getSource() == frmPro.btnLimpiar) {
         limpiar();
      }
   }

   public void limpiar() {
      frmPro.txtIdProveedor.setText(null);
      frmPro.txtNitProveedor.setText(null);
      frmPro.txtNombreEmpresa.setText(null);
      frmPro.txtDireccion.setText(null);
      frmPro.txtCorreo.setText(null);
      frmPro.txtTelefono.setText(null);
      frmPro.txtCuentaBancaria.setText(null);
      frmPro.cbxNombreCiudad.setSelectedIndex(0);
      frmPro.cbxTipoCuenta.setSelectedIndex(0);
      frmPro.txtBuscar.setText(null);
   }

   public void habilitarBotonGuardar() {
      if (frmPro.btnGuardar.getText().isEmpty()
              || frmPro.txtNitProveedor.getText().isEmpty()
              || frmPro.txtNombreEmpresa.getText().isEmpty()
              || frmPro.txtDireccion.getText().isEmpty()
              || frmPro.txtCorreo.getText().isEmpty()
              || frmPro.txtDireccion.getText().isEmpty()
              || frmPro.txtTelefono.getText().isEmpty()
              || frmPro.cbxNombreCiudad.getToolTipText().isEmpty()
              || frmPro.txtCuentaBancaria.getText().isEmpty()
              || !frmPro.cbxTipoCuenta.getToolTipText().isEmpty()) {

         frmPro.btnGuardar.setEnabled(false);
      } else {
         frmPro.btnGuardar.setEnabled(true);
      }
   }
//   public void listarCiudades(){
//      Ciudades ciudad = new Ciudades();
//      ArrayList<Ciudades> listaCiudades = ciudad.getCiudades();
//      for (int i = 0; i < listaCiudades.size(); i++) {
//         frmPro.cbxNombreCiudad.addItem(new Ciudades(listaCiudades.get(i).getIdCiudad(), listaCiudades.get(i).getCiudad()));
//          
//      }
//   }
//   public void listarCuentasBancarias(){
//      CuentasBancarias tipoCuenta = new CuentasBancarias();
//      ArrayList<CuentasBancarias> listaCuentas = tipoCuenta.getCuentasBancarias();
//      for (int i = 0; i < listaCuentas.size(); i++) {
//         frmPro.cbxTipoCuenta.addItem(new CuentasBancarias(listaCuentas.get(i).getIdCuenta(), listaCuentas.get(i).getTipoCuenta()));
//      }
//   }
}
