/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1ed2;

import javax.swing.JFrame;

/**
 *
 * @author manuel
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyForm extends JFrame {
    private JPanel originalPanel;
    NodoCat rootClientes;
    NodoCat rootProductos;

    public MyForm(NodoCat rootClientes, NodoCat rootProductos) {
        
        
        super("My Form");
        this.rootClientes = rootClientes;
        this.rootProductos = rootProductos;
        setSize(500, 500);

        originalPanel = new JPanel();
        originalPanel.setLayout(new GridLayout(3, 1));

        JButton firstWindowButton = new JButton("Open First Window");
        firstWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFirstWindow();
            }
        });

        JButton secondWindowButton = new JButton("Open Second Window");
        secondWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openSecondWindow();
            }
        });

        originalPanel.add(new JLabel("This is the original window."));
        originalPanel.add(firstWindowButton);
        originalPanel.add(secondWindowButton);

        add(originalPanel);
        setVisible(true);
    }
    private void openFirstWindow()
    {
        JFrame frame = new JFrame("N-ary Tree");
        frame.setSize(400, 400);
        NaryTreePanel treePanel = new NaryTreePanel(rootClientes);
        frame.add(treePanel);
        // Set the size and visibility of the frame
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    private void openSecondWindow() {
        JFrame frame = new JFrame("N-ary Tree");
        frame.setSize(400, 400);
        NaryTreePanel treePanel = new NaryTreePanel(rootProductos);
        frame.add(treePanel);
        // Set the size and visibility of the frame
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        NodoCat rootC = new NodoCat("A");
        NodoCat b = new NodoCat("B");
        NodoCat c = new NodoCat("C");
        NodoCat d = new NodoCat("D");
        NodoCat e = new NodoCat("E");
        NodoCat f = new NodoCat("F");
        NodoCat g = new NodoCat("G");
        
            // Add children to node B
    rootC.addHijo(b);
    b.addHijo(e);
    b.addHijo(f);

    // Add children to node C
    c.addHijo(g);

    // Add children to node D

    NodoCat rootP = new NodoCat("P");
        NodoCat bb = new NodoCat("R");
        NodoCat cc = new NodoCat("O");
        NodoCat dd = new NodoCat("D");
        NodoCat ee = new NodoCat("U");
        NodoCat ff = new NodoCat("F");
        NodoCat gg = new NodoCat("G");
        
        rootP.addHijo(bb);
        bb.addHijo(ee);
        bb.addHijo(ff);
    // Create a JFrame and add the tree panel to it
    new MyForm(rootC, rootP);
    }
}

