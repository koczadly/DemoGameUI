package uk.oczadly.karl.gameui.ui.alignment.horizontal;

import uk.oczadly.karl.gameui.ui.UIManager;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;

public class HorizAlignLeftWindow extends UIAlignment {
    
    public HorizAlignLeftWindow() {
        super();
    }
    
    public HorizAlignLeftWindow(int offset) {
        super(offset);
    }
    
    
    @Override
    protected int _calcPos(UIManager ui, int scaledWidth, int scaledHeight) {
        return 0;
    }
    
}
