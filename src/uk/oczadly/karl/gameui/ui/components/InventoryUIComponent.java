package uk.oczadly.karl.gameui.ui.components;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import uk.oczadly.karl.gameui.ui.HorizontalAlignment;
import uk.oczadly.karl.gameui.ui.UIComponent;
import uk.oczadly.karl.gameui.ui.VerticalAlignment;

public class InventoryUIComponent extends UIComponent {
    
    public InventoryUIComponent() {
        super(176,166, HorizontalAlignment.CENTER, 0, VerticalAlignment.CENTER, -10);
    }
    
    
    @Override
    protected void draw(GraphicsContext graphics, int x, int y, int scaleFactor) {
        graphics.setFill(Color.YELLOW);
        graphics.fillRoundRect(x, y, getWidth() * scaleFactor, getHeight() * scaleFactor,
                7 * scaleFactor, 7 * scaleFactor);
    }
    
}
