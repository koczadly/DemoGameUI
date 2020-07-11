package uk.oczadly.karl.gameui.ui.components;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import uk.oczadly.karl.gameui.ui.UIComponent;
import uk.oczadly.karl.gameui.ui.alignment.horizontal.HorizAlignCenter;
import uk.oczadly.karl.gameui.ui.alignment.vertical.VertAlignBottomWindow;

public class HotbarUIComponent extends UIComponent {
    
    public HotbarUIComponent() {
        super(180, 20, new HorizAlignCenter(), new VertAlignBottomWindow());
    }
    
    
    @Override
    protected void draw(GraphicsContext graphics, int x, int y, int scaleFactor) {
        graphics.setFill(Color.LIGHTGREEN);
        graphics.fillRoundRect(x, y, getWidth() * scaleFactor, getHeight() * scaleFactor,
                4 * scaleFactor, 4 * scaleFactor);
    }
    
}
