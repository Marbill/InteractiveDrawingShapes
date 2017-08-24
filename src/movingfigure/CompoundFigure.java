package movingfigure;

import java.awt.Graphics;
import java.util.List;
import java.util.ArrayList;

/* @author marbi */
public class CompoundFigure extends Figure {

    private List<Figure> figures;

    public CompoundFigure() {
        super(0, 0);
        this.figures = new ArrayList<Figure>();
    }

    public void add(Figure f) {
        this.figures.add(f);
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure figure : figures) {
            figure.draw(graphics);            
        }
    }

    @Override
    public void move(int dx, int dy) {
        for (Figure figure : figures) {
            figure.move(dx, dy);
        }
    }
    
    

}
