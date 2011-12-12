/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package face;

import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Josue
 */
public class SetRegistro {
    
    public char opcion;
    public Date FechadeNacimiento;
    public Date Ahorita=null;

    
    public SetRegistro(){
        
        Ahorita=new Date();
        
       }
    
    
    
      public void setFechadeNacimiento(int dia,int mes,int anio){
              
              Calendar cal=Calendar.getInstance();
              cal.set(anio,mes,dia);
              
              FechadeNacimiento=cal.getTime();
              
          }
    
    
  
    
}
