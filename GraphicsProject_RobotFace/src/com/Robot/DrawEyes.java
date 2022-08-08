// DrawEyes.java

package com.Robot;

import java.awt.*;
import java.awt.geom.*;

public class DrawEyes {

    // No Argument Constructor
    public DrawEyes() {

    }

    public DrawEyes(Graphics g) {
        eyeTemplate(g);
    }

    // Eyes
    private void eyeTemplate(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Eyes Outlines
        g2d.setColor(Color.orange);
        g2d.fill(new Ellipse2D.Double(115, 195, 110, 190));
        g2d.fill(new Ellipse2D.Double(345, 195, 110, 190));

        // Eyes
        g2d.setColor(Color.red);
        g2d.fill(new Ellipse2D.Double(120, 200, 100, 180));
        g2d.fill(new Ellipse2D.Double(350, 200, 100, 180));

        // Pupils
        g2d.setColor(Color.black);
        g2d.fill(new Ellipse2D.Double(130, 290, 20, 60));
        g2d.fill(new Ellipse2D.Double(360, 290, 20, 60));
    }

}
