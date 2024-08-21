package PruebaProyecto;

import javax.swing.JOptionPane;

public class AgregarHabi extends javax.swing.JFrame {

    public AgregarHabi() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        BOTONATRASPNG = new javax.swing.JLabel();
        SAVEPNG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        InputNombreHabi = new javax.swing.JTextField();
        NombreHabi = new javax.swing.JLabel();
        TipoHabi = new javax.swing.JLabel();
        InputTipoHabi = new javax.swing.JTextField();
        GuardarHabi = new javax.swing.JButton();
        MenuHabi = new javax.swing.JButton();
        AtrasHabi = new javax.swing.JButton();
        Capacidad = new javax.swing.JLabel();
        InputCapaciHabi = new javax.swing.JTextField();
        InputIDHabi = new javax.swing.JTextField();
        IDHabi = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(119, 139, 81));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BOTONATRASPNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        BOTONATRASPNG.setText("jLabel3");
        jPanel2.add(BOTONATRASPNG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 160, 130));

        SAVEPNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SAVEPNGAMARILLO.png"))); // NOI18N
        jPanel2.add(SAVEPNG, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 680, 130, 90));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESE LOS DATOS DEL HABITAT");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 480, 49));

        InputNombreHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreHabiActionPerformed(evt);
            }
        });
        jPanel2.add(InputNombreHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 428, -1));

        NombreHabi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NombreHabi.setForeground(new java.awt.Color(255, 255, 255));
        NombreHabi.setText("Nombre");
        jPanel2.add(NombreHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 280, 445, -1));

        TipoHabi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TipoHabi.setForeground(new java.awt.Color(255, 255, 255));
        TipoHabi.setText("Tipo de Ambiente");
        jPanel2.add(TipoHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 410, -1));

        InputTipoHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputTipoHabiActionPerformed(evt);
            }
        });
        jPanel2.add(InputTipoHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 428, -1));

        GuardarHabi.setBackground(new java.awt.Color(65, 85, 40));
        GuardarHabi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarHabi.setForeground(new java.awt.Color(255, 255, 255));
        GuardarHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarHabiActionPerformed(evt);
            }
        });
        jPanel2.add(GuardarHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 700, 70, 60));

        MenuHabi.setBackground(new java.awt.Color(65, 85, 40));
        MenuHabi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuHabi.setForeground(new java.awt.Color(255, 255, 255));
        MenuHabi.setText("MENU");
        MenuHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHabiActionPerformed(evt);
            }
        });
        jPanel2.add(MenuHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 700, 100, 50));

        AtrasHabi.setBackground(new java.awt.Color(102, 102, 102));
        AtrasHabi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasHabi.setForeground(new java.awt.Color(255, 255, 255));
        AtrasHabi.setText("Atras");
        AtrasHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasHabiActionPerformed(evt);
            }
        });
        jPanel2.add(AtrasHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 700, 80, 60));

        Capacidad.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Capacidad.setForeground(new java.awt.Color(255, 255, 255));
        Capacidad.setText("Capacidad");
        jPanel2.add(Capacidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 413, -1));

        InputCapaciHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputCapaciHabiActionPerformed(evt);
            }
        });
        jPanel2.add(InputCapaciHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 428, -1));

        InputIDHabi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIDHabiActionPerformed(evt);
            }
        });
        jPanel2.add(InputIDHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 570, 428, -1));

        IDHabi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDHabi.setForeground(new java.awt.Color(255, 255, 255));
        IDHabi.setText("ID Habitat");
        jPanel2.add(IDHabi, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 550, 340, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO HABITAT.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasHabiActionPerformed
        //Codigo para pasar entre pestañas
        RegistroDeHabitats atrasHabi = new RegistroDeHabitats();
        atrasHabi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasHabiActionPerformed

    private void MenuHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHabiActionPerformed
        //Codigo para pasar entre pestañas
        Menu menu1 = new Menu();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuHabiActionPerformed

    private void GuardarHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarHabiActionPerformed
        //creacion de objeto para usar el arreglo
        Home guardar = new Home();
        guardar.InformacionPrecargadaHabitats(guardar.arrHabitats);

        //recolectamos la informacion del input
        String nombreHabi = InputNombreHabi.getText();
        String tipoHabi = InputTipoHabi.getText();
        int capacidadHabi = Integer.parseInt(InputCapaciHabi.getText());
        int idHabi = Integer.parseInt(InputIDHabi.getText());

        // creamos un for para agregar info delante del arr precargado y que nos diga cuando no se pueden agregar mas
        boolean added = false;
        for (int i = 0; i < guardar.arrHabitats.length; i++) {
            if (guardar.arrHabitats[i] == null) {
                guardar.arrHabitats[i] = new Habitats(nombreHabi, tipoHabi, capacidadHabi, idHabi);
                added = true;
                break;
            }
        }

        //Verificar si se ha podido agregar un nuevo animal si added = falso significa que no hay espacio
        if (!added) {
            JOptionPane.showMessageDialog(null, "No hay espacio para agregar más animales.");
            return;
        }

        // String Builder
        StringBuilder sb = new StringBuilder("Habitats registrados:\n");
        for (int i = 0; i < guardar.arrHabitats.length; i++) {
            if (guardar.arrHabitats[i] != null) {
                sb.append(guardar.arrHabitats[i].toString()).append("\n");
            }
        }
        //muestra la informacion ya añadida
        JOptionPane.showMessageDialog(null, sb.toString());
    }//GEN-LAST:event_GuardarHabiActionPerformed

    private void InputTipoHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputTipoHabiActionPerformed
        //Asignacion de lo solicitado en una variable
        String tipohabi = InputTipoHabi.getText();
        //Muestra de lo almacenado en la variable
        JOptionPane.showMessageDialog(null, tipohabi);
        //Creacion de objeto para poder llamar la informacion precargada
        Home habi = new Home();
        habi.InformacionPrecargadaHabitats(habi.arrHabitats);
        //Bucle para almacenar la informacion donde no haya nada guardado
        for (int i = 0; i < habi.arrHabitats.length; i++) {
            if (habi.arrHabitats[i] == null) {
                habi.arrHabitats[i].setAmbiente(tipohabi);
            }
        }
    }//GEN-LAST:event_InputTipoHabiActionPerformed

    private void InputNombreHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreHabiActionPerformed
        //Asignacion de lo solicitado en una variable
        String nombreHabi = InputNombreHabi.getText();
        //Muestra de lo almacenado en la variable
        JOptionPane.showMessageDialog(null, nombreHabi);
        //Creacion de objeto para poder llamar la informacion precargada
        Home habi = new Home();
        habi.InformacionPrecargadaHabitats(habi.arrHabitats);
        //Bucle para almacenar la informacion donde no haya nada guardado
        for (int i = 0; i < habi.arrHabitats.length; i++) {
            if (habi.arrHabitats[i] == null) {
                habi.arrHabitats[i].setNombre(nombreHabi);
            }
        }
    }//GEN-LAST:event_InputNombreHabiActionPerformed

    private void InputCapaciHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputCapaciHabiActionPerformed
        //Asignacion de lo solicitado en una variable
        int capacidad = Integer.parseInt(InputNombreHabi.getText());
        //Muestra de lo almacenado en la variable
        JOptionPane.showMessageDialog(null, capacidad);
        //Creacion de objeto para poder llamar la informacion precargada
        Home habi = new Home();
        habi.InformacionPrecargadaHabitats(habi.arrHabitats);
        //Bucle para almacenar la informacion donde no haya nada guardado
        for (int i = 0; i < habi.arrHabitats.length; i++) {
            if (habi.arrHabitats[i] == null) {
                habi.arrHabitats[i].setCapacidad(capacidad);
            }
        }
    }//GEN-LAST:event_InputCapaciHabiActionPerformed

    private void InputIDHabiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIDHabiActionPerformed
        //Asignacion de lo solicitado en una variable
        int Id = Integer.parseInt(InputNombreHabi.getText());
        //Muestra de lo almacenado en la variable
        JOptionPane.showMessageDialog(null, Id);
        //Creacion de objeto para poder llamar la informacion precargada
        Home habi = new Home();
        habi.InformacionPrecargadaHabitats(habi.arrHabitats);
        //Bucle para almacenar la informacion donde no haya nada guardado
        for (int i = 0; i < habi.arrHabitats.length; i++) {
            if (habi.arrHabitats[i] == null) {
                habi.arrHabitats[i].setNum(Id);
            }
        }
    }//GEN-LAST:event_InputIDHabiActionPerformed

    
    public static void main(String args[]) {
     
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarHabi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasHabi;
    private javax.swing.JLabel BOTONATRASPNG;
    private javax.swing.JLabel Capacidad;
    private javax.swing.JButton GuardarHabi;
    private javax.swing.JLabel IDHabi;
    private javax.swing.JTextField InputCapaciHabi;
    private javax.swing.JTextField InputIDHabi;
    private javax.swing.JTextField InputNombreHabi;
    private javax.swing.JTextField InputTipoHabi;
    private javax.swing.JButton MenuHabi;
    private javax.swing.JLabel NombreHabi;
    private javax.swing.JLabel SAVEPNG;
    private javax.swing.JLabel TipoHabi;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
