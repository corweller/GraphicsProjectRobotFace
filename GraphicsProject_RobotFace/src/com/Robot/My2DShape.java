// My2DShape.java

package com.Robot;

import javax.swing.*;
import java.awt.*;

public class My2DShape extends JPanel {

    // No Argument Constructor
    public My2DShape() {

    }

    // PaintComponent method to construct graphic
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;

        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        DrawBackground drawBackground = new DrawBackground(g2d);
        DrawHead drawHead = new DrawHead(g2d);
        DrawEyes drawEyes = new DrawEyes(g2d);
        DrawEars drawEars = new DrawEars(g2d);
        DrawNose drawNose = new DrawNose(g2d);
        DrawMouth drawMouth = new DrawMouth(g2d);
        WriteText writeText = new WriteText(g2d);

    }

}
