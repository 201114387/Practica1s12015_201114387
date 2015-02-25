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
public class Pilas_Colas {
    
    class Nodo_PC{
        String path;
        int CantAtac;
        int CantDefen;
        int TipoAtac;
        Nodo_PC next;
        Nodo_PC anterior;

        public Nodo_PC(String direc, int CA, int CD, int TA) {
            path = direc;
            CantAtac = CA;
            CantDefen = CD;
            TipoAtac = TA;
            next = null;
            anterior = null;
        }
        
        public Nodo_PC(String direc, int CA, int CD, int TA, Nodo_PC sig, Nodo_PC ant){
            path = direc;
            CantAtac = CA;
            CantDefen = CD;
            TipoAtac = TA;
            next = sig;
            anterior = ant;
        }
        
    }
    
    Nodo_PC Cabeza;
    Nodo_PC Fin;
    Nodo_PC AuxPila;
    Nodo_PC AuxCola;
    
    public Pilas_Colas(){
        Cabeza = null;
        Fin = null;
        AuxPila = null;
        AuxCola = null;
    }
    
    public void Push_PC(String path, int CA, int CD, int TA){
        if(Cabeza == null){
            Cabeza = Fin =  new Nodo_PC(path, CA, CD, TA);
        }else{
            Fin = new Nodo_PC(path, CA, CD, TA, Fin,null);
        }
    }
    
    public Nodo_PC Pop_Pila(){
        if(Fin == null){
            return null;
        }else{
            AuxPila = Fin;
            Fin = Fin.next;
            return AuxPila;
        }
    }
    
    public Nodo_PC Pop_Cola(){
        if(Cabeza == null){
            return null;
        }else{
            AuxCola = Cabeza;
            Cabeza = Cabeza.anterior;
            return AuxCola;
        }
    }
}
