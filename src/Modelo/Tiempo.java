
package Modelo;
import java.util.Calendar;
import java.util.GregorianCalendar;
/**
 *
 * @author Diego Arango
 */
public class Tiempo {
   Calendar date = new GregorianCalendar();
   
   String anio = Integer.toString(date.get(Calendar.YEAR));
   String mes = Integer.toString(date.get(Calendar.MONTH));
   String dia = Integer.toString(date.get(Calendar.DATE));
   
   String fechaSql = anio+"-"+mes+"-"+dia+"-";
}
