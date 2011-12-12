/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package face;

import java.io.RandomAccessFile;

/**
 *
 * @author Josue
 */
public class Registroclass {
    
    public RandomAccessFile Gere=null;
   
    
    public Registroclass(){
        
        try{
        Gere=new RandomAccessFile("Gerencia.fbn","rw");
        }
        
        catch(Exception error){
            
        }
        
    }
    
}
