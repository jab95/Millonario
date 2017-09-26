/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pepe
 */
public class PanelModificarPreguntaElegida extends javax.swing.JPanel {

    /**
     * Creates new form IntroducirPregunta
     */
    
    private VentanaPrincipal ventana;
    private         String respuestaCorrecta;
    private  String[] respuestas;
    private int nivel;
    private Preguntas nuevaPregunta;
    private PanelModificar panel;
    
    
    public PanelModificarPreguntaElegida(VentanaPrincipal ventana,PanelModificar panel) {
        initComponents();
                this.setBackground(ventana.getGestionPreguntas().getColor());

        this.ventana=ventana;
        this.panel=panel;
        generarDatosCargados();
        
    }

    public void generarDatosCargados(){
        
        if(panel.getBusqueda()==false){
        
        this.textoPregunta.setText(ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).getPregunta());
        this.respuesta1.setText(ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).getRespuesta()[0]);
        this.respuesta2.setText(ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).getRespuesta()[1]);
        this.respuesta3.setText(ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).getRespuesta()[2]);
        this.respuesta4.setText(ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).getRespuesta()[3]);
        }else{
             this.textoPregunta.setText(panel.getArrayBusqueda().get(panel.getPreguntaSeleccionada()).getPregunta());
        this.respuesta1.setText(panel.getArrayBusqueda().get(panel.getPreguntaSeleccionada()).getRespuesta()[0]);
        this.respuesta2.setText(panel.getArrayBusqueda().get(panel.getPreguntaSeleccionada()).getRespuesta()[1]);
        this.respuesta3.setText(panel.getArrayBusqueda().get(panel.getPreguntaSeleccionada()).getRespuesta()[2]);
        this.respuesta4.setText(panel.getArrayBusqueda().get(panel.getPreguntaSeleccionada()).getRespuesta()[3]);
        }
    }
    
    public void guardarDatosNuevos(){
        
        
        ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setPregunta(this.textoPregunta.getText());
        ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setRespuesta1(this.respuesta1.getText());
        ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setRespuesta2(this.respuesta2.getText());
        ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setRespuesta3(this.respuesta3.getText());
        ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setRespuesta4(this.respuesta4.getText());
       
        if(this.nivel1.isSelected()){
                    ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setDificutad(1);
                    ventana.getGestionPreguntas().añadirPreguntaANivel1(ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()));
                   
        }else if(this.nivel2.isSelected()){
                   ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setDificutad(2);
                   ventana.getGestionPreguntas().añadirPreguntaANivel2(ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()));

        }else if(this.nivel3.isSelected()){
                    ventana.getGestionPreguntas().añadirPreguntaANivel3(ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()));
                    ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setDificutad(3);

        }
        
        if(this.respuestaCorrecta1.isSelected()){
                    ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setRespuestaCorrecta(this.respuesta1.getText());

        }else if(this.respuestaCorrecta2.isSelected()){
                   ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setRespuestaCorrecta(this.respuesta2.getText());

        }else if(this.respuestaCorrecta3.isSelected()){
                    ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setRespuestaCorrecta(this.respuesta3.getText());

        }else if(this.respuestaCorrecta4.isSelected()){
                    ventana.getGestionPreguntas().getArrayPreguntas().get(panel.getPreguntaSeleccionada()).setRespuestaCorrecta(this.respuesta4.getText());

        }
        

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotones1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        textoPregunta = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        nivel1 = new javax.swing.JRadioButton();
        nivel2 = new javax.swing.JRadioButton();
        nivel3 = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        respuesta1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        respuesta2 = new javax.swing.JTextField();
        respuesta3 = new javax.swing.JTextField();
        respuesta4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        respuestaCorrecta1 = new javax.swing.JRadioButton();
        respuestaCorrecta2 = new javax.swing.JRadioButton();
        respuestaCorrecta3 = new javax.swing.JRadioButton();
        respuestaCorrecta4 = new javax.swing.JRadioButton();

        setLayout(null);

        textoPregunta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textoPreguntaActionPerformed(evt);
            }
        });
        add(textoPregunta);
        textoPregunta.setBounds(106, 10, 300, 30);

        jLabel1.setText("Nivel Pregunta");
        add(jLabel1);
        jLabel1.setBounds(10, 53, 90, 14);

        grupoBotones1.add(nivel1);
        nivel1.setText("Nivel1");
        add(nivel1);
        nivel1.setBounds(130, 50, 80, 23);

        grupoBotones1.add(nivel2);
        nivel2.setText("Nivel2");
        add(nivel2);
        nivel2.setBounds(210, 50, 80, 23);

        grupoBotones1.add(nivel3);
        nivel3.setText("Nivel3");
        add(nivel3);
        nivel3.setBounds(300, 50, 70, 23);

        jLabel2.setText("Pregunta");
        add(jLabel2);
        jLabel2.setBounds(10, 14, 90, 14);

        jLabel3.setText("Respuesta 1");
        add(jLabel3);
        jLabel3.setBounds(10, 93, 80, 14);
        add(respuesta1);
        respuesta1.setBounds(100, 80, 302, 30);

        jLabel4.setText("Respuesta2");
        add(jLabel4);
        jLabel4.setBounds(10, 131, 80, 14);

        jLabel5.setText("Respuesta3");
        add(jLabel5);
        jLabel5.setBounds(10, 169, 80, 14);

        jLabel6.setText("Respuesta 4");
        add(jLabel6);
        jLabel6.setBounds(10, 207, 90, 20);
        add(respuesta2);
        respuesta2.setBounds(100, 120, 302, 30);
        add(respuesta3);
        respuesta3.setBounds(100, 160, 305, 30);
        add(respuesta4);
        respuesta4.setBounds(100, 200, 302, 30);

        jButton1.setText("Modificar Pregunta");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1);
        jButton1.setBounds(10, 277, 170, 23);

        jLabel7.setText("RespuestaCorrecta");
        add(jLabel7);
        jLabel7.setBounds(10, 240, 130, 14);

        buttonGroup2.add(respuestaCorrecta1);
        respuestaCorrecta1.setText("1");
        add(respuestaCorrecta1);
        respuestaCorrecta1.setBounds(160, 240, 31, 23);

        buttonGroup2.add(respuestaCorrecta2);
        respuestaCorrecta2.setText("2");
        add(respuestaCorrecta2);
        respuestaCorrecta2.setBounds(200, 240, 31, 23);

        buttonGroup2.add(respuestaCorrecta3);
        respuestaCorrecta3.setText("3");
        add(respuestaCorrecta3);
        respuestaCorrecta3.setBounds(240, 240, 31, 23);

        buttonGroup2.add(respuestaCorrecta4);
        respuestaCorrecta4.setText("4");
        add(respuestaCorrecta4);
        respuestaCorrecta4.setBounds(290, 240, 31, 23);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
            guardarDatosNuevos();
            ventana.getGestionPreguntas().ordenarArrayPreguntas();

       
            ventana.getGestionPreguntas().comprobarNumeroPreguntas();
       
        
        
        
        

        
       
         
    
    }//GEN-LAST:event_jButton1ActionPerformed

    private void textoPreguntaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textoPreguntaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textoPreguntaActionPerformed

    
    
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup grupoBotones1;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton nivel1;
    private javax.swing.JRadioButton nivel2;
    private javax.swing.JRadioButton nivel3;
    private javax.swing.JTextField respuesta1;
    private javax.swing.JTextField respuesta2;
    private javax.swing.JTextField respuesta3;
    private javax.swing.JTextField respuesta4;
    private javax.swing.JRadioButton respuestaCorrecta1;
    private javax.swing.JRadioButton respuestaCorrecta2;
    private javax.swing.JRadioButton respuestaCorrecta3;
    private javax.swing.JRadioButton respuestaCorrecta4;
    private javax.swing.JTextField textoPregunta;
    // End of variables declaration//GEN-END:variables
}
