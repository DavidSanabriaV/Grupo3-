package PruebaProyecto;

public class Home extends javax.swing.JFrame {

    //Matriz a utilizar para los animales 
    public static Animales[] arrAnimales = new Animales[100];
    //Matriz a utilizar para los habitats 
    public static Habitats[] arrHabitats = new Habitats[100];
    //Matriz a utilizar para los visitantes
    public static Visitantes[] arrVisitantes = new Visitantes[100];
    //Matriz a utilizar para los eventos
    public static Eventos[] arrEventos = new Eventos[100];

    public Home() {
        initComponents();
        InformacionPrecargadaAni(arrAnimales);
        InformacionPrecargadaHabitats(arrHabitats);
        InformacionPrecargadaVisitantes(arrVisitantes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BackroundHome = new javax.swing.JPanel();
        MenuHome = new javax.swing.JButton();
        MapaHome = new javax.swing.JButton();
        GestionHome = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        BackroundHome.setBackground(new java.awt.Color(204, 204, 204));
        BackroundHome.setMaximumSize(new java.awt.Dimension(800, 800));
        BackroundHome.setMinimumSize(new java.awt.Dimension(800, 800));
        BackroundHome.setPreferredSize(new java.awt.Dimension(800, 800));
        BackroundHome.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuHome.setBackground(new java.awt.Color(65, 85, 40));
        MenuHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuHome.setForeground(new java.awt.Color(255, 255, 255));
        MenuHome.setText("MENU DE REGISTROS");
        MenuHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MenuHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuHomeActionPerformed(evt);
            }
        });
        BackroundHome.add(MenuHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 590, 290, 50));

        MapaHome.setBackground(new java.awt.Color(65, 85, 40));
        MapaHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MapaHome.setForeground(new java.awt.Color(255, 255, 255));
        MapaHome.setText("MAPA");
        MapaHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        MapaHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MapaHomeActionPerformed(evt);
            }
        });
        BackroundHome.add(MapaHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 730, 380, 50));

        GestionHome.setBackground(new java.awt.Color(65, 85, 40));
        GestionHome.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        GestionHome.setForeground(new java.awt.Color(255, 255, 255));
        GestionHome.setText("GESTION");
        GestionHome.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        GestionHome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GestionHomeActionPerformed(evt);
            }
        });
        BackroundHome.add(GestionHome, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 660, 330, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/HOMEBACK.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        BackroundHome.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 800, 810));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackroundHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BackroundHome, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GestionHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GestionHomeActionPerformed
        //boton para ir a gestion        

        Gestion gestion1 = new Gestion();
        gestion1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_GestionHomeActionPerformed

    private void MapaHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MapaHomeActionPerformed
        //boton para ir a mapa        

        Mapa mapa1 = new Mapa();
        mapa1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MapaHomeActionPerformed

    private void MenuHomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuHomeActionPerformed
        //boton para ir a menu        

        Menu menu1 = new Menu();
        menu1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_MenuHomeActionPerformed

    public static void main(String args[]) {
        //Creacion de matriz para almacenar datos pre cargados
        Object[][] arrAnimales = new Object[100][8];

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }

        });

    }

    public void InformacionPrecargadaAni(Animales[] agregarinfo) {

        //Informacion de animal 1 
        this.arrAnimales[0] = new Animales("Oso", 5, "Pardo", 1, 1, "Pescado", 13, 1);

        //Informacion de animal 2
        this.arrAnimales[1] = new Animales("Jaguar", 2, "Amazonico", 2, 2, "Carne", 13, 1);

        //Informacion de animal 3 
        this.arrAnimales[2] = new Animales("Canguro", 9, "Rojo", 3, 3, "Hierbas", 13, 1);

        //Informacion de animal 4
        this.arrAnimales[3] = new Animales("Tiburon", 4, "Martillo", 4, 4, "Pescado", 13, 1);

        //Informacion de animal 5
        this.arrAnimales[4] = new Animales("Pinguino", 1, "Antartico", 5, 5, "Pescado", 13, 1);

    }

    public void InformacionPrecargadaHabitats(Habitats[] agregarinfo) {

        //Informacion de habitat 1 
        this.arrHabitats[0] = new Habitats("Bosque", "de altura", 50, 1);

        //Informacion de habitat 2
        this.arrHabitats[1] = new Habitats("Selva", "Humedo", 50, 2);

        //Informacion de habitat 3 
        this.arrHabitats[2] = new Habitats("Desierto", "Caliente", 50, 3);

        //Informacion de habitat 4
        this.arrHabitats[3] = new Habitats("Oceano", "Humedo", 50, 4);

        //Informacion de habitat 5
        this.arrHabitats[4] = new Habitats("Artico", "Frio", 50, 5);

    }

    public void InformacionPrecargadaVisitantes(Visitantes[] agregarinfo) {
        //Informacion de evento 1 
        this.arrVisitantes[0] = new Visitantes("David", 18, 121224, 1);
        //Informacion de evento 2
        this.arrVisitantes[1] = new Visitantes("Diego", 20, 80424, 2);
        //Informacion de evento 3 
        this.arrVisitantes[2] = new Visitantes("Lucia", 5, 060124, 3);;
        //Informacion de evento 4
        this.arrVisitantes[3] = new Visitantes("Ashley", 3, 010124, 4);;
        //Informacion de evento 5
        this.arrVisitantes[4] = new Visitantes("Gabriel", 25, 010624, 5);;
    }

    public void InformacionPrecargadaEvent(Eventos[] agregarinfo) {
        //Informacion de evento 1 
        this.arrEventos[0] = new Eventos("Baile", "12 de agosto", 1, "Baile tipico");
        //Informacion de evento 2
        this.arrEventos[1] = new Eventos("Pinta Caritas", "9 de diciembre", 2, "Pinta caritas para niños");
        //Informacion de evento 3 
        this.arrEventos[2] = new Eventos("Juego con Leon", "1 de enero", 3, "Disfruta con nuestro leon");
        //Informacion de evento 4
        this.arrEventos[3] = new Eventos("Nacimiento de Oso", "7 de marzo", 4, "Aprecia como nace el nuevo  Oso");
        //Informacion de evento 5
        this.arrEventos[4] = new Eventos("Manten el equilibrio", "9 de noviembe", 5, "Manten el equilibrio y llevate un maravilloso premio");
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BackroundHome;
    private javax.swing.JButton GestionHome;
    private javax.swing.JButton MapaHome;
    private javax.swing.JButton MenuHome;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
