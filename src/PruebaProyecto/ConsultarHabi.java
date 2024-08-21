package PruebaProyecto;

import javax.swing.JOptionPane;

public class ConsultarHabi extends javax.swing.JFrame {

    public ConsultarHabi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AtrasConsHabi = new javax.swing.JButton();
        MenuConsHabi = new javax.swing.JButton();
        GuardarCHabi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        consuHabi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, 150, 130));

        AtrasConsHabi.setBackground(new java.awt.Color(102, 102, 102));
        AtrasConsHabi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasConsHabi.setForeground(new java.awt.Color(255, 255, 255));
        AtrasConsHabi.setText("Atras");
        AtrasConsHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasConsHabiActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasConsHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 80, 80));

        MenuConsHabi.setBackground(new java.awt.Color(65, 85, 40));
        MenuConsHabi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuConsHabi.setForeground(new java.awt.Color(255, 255, 255));
        MenuConsHabi.setText("MENU");
        MenuConsHabi.setBorderPainted(false);
        MenuConsHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuConsHabiActionPerformed(evt);
            }
        });
        jPanel1.add(MenuConsHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 697, 120, 70));

        GuardarCHabi.setBackground(new java.awt.Color(65, 85, 40));
        GuardarCHabi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarCHabi.setForeground(new java.awt.Color(255, 255, 255));
        GuardarCHabi.setText("BUSCAR");
        GuardarCHabi.setBorderPainted(false);
        GuardarCHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarCHabiActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarCHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 380, 110, 40));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESE EL NUMERO DE HABITAT A CONSULTAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, 490, -1));

        consuHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consuHabiActionPerformed(evt);
            }
        });
        jPanel1.add(consuHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 400, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO HABITAT.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 810));

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

    private void AtrasConsHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasConsHabiActionPerformed
        //boton para ir atras

        RegistroDeHabitats atrasHabi = new RegistroDeHabitats();
        atrasHabi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasConsHabiActionPerformed

    private void MenuConsHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuConsHabiActionPerformed
        //boton para ir a menu        
        Menu Menu1 = new Menu();
        Menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuConsHabiActionPerformed

    private void GuardarCHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarCHabiActionPerformed
        //Asignacion de valor ingresado a la variable
        int id = Integer.parseInt(consuHabi.getText());

        //Creacion de objeto para llamar el arreglo
        Home buscarHabi = new Home();
        //Llamado a la informacion precargada
        buscarHabi.InformacionPrecargadaHabitats(buscarHabi.arrHabitats);

        //Creacion de variable bucle
        boolean habitatFound = false;

        //Bucle para buscar el habitat 
        for (int i = 0; i < buscarHabi.arrHabitats.length; i++) {
            if (buscarHabi.arrHabitats[i] != null && id == buscarHabi.arrHabitats[i].getNum()) {
                JOptionPane.showMessageDialog(null, buscarHabi.arrHabitats[i].toString());
                habitatFound = true;
                break;
            }
        }
        if (!habitatFound) {
            JOptionPane.showMessageDialog(null, "ID de Habitat no encontrado");

        }

    }//GEN-LAST:event_GuardarCHabiActionPerformed

    private void consuHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consuHabiActionPerformed

    }//GEN-LAST:event_consuHabiActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarHabi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasConsHabi;
    private javax.swing.JButton GuardarCHabi;
    private javax.swing.JButton MenuConsHabi;
    private javax.swing.JTextField consuHabi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
