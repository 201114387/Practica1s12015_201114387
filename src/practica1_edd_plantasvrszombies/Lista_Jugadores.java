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
        int Cantidad;
        Nodo next;
        
        public Nodo(String nombre,int cant){
            Data = nombre;
            Cantidad = cant;
            next = null;
        }
        
        public Nodo(String dato, int cant, Nodo n){
            Data = dato;
            Cantidad = cant;
            next = n;
        }
        
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
    
    public void InsertAtBack(String Name, int Cantidad)
    {
        if(FirstNode == null)
        {
            FirstNode = LastNodo = new Nodo(Name, Cantidad); 
        }
        else{
            LastNodo = LastNodo.next = new Nodo(Name, Cantidad);
        }
    }
    
    public void InsertAtFront(String dato, int Cantidad){
        if(FirstNode == null){
            FirstNode = LastNodo = new Nodo(dato, Cantidad);
        }else{
            FirstNode = new Nodo(dato, Cantidad, FirstNode);
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
