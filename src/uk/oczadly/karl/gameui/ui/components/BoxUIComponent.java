package uk.oczadly.karl.gameui.ui.components;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import uk.oczadly.karl.gameui.ui.UIComponent;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;
import uk.oczadly.karl.gameui.ui.alignment.horizontal.HorizAlignRightWindow;
import uk.oczadly.karl.gameui.ui.alignment.vertical.VertAlignTopWindow;

public class BoxUIComponent extends UIComponent {
    
    public BoxUIComponent(int width, int height, UIAlignment horizAlignment, UIAlignment vertAlignment) {
        super(width, height, horizAlignment, vertAlignment);
    }
    
    
    @Override
    protected void draw(GraphicsContext graphics, int x, int y, int scaleFactor) {
        graphics.setFill(Color.MAGENTA);
        graphics.fillRect(x, y, getWidth() * scaleFactor, getHeight() * scaleFactor);
    }
    
}
