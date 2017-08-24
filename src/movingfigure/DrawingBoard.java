package movingfigure;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/* @author marbi */
public class DrawingBoard extends JPanel {

    private Figure figure;

    public DrawingBoard(Figure figure) {
        super.setBackground(Color.white);
        this.figure = figure;
    }

    @Override
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

       this.figure.draw(graphics);

    }

}
