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

    public MyForm() {
        super("My Form");
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

    private void openFirstWindow() {
        JFrame firstWindow = new JFrame("First Window");
        firstWindow.setSize(300, 300);

        JButton backButton = new JButton("Back to Original Window");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                firstWindow.dispose();
                setVisible(true);
            }
        });

        JPanel firstWindowPanel = new JPanel();
        firstWindowPanel.setLayout(new GridLayout(2, 1));
        firstWindowPanel.add(new JLabel("This is the first new window."));
        firstWindowPanel.add(backButton);

        firstWindow.add(firstWindowPanel);
        firstWindow.setVisible(true);
    }

    private void openSecondWindow() {
        JFrame secondWindow = new JFrame("Second Window");
        secondWindow.setSize(300, 300);

        JButton backButton = new JButton("Back to Original Window");
        backButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                secondWindow.dispose();
                setVisible(true);
            }
        });

        JPanel secondWindowPanel = new JPanel();
        secondWindowPanel.setLayout(new GridLayout(2, 1));
        secondWindowPanel.add(new JLabel("This is the second new window."));
        secondWindowPanel.add(backButton);

        secondWindow.add(secondWindowPanel);
        secondWindow.setVisible(true);
    }

    public static void main(String[] args) {
        new MyForm();
    }
}

