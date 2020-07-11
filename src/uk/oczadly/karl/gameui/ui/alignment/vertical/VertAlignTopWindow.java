package uk.oczadly.karl.gameui.ui.alignment.vertical;

import uk.oczadly.karl.gameui.ui.UIManager;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;

public class VertAlignTopWindow extends UIAlignment {
    
    public VertAlignTopWindow() {
        super();
    }
    
    public VertAlignTopWindow(int offset) {
        super(offset);
    }
    
    
    @Override
    protected int _calcPos(UIManager ui, int scaledWidth, int scaledHeight) {
        return 0;
    }
    
}
