package uk.oczadly.karl.gameui.ui.components;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import uk.oczadly.karl.gameui.ui.HorizontalAlignment;
import uk.oczadly.karl.gameui.ui.UIComponent;
import uk.oczadly.karl.gameui.ui.VerticalAlignment;

public class MinimapUIComponent extends UIComponent {
    
    public MinimapUIComponent() {
        super(80,80, HorizontalAlignment.RIGHT_MONITOR, -8, VerticalAlignment.TOP_MONITOR, 8);
    }
    
    
    @Override
    protected void draw(GraphicsContext graphics, int x, int y, int scaleFactor) {
        graphics.setStroke(Color.AQUA);
        graphics.strokeOval(x, y, getWidth() * scaleFactor, getHeight() * scaleFactor);
    }
    
}
