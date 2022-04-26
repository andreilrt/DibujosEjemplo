package dibujosejemplo;

import java.awt.*;
import java.awt.event.*;

public class DibujosEjemplo extends MouseMotionAdapter {

    Frame F;

    DibujosEjemplo() {
        F = new Frame("Ejemplo");
        F.addMouseMotionListener(this);
        F.setSize(500, 500);
        F.setLayout(null);
        F.setVisible(true);
    }

    public void mouseDragged(MouseEvent e) {
        Graphics g = F.getGraphics();
        g.setColor(Color.MAGENTA);
        g.fillOval(e.getX(), e.getY(), 10, 10);
    }

    public static void main(String[] args) {
        new DibujosEjemplo();
    }
}
