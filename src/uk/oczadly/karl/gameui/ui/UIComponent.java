package uk.oczadly.karl.gameui.ui;

import javafx.scene.canvas.GraphicsContext;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;

public abstract class UIComponent {
    
    private final int width, height;
    private final UIAlignment horizAlign, vertAlign;
    
    public UIComponent(int width, int height, UIAlignment horizAlign, UIAlignment vertAlign) {
        this.width = width;
        this.height = height;
        this.horizAlign = horizAlign;
        this.vertAlign = vertAlign;
    }
    
    
    protected abstract void draw(GraphicsContext graphics, int x, int y, int scaleFactor);
    
    public final void draw(GraphicsContext graphics, UIManager ui) {
        // Draw (delegate to abstract method)
        draw(graphics,
                horizAlign.calcPos(ui, width, height), vertAlign.calcPos(ui, width, height),
                ui.getScaleFactor());
    }
    
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public UIAlignment getHorizontalAlignment() {
        return horizAlign;
    }
    
    public UIAlignment getVerticalAlignment() {
        return vertAlign;
    }
    
}
