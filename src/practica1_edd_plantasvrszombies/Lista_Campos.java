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
public class Lista_Campos {
    
    class Nodo_Campo{
        String Campo;
        Nodo_Campo sig;

        public Nodo_Campo(String Data){
            Campo = Data;
            sig = null;
        }
        
        public Nodo_Campo(String Data, Nodo_Campo n){
            Campo = Data;
            sig = n;
        }
        
    }
    
    Nodo_Campo FirstNodo;
    Nodo_Campo LastNodo;

    public Lista_Campos() {
        FirstNodo = null;
        LastNodo = null;
    }
    
    public void InsertAtBack(String Data){
    
        if(FirstNodo == null){
            FirstNodo = LastNodo = new Nodo_Campo(Data);
        }else{
            LastNodo = LastNodo.sig = new Nodo_Campo(Data);
        }
    }
    
    
}
