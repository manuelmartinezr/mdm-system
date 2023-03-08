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
public class Item {
    
    String id, idCat, nombre;
        
    public String getIdCat() {
        return idCat;
    }
    // Asignar producto/cliente a la clasificación deseada
    public void setIdCat(String idCat) {
        this.idCat = idCat;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
