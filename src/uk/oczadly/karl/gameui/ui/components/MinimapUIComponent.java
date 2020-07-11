package uk.oczadly.karl.gameui.ui.components;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import uk.oczadly.karl.gameui.ui.UIComponent;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;

public class MinimapUIComponent extends UIComponent {
    
    public MinimapUIComponent(int size, UIAlignment horizAlignment, UIAlignment vertAlignment) {
        super(size, size, horizAlignment, vertAlignment);
    }
    
    
    @Override
    protected void draw(GraphicsContext graphics, int x, int y, int scaleFactor) {
        graphics.setFill(Color.AQUA);
        graphics.fillOval(x, y, getWidth() * scaleFactor, getHeight() * scaleFactor);
    }
    
}
