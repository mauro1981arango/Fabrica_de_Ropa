//package Controlador;
//
//import Modelo.ConsultasDetalleFactura;
//import Modelo.DetalleFactura;
//import Modelo.DetalleFacturaDAO;
//import Modelo.Factura;
//
//import Modelo.ReferenciasRopa;
//import Modelo.RopaTerminada;
//import Vista.frmDetalleFactura;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.util.ArrayList;
//import javax.swing.JOptionPane;
//
//public final class CtrlDetalleFactura implements ActionListener {
//
//    private DetalleFactura modelDetalle;
//    private ConsultasDetalleFactura modelConsultaDetalle;
//    private final frmDetalleFactura vistaDetalleFac;
//    private final DetalleFacturaDAO detalleDao = new DetalleFacturaDAO();
//
//    public CtrlDetalleFactura(frmDetalleFactura vista_detalle) {
//        vistaDetalleFac = vista_detalle;
//        cargarTabla();
//        iniciar();
//
//    }
//
//    public CtrlDetalleFactura(DetalleFactura modelDetalle, ConsultasDetalleFactura modelConsultaDetalle, frmDetalleFactura vistaDetalleFac) {
//        this.modelDetalle = modelDetalle;
//        this.modelConsultaDetalle = modelConsultaDetalle;
//        this.vistaDetalleFac = vistaDetalleFac;
//        this.vistaDetalleFac.btnRegistrar.addActionListener(this);
//        this.vistaDetalleFac.btnEliminar.addActionListener(this);
//        this.vistaDetalleFac.btnModificar.addActionListener(this);
//        this.vistaDetalleFac.btnLimpiar.addActionListener(this);
//        this.vistaDetalleFac.btnBuscar.addActionListener(this);
//        cargarTabla();
//        iniciar();
//        
//
//    }
//
//    public void iniciar() {
//        vistaDetalleFac.setTitle("Registro Detalle Factura");
//        vistaDetalleFac.setLocationRelativeTo(null);
//        vistaDetalleFac.txtIdDetalle.setVisible(false);
//        
//        llenarReferenciasRopa();
//        llenarFactura();  
//        llenarRopaTerminada();
//    }
//
//    public void cargarTabla() {
//
//        vistaDetalleFac.TblDetalleFactura.setModel(detalleDao.getDetalleFactura());
//    }
//
//   
//
//    @Override
//    public void actionPerformed(ActionEvent e) {
//        if (e.getSource() == vistaDetalleFac.btnRegistrar) {
//
//            modelDetalle.setCantidad(Integer.parseInt(vistaDetalleFac.jFormattedTxtCantidad.getText()));
//            modelDetalle.setValorUnitario(Double.parseDouble(vistaDetalleFac.jFormattedTxtValorUnitario.getText()));
//            modelDetalle.setValorTotal(Double.parseDouble(vistaDetalleFac.jFormattedTxtValorTotal.getText()));
//            modelDetalle.setIdVestuario(vistaDetalleFac.cbxCodigo.getSelectedIndex());
//            modelDetalle.setIdFactura(vistaDetalleFac.cbxIdProducto.getSelectedIndex());
//            modelDetalle.setIdProducto(vistaDetalleFac.cbxIdProducto.getSelectedIndex());
//            if (modelConsultaDetalle.Registrar(modelDetalle)) {
//                JOptionPane.showMessageDialog(null, "Registro guardado");
//                cargarTabla();
//                limpiar();
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Error al guardar los datos" + e);
//                limpiar();
//            }
//        }
//        if (e.getSource() == vistaDetalleFac.btnModificar) {
//
//            modelDetalle.setCantidad(Integer.parseInt(vistaDetalleFac.jFormattedTxtCantidad.getText()));
//            modelDetalle.setValorUnitario(Double.parseDouble(vistaDetalleFac.jFormattedTxtValorUnitario.getText()));
//            modelDetalle.setValorTotal(Double.parseDouble(vistaDetalleFac.jFormattedTxtValorTotal.getText()));
//            modelDetalle.setIdVestuario(vistaDetalleFac.cbxCodigo.getSelectedIndex());
//            modelDetalle.setIdFactura(vistaDetalleFac.cbxIdFactura.getSelectedIndex());
//            modelDetalle.setIdProducto(vistaDetalleFac.cbxIdProducto.getSelectedIndex());
//            modelDetalle.setIdDetalle(Integer.parseInt(vistaDetalleFac.txtIdDetalle.getText()));
//            if (modelConsultaDetalle.Modificar(modelDetalle)) {
//                JOptionPane.showMessageDialog(null, "Registro actualizado");
//                cargarTabla();
//                limpiar();
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Error al actualizar los datos" + e);
//                limpiar();
//            }
//        }
//        if (e.getSource() == vistaDetalleFac.btnEliminar) {
//            modelDetalle.setIdDetalle(Integer.parseInt(vistaDetalleFac.txtBuscar.getText()));
//            if (modelConsultaDetalle.Eliminar(modelDetalle)) {
//                JOptionPane.showMessageDialog(null, "Registro eliminado de la base de datos");
//                limpiar();
//
//            } else {
//                JOptionPane.showMessageDialog(null, "Error al eliminar el registro" + e);
//                limpiar();
//            }
//        }
//        if (e.getSource() == vistaDetalleFac.btnBuscar) {
//            modelDetalle.setIdDetalle(Integer.parseInt(vistaDetalleFac.txtBuscar.getText()));
//
//            if (modelConsultaDetalle.Buscar(modelDetalle)) {
//                vistaDetalleFac.txtIdDetalle.setText(String.valueOf(modelDetalle.getIdDetalle()));
//                vistaDetalleFac.jFormattedTxtCantidad.setText(String.valueOf(modelDetalle.getIdDetalle()));
//                vistaDetalleFac.jFormattedTxtValorUnitario.setText(String.valueOf(modelDetalle.getValorUnitario()));
//                vistaDetalleFac.jFormattedTxtValorTotal.setText(String.valueOf(modelDetalle.getValorTotal()));
//                vistaDetalleFac.cbxCodigo.setSelectedIndex(modelDetalle.getIdVestuario());
//                
//                vistaDetalleFac.cbxIdFactura.setSelectedItem(modelDetalle.getIdFactura());
//                vistaDetalleFac.cbxIdProducto.setSelectedIndex(modelDetalle.getIdProducto());
//
//            }
//            if (modelConsultaDetalle.Buscar(modelDetalle)) {
//                JOptionPane.showMessageDialog(null, "Aquí está el resultado");
//
//            } else {
//                JOptionPane.showMessageDialog(null, "No se encontró ningún registro" + e);
//                limpiar();
//            }
//        }
//        if (e.getSource() == vistaDetalleFac.btnLimpiar) {
//            limpiar();
//        }
//    }
//
//    
//    public void limpiar() {
//
//        vistaDetalleFac.txtIdDetalle.setText(null);
//        vistaDetalleFac.txtAreaDetalle.setText(null);
//        vistaDetalleFac.jFormattedTxtCantidad.setText(null);
//        vistaDetalleFac.jFormattedTxtValorUnitario.setText(null);
//        vistaDetalleFac.jFormattedTxtValorTotal.setText(null);
//        vistaDetalleFac.cbxCodigo.setSelectedIndex(0);
//        vistaDetalleFac.cbxIdFactura.setSelectedIndex(0);
//        vistaDetalleFac.cbxIdProducto.setSelectedIndex(0);
//        vistaDetalleFac.txtBuscar.setText(null);
//    }
//    public void llenarReferenciasRopa(){
//        ReferenciasRopa modReferencias = new ReferenciasRopa();
//        ArrayList<ReferenciasRopa> listaref = modReferencias.getReferenciasRopa();
//        vistaDetalleFac.cbxCodigo.removeAllItems();
//        vistaDetalleFac.cbxCodigo.addItem("Selecione");
//        for (int i = 0; i < listaref.size(); i++) {
//           vistaDetalleFac.cbxCodigo.addItem(listaref.get(i).getCodigo());
//        }
//    }
//    
//    public void llenarFactura(){
//        Factura modFactura = new Factura();
//        ArrayList<Factura> listafactura = modFactura.getFactura();
//        
//        vistaDetalleFac.cbxIdFactura.removeAllItems();
//        //vistaDetalleFac.cbxIdFactura.setToolTipText("Selecione");
//        for (int i = 0; i < listafactura.size(); i++) {
//           vistaDetalleFac.cbxIdFactura.addItem(new Factura(listafactura.get(i).getIdFactura(), listafactura.get(i).getFecha()));
//        }
//    }
//    
//     public void llenarRopaTerminada(){
//        RopaTerminada modProducto = new RopaTerminada();
//        ArrayList<RopaTerminada> listaref = modProducto.getRopaTerminada();
//        vistaDetalleFac.cbxIdProducto.removeAllItems();
//        vistaDetalleFac.cbxIdProducto.addItem("Selecione");
//        for (int i = 0; i < listaref.size(); i++) {
//           vistaDetalleFac.cbxIdProducto.addItem(listaref.get(i).getPrecioVenta());
//        }
//    }
//    
//}
