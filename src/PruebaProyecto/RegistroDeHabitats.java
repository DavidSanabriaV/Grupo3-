
package PruebaProyecto;

public class RegistroDeHabitats extends javax.swing.JFrame {

    public RegistroDeHabitats() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AgregarHabi = new javax.swing.JButton();
        EliminarInfo = new javax.swing.JButton();
        ConsultarHabi = new javax.swing.JButton();
        ModificaHabi = new javax.swing.JButton();
        AtrasAAL = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 640, 170, 120));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE HABITATS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 360, -1, -1));

        AgregarHabi.setBackground(new java.awt.Color(65, 85, 40));
        AgregarHabi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarHabi.setForeground(new java.awt.Color(255, 255, 255));
        AgregarHabi.setText("AGREGAR HABITAT");
        AgregarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarHabiActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, 210, 40));

        EliminarInfo.setBackground(new java.awt.Color(65, 85, 40));
        EliminarInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EliminarInfo.setForeground(new java.awt.Color(255, 255, 255));
        EliminarInfo.setText("ELIMINAR HABITAT");
        EliminarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarInfoActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 340, 40));

        ConsultarHabi.setBackground(new java.awt.Color(65, 85, 40));
        ConsultarHabi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ConsultarHabi.setForeground(new java.awt.Color(255, 255, 255));
        ConsultarHabi.setText("CONSULTAR HABITAT");
        ConsultarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarHabiActionPerformed(evt);
            }
        });
        jPanel1.add(ConsultarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 650, 400, 40));

        ModificaHabi.setBackground(new java.awt.Color(65, 85, 40));
        ModificaHabi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ModificaHabi.setForeground(new java.awt.Color(255, 255, 255));
        ModificaHabi.setText("MODIFICAR HABITAT");
        ModificaHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaHabiActionPerformed(evt);
            }
        });
        jPanel1.add(ModificaHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 530, 250, 40));

        AtrasAAL.setText("Atras");
        AtrasAAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasAALActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasAAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 660, 80, 70));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTROHABITATSBACK.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, -5, 796, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarHabiActionPerformed
        AgregarHabi aHbi = new AgregarHabi();
        aHbi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarHabiActionPerformed

    private void EliminarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarInfoActionPerformed
        EliminarHabi Ehabi= new EliminarHabi();
        Ehabi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EliminarInfoActionPerformed

    private void ConsultarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarHabiActionPerformed
        ConsultarHabi Chabi = new ConsultarHabi();
        Chabi.setVisible(true);
        this.dispose();
        
      
    }//GEN-LAST:event_ConsultarHabiActionPerformed

    private void ModificaHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaHabiActionPerformed
       ModificarHabi Mhabi = new ModificarHabi();
       Mhabi.setVisible(true);
       this.dispose();
    }//GEN-LAST:event_ModificaHabiActionPerformed

    private void AtrasAALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasAALActionPerformed
        Menu atrasMenu = new Menu();
        atrasMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasAALActionPerformed

    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeHabitats().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarHabi;
    private javax.swing.JButton AtrasAAL;
    private javax.swing.JButton ConsultarHabi;
    private javax.swing.JButton EliminarInfo;
    private javax.swing.JButton ModificaHabi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
