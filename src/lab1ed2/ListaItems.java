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
    private ArrayList<Item> lista;
    
    public ListaItems(){
        this.lista = new ArrayList<Item>();
    }
    
    public Item buscar(String id)
    {
        for(Item item : lista)
        {
            if (item.getId().equals(id)) return item;
        }
        return null;
    }
    
    public void getItemsInCat(String idCat) //*****
    {
        
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
        int a = 0;
        for(Item item : lista)
        {
            if (item.getIdCat().equals(idCat)) a++;
        }
        return a;
    }
    
    public boolean add(Item newItem)
    {
        for(Item item : lista)
        {
            if (newItem.getId().equals(item.getId())) return false;
        }
        return true;
    }
}
