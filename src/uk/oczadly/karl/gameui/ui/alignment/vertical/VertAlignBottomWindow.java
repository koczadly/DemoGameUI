package uk.oczadly.karl.gameui.ui.alignment.vertical;

import uk.oczadly.karl.gameui.ui.UIManager;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;

public class VertAlignBottomWindow extends UIAlignment {
    
    public VertAlignBottomWindow() {
        super();
    }
    
    public VertAlignBottomWindow(int offset) {
        super(offset);
    }
    
    
    @Override
    protected int _calcPos(UIManager ui, int scaledWidth, int scaledHeight) {
        return ui.getScreenHeight() - scaledHeight;
    }
    
}
