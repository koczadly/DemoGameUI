package uk.oczadly.karl.gameui.ui.alignment.horizontal;

import uk.oczadly.karl.gameui.ui.UIManager;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;

public class HorizAlignCenter extends UIAlignment {
    
    public HorizAlignCenter() {
        super();
    }
    
    public HorizAlignCenter(int offset) {
        super(offset);
    }
    
    
    @Override
    protected int _calcPos(UIManager ui, int scaledWidth, int scaledHeight) {
        return (ui.getScreenWidth() / 2) -(scaledWidth / 2);
    }
    
}
