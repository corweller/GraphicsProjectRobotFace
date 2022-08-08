// DrawHead.java

package com.Robot;

import java.awt.*;
import java.awt.geom.Rectangle2D;

public class DrawHead {

    // No Argument Constructor
    public DrawHead() {

    }

    public DrawHead(Graphics g) {
        headTemplate(g);
    }

    // Head
    private void headTemplate(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;
        Color clr1 = new Color(97, 96, 96);
        Color clr2 = new Color(170, 170, 170);
        GradientPaint gp = new GradientPaint(90, 40, clr1, 700, 40, clr2);

        // Head
        g2d.setPaint(gp);
        g2d.fill(new Rectangle2D.Double(90, 40, 600, 600));

        // Head Outline
        BasicStroke s = new BasicStroke(3);
        g2d.setStroke(s);
        g2d.setPaint(Color.black);
        g2d.draw(new Rectangle2D.Double(90, 40, 600, 600));
    }

}
