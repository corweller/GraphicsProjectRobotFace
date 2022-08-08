// DrawMouth.java

package com.Robot;

import java.awt.*;
import java.awt.geom.*;

public class DrawMouth {

    // No Argument Constructor
    public DrawMouth() {

    }

    public DrawMouth(Graphics g) {
        mouthTemplate(g);
    }

    // Mouth
    private void mouthTemplate(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.black);
        g2d.fill(new Arc2D.Double(50, 550, 260, 60, 0, 75,2));
    }

}
