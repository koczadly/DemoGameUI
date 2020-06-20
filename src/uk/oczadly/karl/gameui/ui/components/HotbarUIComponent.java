package uk.oczadly.karl.gameui.ui.components;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import uk.oczadly.karl.gameui.ui.HorizontalAlignment;
import uk.oczadly.karl.gameui.ui.UIComponent;
import uk.oczadly.karl.gameui.ui.VerticalAlignment;

public class HotbarUIComponent extends UIComponent {
    
    public HotbarUIComponent() {
        super(180,20, HorizontalAlignment.CENTER, 0, VerticalAlignment.BOTTOM_WINDOW, 0);
    }
    
    
    @Override
    protected void draw(GraphicsContext graphics, int x, int y, int scaleFactor) {
        graphics.setFill(Color.LIGHTGREEN);
        graphics.fillRoundRect(x, y, getWidth() * scaleFactor, getHeight() * scaleFactor,
                4 * scaleFactor, 4 * scaleFactor);
    }
    
}
