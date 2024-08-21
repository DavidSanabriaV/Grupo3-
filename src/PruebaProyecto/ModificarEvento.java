package PruebaProyecto;

import javax.swing.JOptionPane;

public class ModificarEvento extends javax.swing.JFrame {

    public ModificarEvento() {
        initComponents();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AtrasEvenMod = new javax.swing.JButton();
        GuardarEvenMod = new javax.swing.JButton();
        MenuModEvent = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        modificarEvent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 530, 150, 130));

        AtrasEvenMod.setBackground(new java.awt.Color(102, 102, 102));
        AtrasEvenMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasEvenMod.setForeground(new java.awt.Color(255, 255, 255));
        AtrasEvenMod.setText("Atras");
        AtrasEvenMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasEvenModActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasEvenMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 80, 70));

        GuardarEvenMod.setBackground(new java.awt.Color(65, 85, 40));
        GuardarEvenMod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarEvenMod.setForeground(new java.awt.Color(255, 255, 255));
        GuardarEvenMod.setText("MODIFICAR");
        GuardarEvenMod.setBorderPainted(false);
        GuardarEvenMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEvenModActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarEvenMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 380, 150, 40));

        MenuModEvent.setBackground(new java.awt.Color(65, 85, 40));
        MenuModEvent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuModEvent.setForeground(new java.awt.Color(255, 255, 255));
        MenuModEvent.setText("MENU");
        MenuModEvent.setBorderPainted(false);
        MenuModEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModEventActionPerformed(evt);
            }
        });
        jPanel1.add(MenuModEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(622, 687, 150, 70));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESE EL ID DEL EVENTO A MODIFICAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 550, -1));

        modificarEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarEventActionPerformed(evt);
            }
        });
        jPanel1.add(modificarEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 380, 350, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO EVENTOS_1.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 800));

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

    private void AtrasEvenModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasEvenModActionPerformed
        //boton para ir atras       
        RegistroDeEventos even = new RegistroDeEventos();
        even.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasEvenModActionPerformed

    private void MenuModEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModEventActionPerformed
        //boton para ir a menu        

        Menu menu1 = new Menu();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuModEventActionPerformed

    private void GuardarEvenModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEvenModActionPerformed
//llamar el numero ANI
        int numEvent = Integer.parseInt(modificarEvent.getText());
        //crear objeto para utilizar arreglo
        Home modificacion = new Home();
        modificacion.InformacionPrecargadaEvent(modificacion.arrEventos);

        //Bucle para revisar el arreglo y modificar[si es true]
        boolean encontrarEvent = false;

        for (int i = 0; i < modificacion.arrEventos.length; i++) {
            if (modificacion.arrEventos[i] != null && numEvent == modificacion.arrEventos[i].getId()) {
                encontrarEvent = true;

                String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del evento: ");
                modificacion.arrEventos[i].setNombre(nombre);

                String fecha = JOptionPane.showInputDialog("Ingrese la nueva fecha del evento: ");
                modificacion.arrEventos[i].setFecha(fecha);

                String descripcion = JOptionPane.showInputDialog("Ingrese la nueva descripcion del evento: ");
                modificacion.arrEventos[i].setDescripcion(descripcion);

                int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo id del evento: "));
                modificacion.arrEventos[i].setId(id);

                break;

            }
        }
        //confirmacionciones si verdadero o si falso stringbuilder      
        if (encontrarEvent) {
            JOptionPane.showMessageDialog(null, "Modificaciones exitosas");
        } else {
            JOptionPane.showMessageDialog(null, "Evento no encontrado");
        }
        //metodo de string builder
        StringBuilder sb = new StringBuilder("Lista actualizada:\n");
        for (int i = 0; i < modificacion.arrEventos.length; i++) {
            if (modificacion.arrEventos[i] != null) {
                sb.append(modificacion.arrEventos[i].toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }//GEN-LAST:event_GuardarEvenModActionPerformed

    private void modificarEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarEventActionPerformed
        GuardarEvenModActionPerformed(evt);
    }//GEN-LAST:event_modificarEventActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarEvento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasEvenMod;
    private javax.swing.JButton GuardarEvenMod;
    private javax.swing.JButton MenuModEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField modificarEvent;
    // End of variables declaration//GEN-END:variables
}
