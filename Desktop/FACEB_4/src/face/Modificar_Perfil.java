/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Modificar_Perfil.java
 *
 * Created on 12-01-2011, 06:38:42 PM
 */
package face;

import java.io.File;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author Josue
 */
public class Modificar_Perfil extends javax.swing.JFrame {

    /** Creates new form Modificar_Perfil */
    public Modificar_Perfil() {
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        Nombrefield = new javax.swing.JLabel();
        usuer = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        phonofield = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Anioscmb = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        Mescmb = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        Diacmb = new javax.swing.JComboBox();
        Cambiosbtn = new javax.swing.JButton();
        Regresarbtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Deactivatebtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1324, 734));
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 3, 36)); // NOI18N
        jLabel1.setText("   MODIFY YOUR STAT");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(120, 40, 400, 43);

        Nombrefield.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        Nombrefield.setText("  Usuario:");
        getContentPane().add(Nombrefield);
        Nombrefield.setBounds(50, 104, 65, 22);

        usuer.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        usuer.setForeground(new java.awt.Color(255, 255, 255));
        usuer.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                usuerPropertyChange(evt);
            }
        });
        getContentPane().add(usuer);
        usuer.setBounds(140, 110, 255, 18);

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("Telefono:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 156, 80, 17);
        getContentPane().add(phonofield);
        phonofield.setBounds(140, 160, 225, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("         Fecha de Nacimiento");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(155, 240, 190, 17);

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("Año:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 280, 40, 17);

        Anioscmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970" }));
        getContentPane().add(Anioscmb);
        Anioscmb.setBounds(100, 280, 75, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText(" Mes:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(260, 280, 50, 17);

        Mescmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        getContentPane().add(Mescmb);
        Mescmb.setBounds(310, 280, 81, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        jLabel6.setText("Dia:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(460, 280, 40, 15);

        Diacmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        getContentPane().add(Diacmb);
        Diacmb.setBounds(510, 280, 80, 20);

        Cambiosbtn.setText("Guardar cambios");
        Cambiosbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CambiosbtnMouseClicked(evt);
            }
        });
        getContentPane().add(Cambiosbtn);
        Cambiosbtn.setBounds(75, 462, 171, 23);

        Regresarbtn.setText("Regresar a mi perfil");
        Regresarbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegresarbtnMouseClicked(evt);
            }
        });
        getContentPane().add(Regresarbtn);
        Regresarbtn.setBounds(264, 462, 181, 23);

        jLabel7.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel7.setText("Para modificar porfavor ingrese los datos de telefono");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(450, 150, 480, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("y una nueva fecha de nacimiento son necesarios ambos !!");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(450, 180, 530, 20);

        Deactivatebtn.setText("Desactivar Cuenta");
        Deactivatebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DeactivatebtnMouseClicked(evt);
            }
        });
        getContentPane().add(Deactivatebtn);
        Deactivatebtn.setBounds(820, 462, 171, 23);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/face/imagess1 - copia.jpg"))); // NOI18N
        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(0, 0, 1320, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuerPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_usuerPropertyChange
        
         usuer.setText(Profile.Email);
        
        
        
    }//GEN-LAST:event_usuerPropertyChange

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void CambiosbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CambiosbtnMouseClicked
        
        try{
            
            int index,anio=0;
            int mes;
            int dia;
               
            long nuevafecha;
            
            
            RandomAccessFile t=new RandomAccessFile("Cuentas/"+Profile.Email+"/profile.fbn","rw");
            
            
            
            
            SetRegistro sr=new SetRegistro();
            
          dia=Diacmb.getSelectedIndex()+1 ;
          mes=Mescmb.getSelectedIndex() ;
          index=Anioscmb.getSelectedIndex();
          
            if(index == 0){
                
                anio=2011;
            }else if(index == 1){
                anio+=2010;
            }else if(index ==2){
                anio+=2009;
            }else if(index ==3){
                anio+=2008;
            }else if(index ==4){
                anio+=2007;
            }else if(index ==5){
                anio+=2006;
            }else if(index ==6){
                anio+=2005;
            }else if(index ==7){
                anio+=2004;
            }else if(index ==8){
                anio+=2003;
            }else if(index ==9){
                anio+=2002;
            }else if(index ==10){
                anio+=2001;
            }else if(index ==11){
                anio+=2000;
            }else if(index ==12){
                anio+=1999;
            }else if(index ==13){
                anio+=1998;
            }else if(index ==14){
                anio+=1997;
            }else if(index ==15){
                anio+=1996;
            }else if(index ==16){
                anio+=1995;
            }else if(index ==17){
                anio+=1994;
            }else if(index ==18){
                anio+=1993;
            }else if(index ==19){
                anio+=1992;
            }else if(index ==20){
                anio+=1991;
            }else if(index == 21){
                anio+=1990;
            }else if(index == 22){
                
                anio+=1989;
            }else if(index == 23){
                
                anio+=1988;
            }else if(index == 24){
                
                anio+=1987;
            }else if(index == 25){
                
                anio+=1986;
            }else if(index == 26){
                
                anio+=1985;
            }else if(index == 27){
                
                anio+=1984;
            }else if(index == 28){
                
                anio+=1983;
            }else if(index == 29){
                
                anio+=1982;
            }else if(index == 30){
                
                anio+=1981;
            }else if(index == 31){
                
                 anio+=1980;
            }else if( index == 32){
                
                anio+=1979;
            }else if( index == 33){
                
                anio+=1978;
            }else if( index == 34){
                
                anio+=1977;
            }else if( index == 35){
                
                anio+=1976;
            }else if( index == 36){
                
                anio+=1975;
            }else if( index == 37){
                
                anio+=1974;
            }else if( index == 38){
                
                anio+=1973;
            }else if( index == 39){
                
                anio+=1972;
            }else if( index == 40){
                
                anio+=1971;
            }else if( index == 41){
                
                anio+=1970;
            }
            
            sr.setFechadeNacimiento(dia,mes,anio);
          
          nuevafecha=sr.FechadeNacimiento.getTime();
            
          if(index != 0 && dia != 0 && mes != 0){
              
              t.seek(0);
              
              
              t.readUTF();
              t.readChar();
              t.writeLong(nuevafecha);
              t.readUTF();
              t.readLong();
              t.writeInt(Integer.parseInt(phonofield.getText()));
              
              JOptionPane.showMessageDialog(null, " Modificacion realizada con exito!!",
                "Proceso de modificacion de datos", JOptionPane.INFORMATION_MESSAGE);
                
              
              
          } else{
              
              JOptionPane.showMessageDialog(null, "Ingrese un valor para los datos de dia,mes o año !!",
                "Proceso de modificacion de datos", JOptionPane.INFORMATION_MESSAGE);
                
              
              
          } 
          
            
            
            
        }
        catch(Exception error){
            
            
        }
    }//GEN-LAST:event_CambiosbtnMouseClicked

    private void RegresarbtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegresarbtnMouseClicked
      
         Perfil pe=new Perfil();
         pe.setVisible(true);
         dispose();
        
        
    }//GEN-LAST:event_RegresarbtnMouseClicked

    private void DeactivatebtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DeactivatebtnMouseClicked
       
        try{
            
            
            String comparison;
           
            DesactivarCuenta dc=new DesactivarCuenta();
            
            RandomAccessFile rap=new RandomAccessFile("Gerencia.fbn","rw");
            rap.seek(0);
            
            while(rap.getFilePointer() < rap.length()){
                
                comparison=rap.readUTF();
                
                if(comparison.equals(Profile.Email)){
                rap.readUTF();
                rap.writeBoolean(false);
                
                break;
                
                }
                
                rap.readUTF();
                rap.readBoolean();
                
            }
            
           
            
            
            
           
          
            
            
            
            
            
         JOptionPane.showMessageDialog(null, "La cuenta fue desactivada exitosamente!!",
                "Estado de cuenta", JOptionPane.INFORMATION_MESSAGE);
         
         
         LogIn loga=new LogIn();
         loga.setVisible(true);
         dispose();
            
            
            
            
            
            
            
        }
        catch(Exception err){
            
        }
        
        
        
        
        
        
    }//GEN-LAST:event_DeactivatebtnMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Modificar_Perfil().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Anioscmb;
    private javax.swing.JButton Cambiosbtn;
    private javax.swing.JButton Deactivatebtn;
    private javax.swing.JComboBox Diacmb;
    private javax.swing.JComboBox Mescmb;
    private javax.swing.JLabel Nombrefield;
    private javax.swing.JButton Regresarbtn;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField phonofield;
    private javax.swing.JLabel usuer;
    // End of variables declaration//GEN-END:variables
}