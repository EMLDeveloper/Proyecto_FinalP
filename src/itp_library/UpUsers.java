/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package itp_library;

import java.awt.BorderLayout;
import java.awt.Color;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import static itp_library.Dashboard.content;
import java.sql.Statement;
/**
 *
 * @author Antonio
 */
public class UpUsers extends javax.swing.JPanel {

    Connect conn;
    Connection reg;
    boolean edit;
    String idus;
    /**
     * Creates new form Principal
     */
    public UpUsers() {
        initComponents();
        conn = new Connect();
        reg = conn.getConnection();
        edit = false;
    }
    
    public UpUsers(String usid, String usname, String usap1, String usap2, String usdom, String ustel) {
        initComponents();
        conn = new Connect();
        reg = conn.getConnection();
        idus = usid;
        name.setText(usname);
        ap1.setText(usap1);
        ap2.setText(usap2);
        dom.setText(usdom);
        tel.setText(ustel);
        edit = true;
        jLabel1.setText("Guardar");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        body = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        Text1 = new javax.swing.JLabel();
        Text2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        tel = new javax.swing.JTextField();
        dom = new javax.swing.JTextField();
        Text3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        Text4 = new javax.swing.JLabel();
        ap1 = new javax.swing.JTextField();
        jSeparator5 = new javax.swing.JSeparator();
        Text5 = new javax.swing.JLabel();
        ap2 = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(750, 430));
        setPreferredSize(new java.awt.Dimension(750, 430));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Title.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        Title.setForeground(new java.awt.Color(153, 0, 0));
        Title.setText("Registrar nuevo Usuario");
        add(Title, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        Text1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text1.setText("Teléfono");
        add(Text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 180, -1, -1));

