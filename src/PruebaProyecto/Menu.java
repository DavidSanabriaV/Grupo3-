package PruebaProyecto;

import PruebaProyecto.Home;
import PruebaProyecto.RegistroDeAnimales;
import PruebaProyecto.RegistroDeHabitats;
import PruebaProyecto.RegistroDeVisitantes;

public class Menu extends javax.swing.JFrame {

    public Menu() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        RegistroDeAnimalesMenu = new javax.swing.JButton();
        RegistroDeVisitantesMenu = new javax.swing.JButton();
        RegistroDeHabitatsMenu = new javax.swing.JButton();
        RegistroDeEventosMenu = new javax.swing.JButton();
        AtrasMenu = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 530, -1, 130));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setText("MENU DE REGISTROS");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 340, 290, 80));

        RegistroDeAnimalesMenu.setBackground(new java.awt.Color(65, 85, 40));
        RegistroDeAnimalesMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegistroDeAnimalesMenu.setForeground(new java.awt.Color(255, 255, 255));
        RegistroDeAnimalesMenu.setText("REGISTRO DE ANIMALES");
        RegistroDeAnimalesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroDeAnimalesMenuActionPerformed(evt);
            }
        });
        jPanel1.add(RegistroDeAnimalesMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 270, 44));

        RegistroDeVisitantesMenu.setBackground(new java.awt.Color(65, 85, 40));
        RegistroDeVisitantesMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegistroDeVisitantesMenu.setForeground(new java.awt.Color(255, 255, 255));
        RegistroDeVisitantesMenu.setText("REGISTRO DE VISITANTES");
        RegistroDeVisitantesMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroDeVisitantesMenuActionPerformed(evt);
            }
        });
        jPanel1.add(RegistroDeVisitantesMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 680, 450, 42));

        RegistroDeHabitatsMenu.setBackground(new java.awt.Color(65, 85, 40));
        RegistroDeHabitatsMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegistroDeHabitatsMenu.setForeground(new java.awt.Color(255, 255, 255));
        RegistroDeHabitatsMenu.setText("REGISTRO DE HABITATS");
        RegistroDeHabitatsMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroDeHabitatsMenuActionPerformed(evt);
            }
        });
        jPanel1.add(RegistroDeHabitatsMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 540, 320, 42));

        RegistroDeEventosMenu.setBackground(new java.awt.Color(65, 85, 40));
        RegistroDeEventosMenu.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegistroDeEventosMenu.setForeground(new java.awt.Color(255, 255, 255));
        RegistroDeEventosMenu.setText("REGISTRO DE EVENTOS");
        RegistroDeEventosMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroDeEventosMenuActionPerformed(evt);
            }
        });
        jPanel1.add(RegistroDeEventosMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 610, 370, 43));

        AtrasMenu.setBackground(new java.awt.Color(204, 204, 204));
        AtrasMenu.setText("Atras");
        AtrasMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasMenuActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 560, 80, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/MENUREGISTROBACKR.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 810));

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

    private void RegistroDeAnimalesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroDeAnimalesMenuActionPerformed
        //boton para ir a registro animales       
        RegistroDeAnimales AAL = new RegistroDeAnimales();
        AAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistroDeAnimalesMenuActionPerformed

    private void RegistroDeHabitatsMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroDeHabitatsMenuActionPerformed
        //boton para ir a registro habitats       
        RegistroDeHabitats habi = new RegistroDeHabitats();
        habi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistroDeHabitatsMenuActionPerformed


    private void AtrasMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasMenuActionPerformed
        //boton para ir atras
        Home atrasHome = new Home();
        atrasHome.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasMenuActionPerformed

    private void RegistroDeVisitantesMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroDeVisitantesMenuActionPerformed
        //boton para ir a registro visitantes       
        RegistroDeVisitantes visi = new RegistroDeVisitantes();
        visi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistroDeVisitantesMenuActionPerformed

    private void RegistroDeEventosMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroDeEventosMenuActionPerformed
        //boton para ir a registro eventos       

        RegistroDeEventos even = new RegistroDeEventos();
        even.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RegistroDeEventosMenuActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasMenu;
    private javax.swing.JButton RegistroDeAnimalesMenu;
    private javax.swing.JButton RegistroDeEventosMenu;
    private javax.swing.JButton RegistroDeHabitatsMenu;
    private javax.swing.JButton RegistroDeVisitantesMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
