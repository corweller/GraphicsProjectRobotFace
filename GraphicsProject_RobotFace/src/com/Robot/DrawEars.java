// DrawEars.java

package com.Robot;

import java.awt.*;
import java.awt.geom.*;

public class DrawEars {

    // No Argument Constructor
    public DrawEars() {

    }

    public DrawEars(Graphics g) {
        earTemplate(g);
    }

    // Ear
    private void earTemplate(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Set Line Properties
        BasicStroke s = new BasicStroke(15);
        g2d.setStroke(s);

        // Ear Antenna
        g2d.setColor(Color.black);
        g2d.draw(new Line2D.Double(650, 300, 700, 230));

        // Ear Bulb
        g2d.setColor(Color.red);
        g2d.fill(new Ellipse2D.Double(695, 200, 30, 30));
    }

}
