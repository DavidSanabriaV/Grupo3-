package PruebaProyecto;

import javax.swing.JOptionPane;

public class AgregarVis extends javax.swing.JFrame {

    //Variables a utilizar
    int total = 5;
    int ninios = 2;
    int adultos = 3;

    public AgregarVis() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        GUARDARVIS = new javax.swing.JLabel();
        FLECHAATRASVIS = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        InputNombreVis = new javax.swing.JTextField();
        NombreVisi = new javax.swing.JLabel();
        EdadVisi = new javax.swing.JLabel();
        InputEdadVis = new javax.swing.JTextField();
        Fechavisi = new javax.swing.JLabel();
        InputFechaVisi = new javax.swing.JTextField();
        IDvisit = new javax.swing.JLabel();
        InputIDVisi = new javax.swing.JTextField();
        Guardarvisi = new javax.swing.JButton();
        MenuVisi = new javax.swing.JButton();
        AtrasVisi = new javax.swing.JButton();
        TotalVisitantes = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(119, 139, 81));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        GUARDARVIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SAVEPNGAMARILLO.png"))); // NOI18N
        jPanel2.add(GUARDARVIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 570, -1, -1));

        FLECHAATRASVIS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        FLECHAATRASVIS.setText("jLabel3");
        jPanel2.add(FLECHAATRASVIS, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 150, 130));

        jLabel1.setFont(new java.awt.Font("Mongolian Baiti", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("INGRESE LOS DATOS DEL VISITANTE");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 400, 49));

        InputNombreVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreVisActionPerformed(evt);
            }
        });
        jPanel2.add(InputNombreVis, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 406, -1));

        NombreVisi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NombreVisi.setForeground(new java.awt.Color(255, 255, 255));
        NombreVisi.setText("Nombre");
        jPanel2.add(NombreVisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 250, 371, -1));

        EdadVisi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EdadVisi.setForeground(new java.awt.Color(255, 255, 255));
        EdadVisi.setText("Edad ");
        jPanel2.add(EdadVisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, 420, -1));

        InputEdadVis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEdadVisActionPerformed(evt);
            }
        });
        jPanel2.add(InputEdadVis, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 408, -1));

        Fechavisi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Fechavisi.setForeground(new java.awt.Color(255, 255, 255));
        Fechavisi.setText("Fecha ingreso");
        jPanel2.add(Fechavisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        InputFechaVisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFechaVisiActionPerformed(evt);
            }
        });
        jPanel2.add(InputFechaVisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 408, -1));

        IDvisit.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDvisit.setForeground(new java.awt.Color(255, 255, 255));
        IDvisit.setText("ID visitante");
        jPanel2.add(IDvisit, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 213, -1));

        InputIDVisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIDVisiActionPerformed(evt);
            }
        });
        jPanel2.add(InputIDVisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 470, 408, -1));

        Guardarvisi.setBackground(new java.awt.Color(65, 85, 40));
        Guardarvisi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Guardarvisi.setForeground(new java.awt.Color(255, 255, 255));
        Guardarvisi.setText("Guardar");
        Guardarvisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarvisiActionPerformed(evt);
            }
        });
        jPanel2.add(Guardarvisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 630, 60, 50));

        MenuVisi.setBackground(new java.awt.Color(65, 85, 40));
        MenuVisi.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuVisi.setForeground(new java.awt.Color(255, 255, 255));
        MenuVisi.setText("MENU");
        MenuVisi.setBorderPainted(false);
        MenuVisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuVisiActionPerformed(evt);
            }
        });
        jPanel2.add(MenuVisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 630, -1, -1));

        AtrasVisi.setBackground(new java.awt.Color(65, 85, 40));
        AtrasVisi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AtrasVisi.setForeground(new java.awt.Color(255, 255, 255));
        AtrasVisi.setText("Atras");
        AtrasVisi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasVisiActionPerformed(evt);
            }
        });
        jPanel2.add(AtrasVisi, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 627, 90, 50));

        TotalVisitantes.setBackground(new java.awt.Color(238, 175, 19));
        TotalVisitantes.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TotalVisitantes.setForeground(new java.awt.Color(65, 85, 40));
        TotalVisitantes.setText("TOTAL VISITANTES");
        TotalVisitantes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalVisitantesActionPerformed(evt);
            }
        });
        jPanel2.add(TotalVisitantes, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 710, 278, 68));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/visitantesBack.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AtrasVisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasVisiActionPerformed
        //Codigo para ir atras
        RegistroDeVisitantes rVisi = new RegistroDeVisitantes();
        rVisi.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasVisiActionPerformed

    private void MenuVisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuVisiActionPerformed
        //codigo para volver al menu
        Menu menu1 = new Menu();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuVisiActionPerformed

    private void GuardarvisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarvisiActionPerformed
        //creacion de objeto para usar el arreglo

        Home guardar = new Home();
        guardar.InformacionPrecargadaVisitantes(guardar.arrVisitantes);

        //recolectamos la informacion del input
        String nombreVisitantes = InputNombreVis.getText();
        int edadVisitante = Integer.parseInt(InputEdadVis.getText());
        int fechaVisitante = Integer.parseInt(InputFechaVisi.getText());
        int idVisitante = Integer.parseInt(InputIDVisi.getText());

        // creamos un for para agregar info delante del arr precargado y que nos diga cuando no se pueden agregar mas
        boolean added = false;
        for (int i = 0; i < Home.arrVisitantes.length; i++) {
            if (Home.arrVisitantes[i] == null) {
                Home.arrVisitantes[i] = new Visitantes(nombreVisitantes, edadVisitante, fechaVisitante, idVisitante);
                added = true;
                break;
            }
        }

        //Verificar si se ha podido agregar un nuevo animal si added = falso significa que no hay espacio
        if (!added) {
            JOptionPane.showMessageDialog(null, "No hay espacio para agregar más Visitantes.");
            return;
        }

        // String Builder
        StringBuilder sb = new StringBuilder("Visitantes registrados:\n");
        for (int i = 0; i < Home.arrVisitantes.length; i++) {
            if (Home.arrVisitantes[i] != null) {
                sb.append(Home.arrVisitantes[i].toString()).append("\n");
            }
        }
        //muestra la informacion ya añadida
        JOptionPane.showMessageDialog(null, sb.toString());

        //Metodo para demostrar la cantidad de personas, niños y adultos ingresaron
        int edades = Integer.parseInt(InputEdadVis.getText());
        if (edades < 18) {
            ninios += 1;
            total += 1;
            //Muestra de resultados
            JOptionPane.showMessageDialog(null, "El total de personas ingresadas fue de: " + total);
            JOptionPane.showMessageDialog(null, "El total de niños ingresados fue de:" + ninios);
        }

        if (edades >= 18) {
            adultos += 1;
            total += 1;
            //Muestra de resultados
            JOptionPane.showMessageDialog(null, "El total de personas ingresadas fue de: " + total);
            JOptionPane.showMessageDialog(null, "El total de adultos ingresados fue de:" + adultos);
        }
    }//GEN-LAST:event_GuardarvisiActionPerformed

    private void InputIDVisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIDVisiActionPerformed

        //Asignacion de lo ingresado a la variable
        int idVis = Integer.parseInt(InputNombreVis.getText());
        JOptionPane.showMessageDialog(null, idVis);
        //Bucle para ingresar a informacion al arreglo 
        for (int i = 0; i < Home.arrVisitantes.length; i++) {
            if (Home.arrVisitantes[i] == null) {
                Home.arrVisitantes[i].setId(idVis);
            }
        }
    }//GEN-LAST:event_InputIDVisiActionPerformed

    private void InputFechaVisiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFechaVisiActionPerformed
        //Asignacion de lo ingresado a la variable
        int fechaVis = Integer.parseInt(InputNombreVis.getText());
        JOptionPane.showMessageDialog(null, fechaVis);
        //Bucle para ingresar a informacion al arreglo 
        for (int i = 0; i < Home.arrVisitantes.length; i++) {
            if (Home.arrVisitantes[i] == null) {
                Home.arrVisitantes[i].setFecha(fechaVis);
            }
        }
    }//GEN-LAST:event_InputFechaVisiActionPerformed

    private void InputEdadVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEdadVisActionPerformed

        //Asignacion de lo ingresado a la variable
        int edadVis = Integer.parseInt(InputEdadVis.getText());
        JOptionPane.showMessageDialog(null, edadVis);
        //Bucle para ingresar a informacion al arreglo 
        for (int i = 0; i < Home.arrVisitantes.length; i++) {
            if (Home.arrVisitantes[i] == null) {
                Home.arrVisitantes[i].setEdad(edadVis);
            }
        }
        //Metodo para sumar la cantidad de personas y si es niño o adulto
        if (edadVis < 18) {
            ninios += 1;
            total += 1;
        } else if (edadVis >= 18) {
            adultos += 1;
            total += 1;
        }
        //Muestra del resultado
        JOptionPane.showMessageDialog(null, "El total de personas ingresadas fue de: " + total);
        //Muestra del resultado
        JOptionPane.showMessageDialog(null, "El total de niños ingresados fue de: " + ninios);
        //Muestra del resultado
        JOptionPane.showMessageDialog(null, "El total de adultos ingresados fue de: " + adultos);
    }//GEN-LAST:event_InputEdadVisActionPerformed

    private void InputNombreVisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreVisActionPerformed
        //Asignacion de lo ingresado a la variable
        String nombreVis = InputNombreVis.getText();
        JOptionPane.showMessageDialog(null, nombreVis);
        //Bucle para ingresar a informacion al arreglo 
        for (int i = 0; i < Home.arrVisitantes.length; i++) {
            if (Home.arrVisitantes[i] == null) {
                Home.arrVisitantes[i].setNombre(nombreVis);
            }
        }

    }//GEN-LAST:event_InputNombreVisActionPerformed

    private void TotalVisitantesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalVisitantesActionPerformed
        // asignaicon de variables
        int total = 0;
        int ninios = 0;
        int adultos = 0;

        // bucle del suma
        for (int i = 0; i < Home.arrVisitantes.length; i++) {
            if (Home.arrVisitantes[i] != null) {
                total++;
                if (Home.arrVisitantes[i].getEdad() < 18) {
                    ninios++;
                } else {
                    adultos++;

                }
            }
        }

        // Display de resultados
        JOptionPane.showMessageDialog(null, "El total de visitantes ingresados es: " + total);
        JOptionPane.showMessageDialog(null, "El total de niños ingresados es: " + ninios);
    JOptionPane.showMessageDialog(null, "El total de adultos ingresados es: " + adultos);    }//GEN-LAST:event_TotalVisitantesActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarVis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AtrasVisi;
    private javax.swing.JLabel EdadVisi;
    private javax.swing.JLabel FLECHAATRASVIS;
    private javax.swing.JLabel Fechavisi;
    private javax.swing.JLabel GUARDARVIS;
    private javax.swing.JButton Guardarvisi;
    private javax.swing.JLabel IDvisit;
    private javax.swing.JTextField InputEdadVis;
    private javax.swing.JTextField InputFechaVisi;
    private javax.swing.JTextField InputIDVisi;
    private javax.swing.JTextField InputNombreVis;
    private javax.swing.JButton MenuVisi;
    private javax.swing.JLabel NombreVisi;
    private javax.swing.JButton TotalVisitantes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
