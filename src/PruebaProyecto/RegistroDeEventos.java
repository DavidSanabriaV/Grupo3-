
package PruebaProyecto;

public class RegistroDeEventos extends javax.swing.JFrame {

    public RegistroDeEventos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MostrarEven = new javax.swing.JButton();
        AgregarEven = new javax.swing.JButton();
        ModificarEven = new javax.swing.JButton();
        AtrasEven = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setAutoscrolls(true);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 660, 170, 130));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE EVENTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 380, -1, -1));

        MostrarEven.setBackground(new java.awt.Color(65, 85, 40));
        MostrarEven.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MostrarEven.setForeground(new java.awt.Color(255, 255, 255));
        MostrarEven.setText("CONSULTAR EVENTO");
        MostrarEven.setBorderPainted(false);
        MostrarEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MostrarEvenActionPerformed(evt);
            }
        });
        jPanel1.add(MostrarEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 620, 410, 40));

        AgregarEven.setBackground(new java.awt.Color(65, 85, 40));
        AgregarEven.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AgregarEven.setForeground(new java.awt.Color(255, 255, 255));
        AgregarEven.setText("AGREGAR EVENTOS");
        AgregarEven.setBorderPainted(false);
        AgregarEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarEvenActionPerformed(evt);
            }
        });
        jPanel1.add(AgregarEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, 230, 40));

        ModificarEven.setBackground(new java.awt.Color(65, 85, 40));
        ModificarEven.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ModificarEven.setForeground(new java.awt.Color(255, 255, 255));
        ModificarEven.setText("MODIFICAR EVENTOS");
        ModificarEven.setBorderPainted(false);
        ModificarEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarEvenActionPerformed(evt);
            }
        });
        jPanel1.add(ModificarEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 560, 300, 40));

        AtrasEven.setText("Atras");
        AtrasEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasEvenActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 680, -1, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRODEEVENTOSBACK.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 879, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MostrarEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MostrarEvenActionPerformed
        MostrarEvent MosEven = new MostrarEvent();
        MosEven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MostrarEvenActionPerformed

    private void AgregarEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarEvenActionPerformed
        AgregarEvent AgerEven = new AgregarEvent();
        AgerEven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AgregarEvenActionPerformed

    private void ModificarEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarEvenActionPerformed
        ModificarEvento modiEvent = new ModificarEvento();
        modiEvent.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ModificarEvenActionPerformed

    private void AtrasEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasEvenActionPerformed
        Menu atrasMenuEve = new Menu();
        atrasMenuEve.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasEvenActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroDeEventos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarEven;
    private javax.swing.JButton AtrasEven;
    private javax.swing.JButton ModificarEven;
    private javax.swing.JButton MostrarEven;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
