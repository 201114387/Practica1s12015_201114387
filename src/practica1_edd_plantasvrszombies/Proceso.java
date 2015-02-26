/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd_plantasvrszombies;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;

/**
 *
 * @author ROBIN
 */
public class Proceso extends Thread{
    
    private boolean Vida;
    private int orden;
    private int progreso;
    JLabel b;
    int contador;

    public Proceso(JLabel a, int c) {
        b=a;
        contador = c;
        this.Vida = true;
        this.progreso=0;
    }
    
    public void Muerte_Hilo(){
        this.Vida=false;
    }
    
    public void cmd(int in){
        this.orden = in;
    }
    
    public void run(){
        while(Vida){
            if(orden ==1){
                b.setVisible(false); 
                System.out.println("Iniciando Hilo");
                this.progreso++;
                System.out.println(progreso);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Proceso.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(this.progreso==100){
                contador--;
                if(contador != 0)
                {
                    
                }
                Vida = false;
                b.setVisible(true); 
                System.out.println("hilo terminado");
            }
        }
    }
    
}
