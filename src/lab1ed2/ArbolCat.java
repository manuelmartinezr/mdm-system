/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1ed2;

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
    
}
