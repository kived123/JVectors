/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnjvectors;

import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

/**
 *
 * @author FED
 */
public class VectorsFrame {
    private final JTextField tfVAX;
    private final JTextField tfVAY;
    private final JTextField tfVAZ;

    private final JTextField tfVBX;
    private final JTextField tfVBY;
    private final JTextField tfVBZ;

    private final JTextField tfK1;
    private final JTextField tfK2;

    private final JButton btnOk;

    private final JTextArea taOut;


    public VectorsFrame(){
        JFrame.setDefaultLookAndFeelDecorated(true);

        Base logic = new Base();

        JPanel inputPanel = new JPanel();

        inputPanel.setLayout(new GridLayout(0,6,10,10));

        inputPanel.add(new JLabel("vA:"));
        inputPanel.add(new JLabel());
        inputPanel.add(new JLabel("vB:"));
        inputPanel.add(new JLabel());
        inputPanel.add(new JLabel());
        inputPanel.add(new JLabel());

        inputPanel.add(new JLabel("X:"));
        tfVAX = new JTextField(5);
        inputPanel.add(tfVAX);

        inputPanel.add(new JLabel("X:"));
        tfVBX = new JTextField(5);
        inputPanel.add(tfVBX);

        inputPanel.add(new JLabel("K1:"));
        tfK1 = new JTextField(5);
        inputPanel.add(tfK1);

        inputPanel.add(new JLabel("Y:"));
        tfVAY = new JTextField(5);
        inputPanel.add(tfVAY);

        inputPanel.add(new JLabel("Y:"));
        tfVBY = new JTextField(5);
        inputPanel.add(tfVBY);

        inputPanel.add(new JLabel("K2:"));
        tfK2 = new JTextField(5);
        inputPanel.add(tfK2);

        inputPanel.add(new JLabel("Z:"));
        tfVAZ = new JTextField(5);
        inputPanel.add(tfVAZ);

        inputPanel.add(new JLabel("Z:"));
        tfVBZ = new JTextField(5);
        inputPanel.add(tfVBZ);


        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setBorder(new EmptyBorder(15,15,15,15));
        mainPanel.add(inputPanel);

        mainPanel.add(Box.createRigidArea(new Dimension(0,10)));

        btnOk = new JButton("Ok");
        btnOk.addActionListener(logic);

        mainPanel.add(btnOk);

        mainPanel.add(Box.createRigidArea(new Dimension(0,10)));

        taOut = new JTextArea(5,20);
        mainPanel.add(new JScrollPane(taOut));


        logic.set(tfVAX, tfVAY, tfVAZ,
                tfVBX, tfVBY, tfVBZ,
                tfK1, tfK2, taOut);



        JFrame frm = new JFrame("Vectors");
        frm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frm.add(mainPanel);
        frm.pack();




        frm.setVisible(true);



    }





}