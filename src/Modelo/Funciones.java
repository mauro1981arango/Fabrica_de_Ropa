package Modelo;

import com.toedter.calendar.JDateChooser;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funciones {

    SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");

    public String getFecha(JDateChooser jDateCFechaNacimiento) {
        if (jDateCFechaNacimiento.getDate() != null) {
            return formato.format(jDateCFechaNacimiento.getDate());
        } else {
            return null;
        }

    }

    public java.util.Date StringADate(String fecha) {
        SimpleDateFormat formato_de_fecha = new SimpleDateFormat("yyyy-MM-dd");
        Date fechaE = null;
        try {
            fechaE = formato_de_fecha.parse(fecha);
            return fechaE;
        } catch (ParseException e) {
            System.err.println("Error" + e);
        }
        return null;
    }
}
