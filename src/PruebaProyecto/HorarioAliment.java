package PruebaProyecto;

import javax.swing.JOptionPane;

public class HorarioAliment extends javax.swing.JFrame {

    public HorarioAliment() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        AtrasEvenMod = new javax.swing.JButton();
        GuardarEvenMod = new javax.swing.JButton();
        InputGestionAli = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 620, 140, 140));

        AtrasEvenMod.setBackground(new java.awt.Color(102, 102, 102));
        AtrasEvenMod.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasEvenMod.setForeground(new java.awt.Color(255, 255, 255));
        AtrasEvenMod.setText("Atras");
        AtrasEvenMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasEvenModActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasEvenMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 650, -1, 90));

        GuardarEvenMod.setBackground(new java.awt.Color(65, 85, 40));
        GuardarEvenMod.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarEvenMod.setForeground(new java.awt.Color(255, 255, 255));
        GuardarEvenMod.setText("BUSCAR");
        GuardarEvenMod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEvenModActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarEvenMod, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 420, 198, 42));
        jPanel1.add(InputGestionAli, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 350, 400, 42));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setText("INGRESE EL NUMERO DE ANI");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 400, 46));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HORARIOALIMENBACK.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

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
        Gestion gen = new Gestion();
        gen.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasEvenModActionPerformed

    private void GuardarEvenModActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEvenModActionPerformed

        //Asignacion de valor ingresado a la variable
        int ani = Integer.parseInt(InputGestionAli.getText());
        //Creacion de objeto para llamar el arreglo
        Home buscarAni = new Home();
        //Llamado a la informacion precargada

        buscarAni.InformacionPrecargadaAni(buscarAni.arrAnimales);
        //Creacion de variable bucle
        boolean habitatFound = false;
        //Bucle para buscar el habitat 
        for (int i = 0; i < buscarAni.arrAnimales.length; i++) {
            if (buscarAni.arrAnimales[i] != null && ani == buscarAni.arrAnimales[i].getAni()) {
                JOptionPane.showMessageDialog(null, "El animal " + buscarAni.arrAnimales[i].getNombre()
                        + " se alimenta de: " + buscarAni.arrAnimales[i].getAlimento()
                        + " a la hora " + buscarAni.arrAnimales[i].getHorario()
                        + " con una frecuencia de: " + buscarAni.arrAnimales[i].getFrecuencia());
                habitatFound = true;
                break;
            }
        }
        if (!habitatFound) {
            JOptionPane.showMessageDialog(null, "ID de ani no encontrado");
        }


    }//GEN-LAST:event_GuardarEvenModActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HorarioAliment().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasEvenMod;
    private javax.swing.JButton GuardarEvenMod;
    private javax.swing.JTextField InputGestionAli;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
