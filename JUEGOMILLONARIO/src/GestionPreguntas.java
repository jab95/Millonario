
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pepe
 */
public class GestionPreguntas extends javax.swing.JPanel {

    Random rnd = new Random();

    
    private ArrayList<Preguntas> preguntas;
    private PanelJuego panelJuego;
    private int[] arrayPreguntas;
    private VentanaPrincipal ventana;
    private  ArrayList<Preguntas> preguntasNivel1;
    private  ArrayList<Preguntas> preguntasNivel2;
    private ArrayList<Preguntas> preguntasNivel3;
    private int numeroPreguntasNivel3,numeroPreguntasNivel2,numeroPreguntasNivel1;
    private int contadorPreguntas1,contadorPreguntas2,contadorPreguntas3;
    private int contadorPreguntasNivel1,contadorPreguntasNivel2,contadorPreguntasNivel3;
    private int[] dineroAcumulado ={100,200,300,800,1000,2000,3000,4000,5000,8000,15000,20000,25000,30000,50000};
    private int contadorPreguntasPorNivel=0;
    private int numeroAleatorio1,numeroAleatorio2;
    private int contadorComodines=0;
    private int contadorPreguntasArray15=0;
    private String nombreUsuario;
    private int numeroComodines=3;
    private int dineroGanado;
    private boolean sonidoApagado;
    private boolean juegoIniciado=false;
    private Color color;
    
            
    private    String[] respuestas1 ={"madrid","valencia","bilbao","barcelona"};
    private    String[] respuestas2 ={"juan","felipe","carlos","manuel"};
    private    String[] respuestas3 ={"pepe","juan","pedro","luis"};
    private    String[] respuestas4 ={"Marron","negro","Amarillo","Blanco"};
    private    String[] respuestas5 ={"ahoraco","parchis","millonario","buscaminas"};
    private    String[] respuestas6 ={"14","15","16","13"};
    private    String[] respuestas7 ={"200000","230000","250000","212000"};
    private    String[] respuestas8 ={"600","595","604","615"};
    private    String[] respuestas9 ={"Mike Pence","obama","Rex Tillerson","Steven Mnuchin"};
    private    String[] respuestas10 ={"Matteo Renzi","No tiene","Graziano Delrio","Angelino Alfano"};
    private    String[] respuestas11={"Niño","Abeja macho","Apellido","Rana"};
    private    String[] respuestas12 ={"3700","3356","3474","3655"};
    private    String[] respuestas13 ={"1,0070 UMA","1,0075 UMA","1,0085 UMA","1,0080 UMA"};
    private    String[] respuestas14 ={"21 Novienmbre","21 de Octubre","21 Junio","20 Septiembre"};
    private    String[] respuestas15 ={"13 Marzo","15 Abril","10 Mayo","14 Junio"};

            
            
            /**
     * Creates new form Preguntas
     */
    public GestionPreguntas() {
        initComponents();
        arrayPreguntas = new int[15];
        preguntas = new ArrayList<Preguntas>();
        
        
       
        
         preguntas.add(new Preguntas("¿Capital de españa?",respuestas1,respuestas1[0],1));
        preguntas.add(new Preguntas("¿Nombre del rey?",respuestas2,respuestas2[1],1));
        preguntas.add(new Preguntas("¿mejor programador?",respuestas3,respuestas3[0],1));
        preguntas.add(new Preguntas("¿Color del caballo blanco de santiago?",respuestas4,respuestas4[3],1));
        preguntas.add(new Preguntas("¿mejor juego?",respuestas5,respuestas5[2],1));
        preguntas.add(new Preguntas("Raiz cuadrada de 196",respuestas6,respuestas6[0],2));
        preguntas.add(new Preguntas("Poblacion de jerez",respuestas7,respuestas7[3],2));
        preguntas.add(new Preguntas("Extension de madrid",respuestas8,respuestas8[2],2));
        preguntas.add(new Preguntas("Vicepresidente de EEUU",respuestas9,respuestas9[0],2));
        preguntas.add(new Preguntas("Rey de Italia",respuestas10,respuestas10[1],2));
        preguntas.add(new Preguntas("Que es un zangano",respuestas11,respuestas11[1],3));
        preguntas.add(new Preguntas("Diametro de la luna",respuestas12,respuestas12[2],3));
        preguntas.add(new Preguntas("Peso de un atomo",respuestas13,respuestas13[3],3));
        preguntas.add(new Preguntas("Dia de la television",respuestas14,respuestas14[0],3));
        preguntas.add(new Preguntas("Dia de la muerte de Abraham Lincoln",respuestas15,respuestas15[1],3));

        
        preguntasNivel1 = new ArrayList<Preguntas>();
        preguntasNivel2 = new ArrayList<Preguntas>();
        preguntasNivel3 = new ArrayList<Preguntas>();

        
        
     
    }
    
    
    public void rellenaArray1(){
        contadorPreguntasNivel1 = 0;

        numeroPreguntasNivel1 = arrayPreguntasNivel1().size();
 
            arrayPreguntas[0] = (int) (Math.random()*(numeroPreguntasNivel1));
            for(int i=1;i<5;i++){
                        arrayPreguntas[i]=(int) (Math.random()*(numeroPreguntasNivel1));

                        for(int j=0;j<i;j++){
                            
                            if(arrayPreguntas[i]==arrayPreguntas[j]){
                                i--;
                            }
                            
                        }
  
            }
       
    }
    
