
package empresaMVC;

import Controlador.CtrLogin;
import Modelo.mLogin;
import Vista.frmLogin;



public class Empresa {  

    public static void main(String[] args) {
      frmLogin fLogin = new frmLogin();
      fLogin.setVisible(true);
      mLogin mlg = new mLogin();
      CtrLogin cLogin = new CtrLogin(fLogin, mlg);
      
     
    }   
     
}

