// WriteText.java

package com.Robot;

import java.awt.*;
import java.awt.geom.*;

public class WriteText {

    // No Argument Constructor
    public WriteText() {

    }

    public WriteText(Graphics g) {
        textBubble(g);
        inBubbleText(g);
    }

    // Text Bubble
    private void textBubble(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        // Text Bubble
        Color clr1 = new Color(206, 204, 204);
        g2d.setPaint(clr1);
        g2d.fill(new RoundRectangle2D.Double(425, 455, 300, 60, 40, 40));

        // Text Bubble Outline
        BasicStroke s = new BasicStroke(3);
        g2d.setStroke(s);
        g2d.setPaint(Color.black);
        g2d.draw(new RoundRectangle2D.Double(425, 455, 300, 60, 40, 40));
    }

    // Text
    private void inBubbleText(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        g2d.setColor(Color.black);
        g2d.setFont(new Font("Arial", 2, 30));
        g2d.drawString("Hello. My name is...", 445, 495);
    }

}
