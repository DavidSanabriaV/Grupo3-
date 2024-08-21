package PruebaProyecto;

import javax.swing.JOptionPane;

public class MostrarEvent extends javax.swing.JFrame {

    public MostrarEvent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AtrasEvenMos = new javax.swing.JButton();
        MenuMosEvent = new javax.swing.JButton();
        GuardarEvenMos = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        InputEvent = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 170, 150));

        AtrasEvenMos.setBackground(new java.awt.Color(102, 102, 102));
        AtrasEvenMos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasEvenMos.setForeground(java.awt.Color.white);
        AtrasEvenMos.setText("Atras");
        AtrasEvenMos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasEvenMosActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasEvenMos, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 537, 80, 70));

        MenuMosEvent.setBackground(new java.awt.Color(65, 85, 40));
        MenuMosEvent.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuMosEvent.setForeground(java.awt.Color.white);
        MenuMosEvent.setText("MENU");
        MenuMosEvent.setBorderPainted(false);
        MenuMosEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuMosEventActionPerformed(evt);
            }
        });
        jPanel1.add(MenuMosEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 700, 110, 60));

        GuardarEvenMos.setBackground(new java.awt.Color(65, 85, 40));
        GuardarEvenMos.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarEvenMos.setForeground(java.awt.Color.white);
        GuardarEvenMos.setText("CONSULTAR");
        GuardarEvenMos.setBorderPainted(false);
        GuardarEvenMos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEvenMosActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarEvenMos, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 149, 42));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setText("INGRESE EL NUMERO DE EVENTO A CONSULTAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 540, 39));

        InputEvent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEventActionPerformed(evt);
            }
        });
        jPanel1.add(InputEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 390, 360, 42));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO EVENTOS.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 802, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasEvenMosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasEvenMosActionPerformed
        //boton para ir atras        
        RegistroDeEventos even = new RegistroDeEventos();
        even.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasEvenMosActionPerformed

    private void MenuMosEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuMosEventActionPerformed
        //boton para ir a menu        

        Menu menu1 = new Menu();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuMosEventActionPerformed

    private void GuardarEvenMosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEvenMosActionPerformed
        //Asignacion de valor ingresado a la variable
        int id = Integer.parseInt(InputEvent.getText());
        //Creacion de objeto para llamar el arreglo
        Home buscarEvent = new Home();
        //Llamado a la informacion precargada
        buscarEvent.InformacionPrecargadaEvent(buscarEvent.arrEventos);
        //Creacion de variable bucle
        boolean EventFound = false;
        //Bucle para buscar el habitat 
        for (int i = 0; i < buscarEvent.arrEventos.length; i++) {
            if (buscarEvent.arrEventos[i] != null && id == buscarEvent.arrEventos[i].getId()) {
                JOptionPane.showMessageDialog(null, buscarEvent.arrEventos[i].toString());
                EventFound = true;
                break;
            }
        }
        if (!EventFound) {
            JOptionPane.showMessageDialog(null, "ID de evento no encontrado");
        }
    }//GEN-LAST:event_GuardarEvenMosActionPerformed

    private void InputEventActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEventActionPerformed

    }//GEN-LAST:event_InputEventActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MostrarEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasEvenMos;
    private javax.swing.JButton GuardarEvenMos;
    private javax.swing.JTextField InputEvent;
    private javax.swing.JButton MenuMosEvent;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
