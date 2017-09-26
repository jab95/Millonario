
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author AYALA
 */
public class Contador{
   
   Timer timer;
    TimerTask task;
    int contador;
    JLabel reloj;
    VentanaPrincipal ventana;
    public Contador(JLabel reloj, int contador, VentanaPrincipal ventana)
    {
        this.reloj=reloj;
        this.ventana=ventana;
        timer= new Timer();
        this.contador=contador;
        //La tarea
        crearTask();
    }
    
    public void restartReloj()
    {
        restartReloj(reloj);
    }
    
    private void restartReloj(JLabel reloj)
    {
        task.cancel();
        crearTask();
    }
    
    public void reloadReloj()
    {
        reloadReloj(reloj);
    }
    
    private void reloadReloj(JLabel reloj)
    {
        contador=30;
        task.cancel();
        crearTask();
    }

    public void pararReloj()
    {
        pararReloj(reloj);
    }
    
    private void pararReloj(JLabel reloj)
    {
        task.cancel();
        task = new TimerTask(){
            @Override
            public void run() 
            {
                reloj.setText(""+contador);
            }
            
        };
        timer.schedule(task, 0);
    }
    
    public int getContador() {
        return contador;
    }
    
    private TimerTask crearTask()
    {
        task = new TimerTask(){
            @Override
            public void run() 
            {
                if (contador > 0){
                    reloj.setText(""+contador);
                    contador--; 
                }
                else if(contador==0){
                       
                        JOptionPane.showMessageDialog(null, "¡Se acabó el tiempo!", "Tiempo agotado", JOptionPane.WARNING_MESSAGE);
                        ventana.getGestionPreguntas().getAudioJuego().stop();
                        
                        ventana.getGestionPreguntas().resetearTodosContadores();

                        ventana.getBarraMenu().setVisible(true);
                        PanelImagenJFrame panel2 = new PanelImagenJFrame(ventana);
                        ventana.getGestionPreguntas().cambiarPanel(ventana, panel2);

                        ventana.validate();
                        timer.cancel();
                }
                else{
                    task.cancel();
                }
            }
        };
        timer.schedule(task, 0, 1000);
        return task;
    }
            
}
