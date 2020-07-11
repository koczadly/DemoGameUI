package uk.oczadly.karl.gameui;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import uk.oczadly.karl.gameui.ui.alignment.UIAlignment;
import uk.oczadly.karl.gameui.ui.alignment.horizontal.*;
import uk.oczadly.karl.gameui.ui.alignment.vertical.*;

import java.net.URL;
import java.util.ResourceBundle;

public class FXController implements Initializable {
    
    @FXML public TextField idealGui;
    @FXML public Label guiScaleLabel;
    
    @FXML public TextField resWidth;
    @FXML public TextField resHeight;
    @FXML public Label resLabel;
    
    @FXML public CheckBox checkScaleBox;
    @FXML public CheckBox checkUiHotbar;
    @FXML public CheckBox checkUiInventory;
    @FXML public CheckBox checkUiMinimap;
    
    @FXML public TextField minimapSize;
    @FXML public TextField horizontalOffset;
    @FXML public ChoiceBox<HorizontalAlignment> choiceHorizontal;
    @FXML public TextField verticalOffset;
    @FXML public ChoiceBox<VerticalAlignment> choiceVertical;
    
    
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        idealGui.textProperty().addListener(e -> Main.updateUISettings());
        resWidth.textProperty().addListener(e -> Main.updateUISettings());
        resHeight.textProperty().addListener(e -> Main.updateUISettings());
        
        checkScaleBox.selectedProperty().addListener(e -> Main.updateUISettings());
        checkUiHotbar.selectedProperty().addListener(e -> Main.updateUISettings());
        checkUiInventory.selectedProperty().addListener(e -> Main.updateUISettings());
        checkUiMinimap.selectedProperty().addListener(e -> Main.updateUISettings());
    
        choiceHorizontal.setItems(FXCollections.observableArrayList(HorizontalAlignment.values()));
        choiceHorizontal.setValue(HorizontalAlignment.RIGHT_WINDOW);
        choiceVertical.setItems(FXCollections.observableArrayList(VerticalAlignment.values()));
        choiceVertical.setValue(VerticalAlignment.TOP_WINDOW);
        
        minimapSize.textProperty().addListener(e -> Main.updateUISettings());
        horizontalOffset.textProperty().addListener(e -> Main.updateUISettings());
        choiceHorizontal.valueProperty().addListener(e -> Main.updateUISettings());
        verticalOffset.textProperty().addListener(e -> Main.updateUISettings());
        choiceVertical.valueProperty().addListener(e -> Main.updateUISettings());
    }
    
    
    public enum VerticalAlignment {
        CENTER {
            @Override
            public UIAlignment getAlignment(int offset) {
                return new VertAlignCenter(offset);
            }
        },
        TOP_UI {
            @Override
            public UIAlignment getAlignment(int offset) {
                return new VertAlignTopUI(offset);
            }
        },
        TOP_WINDOW {
            @Override
            public UIAlignment getAlignment(int offset) {
                return new VertAlignTopWindow(offset);
            }
        },
        BOTTOM_UI {
            @Override
            public UIAlignment getAlignment(int offset) {
                return new VertAlignBottomUI(offset);
            }
        },
        BOTTOM_WINDOW {
            @Override
            public UIAlignment getAlignment(int offset) {
                return new VertAlignBottomWindow(offset);
            }
        };
        
        public abstract UIAlignment getAlignment(int offset);
    }
    
    public enum HorizontalAlignment {
        CENTER {
            @Override
            public UIAlignment getAlignment(int offset) {
                return new HorizAlignCenter(offset);
            }
        },
        LEFT_UI {
            @Override
            public UIAlignment getAlignment(int offset) {
                return new HorizAlignLeftUI(offset);
            }
        },
        LEFT_WINDOW {
            @Override
            public UIAlignment getAlignment(int offset) {
                return new HorizAlignLeftWindow(offset);
            }
        },
        RIGHT_UI {
            @Override
            public UIAlignment getAlignment(int offset) {
                return new HorizAlignRightUI(offset);
            }
        },
        RIGHT_WINDOW {
            @Override
            public UIAlignment getAlignment(int offset) {
                return new HorizAlignRightWindow(offset);
            }
        };
    
        public abstract UIAlignment getAlignment(int offset);
    }
    
}
