package PruebaProyecto;

import javax.swing.JOptionPane;

public class EliminarHabi extends javax.swing.JFrame {

    public EliminarHabi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AtrasEliminarHabi = new javax.swing.JButton();
        MenuEliminarHabi = new javax.swing.JButton();
        GuardarHabi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        EliHabitat = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, 180, 160));

        AtrasEliminarHabi.setBackground(new java.awt.Color(102, 102, 102));
        AtrasEliminarHabi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasEliminarHabi.setForeground(new java.awt.Color(255, 255, 255));
        AtrasEliminarHabi.setText("Atras");
        AtrasEliminarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasEliminarHabiActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasEliminarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 540, -1, 50));

        MenuEliminarHabi.setBackground(new java.awt.Color(65, 85, 40));
        MenuEliminarHabi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuEliminarHabi.setForeground(new java.awt.Color(255, 255, 255));
        MenuEliminarHabi.setText("MENU");
        MenuEliminarHabi.setBorderPainted(false);
        MenuEliminarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEliminarHabiActionPerformed(evt);
            }
        });
        jPanel1.add(MenuEliminarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(602, 690, 130, 70));

        GuardarHabi.setBackground(new java.awt.Color(65, 85, 40));
        GuardarHabi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarHabi.setForeground(new java.awt.Color(255, 255, 255));
        GuardarHabi.setText("ELIMINAR");
        GuardarHabi.setBorderPainted(false);
        GuardarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarHabiActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 130, 40));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESE EL NUMERO DE HABITAT A ELIMINAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 470, -1));

        EliHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliHabitatActionPerformed(evt);
            }
        });
        jPanel1.add(EliHabitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 330, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO HABITAT.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 821, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasEliminarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasEliminarHabiActionPerformed
        //boton para ir atras        
        RegistroDeHabitats atrasEliminarHabi = new RegistroDeHabitats();
        atrasEliminarHabi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasEliminarHabiActionPerformed

    private void MenuEliminarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEliminarHabiActionPerformed
        //boton para ir a menu        

        Menu menu1 = new Menu();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuEliminarHabiActionPerformed

    private void GuardarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarHabiActionPerformed
        //creacion de objeto para usar el arreglo

        int numani = Integer.parseInt(EliHabitat.getText());
        Home elimHabi = new Home();
        elimHabi.InformacionPrecargadaHabitats(elimHabi.arrHabitats);

        //asignacion de la variable
        boolean encontrarHabi = false;

        //Bucle para almacenar la informacion y recorrer el arreglo
        for (int i = 0; i < elimHabi.arrHabitats.length; i++) {
            if (elimHabi.arrHabitats[i] != null && elimHabi.arrHabitats[i].getNum() == numani) {
                elimHabi.arrHabitats[i] = null;
                encontrarHabi = true;
                break;
            }

        }

        if (encontrarHabi) {
            JOptionPane.showMessageDialog(null, "Habitat eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "Habitat no encontrado");
        }

        //String Builder
        StringBuilder sb = new StringBuilder("Lista actualizada:\n");
        for (int i = 0; i < elimHabi.arrHabitats.length; i++) {
            if (elimHabi.arrHabitats[i] != null) {
                sb.append(elimHabi.arrHabitats[i].toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }//GEN-LAST:event_GuardarHabiActionPerformed

    private void EliHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliHabitatActionPerformed

    }//GEN-LAST:event_EliHabitatActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarHabi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasEliminarHabi;
    private javax.swing.JTextField EliHabitat;
    private javax.swing.JButton GuardarHabi;
    private javax.swing.JButton MenuEliminarHabi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
