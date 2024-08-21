package PruebaProyecto;

public class RegistroDeAnimales extends javax.swing.JFrame {

    public RegistroDeAnimales() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        AgregarInfo = new javax.swing.JButton();
        ModificarAnimales = new javax.swing.JButton();
        EliminarAnimales = new javax.swing.JButton();
        BuscarAnimal = new javax.swing.JButton();
        AtrasAAL = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 150, 130));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setText("REGISTRO DE ANIMALES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 380, -1, -1));

        AgregarInfo.setBackground(new java.awt.Color(65, 85, 40));
        AgregarInfo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarInfo.setForeground(new java.awt.Color(255, 255, 255));
        AgregarInfo.setText("AGREGAR ANIMAL");
        AgregarInfo.setBorderPainted(false);
        AgregarInfo.setHideActionText(true);
        AgregarInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarInfoActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarInfo, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 230, 40));

        ModificarAnimales.setBackground(new java.awt.Color(65, 85, 40));
        ModificarAnimales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ModificarAnimales.setForeground(new java.awt.Color(255, 255, 255));
        ModificarAnimales.setText("MODIFICAR ANIMAL");
        ModificarAnimales.setBorderPainted(false);
        ModificarAnimales.setHideActionText(true);
        ModificarAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarAnimalesActionPerformed(evt);
            }
        });
        jPanel1.add(ModificarAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 620, 340, 40));

        EliminarAnimales.setBackground(new java.awt.Color(65, 85, 40));
        EliminarAnimales.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        EliminarAnimales.setForeground(new java.awt.Color(255, 255, 255));
        EliminarAnimales.setText("ELIMINAR ANIMAL");
        EliminarAnimales.setBorderPainted(false);
        EliminarAnimales.setHideActionText(true);
        EliminarAnimales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarAnimalesActionPerformed(evt);
            }
        });
        jPanel1.add(EliminarAnimales, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 430, 40));

        BuscarAnimal.setBackground(new java.awt.Color(65, 85, 40));
        BuscarAnimal.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        BuscarAnimal.setForeground(new java.awt.Color(255, 255, 255));
        BuscarAnimal.setText("BUSCAR ANIMAL");
        BuscarAnimal.setBorderPainted(false);
        BuscarAnimal.setHideActionText(true);
        BuscarAnimal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BuscarAnimalActionPerformed(evt);
            }
        });
        jPanel1.add(BuscarAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 300, 40));

        AtrasAAL.setText("Atras");
        AtrasAAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasAALActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasAAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 700, 80, 70));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRODEANIMALESBACK.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 822, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AgregarInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarInfoActionPerformed
        //Boton para ir a agregar animal
        AgregarAnimal1 ani1 = new AgregarAnimal1();
        ani1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarInfoActionPerformed

    private void ModificarAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarAnimalesActionPerformed
        //boton para ir a modificar animal
        ModificarAnimalLobby MAL = new ModificarAnimalLobby();
        MAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ModificarAnimalesActionPerformed

    private void AtrasAALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasAALActionPerformed
        //boton para ir atras
        Menu atrasMenu = new Menu();
        atrasMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasAALActionPerformed

    private void EliminarAnimalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarAnimalesActionPerformed
        //boton para ir a eliminar animal
        EliminarAnimal EAL = new EliminarAnimal();
        EAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EliminarAnimalesActionPerformed

    private void BuscarAnimalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BuscarAnimalActionPerformed
        //boton para ir a buscar animal
        BuscarAnimal BAL = new BuscarAnimal();
        BAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_BuscarAnimalActionPerformed

    public static void main(String args[]) {

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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
