package uk.oczadly.karl.gameui.ui;

import javafx.scene.canvas.GraphicsContext;

public abstract class UIComponent {
    
    private int width, height, horOffset, vertOffset;
    private HorizontalAlignment horAlignment;
    private VerticalAlignment vertAlignment;
    
    public UIComponent(int width, int height, HorizontalAlignment horAlignment, int horOffset,
                       VerticalAlignment vertAlignment, int vertOffset) {
        this.width = width;
        this.height = height;
        this.horAlignment = horAlignment;
        this.horOffset = horOffset;
        this.vertAlignment = vertAlignment;
        this.vertOffset = vertOffset;
    }
    
    
    protected abstract void draw(GraphicsContext graphics, int x, int y, int scaleFactor);
    
    public final void draw(GraphicsContext graphics, UIManager ui) {
        int sf = ui.getScaleFactor();
        
        // Calculate the absolute X and Y positions to start drawing from
        int x = 0, y = 0;
        switch (horAlignment) {
            case CENTER:
                x = (ui.getScreenWidth() / 2) + (-(width / 2) * sf);
                break;
            case LEFT_UI:
                x = ((ui.getScreenWidth() - ui.getScaledWidth()) / 2);
                break;
            case RIGHT_WINDOW:
                x = ui.getScreenWidth() - (width * sf);
                break;
            case RIGHT_UI:
                x = ((ui.getScreenWidth() + ui.getScaledWidth()) / 2) - (width * sf);
                break;
        }
        switch (vertAlignment) {
            case CENTER:
                y = (ui.getScreenHeight() / 2) + (-(height / 2) * sf);
                break;
            case TOP_UI:
                y = ((ui.getScreenHeight() - ui.getScaledHeight()) / 2);
                break;
            case BOTTOM_WINDOW:
                y = ui.getScreenHeight() - (height * sf);
                break;
            case BOTTOM_UI:
                y = ((ui.getScreenHeight() + ui.getScaledHeight()) / 2) - (height * sf);
                break;
        }
        
        // Draw (delegate to abstract method)
        draw(graphics, x + (horOffset * sf), y + (vertOffset * sf), sf);
    }
    
    
    public int getWidth() {
        return width;
    }
    
    public int getHeight() {
        return height;
    }
    
    public int getHorOffset() {
        return horOffset;
    }
    
    public int getVertOffset() {
        return vertOffset;
    }
    
    public HorizontalAlignment getHorAlignment() {
        return horAlignment;
    }
    
    public VerticalAlignment getVertAlignment() {
        return vertAlignment;
    }
    
}
