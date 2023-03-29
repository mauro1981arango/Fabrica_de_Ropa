
package Controlador;

import Modelo.mLogin;
import Vista.Menu;
import Vista.frmLogin;

public class CtrLogin {
    
    private frmLogin vistalogin;
    private mLogin mlogin;

    public CtrLogin() {
    }

    public CtrLogin(frmLogin vistalogin, mLogin mlogin) {
        this.vistalogin = vistalogin;
        this.mlogin = mlogin;
        iniciar();
    }

    private void iniciar() {
        vistalogin.btnIngresar.addActionListener((e) -> {
            mlogin.setUsuario(vistalogin.txtUsuario.getText());
            mlogin.setContraseña(new String(vistalogin.txtContraseña.getPassword()));
            boolean sesion = mlogin.ingresar();
            if(sesion){
               Menu vMenu = new Menu();
               vMenu.setVisible(true);
               vMenu.setLocationRelativeTo(null);
               vistalogin.dispose();
            }else{
                vistalogin.lblMensaje.setText("Datos incorrectos");
            }
        });
    }
    
}