    public void rellenaArray2(){
                contadorPreguntasNivel2 = arrayPreguntasNivel1().size();

        numeroPreguntasNivel2 = arrayPreguntasNivel2().size();

        arrayPreguntas[5] = (int) (Math.random()*((numeroPreguntasNivel2+numeroPreguntasNivel1)-(numeroPreguntasNivel1)))+numeroPreguntasNivel1;
        for(int i=6;i<10;i++){
                arrayPreguntas[i] = (int) (Math.random()*((numeroPreguntasNivel2+numeroPreguntasNivel1)-(numeroPreguntasNivel1)))+numeroPreguntasNivel1;
                for(int j=5;j<i;j++){
                            
                            if(arrayPreguntas[i]==arrayPreguntas[j]){
                                i--;
                            }
                            
                            
                        }
                
        }
        
    
    }
    
    public void rellenaArray3(){
                contadorPreguntasNivel3 = (arrayPreguntasNivel2().size()+arrayPreguntasNivel1().size());

        numeroPreguntasNivel3 = arrayPreguntasNivel3().size();
  
        arrayPreguntas[10] = (int) (Math.random()*((numeroPreguntasNivel3+numeroPreguntasNivel2+numeroPreguntasNivel1)-(numeroPreguntasNivel1+numeroPreguntasNivel2)))+(numeroPreguntasNivel1+numeroPreguntasNivel2);
        for(int i=11;i<15;i++){
                arrayPreguntas[i] = (int) (Math.random()*((numeroPreguntasNivel3+numeroPreguntasNivel2+numeroPreguntasNivel1)-(numeroPreguntasNivel1+numeroPreguntasNivel2)))+(numeroPreguntasNivel1+numeroPreguntasNivel2);
                for(int j=10;j<i;j++){
                            
                            if(arrayPreguntas[i]==arrayPreguntas[j]){
                                i--;
                            }
                            
                            
                        }
                
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 468, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 343, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public ArrayList<Preguntas> getArrayPreguntas(){
        return preguntas;
    }
    
  
    public void arraysPreguntasNivel1(){
        
 
        while(preguntas.get(contadorPreguntasPorNivel).getNivel()==1){
            
            preguntasNivel1.add(preguntas.get(contadorPreguntasPorNivel));
            contadorPreguntasPorNivel++;
        }
        
        
    }
    
    public void arraysPreguntasNivel2(){

        while(preguntas.get(contadorPreguntasPorNivel).getNivel()==2){
            
            preguntasNivel2.add(preguntas.get(contadorPreguntasPorNivel));
            contadorPreguntasPorNivel++;
        }
    
        
    }
    
    public void arraysPreguntasNivel3(){
 
        while((contadorPreguntasPorNivel<preguntas.size())&&preguntas.get(contadorPreguntasPorNivel).getNivel()==3){
            
            preguntasNivel3.add(preguntas.get(contadorPreguntasPorNivel));
            contadorPreguntasPorNivel++;
        }
        
   
    }
    
    public void añadirPreguntaANivel1(Preguntas pregunta){
        
        arrayPreguntasNivel1().add(pregunta);
        
    }
    public void añadirPreguntaANivel2(Preguntas pregunta){
        
        arrayPreguntasNivel2().add(pregunta);
        
    }
    public void añadirPreguntaANivel3(Preguntas pregunta){
        
        arrayPreguntasNivel3().add(pregunta);
     
       
        
    }
    
    
    
    public boolean comprobarNumeroPreguntas(){
        boolean menosde15 = false;
        if(this.getArrayPreguntas().size()==15){
               JOptionPane.showMessageDialog(null,"NO PUEDE HABER MENOS DE 5 PREGUNTAS EN CUALQUIER NIVEL");                                 
               menosde15=true;
        }
        return menosde15;
    }
    
    
    
    
    public int[] getArray15Preguntas(){
        return arrayPreguntas;
    }
    
    public ArrayList<Preguntas> arrayPreguntasNivel1(){
        return preguntasNivel1;
        
    }
    
     public ArrayList<Preguntas> arrayPreguntasNivel2(){
        return preguntasNivel2;
        
    }
     
      public ArrayList<Preguntas> arrayPreguntasNivel3(){
        return preguntasNivel3;
        
    }

      public PanelJuego getPanelJuego(){
          return panelJuego;
      }
      
    public void cambiarPanel(VentanaPrincipal ventana,JPanel panelActivo){
        this.ventana=ventana;
        ventana.getContentPane().removeAll();
        ventana.getContentPane().add(panelActivo);
        
        ventana.validate();
  
    }
    
    public void resetearTodosContadores(){
        setContadorPreguntasArray15(0);
        
        setNumeroPreguntasArray1(arrayPreguntasNivel1().size());
        setNumeroPreguntasArray2(arrayPreguntasNivel2().size());
        setNumeroPreguntasArray3(arrayPreguntasNivel3().size());
        
        setContadorPreguntasNivel(0);
    }
    
    public int[] obtenerArrayDinero(){
        return dineroAcumulado;
    }
    
   public void ordenarArrayPreguntas(){ 
      
       //Collections.sort(preguntas, new OrdenarArray());
       
       Collections.sort(preguntas);
       
       
       /*  
       Collections.sort(preguntas, new Comparator<Preguntas>(){
            public int compare(Preguntas p1, Preguntas p2) {

                
                
                if(p1.getNivel()!=p2.getNivel()){
                    return Integer.compare(p1.getNivel(),p2.getNivel());
                }else if(!p1.getPregunta().equalsIgnoreCase(p2.getPregunta())){
                    return p1.getPregunta().compareTo(p2.getPregunta()); 
                }else{
                    return p1.getRespuestaAcertada().compareTo(p2.getRespuestaAcertada()); 

                }
            }
 
        });
        */
    }
   
   //                    return p1.compareTo(p1);

     public void ordenarArrayListNombrePregunta(){
        Collections.sort(preguntas, new Comparator<Preguntas>(){
            public int compare(Preguntas p1, Preguntas p2) {
                return p1.getPregunta().compareTo(p2.getPregunta()); 
            }
    
        });
    }
    
   
    
   public void comodin(PanelJuego panel){
       this.panelJuego=panel;
       
       Random rnd = new Random();

             do{
               
                numeroAleatorio1 = rnd.nextInt(4);
                numeroAleatorio2 = rnd.nextInt(4);
               
            }while(numeroAleatorio1==numeroAleatorio2|| this.getArrayPreguntas().get(this.getArray15Preguntas()[panel.getContadorPreguntas()]).getRespuesta()[numeroAleatorio2].equalsIgnoreCase(this.getArrayPreguntas().get(this.getArray15Preguntas()[panel.getContadorPreguntas()]).getRespuestaAcertada()) || this.getArrayPreguntas().get(this.getArray15Preguntas()[panel.getContadorPreguntas()]).getRespuesta()[numeroAleatorio1].equalsIgnoreCase(this.getArrayPreguntas().get(this.getArray15Preguntas()[panel.getContadorPreguntas()]).getRespuestaAcertada()));
        
               
        switch (numeroAleatorio1) {
            case 0:
                panel.getRespuesta1().setVisible(false);
                break;
            case 1:
                panel.getRespuesta2().setVisible(false);
                break;
            case 2:
                panel.getRespuesta3().setVisible(false);
                break;
            case 3:
                panel.getRespuesta4().setVisible(false);
                break;
            default:
                break;
        }
           
        switch (numeroAleatorio2) {
            case 0:
                panel.getRespuesta1().setVisible(false);
                break;
            case 1:
                panel.getRespuesta2().setVisible(false);
                break;
            case 2:
                panel.getRespuesta3().setVisible(false);
                break;
            case 3:
                panel.getRespuesta4().setVisible(false);
                break;
            default:
                break;
        }
   
   }

    
    public void cargarPregunta(PanelJuego panel,JLabel numeroPregunta,JLabel pregunta,JRadioButton respuesta1,JRadioButton respuesta2,JRadioButton respuesta3,JRadioButton respuesta4,int contadorPregunta){
    
            this.panelJuego=panel;

            if(contadorPregunta<5){
            
                pregunta.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getPregunta());
                respuesta1.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[0]);
                respuesta2.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[1]);
                respuesta3.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[2]);
                respuesta4.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[3]);

                contadorPreguntasArray15++;
            
      
            }else if(contadorPregunta>4&&contadorPregunta<10){
                
                
                pregunta.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getPregunta());
                respuesta1.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[0]);
                respuesta2.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[1]);
                respuesta3.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[2]);
                respuesta4.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[3]);

                contadorPreguntasArray15++;
                    
            }else if(contadorPregunta>9&&contadorPregunta<15){
                
                
                pregunta.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getPregunta());
                respuesta1.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[0]);
                respuesta2.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[1]);
                respuesta3.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[2]);
                respuesta4.setText(preguntas.get(arrayPreguntas[contadorPreguntasArray15]).getRespuesta()[3]);

                contadorPreguntasArray15++;
            
            }else{
                
                panelJuego.cambiarContadorPreguntas(0);
                
                ventana.getBarraMenu().setVisible(true);

                
                PanelVictoria panelVictoria = new PanelVictoria(ventana);
                ventana.getGestionPreguntas().cambiarPanel(ventana, panelVictoria);
                
            }
            
            numeroPregunta.setText("PREGUNTA "+(contadorPregunta+1));

            
            
            
        
        
    }
    
    public void desactivarComodines(){
        
        
    }
    
    public void setNumeroComodines(int numero){
        numeroComodines=numero;
    }
    
    public int getNumeroComodines(){
        return numeroComodines;
    }
    
    public void setNombreUsuario(String nombre){
        this.nombreUsuario=nombre;
    }
    
    public String getNombreUsuario(){
        return nombreUsuario;
    }
    
    public int getDineroGanado(){
        return dineroGanado;
    }
    
    public void setDineroGanado(int dinero){
        this.dineroGanado=dinero;
    }
    
    public void cambiarImagen(JLabel label,String imagen){
        URL url=this.getClass().getResource("/imagenes/"+imagen);
        Image img;
        
         try {
            img = ImageIO.read(url); //leemos la imagen
            label.setIcon(new ImageIcon(img));

        } catch (IOException ex) {
            Logger.getLogger(GestionPreguntas.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void setContadorPreguntasNivel(int contador){
        this.contadorPreguntasPorNivel=contador;
    }
    
    public void setNumeroPreguntasArray1(int preguntas){
        this.numeroPreguntasNivel1=preguntas;
     }
     public void setNumeroPreguntasArray2(int preguntas){
         this.numeroPreguntasNivel2=preguntas;
     }
     public void setNumeroPreguntasArray3(int preguntas){
            this.numeroPreguntasNivel3=preguntas;
        }
     
     public void setContadorPreguntasArray15(int contador){
         this.contadorPreguntasArray15=contador;
     }
     
    public void setSonidoApagado(boolean sonido){
        this.sonidoApagado=sonido;
    }
    
    public boolean getSonidoApagado(){
        return sonidoApagado;
    }
    
    public AudioClip getAudioJuego(){
        return panelJuego.getAudioClip();
    }
    
    public void setJuegoIniciado(boolean ini){
        this.juegoIniciado=ini;
    }
    
    public boolean getJuegoIniciado(){
        return juegoIniciado;
    }
    
    public Color getColor(){
        return color;
    }
    
    public void setColor(Color color){
        this.color=color;
    }
    
    public void borrarArrayListPreguntasPorNivel(){
         arrayPreguntasNivel1().clear();
         arrayPreguntasNivel2().clear();
         arrayPreguntasNivel3().clear();
    }
   
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
