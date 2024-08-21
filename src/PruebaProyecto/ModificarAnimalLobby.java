package PruebaProyecto;

import javax.swing.JOptionPane;

public class ModificarAnimalLobby extends javax.swing.JFrame {

    public ModificarAnimalLobby() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AtrasMAL = new javax.swing.JButton();
        MenuModAni = new javax.swing.JButton();
        GuardarModAni = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        SoliNumAni = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 510, 170, 130));

        AtrasMAL.setBackground(new java.awt.Color(102, 102, 102));
        AtrasMAL.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasMAL.setForeground(new java.awt.Color(255, 255, 255));
        AtrasMAL.setText("Atras");
        AtrasMAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasMALActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasMAL, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 540, -1, 60));

        MenuModAni.setBackground(new java.awt.Color(65, 85, 40));
        MenuModAni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuModAni.setForeground(new java.awt.Color(255, 255, 255));
        MenuModAni.setText("MENU");
        MenuModAni.setBorderPainted(false);
        MenuModAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuModAniActionPerformed(evt);
            }
        });
        jPanel1.add(MenuModAni, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 690, 130, 70));

        GuardarModAni.setBackground(new java.awt.Color(65, 85, 40));
        GuardarModAni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarModAni.setForeground(new java.awt.Color(255, 255, 255));
        GuardarModAni.setText("BUSCAR");
        GuardarModAni.setBorderPainted(false);
        GuardarModAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarModAniActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarModAni, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 350, 110, 50));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESE EL ANI A MODIFICAR");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 420, -1));

        SoliNumAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SoliNumAniActionPerformed(evt);
            }
        });
        jPanel1.add(SoliNumAni, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 350, 330, 50));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO HABITAT.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasMALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasMALActionPerformed
        //boton para ir atras      
        RegistroDeAnimales atrasMAL = new RegistroDeAnimales();
        atrasMAL.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasMALActionPerformed

    private void MenuModAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuModAniActionPerformed
        //boton para ir a menu        

        Menu menu1 = new Menu();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuModAniActionPerformed

    private void GuardarModAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarModAniActionPerformed
        //llamar el numero ANI
        int numAni = Integer.parseInt(SoliNumAni.getText());
        //crear objeto para utilizar arreglo
        Home modificacion = new Home();
        modificacion.InformacionPrecargadaAni(modificacion.arrAnimales);

        //Bucle para revisar el arreglo y modificar[si es true]
        boolean encontrarAni = false;

        for (int i = 0; i < modificacion.arrAnimales.length; i++) {
            if (modificacion.arrAnimales[i] != null && numAni == modificacion.arrAnimales[i].getAni()) {
                encontrarAni = true;

                String nombre = JOptionPane.showInputDialog("Ingrese el nuevo nombre del animal: ");
                modificacion.arrAnimales[i].setNombre(nombre);

                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad modificada del animal: "));

                String especie = JOptionPane.showInputDialog("Ingrese la nueva especie del animal: ");
                modificacion.arrAnimales[i].setEspecie(especie);

                int habitat = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo habitat para este animal: "));
                modificacion.arrAnimales[i].setHabitat(habitat);

                int ani = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero de ANI: "));
                modificacion.arrAnimales[i].setAni(ani);

                String alimento = JOptionPane.showInputDialog("Ingrese el nuevo tipo de alimentacion para este animal: ");
                modificacion.arrAnimales[i].setAlimento(alimento);

                int horario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo horario de alimentacion del animal: "));
                modificacion.arrAnimales[i].setHorario(horario);

                int frecuencia = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nueva frecuencia de alimentacion: "));
                modificacion.arrAnimales[i].setFrecuencia(frecuencia);

                break;

            }
        }
        //confirmacionciones si verdadero o si falso stringbuilder      
        if (encontrarAni) {
            JOptionPane.showMessageDialog(null, "Modificaciones exitosas");
        } else {
            JOptionPane.showMessageDialog(null, "Animal no encontrado");
        }
        //metodo de string builder

        StringBuilder sb = new StringBuilder("Lista actualizada:\n");
        for (int i = 0; i < modificacion.arrAnimales.length; i++) {
            if (modificacion.arrAnimales[i] != null) {
                sb.append(modificacion.arrAnimales[i].toString()).append("\n");
            }
        }
        JOptionPane.showMessageDialog(null, sb.toString());
    }//GEN-LAST:event_GuardarModAniActionPerformed

    private void SoliNumAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SoliNumAniActionPerformed
        GuardarModAniActionPerformed(evt);
    }//GEN-LAST:event_SoliNumAniActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModificarAnimalLobby().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasMAL;
    private javax.swing.JButton GuardarModAni;
    private javax.swing.JButton MenuModAni;
    private javax.swing.JTextField SoliNumAni;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    // End of variables declaration//GEN-END:variables
}
