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
    ListaItems listaClientes;
    ListaItems ListaClientes = new ListaItems();
    ListaItems ListaProductos = new ListaItems();

    public MyForm(NodoCat rootClientes, NodoCat rootProductos) {
        
        
        super("My Form");
        this.rootClientes = rootClientes;
        this.rootProductos = rootProductos;
        setSize(500, 500);

        originalPanel = new JPanel();
        originalPanel.setLayout(new GridLayout(3, 1));

        JButton firstWindowButton = new JButton("Arbrir árbol de clientes");
        firstWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openFirstWindow();
            }
        });

        JButton secondWindowButton = new JButton("Abrir árbol de productos");
        secondWindowButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                openSecondWindow();
            }
        });

        originalPanel.add(new JLabel("BIENVENIDO JEF@"));
        originalPanel.add(firstWindowButton);
        originalPanel.add(secondWindowButton);

        add(originalPanel);
        setVisible(true);
    }
    private void openFirstWindow()
    {
        JFrame frame = new JFrame("Árbol de clientes");
        frame.setSize(400, 400);
        NaryTreePanel treePanel = new NaryTreePanel(rootClientes);
        JButton createButton = new JButton("Crear cliente");
        createButton.addActionListener(e -> createCliente());
        treePanel.setLayout(null);
        createButton.setBounds(300, 100, 100, 40);
        treePanel.add(createButton);
        frame.add(treePanel);
        // Set the size and visibility of the frame
        frame.setSize(400, 400);
        frame.setVisible(true);
    }

    private void openSecondWindow() {
        JFrame frame = new JFrame("Árbol de productos");
        frame.setSize(400, 400);
        NaryTreePanel treePanel = new NaryTreePanel(rootProductos);
        JButton createButton = new JButton("Crear producto");
        createButton.addActionListener(e -> createProducto());
        treePanel.setLayout(null);
        createButton.setBounds(300, 100, 100, 40);
        treePanel.add(createButton);
        frame.add(treePanel);
        // Set the size and visibility of the frame
        frame.setSize(400, 400);
        frame.setVisible(true);
    }
    private void createProducto(){
        String [] stringInputs = new String[7];
        JFrame inputFrame = new JFrame("Input");
        inputFrame.setSize(500, 400);
        inputFrame.setLayout(new GridLayout(18, 1));
        JLabel[] stringLabels = new JLabel[7];
        JTextField[] stringFields = new JTextField[7];
        stringLabels[0] = new JLabel("ID");
        stringLabels[1] = new JLabel("ID CAT");
        stringLabels[2] = new JLabel("NOMBRE");
        stringLabels[3] = new JLabel("APELLIDO");
        stringLabels[4] = new JLabel("EDAD");
        stringLabels[5] = new JLabel("CUMPLEAÑOS");
        stringLabels[6] = new JLabel("GENERO");
        for (int i = 0; i < 7; i++) {
            
            stringFields[i] = new JTextField(20);
            inputFrame.add(stringLabels[i]);
            inputFrame.add(stringFields[i]);
        }
        JButton acceptButton = new JButton("Accept");
        acceptButton.addActionListener(e -> {
            for (int i = 0; i < 7; i++) {
                stringInputs[i] = stringFields[i].getText();
            }
            
            inputFrame.dispose();
            
        });
        inputFrame.add(acceptButton);
        inputFrame.setVisible(true);
    }
    private void createCliente() {
        String [] stringInputs = new String[14];
        Boolean [] booleanInputs = new Boolean[4];
        JFrame inputFrame = new JFrame("Input");
        inputFrame.setSize(500, 400);
        inputFrame.setLayout(new GridLayout(18, 1));
        JLabel[] stringLabels = new JLabel[14];
        JTextField[] stringFields = new JTextField[14];
        JLabel[] booleanLabels = new JLabel[4];
        JCheckBox[] booleanBoxes = new JCheckBox[4];
        stringLabels[0] = new JLabel("ID");
        stringLabels[1] = new JLabel("ID CAT");
        stringLabels[2] = new JLabel("NOMBRE");
        stringLabels[3] = new JLabel("APELLIDO");
        stringLabels[4] = new JLabel("EDAD");
        stringLabels[5] = new JLabel("CUMPLEAÑOS");
        stringLabels[6] = new JLabel("GENERO");
        stringLabels[7] = new JLabel("ESTADO CIVIL");
        stringLabels[8] = new JLabel("TELEFONO");
        stringLabels[9] = new JLabel("CELULAR");
        stringLabels[10] = new JLabel("EMAIL");
        stringLabels[11] = new JLabel("NIVEL EDUCATIVO");
        stringLabels[12] = new JLabel("RANGO DE INGRESOS");
        stringLabels[13] = new JLabel("DIRECCION");
        for (int i = 0; i < 14; i++) {
            
            stringFields[i] = new JTextField(20);
            inputFrame.add(stringLabels[i]);
            inputFrame.add(stringFields[i]);
        }
        booleanLabels[0] = new JLabel("CONTACTO POR EMAIL ");
        booleanLabels[1] = new JLabel("CONTACTO POR TEL");
        booleanLabels[2] = new JLabel("CONTACTO POR SMS");
        booleanLabels[3] = new JLabel("CONTACTO POR CORREO");
        
        for (int i = 0; i < 4; i++) {
            booleanBoxes[i] = new JCheckBox();
            inputFrame.add(booleanLabels[i]);
            inputFrame.add(booleanBoxes[i]);
        }
        JButton acceptButton = new JButton("Accept");
        acceptButton.addActionListener(e -> {
            for (int i = 0; i < 14; i++) {
                stringInputs[i] = stringFields[i].getText();
            }
            for (int i = 0; i < 4; i++) {
                booleanInputs[i] = booleanBoxes[i].isSelected();
            }
            Cliente newCliente = new Cliente();
//            newCliente.setId(stringInputs[0]);
//            newCliente.setIdCat(stringInputs[1]);
//            newCliente.setNombre(stringInputs[2]);
//            newCliente.setApellido(stringInputs[3]);
//            newCliente.setEdad(stringInputs[4]);
//            newCliente.setCum(stringInputs[5]);
//            newCliente.setGenero(stringInputs[6]);
//            newCliente.setEstadoCivil(stringInputs[7]);
//            newCliente.setTel(stringInputs[8]);
//            newCliente.setCel(stringInputs[9]);
//            newCliente.setEmail(stringInputs[10]);
//            newCliente.setNivelEd(stringInputs[11]);
//            newCliente.setRangoIngresos(stringInputs[12]);
//            newCliente.setDir(stringInputs[13]);
//            newCliente.setContactoEmail(booleanInputs[0]);
//            newCliente.setContactoTel(booleanInputs[1]);
//            newCliente.setContactoSMS(booleanInputs[2]);
//            newCliente.setContactoCorreo(booleanInputs[3]);
            listaClientes.add(newCliente);
            inputFrame.dispose();
        });
        inputFrame.add(acceptButton);
        inputFrame.setVisible(true);
    }

    public static void main(String[] args) {
        NodoCat rootC = new NodoCat("A");
        NodoCat b = new NodoCat("B");
        NodoCat c = new NodoCat("C");
        NodoCat d = new NodoCat("D");
        NodoCat e = new NodoCat("E");
        NodoCat f = new NodoCat("F");
        NodoCat g = new NodoCat("G");
        
    rootC.addHijo(b);
    b.addHijo(e);
    b.addHijo(f);



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
    // JFrame with el panel del arbol
    new MyForm(rootC, rootP);
    }
}

