/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1ed2;

import java.util.ArrayList;

/**
 *
 * @author manuel
 */
public class NodoCat {
    
    private String id ="";
    private String nombre ="";
    private ArrayList<NodoCat> hijos ;

    public NodoCat() {
        this.hijos = new ArrayList<NodoCat>();
    }
    public NodoCat(String nombre){
        this.hijos = new ArrayList<NodoCat>();
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<NodoCat> getHijos() {
        return hijos;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void addHijo(NodoCat nodo)
    {
        this.hijos.add(nodo);
    }
    public void delHijo()
    {
        
    }
}
