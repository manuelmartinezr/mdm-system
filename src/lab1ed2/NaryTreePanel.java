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
import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NaryTreePanel extends JPanel {

    private int radius = 20;
    private int padding = 20;
    private NodoCat root;

    public NaryTreePanel(NodoCat root) {
        ArbolCat tree = new ArbolCat(root);
        this.root = root;
        JButton addNodeButton = new JButton("Add Node");
        addNodeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String parentName = JOptionPane.showInputDialog("Enter the name of the parent node:");
                String newNodeName = JOptionPane.showInputDialog("Enter the name of the new node:");
                String newNodeId = JOptionPane.showInputDialog("Enter an ID for the new node:");

                NodoCat padre = tree.buscar(root, parentName);
                
                if (padre!= null)
                {
                    NodoCat newNode = new NodoCat();
                    newNode.setNombre(newNodeName);
                    newNode.setId(newNodeId);
                    tree.insertar(padre, newNode);
                }
            }
        });
        JButton getRutaButton = new JButton("Ruta de categoría");
        getRutaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nodeRuta = JOptionPane.showInputDialog("Inserta el nombre del nodo");
                
                NodoCat r = tree.buscar(root, nodeRuta);
                if (r==null)
                {
                    JOptionPane.showMessageDialog(null, "Nombre no encontrado");
                }else{
                    JOptionPane.showMessageDialog(null, tree.printRuta(nodeRuta));
                };
                
                
            }
        });

        // Add the button to the panel
        setLayout(null);
        addNodeButton.setBounds(300, 300, 100, 40);
        getRutaButton.setBounds(300, 200, 100, 40);
        add(getRutaButton);
        add(addNodeButton);
    }


@Override
        public void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (root == null) {
            return;
        }

        int width = getWidth();
        int height = getHeight();
        int startX = width / 2;
        int startY = padding;

        // Draw the root node
        drawNode(g, root, startX, startY);

        // Draw the children nodes
        int numOfChildren = root.getHijos().size();
        if (numOfChildren > 0) {
            int startChildX = startX - (numOfChildren - 1) * radius;
            int startChildY = startY + 2 * radius;
            for (int i = 0; i < numOfChildren; i++) {
                NodoCat child = root.getHijos().get(i);
                int childX = startChildX + i * 2 * radius;
                int childY = startChildY;
                drawNode(g, child, childX, childY);
                drawEdge(g, startX, startY + radius, childX, childY - radius);
                drawSubtree(g, child, childX, childY);
            }
        }
    }

    private void drawNode(Graphics g, NodoCat node, int x, int y) {
        g.setColor(Color.WHITE);
        g.fillOval(x - radius, y - radius, 2 * radius, 2 * radius);
        g.setColor(Color.BLACK);
        g.drawOval(x - radius, y - radius, 2 * radius, 2 * radius);
        g.drawString(node.getNombre(), x - radius / 2, y);
    }

    private void drawEdge(Graphics g, int startX, int startY, int endX, int endY) {
        g.setColor(Color.BLACK);
        g.drawLine(startX, startY, endX, endY);
    }

    private void drawSubtree(Graphics g, NodoCat node, int x, int y) {
        int numOfChildren = node.getHijos().size();
        if (numOfChildren > 0) {
            int startChildX = x - (numOfChildren - 1) * radius;
            int startChildY = y + 2 * radius;
            for (int i = 0; i < numOfChildren; i++) {
                NodoCat child = node.getHijos().get(i);
                int childX = startChildX + i * 2 * radius;
                int childY = startChildY;
                drawNode(g, child, childX, childY);
                drawEdge(g, x, y + radius, childX, childY - radius);
                drawSubtree(g, child, childX, childY);
            }
        }
    }
    public static void main(String[] args) {
        NodoCat root = new NodoCat("A");
        NodoCat b = new NodoCat("B");
        NodoCat c = new NodoCat("C");
        NodoCat d = new NodoCat("D");
        NodoCat e = new NodoCat("E");
        NodoCat f = new NodoCat("F");
        NodoCat g = new NodoCat("G");
        
    root.addHijo(b);
    b.addHijo(e);
    b.addHijo(f);

    c.addHijo(g);


    // Create a JFrame and add the tree panel to it
    JFrame frame = new JFrame("N-ary Tree");
    NaryTreePanel treePanel = new NaryTreePanel(root);
    frame.add(treePanel);

    // Set the size and visibility of the frame
    frame.setSize(400, 400);
    frame.setVisible(true);
}

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
