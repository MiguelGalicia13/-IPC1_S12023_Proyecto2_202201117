/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Hilos.threads;
import Imagenes.*;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Stack;
import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author ricar
 */
public class Editor extends javax.swing.JFrame {
    
JFileChooser archivoSelected = new JFileChooser();
 File archivo;
    /**
     * Creates new form Editor
     */
    public Editor() {
        initComponents();
    }

        /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_selecImg = new javax.swing.JButton();
        imgSelected = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        JPGaBMP = new javax.swing.JRadioButton();
        copyJPG = new javax.swing.JRadioButton();
        sepia = new javax.swing.JRadioButton();
        rotate90 = new javax.swing.JRadioButton();
        ByW = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btn_selecImg.setText("Seleccionar Imagen");
        btn_selecImg.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_selecImgMouseClicked(evt);
            }
        });

        imgSelected.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        imgSelected.setText("Imagen");
        imgSelected.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        JPGaBMP.setText("JPG a BMP y viceversa");

        copyJPG.setText("copia JPG");

        sepia.setText("Sepia");

        rotate90.setText("Modificar Imagen");
        rotate90.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rotate90ActionPerformed(evt);
            }
        });

        ByW.setText("Blanco y negro");
        ByW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ByWActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ByW)
                    .addComponent(rotate90)
                    .addComponent(copyJPG)
                    .addComponent(JPGaBMP, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sepia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(124, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(JPGaBMP)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(copyJPG)
                .addGap(12, 12, 12)
                .addComponent(sepia)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rotate90)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ByW)
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 197, Short.MAX_VALUE)
                .addComponent(imgSelected, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btn_selecImg, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(142, 142, 142))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btn_selecImg, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(imgSelected, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(149, 149, 149))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rotate90ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rotate90ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rotate90ActionPerformed

    private void ByWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ByWActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ByWActionPerformed

    private void btn_selecImgMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_selecImgMouseClicked
        // TODO add your handling code here:
        // Crear un filtro para mostrar solo archivos JPG
        archivoSelected.setFileFilter(new FileNameExtensionFilter("Imagenes", "jpg"));
        int respuesta = archivoSelected.showOpenDialog(null);
        // Verifica que el archivo haya sido seleccionado
        if (respuesta == JFileChooser.APPROVE_OPTION) {
            archivo = archivoSelected.getSelectedFile();
            // Verifica que el archivo sea una imagen JPG
            if (archivo.getName().toLowerCase().endsWith(".jpg")) {
                ImageIcon imagen = new ImageIcon(archivo.getAbsolutePath());
                Image img = imagen.getImage();
                //Redimensiona la iamgen para el label
                img = img.getScaledInstance(imgSelected.getWidth(), imgSelected.getHeight(), Image.SCALE_SMOOTH);
                imagen = new ImageIcon(img);
                imgSelected.setIcon(imagen);
            } else {
                JOptionPane.showMessageDialog(null, "Solo se permiten imágenes en formato JPG");
            }
        }
        }
        
    //GEN-LAST:event_btn_selecImgMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Editor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Editor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton ByW;
    private javax.swing.JRadioButton JPGaBMP;
    private javax.swing.JButton btn_selecImg;
    private javax.swing.JRadioButton copyJPG;
    private javax.swing.JLabel imgSelected;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rotate90;
    private javax.swing.JRadioButton sepia;
    // End of variables declaration//GEN-END:variables
}
