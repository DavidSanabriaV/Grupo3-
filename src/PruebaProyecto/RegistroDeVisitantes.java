
package PruebaProyecto;

public class RegistroDeVisitantes extends javax.swing.JFrame {

    public RegistroDeVisitantes() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AgregarVis = new javax.swing.JButton();
        AtrasAAL = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 630, 170, 130));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setText("REGISTRO DE VISITANTES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 380, -1, -1));

        AgregarVis.setBackground(new java.awt.Color(65, 85, 40));
        AgregarVis.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarVis.setForeground(new java.awt.Color(255, 255, 255));
        AgregarVis.setText("GESTIONAR VISITANTES");
        AgregarVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarVisActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarVis, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 520, 290, 40));

        AtrasAAL.setText("Atras");
        AtrasAAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasAALActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasAAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 660, 90, 70));
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 398, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/VISITANTESBACK_1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasAALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasAALActionPerformed
        Menu atrasMenu = new Menu();
        atrasMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasAALActionPerformed

    private void AgregarVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarVisActionPerformed
        AgregarVis visi = new AgregarVis();
        visi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarVisActionPerformed

    public static void main(String args[]) {
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeVisitantes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarVis;
    private javax.swing.JButton AtrasAAL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
