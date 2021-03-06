package uk.oczadly.karl.gameui.ui.components;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import uk.oczadly.karl.gameui.ui.UIComponent;
import uk.oczadly.karl.gameui.ui.alignment.horizontal.HorizAlignRightWindow;
import uk.oczadly.karl.gameui.ui.alignment.vertical.VertAlignTopWindow;

public class MinimapUIComponent extends UIComponent {
    
    public MinimapUIComponent() {
        super(80, 80, new HorizAlignRightWindow(-8), new VertAlignTopWindow(8));
    }
    
    
    @Override
    protected void draw(GraphicsContext graphics, int x, int y, int scaleFactor) {
        graphics.setFill(Color.AQUA);
        graphics.fillOval(x, y, getWidth() * scaleFactor, getHeight() * scaleFactor);
    }
    
}
