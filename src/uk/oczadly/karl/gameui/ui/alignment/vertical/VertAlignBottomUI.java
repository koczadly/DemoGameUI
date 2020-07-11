package uk.oczadly.karl.gameui.ui.alignment.vertical;

import uk.oczadly.karl.gameui.ui.UIManager;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;

public class VertAlignBottomUI extends UIAlignment {
    
    public VertAlignBottomUI() {
        super();
    }
    
    public VertAlignBottomUI(int offset) {
        super(offset);
    }
    
    
    @Override
    protected int _calcPos(UIManager ui, int scaledWidth, int scaledHeight) {
        return ((ui.getScreenHeight() + ui.getScaledHeight()) / 2) - scaledHeight;
    }
    
}
