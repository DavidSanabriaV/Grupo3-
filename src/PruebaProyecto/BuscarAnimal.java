package PruebaProyecto;

import javax.swing.JOptionPane;

public class BuscarAnimal extends javax.swing.JFrame {

    public BuscarAnimal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AtrasAni = new javax.swing.JButton();
        MenuBuscarAni = new javax.swing.JButton();
        Guardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numani = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(119, 139, 81));
        panel.setMaximumSize(new java.awt.Dimension(800, 800));
        panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        panel.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, 150, 140));

        AtrasAni.setBackground(new java.awt.Color(102, 102, 102));
        AtrasAni.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasAni.setForeground(new java.awt.Color(255, 255, 255));
        AtrasAni.setText("Atras");
        AtrasAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasAniActionPerformed(evt);
            }
        });
        panel.add(AtrasAni, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 507, -1, 70));

        MenuBuscarAni.setBackground(new java.awt.Color(65, 85, 40));
        MenuBuscarAni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuBuscarAni.setForeground(new java.awt.Color(255, 255, 255));
        MenuBuscarAni.setText("MENU");
        MenuBuscarAni.setBorderPainted(false);
        MenuBuscarAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuBuscarAniActionPerformed(evt);
            }
        });
        panel.add(MenuBuscarAni, new org.netbeans.lib.awtextra.AbsoluteConstraints(614, 690, 110, 70));

        Guardar.setBackground(new java.awt.Color(65, 85, 40));
        Guardar.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        Guardar.setForeground(new java.awt.Color(255, 255, 255));
        Guardar.setText("BUSCAR");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        panel.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 370, -1, 40));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 21)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESE EL NUMERO DE ANI PARA BUSCAR");
        panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, -1, -1));

        numani.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numaniActionPerformed(evt);
            }
        });
        panel.add(numani, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 370, 431, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO HABITAT.png"))); // NOI18N
        panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasAniActionPerformed
        //boton para ir atras
        RegistroDeAnimales atrasBAL = new RegistroDeAnimales();
        atrasBAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasAniActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        //Asignacion de valor ingresado a la variable
        int id = Integer.parseInt(numani.getText());

        //Creacion de objeto para llamar el arreglo
        Home buscarAni = new Home();
        //Llamado a la informacion precargada
        buscarAni.InformacionPrecargadaAni(buscarAni.arrAnimales);

        //Creacion de variable bucle
        boolean aniFound = false;

        //Bucle para buscar el habitat 
        for (int i = 0; i < buscarAni.arrAnimales.length; i++) {
            if (buscarAni.arrAnimales[i] != null && id == buscarAni.arrAnimales[i].getAni()) {
                JOptionPane.showMessageDialog(null, buscarAni.arrAnimales[i].toString());
                aniFound = true;
                break;
            }
        }
        if (!aniFound) {
            JOptionPane.showMessageDialog(null, "ID de Animal no encontrado");

        }

                                           }//GEN-LAST:event_GuardarActionPerformed

    private void MenuBuscarAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuBuscarAniActionPerformed
        //boton para ir al menu
        Menu Menu1 = new Menu();
        Menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuBuscarAniActionPerformed

    private void numaniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numaniActionPerformed
        //asignacion de lo puesto a la variable
        int numAni = Integer.parseInt(numani.getText());
        //creacion de objeto para usar el arreglo

        Home buscarAni = new Home();
        buscarAni.InformacionPrecargadaAni(buscarAni.arrAnimales);

        //creacion de bucle para llenar el arreglo
        for (int i = 0; i < buscarAni.arrAnimales.length; i++) {
            if (numAni == buscarAni.arrAnimales[i].getAni()) {

            }

        }
        //metodo String Builder
        Home guardar = new Home();
        StringBuilder sb = new StringBuilder("Animales registrados:\n");
        for (int i = 0; i < guardar.arrAnimales.length; i++) {
            if (guardar.arrAnimales[i] != null) {
                sb.append(guardar.arrAnimales[i].toString()).append("\n");
            }
        }
        //muestra la informacion ya añadida
        JOptionPane.showMessageDialog(null, sb.toString());
    }//GEN-LAST:event_numaniActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasAni;
    private javax.swing.JButton Guardar;
    private javax.swing.JButton MenuBuscarAni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField numani;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}
