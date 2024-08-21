package PruebaProyecto;

public class RegistroDeAnimales extends javax.swing.JFrame {

    public RegistroDeAnimales() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        AgregarInfo = new javax.swing.JButton();
        ModificarAnimales = new javax.swing.JButton();
        EliminarAnimales = new javax.swing.JButton();
        BuscarAnimal = new javax.swing.JButton();
        AtrasAAL = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setAutoscrolls(true);

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel1.setText("Registro de Animales");

        AgregarInfo.setBackground(new java.awt.Color(0, 0, 0));
        AgregarInfo.setForeground(new java.awt.Color(255, 255, 255));
        AgregarInfo.setText("Agregar Informacion");
        AgregarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarInfoActionPerformed(evt);
            }
        });

        ModificarAnimales.setBackground(new java.awt.Color(0, 0, 0));
        ModificarAnimales.setForeground(new java.awt.Color(255, 255, 255));
        ModificarAnimales.setText("Modificar Informacion");
        ModificarAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarAnimalesActionPerformed(evt);
            }
        });

        EliminarAnimales.setBackground(new java.awt.Color(0, 0, 0));
        EliminarAnimales.setForeground(new java.awt.Color(255, 255, 255));
        EliminarAnimales.setText("Eliminar Informacion");
        EliminarAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAnimalesActionPerformed(evt);
            }
        });

        BuscarAnimal.setBackground(new java.awt.Color(0, 0, 0));
        BuscarAnimal.setForeground(new java.awt.Color(255, 255, 255));
        BuscarAnimal.setText("Buscar Informacion");
        BuscarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarAnimalActionPerformed(evt);
            }
        });

        AtrasAAL.setBackground(new java.awt.Color(0, 0, 0));
        AtrasAAL.setForeground(new java.awt.Color(255, 255, 255));
        AtrasAAL.setText("Atras");
        AtrasAAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasAALActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(AgregarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(622, 622, 622)
                            .addComponent(jLabel1))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EliminarAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModificarAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BuscarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(673, 673, 673)
                        .addComponent(AtrasAAL)))
                .addContainerGap(753, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(67, 67, 67)
                .addComponent(AgregarInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(58, 58, 58)
                .addComponent(ModificarAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(EliminarAnimales, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(BuscarAnimal, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69)
                .addComponent(AtrasAAL)
                .addContainerGap(318, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarInfoActionPerformed
        AgregarAnimal1 ani1 = new AgregarAnimal1();
        ani1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarInfoActionPerformed

    private void ModificarAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarAnimalesActionPerformed
        ModificarAnimalLobby MAL = new ModificarAnimalLobby();
        MAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ModificarAnimalesActionPerformed

    private void AtrasAALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasAALActionPerformed
        Menu atrasMenu = new Menu();
        atrasMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasAALActionPerformed

    private void EliminarAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAnimalesActionPerformed
        EliminarAnimal EAL = new EliminarAnimal();
        EAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EliminarAnimalesActionPerformed

    private void BuscarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarAnimalActionPerformed
        BuscarAnimal BAL = new BuscarAnimal();
        BAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BuscarAnimalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeAnimales().setVisible(true);
            }
        });
    }
   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarInfo;
    private javax.swing.JButton AtrasAAL;
    private javax.swing.JButton BuscarAnimal;
    private javax.swing.JButton EliminarAnimales;
    private javax.swing.JButton ModificarAnimales;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
