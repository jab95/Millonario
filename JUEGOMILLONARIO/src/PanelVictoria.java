/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AYALA
 */
public class PanelVictoria extends javax.swing.JPanel {

    /**
     * Creates new form PanelVictoria
     */
    
    private VentanaPrincipal ventana;

    public PanelVictoria(VentanaPrincipal ventana) {
        initComponents();
                this.setBackground(ventana.getGestionPreguntas().getColor());

        if(ventana.getGestionPreguntas().getNombreUsuario()==null){
            ventana.getGestionPreguntas().setNombreUsuario("USUARIO");
        }
        this.txtNombre.setText("EL USUARIO "+ventana.getGestionPreguntas().getNombreUsuario()+" HA GANADO 50000€!!");
        this.ventana=ventana;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JLabel();

        setLayout(null);

        jButton1.setText("GRACIAS");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(240, 240, 90, 23);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("VICTORIA!!!");
        add(jLabel1);
        jLabel1.setBounds(140, 60, 280, 105);

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        add(txtNombre);
        txtNombre.setBounds(90, 160, 380, 70);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
         PanelImagenJFrame panel2 = new PanelImagenJFrame(ventana);
         ventana.getGestionPreguntas().cambiarPanel(ventana, panel2);
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel txtNombre;
    // End of variables declaration//GEN-END:variables
}
