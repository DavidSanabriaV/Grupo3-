package PruebaProyecto;

import javax.swing.JOptionPane;

public class Mapa extends javax.swing.JFrame {

    public Mapa() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Mashabitats = new javax.swing.JButton();
        AnimalesExtra = new javax.swing.JButton();
        atrasMapa = new javax.swing.JButton();
        ARTICO = new javax.swing.JButton();
        OCEANO = new javax.swing.JButton();
        BOSQUE = new javax.swing.JButton();
        SELVA = new javax.swing.JButton();
        DESIERTO = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 650, 170, 120));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ZOOAVELOGO.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 160, 80));

        Mashabitats.setBackground(new java.awt.Color(102, 102, 102));
        Mashabitats.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        Mashabitats.setForeground(new java.awt.Color(255, 255, 255));
        Mashabitats.setText("OTROS HABITATS");
        Mashabitats.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Mashabitats.setMaximumSize(new java.awt.Dimension(120, 20));
        Mashabitats.setMinimumSize(new java.awt.Dimension(120, 20));
        Mashabitats.setPreferredSize(new java.awt.Dimension(120, 40));
        Mashabitats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MashabitatsActionPerformed(evt);
            }
        });
        jPanel1.add(Mashabitats, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 260, 160, -1));

        AnimalesExtra.setBackground(new java.awt.Color(102, 102, 102));
        AnimalesExtra.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        AnimalesExtra.setForeground(new java.awt.Color(255, 255, 255));
        AnimalesExtra.setText("OTROS ANIMALES");
        AnimalesExtra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        AnimalesExtra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AnimalesExtraActionPerformed(evt);
            }
        });
        jPanel1.add(AnimalesExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 310, 180, 40));

        atrasMapa.setBackground(new java.awt.Color(248, 232, 197));
        atrasMapa.setFont(new java.awt.Font("Segoe UI", 3, 10)); // NOI18N
        atrasMapa.setForeground(new java.awt.Color(0, 0, 0));
        atrasMapa.setText("ATRAS");
        atrasMapa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasMapaActionPerformed(evt);
            }
        });
        jPanel1.add(atrasMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 680, 80, 70));

        ARTICO.setBackground(new java.awt.Color(0, 139, 136));
        ARTICO.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        ARTICO.setForeground(new java.awt.Color(255, 255, 255));
        ARTICO.setText("ARTICO");
        ARTICO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ARTICOActionPerformed(evt);
            }
        });
        jPanel1.add(ARTICO, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 100, 40));

        OCEANO.setBackground(new java.awt.Color(0, 139, 136));
        OCEANO.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        OCEANO.setForeground(new java.awt.Color(255, 255, 255));
        OCEANO.setText("OCEANO");
        OCEANO.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        OCEANO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OCEANOActionPerformed(evt);
            }
        });
        jPanel1.add(OCEANO, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 700, 100, 40));

        BOSQUE.setBackground(new java.awt.Color(65, 85, 40));
        BOSQUE.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        BOSQUE.setForeground(new java.awt.Color(255, 255, 255));
        BOSQUE.setText("BOSQUE");
        BOSQUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BOSQUEActionPerformed(evt);
            }
        });
        jPanel1.add(BOSQUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 120, 40));

        SELVA.setBackground(new java.awt.Color(65, 85, 40));
        SELVA.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        SELVA.setForeground(new java.awt.Color(255, 255, 255));
        SELVA.setText("SELVA");
        SELVA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SELVAActionPerformed(evt);
            }
        });
        jPanel1.add(SELVA, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 510, 110, 40));

        DESIERTO.setBackground(new java.awt.Color(248, 232, 197));
        DESIERTO.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        DESIERTO.setForeground(new java.awt.Color(0, 0, 0));
        DESIERTO.setText("DESIERTO");
        DESIERTO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DESIERTOActionPerformed(evt);
            }
        });
        jPanel1.add(DESIERTO, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 480, 120, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/zooave800_1.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 730, 780));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DESIERTOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DESIERTOActionPerformed
        //Creacion de objeto para llamar los arreglos
        Home mapa = new Home();
        mapa.InformacionPrecargadaAni(mapa.arrAnimales);
        mapa.InformacionPrecargadaHabitats(mapa.arrHabitats);
        //Muestra de la informacion
        JOptionPane.showMessageDialog(null, mapa.arrAnimales[2]);
        JOptionPane.showMessageDialog(null, mapa.arrHabitats[2]);


    }//GEN-LAST:event_DESIERTOActionPerformed

    private void SELVAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SELVAActionPerformed
        //Creacion de objeto para llamar los arreglos
        Home mapa = new Home();
        mapa.InformacionPrecargadaAni(mapa.arrAnimales);
        mapa.InformacionPrecargadaHabitats(mapa.arrHabitats);
        //Muestra de la informacion
        JOptionPane.showMessageDialog(null, mapa.arrAnimales[1]);
        JOptionPane.showMessageDialog(null, mapa.arrHabitats[1]);
    }//GEN-LAST:event_SELVAActionPerformed

    private void ARTICOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ARTICOActionPerformed
        //Creacion de objeto para llamar los arreglos
        Home mapa = new Home();
        mapa.InformacionPrecargadaAni(mapa.arrAnimales);
        mapa.InformacionPrecargadaHabitats(mapa.arrHabitats);
        //Muestra de la informacion
        JOptionPane.showMessageDialog(null, mapa.arrAnimales[4]);
        JOptionPane.showMessageDialog(null, mapa.arrHabitats[4]);    }//GEN-LAST:event_ARTICOActionPerformed

    private void OCEANOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OCEANOActionPerformed
        //Creacion de objeto para llamar los arreglos
        Home mapa = new Home();
        mapa.InformacionPrecargadaAni(mapa.arrAnimales);
        mapa.InformacionPrecargadaHabitats(mapa.arrHabitats);
        //Muestra de la informacion
        JOptionPane.showMessageDialog(null, mapa.arrAnimales[3]);
        JOptionPane.showMessageDialog(null, mapa.arrHabitats[3]);    }//GEN-LAST:event_OCEANOActionPerformed

    private void BOSQUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BOSQUEActionPerformed
        //Creacion de objeto para llamar los arreglos
        Home mapa = new Home();
        mapa.InformacionPrecargadaAni(mapa.arrAnimales);
        mapa.InformacionPrecargadaHabitats(mapa.arrHabitats);
        //Muestra de la informacion
        JOptionPane.showMessageDialog(null, mapa.arrAnimales[0]);

        JOptionPane.showMessageDialog(null, mapa.arrHabitats[0]);    }//GEN-LAST:event_BOSQUEActionPerformed

    private void AnimalesExtraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AnimalesExtraActionPerformed
        //Creacion de objeto para usar la matriz
        Home mapa = new Home();
        mapa.InformacionPrecargadaAni(mapa.arrAnimales);
        //Creacion de variable bucle
        boolean aniFound = false;

        //Bucle para buscar el habitat 
        for (int i = 5; i < mapa.arrAnimales.length; i++) {
            if (mapa.arrAnimales[i] != null) {
                JOptionPane.showMessageDialog(null, mapa.arrAnimales[i]);
                aniFound = true;

            }
        }
        if (!aniFound) {
            JOptionPane.showMessageDialog(null, "No hay mas animales registrados");    }//GEN-LAST:event_AnimalesExtraActionPerformed
    }
    private void atrasMapaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atrasMapaActionPerformed
        //boton para ir atras
        Home atrasAA1 = new Home();
        atrasAA1.setVisible(true);
        this.dispose();


    }//GEN-LAST:event_atrasMapaActionPerformed

    private void MashabitatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MashabitatsActionPerformed
//Creacion de objeto para usar la matriz
        Home mapa = new Home();
        mapa.InformacionPrecargadaHabitats(mapa.arrHabitats);
        //Creacion de variable bucle
        boolean habifound = false;

        //Bucle para buscar el habitat 
        for (int i = 5; i < mapa.arrHabitats.length; i++) {
            if (mapa.arrHabitats[i] != null) {
                JOptionPane.showMessageDialog(null, mapa.arrHabitats[i]);
                habifound = true;

            }
        }
        if (!habifound) {
            JOptionPane.showMessageDialog(null, "No hay mas habitats registrados");

        }
    }//GEN-LAST:event_MashabitatsActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Mapa().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ARTICO;
    private javax.swing.JButton AnimalesExtra;
    private javax.swing.JButton BOSQUE;
    private javax.swing.JButton DESIERTO;
    private javax.swing.JButton Mashabitats;
    private javax.swing.JButton OCEANO;
    private javax.swing.JButton SELVA;
    private javax.swing.JButton atrasMapa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
