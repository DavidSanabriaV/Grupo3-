package PruebaProyecto;

import javax.swing.JOptionPane;

public class AgregarAnimal1 extends javax.swing.JFrame {

    public AgregarAnimal1() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        SAVEPNG = new javax.swing.JLabel();
        AtrasFlecha = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        InputNombre = new javax.swing.JTextField();
        NombreAnimal = new javax.swing.JLabel();
        EdadAnimal = new javax.swing.JLabel();
        InputEdad1 = new javax.swing.JTextField();
        Especie = new javax.swing.JLabel();
        InputEspecie = new javax.swing.JTextField();
        AlimentoAnimal = new javax.swing.JLabel();
        InputHorario = new javax.swing.JTextField();
        HorarioAnimal = new javax.swing.JLabel();
        InputHabitat = new javax.swing.JTextField();
        HabitatAnimal = new javax.swing.JLabel();
        InputAlimento = new javax.swing.JTextField();
        IDEAnimal = new javax.swing.JLabel();
        InputIDE = new javax.swing.JTextField();
        FrecuenciaAnimal = new javax.swing.JLabel();
        InputFrecuencia = new javax.swing.JTextField();
        GuardarAni = new javax.swing.JButton();
        MenuAni = new javax.swing.JButton();
        AtrasAA1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(119, 139, 81));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SAVEPNG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/SAVEPNGAMARILLO.png"))); // NOI18N
        jPanel1.add(SAVEPNG, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, 130, 90));

        AtrasFlecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/ATRAS.png"))); // NOI18N
        jPanel1.add(AtrasFlecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 660, 150, 140));

        jLabel1.setFont(new java.awt.Font("STSong", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(65, 85, 40));
        jLabel1.setText("INGRESE LOS DATOS DEL ANIMAL");
        jLabel1.setAlignmentX(0.5F);
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 420, 49));

        InputNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputNombreActionPerformed(evt);
            }
        });
        jPanel1.add(InputNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 418, -1));

        NombreAnimal.setBackground(new java.awt.Color(255, 255, 255));
        NombreAnimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NombreAnimal.setForeground(new java.awt.Color(255, 255, 255));
        NombreAnimal.setText("Nombre");
        jPanel1.add(NombreAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 60, -1));

        EdadAnimal.setBackground(new java.awt.Color(255, 255, 255));
        EdadAnimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        EdadAnimal.setForeground(new java.awt.Color(255, 255, 255));
        EdadAnimal.setText("Edad ");
        jPanel1.add(EdadAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 50, -1));

        InputEdad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEdad1ActionPerformed(evt);
            }
        });
        jPanel1.add(InputEdad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 418, -1));

        Especie.setBackground(new java.awt.Color(255, 255, 255));
        Especie.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Especie.setForeground(new java.awt.Color(255, 255, 255));
        Especie.setText("Especie");
        jPanel1.add(Especie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, -1, -1));

        InputEspecie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputEspecieActionPerformed(evt);
            }
        });
        jPanel1.add(InputEspecie, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 418, -1));

        AlimentoAnimal.setBackground(new java.awt.Color(255, 255, 255));
        AlimentoAnimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AlimentoAnimal.setForeground(new java.awt.Color(255, 255, 255));
        AlimentoAnimal.setText("Alimento");
        jPanel1.add(AlimentoAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 510, -1, -1));

        InputHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputHorarioActionPerformed(evt);
            }
        });
        jPanel1.add(InputHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 600, 418, -1));

        HorarioAnimal.setBackground(new java.awt.Color(255, 255, 255));
        HorarioAnimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HorarioAnimal.setForeground(new java.awt.Color(255, 255, 255));
        HorarioAnimal.setText("Horario");
        jPanel1.add(HorarioAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 580, -1, -1));

        InputHabitat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputHabitatActionPerformed(evt);
            }
        });
        jPanel1.add(InputHabitat, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 418, -1));

        HabitatAnimal.setBackground(new java.awt.Color(255, 255, 255));
        HabitatAnimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        HabitatAnimal.setForeground(new java.awt.Color(255, 255, 255));
        HabitatAnimal.setText("Habitat");
        jPanel1.add(HabitatAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 390, -1, -1));

        InputAlimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputAlimentoActionPerformed(evt);
            }
        });
        jPanel1.add(InputAlimento, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 530, 418, -1));

        IDEAnimal.setBackground(new java.awt.Color(255, 255, 255));
        IDEAnimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        IDEAnimal.setForeground(new java.awt.Color(255, 255, 255));
        IDEAnimal.setText("# ANI");
        jPanel1.add(IDEAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 70, -1));

        InputIDE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputIDEActionPerformed(evt);
            }
        });
        jPanel1.add(InputIDE, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 470, 418, -1));

        FrecuenciaAnimal.setBackground(new java.awt.Color(255, 255, 255));
        FrecuenciaAnimal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        FrecuenciaAnimal.setForeground(new java.awt.Color(255, 255, 255));
        FrecuenciaAnimal.setText("Frecuencia Alimento");
        jPanel1.add(FrecuenciaAnimal, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 640, -1, -1));

        InputFrecuencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputFrecuenciaActionPerformed(evt);
            }
        });
        jPanel1.add(InputFrecuencia, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 660, 418, -1));

        GuardarAni.setBackground(new java.awt.Color(65, 85, 40));
        GuardarAni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GuardarAni.setForeground(new java.awt.Color(255, 255, 255));
        GuardarAni.setBorderPainted(false);
        GuardarAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarAniActionPerformed(evt);
            }
        });
        jPanel1.add(GuardarAni, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 690, 70, 70));

        MenuAni.setBackground(new java.awt.Color(65, 85, 40));
        MenuAni.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuAni.setForeground(new java.awt.Color(255, 255, 255));
        MenuAni.setText("MENU");
        MenuAni.setBorderPainted(false);
        MenuAni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAniActionPerformed(evt);
            }
        });
        jPanel1.add(MenuAni, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 690, 100, 70));

        AtrasAA1.setBackground(new java.awt.Color(60, 63, 65));
        AtrasAA1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        AtrasAA1.setForeground(new java.awt.Color(255, 255, 255));
        AtrasAA1.setBorderPainted(false);
        AtrasAA1.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        AtrasAA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasAA1ActionPerformed(evt);
            }
        });
        jPanel1.add(AtrasAA1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 80, 80));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/REGISTRO HABITAT.png"))); // NOI18N
        jLabel3.setText("jLabel3");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 800));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 800, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void InputNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputNombreActionPerformed
        //Asignacion de lo puesto a una variable
        String nombreAni = InputNombre.getText();
        JOptionPane.showMessageDialog(null, nombreAni);
        //Creacion de objeto para llamar el evento
        Home ani = new Home();
        ani.InformacionPrecargadaAni(ani.arrAnimales);
        //Bucle para almacenar la informacion
        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i] == null) {
                ani.arrAnimales[i].setNombre(nombreAni);
            }
        }
    }//GEN-LAST:event_InputNombreActionPerformed

    private void MenuAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAniActionPerformed
        //Codigo para ir al menu
        Menu menu1 = new Menu();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuAniActionPerformed

    private void InputEdad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEdad1ActionPerformed
        //Asignacion de lo puesto a una variable

        int edadAni = Integer.parseInt(InputEdad1.getText());
        //Creacion de objeto para llamar el evento

        Home ani = new Home();
        ani.InformacionPrecargadaAni(ani.arrAnimales);
        //Bucle para almacenar la informacion

        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i] == null) {
                ani.arrAnimales[i].setEdad(edadAni);
            }
        }
    }//GEN-LAST:event_InputEdad1ActionPerformed

    private void InputEspecieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputEspecieActionPerformed
        //Asignacion de lo puesto a una variable

        String especieAni = InputEspecie.getText();
        //Creacion de objeto para llamar el evento

        Home ani = new Home();
        ani.InformacionPrecargadaAni(ani.arrAnimales);
        //Bucle para almacenar la informacion

        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i] == null) {
                ani.arrAnimales[i].setEspecie(especieAni);
            }
        }
    }//GEN-LAST:event_InputEspecieActionPerformed

    private void InputHabitatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputHabitatActionPerformed
        //Asignacion de lo puesto a una variable

        int HabitatAni = Integer.parseInt(InputEspecie.getText());
        //Creacion de objeto para llamar el evento

        Home ani = new Home();
        ani.InformacionPrecargadaAni(ani.arrAnimales);
        //Bucle para almacenar la informacion

        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i] == null) {
                ani.arrAnimales[i].setHabitat(HabitatAni);
            }
        }
    }//GEN-LAST:event_InputHabitatActionPerformed

    private void InputIDEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputIDEActionPerformed
        //Asignacion de lo puesto a una variable

        int IDEAni = Integer.parseInt(InputIDE.getText());
        //Creacion de objeto para llamar el evento

        Home ani = new Home();
        ani.InformacionPrecargadaAni(ani.arrAnimales);
        //Bucle para almacenar la informacion

        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i] == null) {
                ani.arrAnimales[i].setAni(IDEAni);
            }
        }
    }//GEN-LAST:event_InputIDEActionPerformed

    private void InputAlimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputAlimentoActionPerformed
        //Asignacion de lo puesto a una variable

        String AlimentoAni = InputAlimento.getText();
        //Creacion de objeto para llamar el evento

        Home ani = new Home();
        ani.InformacionPrecargadaAni(ani.arrAnimales);
        //Bucle para almacenar la informacion

        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i] == null) {
                ani.arrAnimales[i].setAlimento(AlimentoAni);
            }
        }
    }//GEN-LAST:event_InputAlimentoActionPerformed

    private void InputHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputHorarioActionPerformed
        //Asignacion de lo puesto a una variable

        int HorarioAni = Integer.parseInt(InputHorario.getText());
        //Creacion de objeto para llamar el evento

        Home ani = new Home();
        ani.InformacionPrecargadaAni(ani.arrAnimales);
        //Bucle para almacenar la informacion

        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i] == null) {
                ani.arrAnimales[i].setHorario(HorarioAni);
            }
        }
    }//GEN-LAST:event_InputHorarioActionPerformed

    private void InputFrecuenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputFrecuenciaActionPerformed
        //Asignacion de lo puesto a una variable

        int FrecuenciaAni = Integer.parseInt(InputEspecie.getText());
        //Creacion de objeto para llamar el evento

        Home ani = new Home();
        ani.InformacionPrecargadaAni(ani.arrAnimales);
        //Bucle para almacenar la informacion

        for (int i = 0; i < ani.arrAnimales.length; i++) {
            if (ani.arrAnimales[i] == null) {
                ani.arrAnimales[i].setFrecuencia(FrecuenciaAni);
            }
        }
    }//GEN-LAST:event_InputFrecuenciaActionPerformed

    private void GuardarAniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarAniActionPerformed
        //creacion de objeto para usar el arreglo
        Home guardar = new Home();
        guardar.InformacionPrecargadaAni(guardar.arrAnimales);

        //recolectamos la informacion del input
        String nombreAni = InputNombre.getText();
        int edadAni = Integer.parseInt(InputEdad1.getText());
        String especieAni = InputEspecie.getText();
        int habitatAni = Integer.parseInt(InputHabitat.getText());
        int ideAni = Integer.parseInt(InputIDE.getText());
        String alimentoAni = InputAlimento.getText();
        int horarioAni = Integer.parseInt(InputHorario.getText());
        int frecuenciaAni = Integer.parseInt(InputFrecuencia.getText());

        // creamos un for para agregar info delante del arr precargado y que nos diga cuando no se pueden agregar mas
        boolean added = false;
        for (int i = 0; i < guardar.arrAnimales.length; i++) {
            if (guardar.arrAnimales[i] == null) {
                guardar.arrAnimales[i] = new Animales(nombreAni, edadAni, especieAni, habitatAni, ideAni, alimentoAni, horarioAni, frecuenciaAni);
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
        StringBuilder sb = new StringBuilder("Animales registrados:\n");
        for (int i = 0; i < guardar.arrAnimales.length; i++) {
            if (guardar.arrAnimales[i] != null) {
                sb.append(guardar.arrAnimales[i].toString()).append("\n");
            }
        }
        //muestra la informacion ya añadida
        JOptionPane.showMessageDialog(null, sb.toString());
    }//GEN-LAST:event_GuardarAniActionPerformed

    private void AtrasAA1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtrasAA1ActionPerformed
        //Codigo para ir atras
        RegistroDeAnimales atrasAA1 = new RegistroDeAnimales();
        atrasAA1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_AtrasAA1ActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarAnimal1().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AlimentoAnimal;
    private javax.swing.JButton AtrasAA1;
    private javax.swing.JLabel AtrasFlecha;
    private javax.swing.JLabel EdadAnimal;
    private javax.swing.JLabel Especie;
    private javax.swing.JLabel FrecuenciaAnimal;
    private javax.swing.JButton GuardarAni;
    private javax.swing.JLabel HabitatAnimal;
    private javax.swing.JLabel HorarioAnimal;
    private javax.swing.JLabel IDEAnimal;
    private javax.swing.JTextField InputAlimento;
    private javax.swing.JTextField InputEdad1;
    private javax.swing.JTextField InputEspecie;
    private javax.swing.JTextField InputFrecuencia;
    private javax.swing.JTextField InputHabitat;
    private javax.swing.JTextField InputHorario;
    private javax.swing.JTextField InputIDE;
    private javax.swing.JTextField InputNombre;
    private javax.swing.JButton MenuAni;
    private javax.swing.JLabel NombreAnimal;
    private javax.swing.JLabel SAVEPNG;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
