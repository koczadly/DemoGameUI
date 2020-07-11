package uk.oczadly.karl.gameui.ui.alignment.horizontal;

import uk.oczadly.karl.gameui.ui.UIManager;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;

public class HorizAlignRightWindow extends UIAlignment {
    
    public HorizAlignRightWindow() {
        super();
    }
    
    public HorizAlignRightWindow(int offset) {
        super(offset);
    }
    
    
    @Override
    protected int _calcPos(UIManager ui, int scaledWidth, int scaledHeight) {
        return ui.getScreenWidth() - scaledWidth;
    }
    
}
