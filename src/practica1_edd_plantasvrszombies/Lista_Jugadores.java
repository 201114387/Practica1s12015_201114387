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
public class Lista_Jugadores {
    
    class Nodo{
        
        String Data;
        Nodo next;
        Sub_Lista_Jugador sub;
        
        public Nodo(String nombre){
            Data = nombre;
            next = null;
            sub = new Sub_Lista_Jugador();
        }
//        
//        
//        public Nodo(String nombre, Nodo n) {
//            Data = nombre;
//            next = n;
//        }

        public String getData() {
            return Data;
        }

        public void setData(String Data) {
            this.Data = Data;
        }

        public Nodo getNext() {
            return next;
        }

        public void setNext(Nodo next) {
            this.next = next;
        }
                
    }
    
    Nodo FirstNode;
    Nodo LastNodo;
    Nodo aux;

    public Lista_Jugadores() {
        FirstNode = null;
        LastNodo = null;
        aux = null;
    }
    
    public void InsertAtBack(String Name)
    {
        if(FirstNode == null)
        {
            FirstNode = LastNodo = new Nodo(Name);
        }
        else{
            LastNodo = LastNodo.next = new Nodo(Name);
        }
    }
    
    public void Buscar(String Name, Nodo n){
        while(n != null){
            if(n.Data == Name){
                aux = n;
            }
            n = n.next;
        }
    }
}
