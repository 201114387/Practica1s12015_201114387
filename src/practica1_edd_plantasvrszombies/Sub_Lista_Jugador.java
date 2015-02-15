/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1_edd_plantasvrszombies;

/**
 *
 * @author ROBIN
 */
public class Sub_Lista_Jugador {
    
    class Nodo_jugador{
        String Name;
        Nodo_jugador next;
        
        public Nodo_jugador(String dato){
            Name = dato;
            next = null;
        }

        public String getName() {
            return Name;
        }

        public void setName(String Name) {
            this.Name = Name;
        }

        public Nodo_jugador getNext() {
            return next;
        }

        public void setNext(Nodo_jugador next) {
            this.next = next;
        }
        
        
        
    }
    
    Nodo_jugador FirsNod;
    Nodo_jugador LastNod;
    Nodo_jugador auxiliar;

    public Sub_Lista_Jugador() {
        FirsNod = null;
        LastNod = null;
        auxiliar = null;
    }
    
    public void InsertArBack(String dato)
    {
        if(FirsNod == null){
            FirsNod = LastNod = new Nodo_jugador(dato);
        }else{
            LastNod = LastNod.next = new Nodo_jugador(dato);
        }
    }
    
}
