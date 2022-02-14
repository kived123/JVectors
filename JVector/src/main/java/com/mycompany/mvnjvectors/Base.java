/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnjvectors;


import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextArea;
import javax.swing.JTextField;
/**
 *
 * @author FED
 */
public class Base implements ActionListener  {

    private  JTextField tfVAX;
    private  JTextField tfVAY;
    private  JTextField tfVAZ;

    private  JTextField tfVBX;
    private  JTextField tfVBY;
    private  JTextField tfVBZ;

    private  JTextField tfK1;
    private  JTextField tfK2;



    private JTextArea taOut;

    public void set(JTextField tfVAX, JTextField tfVAY, JTextField tfVAZ,
                    JTextField tfVBX, JTextField tfVBY, JTextField tfVBZ,
                    JTextField tfK1, JTextField tfK2,
                    JTextArea textArea)  {
        this.tfVAX = tfVAX;
        this.tfVAY = tfVAY;
        this.tfVAZ = tfVAZ;

        this.tfVBX = tfVBX;
        this.tfVBY = tfVBY;
        this.tfVBZ = tfVBZ;

        this.tfK1 = tfK1;
        this.tfK2 = tfK1;

        taOut = textArea;


    }


    public void actionPerformed(ActionEvent e) {
        taOut.setText("");

        float k1 = Float.valueOf(tfK1.getText());
        float k2 = Float.valueOf(tfK2.getText());

        float x = Float.valueOf(tfVAX.getText());
        float y = Float.valueOf(tfVAY.getText());
        float z = Float.valueOf(tfVAZ.getText());

        Vec3 vA = new Vec3(x,y,z);

        x = Float.valueOf(tfVBX.getText());
        y = Float.valueOf(tfVBY.getText());
        z=  Float.valueOf(tfVBZ.getText());


        Vec3 vB = new Vec3(x,y,z);
        Vec3 vRes = new Vec3();

        writeLn("vA = ");
        writeLn(vA);

        writeLn("vA * k1 = ");
        vRes.scalMult(vA, k1);
        writeLn(vRes);

        writeLn("Len(vA) = ");
        writeLn(String.valueOf(vA.len()));

        writeLn("vB = ");
        writeLn(vB);
        writeLn("vB * k2");
        vRes.scalMult(vB, k2);
        writeLn(vRes);
        writeLn("Len(vB)=");
        writeLn(String.valueOf(vB.len()));

        writeLn("vA + vB =");
        vRes.add(vA, vB);
        writeLn(vRes);
    }

    private void writeLn(String line){
        taOut.append(line+"\n");
    }

    private void writeLn(Vec3 v){
        writeLn(v.toString());
    }

}