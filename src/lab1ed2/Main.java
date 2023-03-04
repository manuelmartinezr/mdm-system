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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    public static int devolverN(NodoCat root, int a)
    {
        if (root == null) return 0;
        a++;
        for(NodoCat node : root.getHijos())
        {
            a = devolverN(node, a);
        }
        return a;
    }
    public static int devolverHojas(NodoCat root, int a)
    {
        if (root == null) return 0;
        if (root.getHijos().isEmpty())
        {
            a++;
        } else {
            for (NodoCat node : root.getHijos())
            {
                a = devolverHojas(node, a);
            }
        }
        return a;
    }
}
