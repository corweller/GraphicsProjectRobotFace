// DrawNose.java

package com.Robot;

import java.awt.*;
import java.awt.geom.Arc2D;

public class DrawNose {

    // No Argument Constructor
    public DrawNose() {

    }

    public DrawNose(Graphics g) {
        noseTemplate(g);
    }

    // Nose
    private void noseTemplate(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.black);
        g2d.fill(new Arc2D.Double(30, 420, 230, 90, 0, 360, 2));
    }

}
