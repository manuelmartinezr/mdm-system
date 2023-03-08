/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1ed2;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class ArbolGUI {
    private JFrame frame;
    private JTree tree;
    private ArbolCat data;

    public ArbolGUI() {
        data = new ArbolCat(null);
        
        frame = new JFrame("Tree GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new BorderLayout());

        // Create the root node and set it as the tree's model
        DefaultMutableTreeNode rootNode = new DefaultMutableTreeNode();
        tree = new JTree(rootNode);
        panel.add(tree, BorderLayout.CENTER);

        // Create the add button and add an action listener to prompt for new node data
        JButton addButton = new JButton("Add");
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Prompt for new node data
                String data = promptForData("Enter node data:");
                if (data != null) {
                    // Add the new node to the tree and update the view
                    DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                    if (selectedNode == null) {
                        selectedNode = rootNode;
                    }
                    DefaultMutableTreeNode newNode = new DefaultMutableTreeNode(data);
                    selectedNode.add(newNode);
                    tree.updateUI();
                }
            }
        });
        panel.add(addButton, BorderLayout.NORTH);

        // Create the remove button and add an action listener to remove the selected node
        JButton removeButton = new JButton("Remove");
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Remove the selected node from the tree and update the view
                DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) tree.getLastSelectedPathComponent();
                if (selectedNode != null && selectedNode != rootNode) {
                    selectedNode.removeFromParent();
                    tree.updateUI();
                }
            }
        });
        panel.add(removeButton, BorderLayout.SOUTH);

        frame.add(panel);
        frame.pack();
        frame.setVisible(true);
    }

    private String promptForData(String message) {
        return JOptionPane.showInputDialog(frame, message);
    }
}
