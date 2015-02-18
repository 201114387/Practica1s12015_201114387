/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd_plantasvrszombies;

import java.io.File;

/**
 *
 * @author ROBIN
 */
public class Lista_Plantas_Zombies {
    
    class Nodo_PZ{
        String Archivo;
        String Name;
        int Cantidad_Ataque;
        int Cantidad_Defensa;
        String Tipo_Ataque;
        
        Nodo_PZ next;
        
        public Nodo_PZ(String file,String dato,int CA, int CD, String TA){
            Archivo = file;
            Name = dato;
            Cantidad_Ataque = CA;
            Cantidad_Defensa = CD;
            Tipo_Ataque = TA;
            next = null;
        }
        
        public Nodo_PZ(String file, String dato, int CA, int CD, String TA, Nodo_PZ n){
            Archivo = file;
            Name = dato;
            Cantidad_Ataque = CA;
            Cantidad_Defensa = CD;
            Tipo_Ataque = TA;
            next = n;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public int getCantidad_Ataque() {
            return Cantidad_Ataque;
        }

        public void setCantidad_Ataque(int Cantidad_Ataque) {
            this.Cantidad_Ataque = Cantidad_Ataque;
        }

        public int getCantidad_Defensa() {
            return Cantidad_Defensa;
        }

        public void setCantidad_Defensa(int Cantidad_Defensa) {
            this.Cantidad_Defensa = Cantidad_Defensa;
        }

        public String getTipo_Ataque() {
            return Tipo_Ataque;
        }

        public void setTipo_Ataque(String Tipo_Ataque) {
            this.Tipo_Ataque = Tipo_Ataque;
        }

        public Nodo_PZ getNext() {
            return next;
        }

        public void setNext(Nodo_PZ next) {
            this.next = next;
        }

        
        
        
    }
    
    Nodo_PZ FirsNod;
    Nodo_PZ LastNod;
    Nodo_PZ auxiliar;

    public Lista_Plantas_Zombies() {
        FirsNod = null;
        LastNod = null;
        auxiliar = null;
    }
    
    public void InsertAtBack(String file, String dato,int CA, int CD, String TA)
    {
        if(FirsNod == null){
            FirsNod = LastNod = new Nodo_PZ(file, dato, CA, CD, TA);
        }else{
            LastNod = LastNod.next = new Nodo_PZ(file, dato, CA, CD, TA);
        }
    }
    
    public void InsertAtFront(String file, String dato, int CA, int CD, String TA){
        if(FirsNod == null){
            FirsNod = LastNod = new Nodo_PZ(file, dato, CA, CD, TA);
        }else{
            FirsNod = new Nodo_PZ(file, dato, CA, CD, TA, FirsNod);
        }
    }
    
    
    
}
