package PruebaProyecto;

import javax.swing.JOptionPane;

public class ModificarHabi extends javax.swing.JFrame {

    public ModificarHabi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AtrasModiHabi = new javax.swing.JButton();
        MenuModiHabi = new javax.swing.JButton();
        GuardarMhabi = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modiHabi = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, 170, 160));

        AtrasModiHabi.setBackground(new java.awt.Color(102, 102, 102));
        AtrasModiHabi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasModiHabi.setForeground(new java.awt.Color(255, 255, 255));
        AtrasModiHabi.setText("Atras");
        AtrasModiHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasModiHabiActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasModiHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 580, 80, 70));

        MenuModiHabi.setBackground(new java.awt.Color(65, 85, 40));
        MenuModiHabi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuModiHabi.setForeground(new java.awt.Color(255, 255, 255));
        MenuModiHabi.setText("MENU");
        MenuModiHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModiHabiActionPerformed(evt);
            }
        });
        jPanel1.add(MenuModiHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(612, 707, 140, 70));

        GuardarMhabi.setBackground(new java.awt.Color(65, 85, 40));
        GuardarMhabi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarMhabi.setForeground(new java.awt.Color(255, 255, 255));
        GuardarMhabi.setText("BUSCAR");
        GuardarMhabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarMhabiActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarMhabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 400, 130, 50));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESE EL ID DEL HABITAT A MODIFICAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, -1, -1));

        modiHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modiHabiActionPerformed(evt);
            }
        });
        jPanel1.add(modiHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 353, 51));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO HABITAT.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 840));

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

    private void AtrasModiHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasModiHabiActionPerformed
        //boton para ir atras       
        RegistroDeHabitats atrasModiHabi = new RegistroDeHabitats();
        atrasModiHabi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasModiHabiActionPerformed

    private void MenuModiHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModiHabiActionPerformed
        //boton para ir a menu        

        Menu Menu1 = new Menu();
        Menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuModiHabiActionPerformed

    private void GuardarMhabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarMhabiActionPerformed
        //llamar el numero ANI
        int numHabi = Integer.parseInt(modiHabi.getText());
        //crear objeto para utilizar arreglo
        Home modificacion = new Home();
        modificacion.InformacionPrecargadaHabitats(modificacion.arrHabitats);
        //Bucle para revisar el arreglo y modificar[si es true]
        boolean encontrarHabi = false;
        for (int i = 0; i < modificacion.arrHabitats.length; i++) {
            if (modificacion.arrHabitats[i] != null && numHabi == modificacion.arrHabitats[i].getNum()) {
                encontrarHabi = true;
                String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del habitat: ");
                modificacion.arrHabitats[i].setNombre(nombre);
                String tipo = JOptionPane.showInputDialog("Ingrese el nuevo tipo de ambiente del habitat: ");
                modificacion.arrHabitats[i].setAmbiente(tipo);
                int capacidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva capacidad del habitat: "));
                modificacion.arrHabitats[i].setCapacidad(capacidad);
                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo id de habitat: "));
                modificacion.arrHabitats[i].setNum(id);
                break;
            }
        }
        //confirmacionciones si verdadero o si falso stringbuilder      
        if (encontrarHabi) {
            JOptionPane.showMessageDialog(null, "Modificaciones exitosas");
        } else {
            JOptionPane.showMessageDialog(null, "Habitat no encontrado");
        }

        //metodo de string builder
        StringBuilder sb = new StringBuilder("Lista actualizada:\n");
        for (int i = 0; i < modificacion.arrHabitats.length; i++) {
            if (modificacion.arrHabitats[i] != null) {
                sb.append(modificacion.arrHabitats[i].toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }//GEN-LAST:event_GuardarMhabiActionPerformed

    private void modiHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modiHabiActionPerformed
        GuardarMhabiActionPerformed(evt);
    }//GEN-LAST:event_modiHabiActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarHabi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasModiHabi;
    private javax.swing.JButton GuardarMhabi;
    private javax.swing.JButton MenuModiHabi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modiHabi;
    // End of variables declaration//GEN-END:variables
}