        Text2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text2.setText("Domicilio");
        add(Text2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jSeparator1.setForeground(new java.awt.Color(153, 0, 0));
        jSeparator1.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 240, 260, 10));

        jSeparator2.setForeground(new java.awt.Color(153, 0, 0));
        jSeparator2.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 150, 260, 10));

        tel.setForeground(new java.awt.Color(102, 102, 102));
        tel.setText("Ingrese un número telefónico");
        tel.setBorder(null);
        tel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                telMousePressed(evt);
            }
        });
        tel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telActionPerformed(evt);
            }
        });
        add(tel, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 210, 260, 30));

        dom.setForeground(new java.awt.Color(102, 102, 102));
        dom.setText("Ingrese el domicilio");
        dom.setBorder(null);
        dom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                domMousePressed(evt);
            }
        });
        dom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                domActionPerformed(evt);
            }
        });
        add(dom, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 120, 260, 30));

        Text3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text3.setText("Nombre");
        add(Text3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        name.setForeground(new java.awt.Color(102, 102, 102));
        name.setText("Ingrese el nombre");
        name.setBorder(null);
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nameMousePressed(evt);
            }
        });
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 260, 30));

        jSeparator4.setForeground(new java.awt.Color(153, 0, 0));
        jSeparator4.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 260, 10));

        Text4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text4.setText("Apellido Paterno");
        add(Text4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, -1));

        ap1.setForeground(new java.awt.Color(102, 102, 102));
        ap1.setText("Ingrese el apellido paterno");
        ap1.setBorder(null);
        ap1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ap1MousePressed(evt);
            }
        });
        ap1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap1ActionPerformed(evt);
            }
        });
        add(ap1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 260, 30));

        jSeparator5.setForeground(new java.awt.Color(153, 0, 0));
        jSeparator5.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 260, 10));

        Text5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Text5.setText("Apellido Materno");
        add(Text5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        ap2.setForeground(new java.awt.Color(102, 102, 102));
        ap2.setText("Ingrese el apellido materno");
        ap2.setBorder(null);
        ap2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ap2MousePressed(evt);
            }
        });
        ap2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ap2ActionPerformed(evt);
            }
        });
        add(ap2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 260, 30));

        jSeparator6.setForeground(new java.awt.Color(153, 0, 0));
        jSeparator6.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 260, 10));

        jPanel1.setBackground(new java.awt.Color(153, 0, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Subir");
        jPanel1.add(jLabel1);

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 300, 330, 50));

        jSeparator3.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator3.setForeground(new java.awt.Color(153, 0, 0));
        jSeparator3.setOrientation(javax.swing.SwingConstants.VERTICAL);
        jSeparator3.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 60, 10, 370));

        jSeparator8.setBackground(new java.awt.Color(153, 0, 0));
        jSeparator8.setForeground(new java.awt.Color(153, 0, 0));
        jSeparator8.setPreferredSize(new java.awt.Dimension(200, 10));
        add(jSeparator8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 760, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void telActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telActionPerformed

    private void domMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_domMousePressed
       
       if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(ap1.getText().equals("") || ap1.getText() == null || ap1.getText().equals(" "))
        ap1.setText("Ingrese el apellido paterno");
       if(ap2.getText().equals("") || ap2.getText() == null || ap2.getText().equals(" "))
        ap2.setText("Ingrese el apellido materno");
       if(dom.getText().equals("Ingrese el domicilio"))
        dom.setText("");
       if(tel.getText().equals("") || tel.getText() == null || tel.getText().equals(" "))
        tel.setText("Ingrese un número telefónico");
    }//GEN-LAST:event_domMousePressed

    private void telMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_telMousePressed
        if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(ap1.getText().equals("") || ap1.getText() == null || ap1.getText().equals(" "))
        ap1.setText("Ingrese el apellido paterno");
       if(ap2.getText().equals("") || ap2.getText() == null || ap2.getText().equals(" "))
        ap2.setText("Ingrese el apellido materno");
       if(dom.getText().equals("") || dom.getText() == null || dom.getText().equals(" "))
        dom.setText("Ingrese el domicilio");
       if(tel.getText().equals("Ingrese un número telefónico"))
        tel.setText("");
    }//GEN-LAST:event_telMousePressed

    private void nameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMousePressed
        if(name.getText().equals("Ingrese el nombre"))
        name.setText("");
       if(ap1.getText().equals("") || ap1.getText() == null || ap1.getText().equals(" "))
        ap1.setText("Ingrese el apellido paterno");
       if(ap2.getText().equals("") || ap2.getText() == null || ap2.getText().equals(" "))
        ap2.setText("Ingrese el apellido materno");
       if(dom.getText().equals("") || dom.getText() == null || dom.getText().equals(" "))
        dom.setText("Ingrese el domicilio");
       if(tel.getText().equals("") || tel.getText() == null || tel.getText().equals(" "))
        tel.setText("Ingrese un número telefónico");
    }//GEN-LAST:event_nameMousePressed

    private void ap1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap1MousePressed
        if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(ap1.getText().equals("Ingrese el apellido paterno"))
        ap1.setText("");
       if(ap2.getText().equals("") || ap2.getText() == null || ap2.getText().equals(" "))
        ap2.setText("Ingrese el apellido materno");
       if(dom.getText().equals("") || dom.getText() == null || dom.getText().equals(" "))
        dom.setText("Ingrese el domicilio");
       if(tel.getText().equals("") || tel.getText() == null || tel.getText().equals(" "))
        tel.setText("Ingrese un número telefónico");
    }//GEN-LAST:event_ap1MousePressed

    private void ap1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ap1ActionPerformed

    private void ap2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ap2MousePressed
       if(name.getText().equals("") || name.getText() == null || name.getText().equals(" "))
        name.setText("Ingrese el nombre");
       if(ap2.getText().equals("Ingrese el apellido materno"))
        ap2.setText("");
       if(ap1.getText().equals("") || ap1.getText() == null || ap1.getText().equals(" "))
        ap1.setText("Ingrese el apellido paterno");
       if(dom.getText().equals("") || dom.getText() == null || dom.getText().equals(" "))
        dom.setText("Ingrese el domicilio");
       if(tel.getText().equals("") || tel.getText() == null || tel.getText().equals(" "))
        tel.setText("Ingrese un número telefónico");
    }//GEN-LAST:event_ap2MousePressed

    private void ap2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ap2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ap2ActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void domActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_domActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_domActionPerformed

    void setColor(JPanel panel){
        panel.setBackground(new Color(21,101,192));
    }
    void resetColor(JPanel panel){
        panel.setBackground(new Color(18,90,173));
    }
    
    public void InsertUser(String name, String app, String apm, String dom, String tel) throws SQLException{
        Statement stm = reg.createStatement();
        
        stm.executeUpdate("INSERT INTO `users` (`name`, `last_name_p`, `last_name_m`, `domicilio`, `tel`) VALUES ('"+name+"', '"+app+"', '"+ apm +"', '"+ dom +"', '"+tel+"')");
        javax.swing.JOptionPane.showMessageDialog(this, "¡Usuario registrado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
    }
    
    public void EditUser(String id, String name, String app, String apm, String dom, String tel) throws SQLException{
        Statement stm = reg.createStatement();
        
        stm.executeUpdate("UPDATE `users` SET `name` = '"+name+"', `last_name_p` = '"+app+"', `last_name_m` = '"+apm+"', `domicilio` = '"+dom+"', `tel` = '"+tel+"' WHERE `id` = "+ id +";");
        javax.swing.JOptionPane.showMessageDialog(this, "¡Usuario editado correctamente! \n", "HECHO", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Text1;
    private javax.swing.JLabel Text2;
    private javax.swing.JLabel Text3;
    private javax.swing.JLabel Text4;
    private javax.swing.JLabel Text5;
    private javax.swing.JLabel Title;
    private javax.swing.JTextField ap1;
    private javax.swing.JTextField ap2;
    private javax.swing.JPanel body;
    private javax.swing.JTextField dom;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JTextField name;
    private javax.swing.JTextField tel;
    // End of variables declaration//GEN-END:variables
}
