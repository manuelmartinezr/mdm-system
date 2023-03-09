/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1ed2;
import java.util.Stack;

/**
 *
 * @author manuel
 */
public class ArbolCat {
    
    private NodoCat root;
    
    public ArbolCat(NodoCat nodo){
        this.root = nodo;
    }
   
    public NodoCat getRoot()
    {
        return root;
    }
    
    public NodoCat buscar(NodoCat root, String nombre)
    {
         if (root == null) return null;
         
         if (root.getNombre().equals(nombre)) return root;
         
        NodoCat r = null;
        for(NodoCat node: root.getHijos())
        {
            r = buscar(node, nombre);
        }
        return r;
    }
    // se pide un padre al usuario
    public boolean insertar (NodoCat padre, NodoCat hijo)
    {   
        NodoCat r = null;
        r = buscar(padre, padre.getNombre());
        
        if (r != null)
                {
                    r.addHijo(hijo);
                    return true;
                }
        
        return false;
    }
    
    // Visualizar ruta de producto/cliente a partir de la categoría asociada
    public Stack getRuta(String idCat)
    {
        // devuelve la ruta como tal (es una pila)
        Stack<NodoCat> ruta = new Stack<NodoCat>();
        if (tieneRuta(this.root, ruta, idCat)) return ruta;
        return null;
    }
    
    //imprime la ruta 
    public String printRuta(String idCat)
    {
        Stack<NodoCat> ruta = getRuta(idCat);
        String writtenRuta = "";
        if (ruta!= null)
        {
            for (NodoCat nodo : ruta)
            {
                writtenRuta = writtenRuta + "->" + nodo.getNombre();
            }
        }
        return writtenRuta;
    }
    
    //algortimo q usa para encontrar la ruta
    private boolean tieneRuta(NodoCat root, Stack ruta, String idCat)
    {
        if (root == null) return false;
        
        ruta.push(root);
        
        if (root.getNombre().equals(idCat)) return true;
        
        for (NodoCat hijo : root.getHijos())
        {    
             if (tieneRuta(hijo, ruta, idCat)) return true;
        }
        ruta.pop();
        return false;
    }

}
