// DrawBackground.java

package com.Robot;

import java.awt.*;
import java.awt.geom.*;

public class DrawBackground {

    // No Argument Constructor
    public DrawBackground() {

    }

    public DrawBackground(Graphics g) {
        setBackgroundColor(g);
    }

    // Background
    private void setBackgroundColor(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Color clr1 = new Color(7, 7, 7);
        Color clr2 = new Color(127, 114, 57);
        GradientPaint gp = new GradientPaint(0, 720, clr1, 800, 50, clr2);

        // Set Background Color
        g2d.setPaint(gp);
        g2d.fill(new Rectangle2D.Double(0, 0, 780, 720));
    }

}
