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
public class ListaItems {
    // va a crear dos listas una para los productos y otra para los clientes
    private ArrayList<Item> lista;
    
    public ListaItems(){
        this.lista = new ArrayList<Item>();
    }
    
    public Item buscar(String id)
    {
        // buscar producto o cliente
        for(Item item : lista)
        {
            if (item.getId().equals(id)) return item;
        }
        return null;
    }
    
    public void getItemsInCat(String idCat) //*****
    {
        // Dado un identificador de categoría de producto, indicar cuantos y cuales productos pertenecen a la misma
        // este indica cuales
        for(Item item : lista)
        {
            if (item.getIdCat().equals(idCat))
            {
                System.out.println(item.getNombre() + " - " + item.getId());
            }
        }
    }
    
    public int countItemsInCat(String idCat) //** tal vez crear funcion que llame a esta y la de arriba
    {
        // Dado un identificador de categoría de producto, indicar cuantos y cuales productos pertenecen a la misma
        // este indica cuantos
        int a = 0;
        for(Item item : lista)
        {
            if (item.getIdCat().equals(idCat)) a++;
        }
        return a;
    }
    
    // añadir un cliente a la lista de clientes 
    // añadir un producto a la lista de productos
    
    public boolean add(Item newItem)
    {
        if (!lista.isEmpty()){
         for(Item item : lista)
            {
            if (newItem.getId().equals(item.getId())) return false;
            // si un cliente/producto ya presente en la lista tiene el mismo ID no se debería dejar añadir
            }
        }
        lista.add(newItem);
        return true;
    }
}
