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
public class ProfileFolder {
    
    
    
    public File folder=null;
    
    public ProfileFolder(String pt){
        
        
        setFile(pt);
        crearFolder();
        
    }
    
    
    
    public void setFile(String path){
        
        folder=new File(path);
        
    }
    
    
    
    public boolean crearFolder(){
        
        try{
            
          return folder.mkdirs(); 
            
        }
        
        catch(Exception error){
            
            return false;
        }
        
    }
    
    
    
    
}
