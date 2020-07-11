package uk.oczadly.karl.gameui.ui.alignment;

import uk.oczadly.karl.gameui.ui.UIManager;

public abstract class UIAlignment {

    private final int offset;
    
    public UIAlignment() {
        this(0);
    }
    
    public UIAlignment(int offset) {
        this.offset = offset;
    }
    
    
    public final int getOffset() {
        return offset;
    }
    
    
    // Method should return absolute X/Y value (depending on context)
    protected abstract int _calcPos(UIManager ui, int scaledWidth, int scaledHeight);
    
    // Runs the abstract method, and adds the offset value
    public final int calcPos(UIManager ui, int width, int height) {
        return _calcPos(ui, width * ui.getScaleFactor(), height * ui.getScaleFactor())
                + (offset * ui.getScaleFactor());
    }
    
}
