package uk.oczadly.karl.gameui;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FXController {
    
    @FXML public TextField idealGui;
    @FXML public Label guiScaleLabel;
    
    @FXML public TextField resWidth;
    @FXML public TextField resHeight;
    @FXML public Label resLabel;
    
    @FXML public CheckBox checkScaleBox;
    @FXML public CheckBox checkUiHotbar;
    @FXML public CheckBox checkUiInventory;
    @FXML public CheckBox checkUiMinimap;
    @FXML public CheckBox checkUiMinimapScaled;
    
    
    public void initialize() {
        idealGui.textProperty().addListener((e) -> Main.draw());
        resWidth.textProperty().addListener((e) -> Main.draw());
        resHeight.textProperty().addListener((e) -> Main.draw());
        checkScaleBox.selectedProperty().addListener((e) -> Main.updateUiComponents());
        checkUiHotbar.selectedProperty().addListener((e) -> Main.updateUiComponents());
        checkUiInventory.selectedProperty().addListener((e) -> Main.updateUiComponents());
        checkUiMinimap.selectedProperty().addListener((e) -> Main.updateUiComponents());
        checkUiMinimapScaled.selectedProperty().addListener((e) -> Main.updateUiComponents());
    }
    
}
