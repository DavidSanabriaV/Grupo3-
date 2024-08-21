package PruebaProyecto;

import javax.swing.JOptionPane;

public class EliminarAnimal extends javax.swing.JFrame {

    public EliminarAnimal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AtrasEAL = new javax.swing.JButton();
        MenuEliAni = new javax.swing.JButton();
        GuardarEliAni = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        numANI = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setForeground(new java.awt.Color(204, 204, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 520, 170, 140));

        AtrasEAL.setBackground(new java.awt.Color(102, 102, 102));
        AtrasEAL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasEAL.setForeground(new java.awt.Color(255, 255, 255));
        AtrasEAL.setText("Atras");
        AtrasEAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasEALActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasEAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 80, 60));

        MenuEliAni.setBackground(new java.awt.Color(65, 85, 40));
        MenuEliAni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuEliAni.setForeground(new java.awt.Color(255, 255, 255));
        MenuEliAni.setText("MENU");
        MenuEliAni.setBorderPainted(false);
        MenuEliAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEliAniActionPerformed(evt);
            }
        });
        jPanel1.add(MenuEliAni, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 697, 130, 60));

        GuardarEliAni.setBackground(new java.awt.Color(65, 85, 40));
        GuardarEliAni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarEliAni.setForeground(new java.awt.Color(255, 255, 255));
        GuardarEliAni.setText("ELIMINAR");
        GuardarEliAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEliAniActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarEliAni, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 360, 120, 40));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESE EL ANI QUE DESEA ELIMINAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 500, -1));

        numANI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numANIActionPerformed(evt);
            }
        });
        jPanel1.add(numANI, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 360, 390, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO HABITAT.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasEALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasEALActionPerformed
        //boton para ir atras        
        RegistroDeAnimales atrasEAL = new RegistroDeAnimales();
        atrasEAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasEALActionPerformed

    private void MenuEliAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEliAniActionPerformed
        //boton para ir a menu        
        Menu Menu1 = new Menu();
        Menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuEliAniActionPerformed

    private void GuardarEliAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEliAniActionPerformed
        //Asignacion de lo puesto a la variable

        int numani = Integer.parseInt(numANI.getText());
        //Creacion de objeto para llamar el arreglo
        Home elimANI = new Home();
        elimANI.InformacionPrecargadaAni(elimANI.arrAnimales);

        //declaracion de variable
        boolean encontrarAni = false;

        //llenado del arreglo y recorrerlo
        for (int i = 0; i < elimANI.arrAnimales.length; i++) {
            if (elimANI.arrAnimales[i] != null && elimANI.arrAnimales[i].getAni() == numani) {
                elimANI.arrAnimales[i] = null;
                encontrarAni = true;
                break;
            }

        }

        if (encontrarAni) {
            JOptionPane.showMessageDialog(null, "Animal eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "Animal no encontrado");
        }

        //metodo de string builder
        StringBuilder sb = new StringBuilder("Lista actualizada:\n");
        for (int i = 0; i < elimANI.arrAnimales.length; i++) {
            if (elimANI.arrAnimales[i] != null) {
                sb.append(elimANI.arrAnimales[i].toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());


    }//GEN-LAST:event_GuardarEliAniActionPerformed

    private void numANIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numANIActionPerformed

    }//GEN-LAST:event_numANIActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarAnimal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasEAL;
    private javax.swing.JButton GuardarEliAni;
    private javax.swing.JButton MenuEliAni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField numANI;
    // End of variables declaration//GEN-END:variables
}
