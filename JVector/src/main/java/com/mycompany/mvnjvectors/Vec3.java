/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mvnjvectors;

/**
 *
 * @author FED
 */
public class Vec3 {
    private float x;
    private float y;
    private float z;


    public Vec3(){}

    public Vec3(float X, float Y, float Z){
        x = X;
        y = Y;
        z = Z;
    }

    public void add(Vec3 vA, Vec3 vB){
        x =  vA.x + vB.x;
        y =  vA.y + vB.y;
        z =  vA.z + vB.z;
    }


    public void scalMult(Vec3 v, float k){
        x = k * v.x;
        y = k * v.y;
        z = k * v.z;
    }

    public float  len() {
        return (float)Math.sqrt(x*x + y*y + z*z);
    }

    @Override
    public String toString() {
        return "{"+x+", "+y+", "+z+"}";

    }

}