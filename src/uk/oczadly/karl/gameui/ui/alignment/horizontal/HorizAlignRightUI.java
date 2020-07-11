package uk.oczadly.karl.gameui.ui.alignment.horizontal;

import uk.oczadly.karl.gameui.ui.UIManager;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;

public class HorizAlignRightUI extends UIAlignment {
    
    public HorizAlignRightUI() {
        super();
    }
    
    public HorizAlignRightUI(int offset) {
        super(offset);
    }
    
    
    @Override
    protected int _calcPos(UIManager ui, int scaledWidth, int scaledHeight) {
        return ((ui.getScreenWidth() + ui.getScaledWidth()) / 2) - scaledWidth;
    }
    
}
