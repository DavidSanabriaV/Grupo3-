package PruebaProyecto;

import javax.swing.JOptionPane;

public class AgregarEvent extends javax.swing.JFrame {

    public AgregarEvent() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        SAVEPNG = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        InputNombreEven = new javax.swing.JTextField();
        NombreEvent = new javax.swing.JLabel();
        FechaEven = new javax.swing.JLabel();
        InputFechaEven = new javax.swing.JTextField();
        InputDescripEven = new javax.swing.JTextField();
        DescripEven = new javax.swing.JLabel();
        InputIDEven = new javax.swing.JTextField();
        GuardarEven = new javax.swing.JButton();
        MenuEven = new javax.swing.JButton();
        AtrasFlecha = new javax.swing.JLabel();
        AtrasEven = new javax.swing.JButton();
        IDeven = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        REGISTROEVENTOS = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 814));

        jPanel2.setBackground(new java.awt.Color(119, 139, 81));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setMinimumSize(new java.awt.Dimension(800, 800));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SAVEPNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SAVEPNGAMARILLO.png"))); // NOI18N
        jPanel2.add(SAVEPNG, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, 130, 80));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESE LOS DATOS DEL EVENTO");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 441, 49));

        InputNombreEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreEvenActionPerformed(evt);
            }
        });
        jPanel2.add(InputNombreEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 527, -1));

        NombreEvent.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NombreEvent.setForeground(new java.awt.Color(255, 255, 255));
        NombreEvent.setText("Nombre");
        jPanel2.add(NombreEvent, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 240, 504, -1));

        FechaEven.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FechaEven.setForeground(new java.awt.Color(255, 255, 255));
        FechaEven.setText("Fecha");
        jPanel2.add(FechaEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 330, 294, -1));

        InputFechaEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFechaEvenActionPerformed(evt);
            }
        });
        jPanel2.add(InputFechaEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, 530, -1));

        InputDescripEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputDescripEvenActionPerformed(evt);
            }
        });
        jPanel2.add(InputDescripEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 440, 519, -1));

        DescripEven.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        DescripEven.setForeground(new java.awt.Color(255, 255, 255));
        DescripEven.setText("Descripcion");
        jPanel2.add(DescripEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        InputIDEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIDEvenActionPerformed(evt);
            }
        });
        jPanel2.add(InputIDEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 540, 526, -1));

        GuardarEven.setBackground(new java.awt.Color(65, 85, 40));
        GuardarEven.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarEven.setForeground(new java.awt.Color(255, 255, 255));
        GuardarEven.setBorderPainted(false);
        GuardarEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarEvenActionPerformed(evt);
            }
        });
        jPanel2.add(GuardarEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(392, 690, 50, 60));

        MenuEven.setBackground(new java.awt.Color(65, 85, 40));
        MenuEven.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuEven.setForeground(new java.awt.Color(255, 255, 255));
        MenuEven.setText("MENU");
        MenuEven.setBorderPainted(false);
        MenuEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuEvenActionPerformed(evt);
            }
        });
        jPanel2.add(MenuEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 690, -1, 60));

        AtrasFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel2.add(AtrasFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 620, 150, 140));

        AtrasEven.setBackground(new java.awt.Color(102, 102, 102));
        AtrasEven.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasEven.setForeground(new java.awt.Color(255, 255, 255));
        AtrasEven.setText("Atras");
        AtrasEven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasEvenActionPerformed(evt);
            }
        });
        jPanel2.add(AtrasEven, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 660, 90, 70));

        IDeven.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDeven.setForeground(new java.awt.Color(255, 255, 255));
        IDeven.setText("ID");
        jPanel2.add(IDeven, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 520, 381, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO EVENTOS.png"))); // NOI18N
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 800));

        REGISTROEVENTOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO EVENTOS.png"))); // NOI18N
        REGISTROEVENTOS.setText("jLabel3");
        jPanel2.add(REGISTROEVENTOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputNombreEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreEvenActionPerformed
        //Asignacion de lo puesto a una variable
        String nombreEvent = InputNombreEven.getText();
        JOptionPane.showMessageDialog(null, nombreEvent);
        //Creacion de objeto para llamar el evento
        Home event = new Home();
        event.InformacionPrecargadaEvent(event.arrEventos);
        //Bucle para almacenar la informacion
        for (int i = 0; i < event.arrEventos.length; i++) {
            if (event.arrEventos[i] == null) {
                event.arrEventos[i].setNombre(nombreEvent);
            }
        }
    }//GEN-LAST:event_InputNombreEvenActionPerformed

    private void InputFechaEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFechaEvenActionPerformed
        //Asignacion de lo puesto a una variable
        String fechaEvent = InputNombreEven.getText();
        JOptionPane.showMessageDialog(null, fechaEvent);
        //Creacion de objeto para llamar el evento
        Home event = new Home();
        event.InformacionPrecargadaEvent(event.arrEventos);
        //Bucle para almacenar la informacion
        for (int i = 0; i < event.arrEventos.length; i++) {
            if (event.arrEventos[i] == null) {
                event.arrEventos[i].setFecha(fechaEvent);
            }
        }
    }//GEN-LAST:event_InputFechaEvenActionPerformed

    private void InputDescripEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputDescripEvenActionPerformed
        //Asignacion de lo puesto a una variable
        String descripcionEvent = InputNombreEven.getText();
        JOptionPane.showMessageDialog(null, descripcionEvent);
        //Creacion de objeto para llamar el evento
        Home event = new Home();
        event.InformacionPrecargadaEvent(event.arrEventos);
        //Bucle para almacenar la informacion
        for (int i = 0; i < event.arrEventos.length; i++) {
            if (event.arrEventos[i] == null) {
                event.arrEventos[i].setDescripcion(descripcionEvent);
            }
        }
    }//GEN-LAST:event_InputDescripEvenActionPerformed

    private void InputIDEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIDEvenActionPerformed
        //Asignacion de lo puesto a una variable
        int IDEAni = Integer.parseInt(InputIDEven.getText());
        //Creacion de objeto para llamar el evento
        Home event = new Home();
        event.InformacionPrecargadaEvent(event.arrEventos);
        //Bucle para almacenar la informacion
        for (int i = 0; i < event.arrHabitats.length; i++) {
            if (event.arrHabitats[i] == null) {
                event.arrHabitats[i].setNum(IDEAni);
            }
        }
    }//GEN-LAST:event_InputIDEvenActionPerformed

    private void GuardarEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarEvenActionPerformed
        //Creacion de objeto para utilizar la matriz

        Home guardar = new Home();

        guardar.InformacionPrecargadaEvent(guardar.arrEventos);

        //recolectamos la informacion del input
        String nombreEvent = InputNombreEven.getText();

        String fechaEvent = InputFechaEven.getText();

        String descripcionEvent = InputDescripEven.getText();

        int idEvent = Integer.parseInt(InputIDEven.getText());

        // creamos un for para agregar info delante del arr precargado y que nos diga cuando no se pueden agregar mas
        boolean added = false;

        for (int i = 0; i < guardar.arrEventos.length; i++) {

            if (guardar.arrEventos[i] == null) {

                guardar.arrEventos[i] = new Eventos(nombreEvent, fechaEvent, idEvent, descripcionEvent);

                added = true;

                break;

            }

        }

        //Verificar si se ha podido agregar un nuevo animal si added = falso significa que no hay espacio
        if (!added) {

            JOptionPane.showMessageDialog(null, "No hay espacio para agregar más eventos.");

            return;

        }

        // String Builder
        StringBuilder sb = new StringBuilder("Eventos registrados:\n");

        for (int i = 0; i < guardar.arrEventos.length; i++) {

            if (guardar.arrEventos[i] != null) {

                sb.append(guardar.arrEventos[i].toString()).append("\n");

            }

        }

        //muestra la informacion ya añadida
        JOptionPane.showMessageDialog(null, sb.toString());


    }//GEN-LAST:event_GuardarEvenActionPerformed

    private void MenuEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuEvenActionPerformed
        //codigo para volver a menu
        Menu menu1 = new Menu();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuEvenActionPerformed

    private void AtrasEvenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasEvenActionPerformed
        //codigo para ir atras
        RegistroDeEventos atrasEven = new RegistroDeEventos();
        atrasEven.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasEvenActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarEvent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasEven;
    private javax.swing.JLabel AtrasFlecha;
    private javax.swing.JLabel DescripEven;
    private javax.swing.JLabel FechaEven;
    private javax.swing.JButton GuardarEven;
    private javax.swing.JLabel IDeven;
    private javax.swing.JTextField InputDescripEven;
    private javax.swing.JTextField InputFechaEven;
    private javax.swing.JTextField InputIDEven;
    private javax.swing.JTextField InputNombreEven;
    private javax.swing.JButton MenuEven;
    private javax.swing.JLabel NombreEvent;
    private javax.swing.JLabel REGISTROEVENTOS;
    private javax.swing.JLabel SAVEPNG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
