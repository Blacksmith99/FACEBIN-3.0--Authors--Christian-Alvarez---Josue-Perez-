/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package face;

import java.io.File;

/**
 *
 * @author Josue
 */
public class DesactivarCuenta {
    
    public File f=null;
    
    
    public DesactivarCuenta(){
        
        
        
    }
    
    public void borrar(String direcc){
       
        try{
        f=new File(direcc);
        
        if( !f.exists() ){
            System.out.println("No existe el archivo");
          
        }
        
        if( f.isFile() )
            
            f.delete();
        if( f.isDirectory()){
            File files[] = f.listFiles();
            for(File fi : files ){
                if( fi.isFile() )
                    fi.delete();
                if( fi.isDirectory() )
                    borrar( fi.getAbsolutePath() );
            }
            f.delete();
        }
        
        }
        catch(Exception error){
            
        }
        
    }
    
}
