/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package face;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 *
 * @author Josue
 */
public class BuscarAmigos {
    
    public File Verificar=null;
    public static boolean existe;
    public RandomAccessFile Data=null;
    
    public BuscarAmigos(){
        
    }
    
    public boolean VerificarExistencia(String Emai)throws IOException{
        
        String EmailGuardado;
        Data=new RandomAccessFile("Gerencia.fbn","rw");
        
        Data.seek(0);
        
        while(Data.getFilePointer() < Data.length()){
            
            Data.readUTF();
            Data.readChar();
            Data.readLong();
            EmailGuardado=Data.readUTF();
            
            if(Emai.equals(EmailGuardado)){
                
                return true;
            }
            
            
            
            
        }
    
      return false;
    
    
    }
    
}
