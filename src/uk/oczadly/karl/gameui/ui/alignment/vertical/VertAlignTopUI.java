package uk.oczadly.karl.gameui.ui.alignment.vertical;

import uk.oczadly.karl.gameui.ui.UIManager;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;

public class VertAlignTopUI extends UIAlignment {
    
    public VertAlignTopUI() {
        super();
    }
    
    public VertAlignTopUI(int offset) {
        super(offset);
    }
    
    
    @Override
    protected int _calcPos(UIManager ui, int scaledWidth, int scaledHeight) {
        return ((ui.getScreenHeight() - ui.getScaledHeight()) / 2);
    }
    
}
