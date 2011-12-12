/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Enviar_Solicitudes.java
 *
 * Created on 11-30-2011, 02:50:09 PM
 */
package face;

import java.io.File;
import java.io.RandomAccessFile;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class Enviar_Solicitudes extends javax.swing.JFrame {

    /** Creates new form Enviar_Solicitudes */
    
    
 
    public Enviar_Solicitudes() {
        initComponents();
    }

   
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        Namefieldtxt = new javax.swing.JLabel();
        Membersincetxt = new javax.swing.JLabel();
        Nametxt = new javax.swing.JLabel();
        Sexotxt = new javax.swing.JLabel();
        Gendertxt = new javax.swing.JLabel();
        Ingrestxt = new javax.swing.JLabel();
        Natxt = new javax.swing.JLabel();
        Membertxt = new javax.swing.JLabel();
        Fieldnametxt = new javax.swing.JLabel();
        sextypetxt = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Contactoaagregartxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Nombretxt = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Agregarbtn = new javax.swing.JButton();
        Buscarbtn = new javax.swing.JButton();
        Ntxt = new javax.swing.JLabel();
        Nameftxt = new javax.swing.JLabel();
        Gtxt = new javax.swing.JLabel();
        Genderftxt = new javax.swing.JLabel();
        FItxt = new javax.swing.JLabel();
        Dateingretxt = new javax.swing.JLabel();
        Backtoperfbtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        Gendertxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                GendertxtPropertyChange(evt);
            }
        });

        Ingrestxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                IngrestxtPropertyChange(evt);
            }
        });

        Natxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                NatxtPropertyChange(evt);
            }
        });

        Membertxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                MembertxtPropertyChange(evt);
            }
        });

        Fieldnametxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FieldnametxtPropertyChange(evt);
            }
        });

        sextypetxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                sextypetxtPropertyChange(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(979, 500));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Email del contacto al que quiere invitar:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(20, 60, 240, 26);
        getContentPane().add(Contactoaagregartxt);
        Contactoaagregartxt.setBounds(10, 90, 287, 20);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(925, 167, 87, 0);
        getContentPane().add(Nombretxt);
        Nombretxt.setBounds(925, 185, 0, 29);
        getContentPane().add(jLabel6);
        jLabel6.setBounds(925, 218, 0, 26);
        getContentPane().add(jLabel8);
        jLabel8.setBounds(925, 262, 0, 25);

        Agregarbtn.setText("Agregar a mis amigos");
        Agregarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarbtnMouseClicked(evt);
            }
        });
        getContentPane().add(Agregarbtn);
        Agregarbtn.setBounds(510, 90, 198, 25);

        Buscarbtn.setText("Buscar contacto");
        Buscarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BuscarbtnMouseClicked(evt);
            }
        });
        getContentPane().add(Buscarbtn);
        Buscarbtn.setBounds(330, 90, 166, 25);

        Ntxt.setForeground(new java.awt.Color(255, 255, 255));
        Ntxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                NtxtPropertyChange(evt);
            }
        });
        getContentPane().add(Ntxt);
        Ntxt.setBounds(84, 182, 109, 26);

        Nameftxt.setForeground(new java.awt.Color(255, 255, 255));
        Nameftxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                NameftxtPropertyChange(evt);
            }
        });
        getContentPane().add(Nameftxt);
        Nameftxt.setBounds(223, 182, 277, 26);

        Gtxt.setForeground(new java.awt.Color(255, 255, 255));
        Gtxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                GtxtPropertyChange(evt);
            }
        });
        getContentPane().add(Gtxt);
        Gtxt.setBounds(84, 232, 96, 26);

        Genderftxt.setForeground(new java.awt.Color(255, 255, 255));
        Genderftxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                GenderftxtPropertyChange(evt);
            }
        });
        getContentPane().add(Genderftxt);
        Genderftxt.setBounds(223, 232, 115, 26);

        FItxt.setForeground(new java.awt.Color(255, 255, 255));
        FItxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                FItxtPropertyChange(evt);
            }
        });
        getContentPane().add(FItxt);
        FItxt.setBounds(84, 293, 156, 28);

        Dateingretxt.setForeground(new java.awt.Color(255, 255, 255));
        Dateingretxt.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                DateingretxtPropertyChange(evt);
            }
        });
        getContentPane().add(Dateingretxt);
        Dateingretxt.setBounds(258, 293, 278, 28);

        Backtoperfbtn.setText("Regresar a mi perfil");
        Backtoperfbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BacktoperfbtnMouseClicked(evt);
            }
        });
        getContentPane().add(Backtoperfbtn);
        Backtoperfbtn.setBounds(730, 90, 207, 26);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/face/s - copia (2).jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(-10, 0, 980, 470);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BuscarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BuscarbtnMouseClicked
     
        Date inicio=null;
        String Emailentrante,Emailendatos;
        boolean active;
        
        try{
        
        RandomAccessFile busc=new RandomAccessFile("Gerencia.fbn","rw");
        
        Emailentrante=Contactoaagregartxt.getText();
        
        busc.seek(0);
        
        while(busc.getFilePointer() < busc.length()){
            
           Emailendatos=busc.readUTF();
           busc.readUTF();
           active=busc.readBoolean();
           
            
            if(Emailentrante.equals(Emailendatos) && active){
                
                DatosdelAmigo.encontrado=true;
                
                RandomAccessFile datos=new RandomAccessFile("Cuentas/"+Emailentrante+"/profile.fbn","rw");
                
                datos.seek(0);
                
                DatosdelAmigo.nombre=datos.readUTF();
                DatosdelAmigo.Genero=datos.readChar();
                datos.readLong();
                datos.readUTF();
                DatosdelAmigo.FechadeIngreso=datos.readLong();
                datos.readInt();
                
                inicio=new Date(DatosdelAmigo.FechadeIngreso);
                
                Ntxt.setText("Nombre:");
                Gtxt.setText("Genero:");
                FItxt.setText("Miembro desde el:");
                
                Nameftxt.setText(DatosdelAmigo.nombre);
                Genderftxt.setText(DatosdelAmigo.Genero=='M'?"Masculino":"Femenino");
                Dateingretxt.setText(inicio.toString());
                
                break;
                
            }
            }
        
        }
        
        catch(Exception error){
            
           
            
        }
        
       
    }//GEN-LAST:event_BuscarbtnMouseClicked

    private void NatxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_NatxtPropertyChange
        
        
        
    }//GEN-LAST:event_NatxtPropertyChange

    private void GendertxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_GendertxtPropertyChange
       
        
    }//GEN-LAST:event_GendertxtPropertyChange

    private void IngrestxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_IngrestxtPropertyChange
      
        
      
    }//GEN-LAST:event_IngrestxtPropertyChange

    private void FieldnametxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FieldnametxtPropertyChange
        
      
       
    }//GEN-LAST:event_FieldnametxtPropertyChange

    private void sextypetxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_sextypetxtPropertyChange
       
       
    }//GEN-LAST:event_sextypetxtPropertyChange

    private void MembertxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_MembertxtPropertyChange
        
        
    }//GEN-LAST:event_MembertxtPropertyChange

    private void AgregarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarbtnMouseClicked

        if(DatosdelAmigo.encontrado){
            
            boolean coincidencia=false,yaesamigo=false,decidido=false;
            
            String emailaagregar,emaildelsolicitante;
            emailaagregar=Contactoaagregartxt.getText();
            
            try{
            
                
            RandomAccessFile raf=new RandomAccessFile("Cuentas/"+emailaagregar+"/manageFriends.fbn","rw");
            raf.seek(0);
            
            while(raf.getFilePointer() < raf.length()){
                
                emaildelsolicitante=raf.readUTF();
                yaesamigo=raf.readBoolean();
                decidido=raf.readBoolean();
                
                
                if(emaildelsolicitante.equals(Profile.Email)){
                    
                     coincidencia=true;
                     break;
                    
                }
                
                
                
                
            }
            
            
            
            
            
            if(!coincidencia){
            
            
            raf.seek(raf.length());
            
            raf.writeUTF(Profile.Email);
            raf.writeBoolean(false);
            raf.writeBoolean(false);
            
             JOptionPane.showMessageDialog(null, "Se ha enviado exitosamente la solicitud de amistad , porfavor espere a que su contacto confirme que es su amigo !!",
                "Informacion de Cuenta", JOptionPane.INFORMATION_MESSAGE);
         
         
            
            }
            
            if(coincidencia && !yaesamigo && decidido){
                
                String comparation;
                raf.seek(0);
                
                while(raf.getFilePointer() < raf.length()){
                    
                    comparation=raf.readUTF();
                    
                    if(comparation.equals(Profile.Email)){
                        
                      raf.writeBoolean(false);
                      raf.writeBoolean(false);
                        break;
                    }
                    
                    raf.readBoolean();
                    raf.readBoolean();
                    
                    
                }
                
                 JOptionPane.showMessageDialog(null, "Se ha enviado exitosamente la solicitud de amistad , porfavor espere a que su contacto confirme que es su amigo !!",
                "Informacion de Cuenta", JOptionPane.INFORMATION_MESSAGE);
                
                
                
                
            }
            
            
            if(coincidencia && !yaesamigo && !decidido ){
                
                 JOptionPane.showMessageDialog(null, " Ya le ha mandado una solicitud de amistad a este usuario, espere a que este confirme la condicion de amistad !!",
                "Informacion de Cuenta", JOptionPane.INFORMATION_MESSAGE);
                
                
                
                
                
                
            }
            
            
            if(coincidencia && yaesamigo && decidido ){
                
                
                JOptionPane.showMessageDialog(null, " Este usuario ya esta registrado como su amigo !!",
                "Informacion de Cuenta", JOptionPane.INFORMATION_MESSAGE);
                
                
            }
            
            
            
            
            
            }
            catch(Exception error){
                
            }
            
            
            
            DatosdelAmigo.encontrado=false;
            
            
        }else{
            
            JOptionPane.showMessageDialog(null, " Error en el envio, verifique que este correo se encuentre en el sistema o que aun este activo !!",
                "Informacion de Cuenta", JOptionPane.INFORMATION_MESSAGE);
            
            
            
        }
        
       
        
    }//GEN-LAST:event_AgregarbtnMouseClicked

    private void NtxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_NtxtPropertyChange
        
        
      
            
            
            
        
    }//GEN-LAST:event_NtxtPropertyChange

    private void GtxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_GtxtPropertyChange
        
     
            
           
            
            
        
    }//GEN-LAST:event_GtxtPropertyChange

    private void FItxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_FItxtPropertyChange
        
       
          
    }//GEN-LAST:event_FItxtPropertyChange

    private void NameftxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_NameftxtPropertyChange
       
    }//GEN-LAST:event_NameftxtPropertyChange

    private void GenderftxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_GenderftxtPropertyChange
        
       
    }//GEN-LAST:event_GenderftxtPropertyChange

    private void DateingretxtPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_DateingretxtPropertyChange
        
       
    }//GEN-LAST:event_DateingretxtPropertyChange

    private void BacktoperfbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BacktoperfbtnMouseClicked
        
        Perfil pr=new Perfil();
        pr.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_BacktoperfbtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Enviar_Solicitudes().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregarbtn;
    private javax.swing.JButton Backtoperfbtn;
    private javax.swing.JButton Buscarbtn;
    private javax.swing.JTextField Contactoaagregartxt;
    private javax.swing.JLabel Dateingretxt;
    private javax.swing.JLabel FItxt;
    private javax.swing.JLabel Fieldnametxt;
    private javax.swing.JLabel Genderftxt;
    private javax.swing.JLabel Gendertxt;
    private javax.swing.JLabel Gtxt;
    private javax.swing.JLabel Ingrestxt;
    private javax.swing.JLabel Membersincetxt;
    private javax.swing.JLabel Membertxt;
    private javax.swing.JLabel Namefieldtxt;
    private javax.swing.JLabel Nameftxt;
    private javax.swing.JLabel Nametxt;
    private javax.swing.JLabel Natxt;
    private javax.swing.JLabel Nombretxt;
    private javax.swing.JLabel Ntxt;
    private javax.swing.JLabel Sexotxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel sextypetxt;
    // End of variables declaration//GEN-END:variables
}
