/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package komunitas.main;

import java.awt.Color;

/**
 *
 * @author Papas
 */
public class formKomunitas extends javax.swing.JFrame {

    /**
     * Creates new form formKomunitas
     */
    public formKomunitas() {
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

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane10 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextArea6 = new javax.swing.JTextArea();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextArea7 = new javax.swing.JTextArea();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextArea8 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Komunitas ISLC");
        setBounds(new java.awt.Rectangle(500, 250, 0, 0));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/komunitas/gambar/171.png"))); // NOI18N
        jButton1.setText("Kembali");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Bookman Old Style", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 51));
        jLabel1.setText("Jenis Komunitas Information System Learning Community");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("ISLC-Java merupakan komunitas yang bertujuan untuk \nmengembangkan minat dan bakat mahasiswa khususnya \npada bahasa pemograman JAVA yang berbasis Desktop");
        jScrollPane1.setViewportView(jTextArea1);

        jTabbedPane10.addTab("ISLC-JAVA", jScrollPane1);

        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setText("ISLC-VB merupakan komunitas yang bertujuan untuk \nmengembangkan minat dan bakat mahasiswa khususnya\npada bahasa pemograman Visual Basic yang berbasis Desktop");
        jScrollPane3.setViewportView(jTextArea3);

        jTabbedPane10.addTab("ISLC-VB", jScrollPane3);

        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setText("ISLC-DESIGN merupakan komunitas yang bertujuan\nuntuk mengembangkan minat dan bakat mahasiswa\nkhususnya pada pengembangan manipulasi\nmaupun pembuatan design-design, dan lain-lain");
        jScrollPane4.setViewportView(jTextArea4);

        jTabbedPane10.addTab("ISLC-DESIGN", jScrollPane4);

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jTextArea5.setText("ISLC-ANIMASI merupakan komunitas yang bertujuan\nuntuk mengembangkan minat dan bakat mahasiswa\nkhususnya pada pengembangan minat untuk editing\nvideo, dan pembuatan animasi kreatif");
        jScrollPane5.setViewportView(jTextArea5);

        jTabbedPane10.addTab("ISLC-ANIMASI", jScrollPane5);

        jTextArea6.setColumns(20);
        jTextArea6.setRows(5);
        jTextArea6.setText("ISLC-SENI merupakan komunitas yang bertujuan\nuntuk mengembangkan minat dan bakat mahasiswa\nkhususnya pada pengembangan skill dan bakat\nbermusik, teatrikal, drama, dan sastra");
        jScrollPane6.setViewportView(jTextArea6);

        jTabbedPane10.addTab("ISLC-SENI", jScrollPane6);

        jTextArea7.setColumns(20);
        jTextArea7.setRows(5);
        jTextArea7.setText("ISLC-JEPANG merupakan komunitas yang bertujuan\nuntuk mengembangkan minat dan bakat mahasiswa\nkhususnya dalam mempelajari bahasa asing\nyaitu bahasa Bepang.");
        jScrollPane7.setViewportView(jTextArea7);

        jTabbedPane10.addTab("ISLC-JEPANG", jScrollPane7);

        jTextArea8.setColumns(20);
        jTextArea8.setRows(5);
        jTextArea8.setText("ISLC-INGGRIS merupakan komunitas yang \nbertujuan untuk mengembangkan minat dan bakat\nmahasiswa khususnya pada pengembangan bahasa\nasing yaitu bahasa inggris");
        jScrollPane8.setViewportView(jTextArea8);

        jTabbedPane10.addTab("ISLC-INGGRIS", jScrollPane8);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setText("ISLC-PHP merupakan komunitas yang bertujuan untuk \nmengembangkan minat dan bakat mahasiswa khususnya\npada bahasa pemograman PHP dan pemograman berbasis Website");
        jScrollPane2.setViewportView(jTextArea2);

        jTabbedPane10.addTab("ISLC-PHP", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                    .addComponent(jTabbedPane10, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane10, javax.swing.GroupLayout.DEFAULT_SIZE, 233, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        formUtama fmu= new formUtama();
        this.dispose();
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setForeground(Color.green);
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setForeground(Color.black);
    }//GEN-LAST:event_jButton1MouseExited

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
            java.util.logging.Logger.getLogger(formKomunitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formKomunitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formKomunitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formKomunitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formKomunitas().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTabbedPane jTabbedPane10;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JTextArea jTextArea6;
    private javax.swing.JTextArea jTextArea7;
    private javax.swing.JTextArea jTextArea8;
    // End of variables declaration//GEN-END:variables
}
