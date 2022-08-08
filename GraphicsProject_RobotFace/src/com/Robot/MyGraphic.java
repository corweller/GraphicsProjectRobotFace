/**
 * File: MyGraphic.java
 * Author: Casey Orweller
 * Date: 03November2020
 * Purpose: Depict Unique Creation of 2D Graphic using Graphics Superclass and 2D Graphics Objects
 **/

package com.Robot;

import javax.swing.*;

public class MyGraphic extends JFrame {

    // MyGraphic Constructor
    public MyGraphic() {
        My2DShape my2DShape = new My2DShape();
        JFrame f1 = new JFrame();

        f1.add(my2DShape);
        f1.setTitle("Java Graphics Project -- Robot Face by Casey Orweller");
        f1.setSize(780, 720);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setResizable(false);
        f1.setLocationRelativeTo(null);
        f1.setVisible(true);
    }

    // Main method to run program
    public static void main(String[] args) {
        MyGraphic myGraphic = new MyGraphic();

    }

}