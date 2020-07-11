package uk.oczadly.karl.gameui.ui.alignment.vertical;

import uk.oczadly.karl.gameui.ui.UIManager;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;

public class VertAlignCenter extends UIAlignment {
    
    public VertAlignCenter() {
        super();
    }
    
    public VertAlignCenter(int offset) {
        super(offset);
    }
    
    
    @Override
    protected int _calcPos(UIManager ui, int scaledWidth, int scaledHeight) {
        return (ui.getScreenHeight() / 2) - (scaledHeight / 2);
    }
    
}
