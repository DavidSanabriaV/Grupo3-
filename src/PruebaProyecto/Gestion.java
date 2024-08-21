
package PruebaProyecto;

public class Gestion extends javax.swing.JFrame {

    public Gestion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        HorariAlimentacion = new javax.swing.JButton();
        AtrasGestion = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(119, 139, 81));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 150, 140));

        jLabel3.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(65, 85, 40));
        jLabel3.setText("ALIMENTACION");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 170, 230, 110));

        jLabel4.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(65, 85, 40));
        jLabel4.setText("GESTION DE");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 140, 190, 110));

        HorariAlimentacion.setBackground(new java.awt.Color(65, 85, 40));
        HorariAlimentacion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HorariAlimentacion.setForeground(new java.awt.Color(255, 255, 255));
        HorariAlimentacion.setText("GESTION DE ALIMENTACION");
        HorariAlimentacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HorariAlimentacionActionPerformed(evt);
            }
        });
        jPanel2.add(HorariAlimentacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 500, 330, 90));

        AtrasGestion.setBackground(new java.awt.Color(102, 102, 102));
        AtrasGestion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasGestion.setForeground(new java.awt.Color(255, 255, 255));
        AtrasGestion.setText("Atras");
        AtrasGestion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasGestionActionPerformed(evt);
            }
        });
        jPanel2.add(AtrasGestion, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 670, 90, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/GESTIONALIMENTACIONBACK.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void HorariAlimentacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HorariAlimentacionActionPerformed
        //boton para it a horario alimentacion 
        HorarioAliment HoraAli = new HorarioAliment();
        HoraAli.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_HorariAlimentacionActionPerformed

    private void AtrasGestionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasGestionActionPerformed
        //boton para ir atras 
        Home atrasGES = new Home();
        atrasGES.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasGestionActionPerformed
 
    public static void main(String args[]) {
      
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gestion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasGestion;
    private javax.swing.JButton HorariAlimentacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
