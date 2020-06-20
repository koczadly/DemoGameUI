package uk.oczadly.karl.gameui.ui;

import java.util.Collections;
import java.util.List;

public class UIManager {

    private int scaleFactor, idealScaleFactor, nativeWidth, nativeHeight, scaledWidth, scaledHeight, screenWidth,
            screenHeight;
    private List<UIComponent> uiComponents = Collections.emptyList();
    
    public void setConfigs(int idealScaleFactor, int idealWidth, int idealHeight) {
        this.idealScaleFactor = idealScaleFactor;
        this.nativeWidth = idealWidth;
        this.nativeHeight = idealHeight;
    }
    
    public void calculate(int screenWidth, int screenHeight) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        int calcSF = Math.max((int)Math.floor(Math.min(screenWidth / nativeWidth, screenHeight / nativeHeight)), 1);
        this.scaleFactor = idealScaleFactor == 0 ? calcSF : Math.min(calcSF, idealScaleFactor);
        this.scaledWidth = scaleFactor * nativeWidth;
        this.scaledHeight = scaleFactor * nativeHeight;
    }
    
    public List<UIComponent> getUIComponents() {
        return uiComponents;
    }
    
    public void setUIComponents(List<UIComponent> uiComponents) {
        this.uiComponents = uiComponents;
    }
    
    public int getScreenWidth() {
        return screenWidth;
    }
    
    public int getScreenHeight() {
        return screenHeight;
    }
    
    public int getNativeWidth() {
        return nativeWidth;
    }
    
    public int getNativeHeight() {
        return nativeHeight;
    }
    
    public int getScaleFactor() {
        return scaleFactor;
    }
    
    public int getScaledWidth() {
        return scaledWidth;
    }
    
    public int getScaledHeight() {
        return scaledHeight;
    }
    
}
