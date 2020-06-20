package uk.oczadly.karl.gameui.ui.components;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import uk.oczadly.karl.gameui.ui.HorizontalAlignment;
import uk.oczadly.karl.gameui.ui.UIComponent;
import uk.oczadly.karl.gameui.ui.VerticalAlignment;

public class MinimapUIComponent extends UIComponent {
    
    public MinimapUIComponent(int size, HorizontalAlignment horizontalAlignment, int horizontalOffset,
                              VerticalAlignment verticalAlignment, int verticalOffset) {
        super(size, size, horizontalAlignment, horizontalOffset,
                verticalAlignment, verticalOffset);
    }
    
    
    @Override
    protected void draw(GraphicsContext graphics, int x, int y, int scaleFactor) {
        graphics.setFill(Color.AQUA);
        graphics.fillOval(x, y, getWidth() * scaleFactor, getHeight() * scaleFactor);
    }
    
}
