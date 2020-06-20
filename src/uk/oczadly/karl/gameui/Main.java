package uk.oczadly.karl.gameui;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import uk.oczadly.karl.gameui.ui.*;
import uk.oczadly.karl.gameui.ui.components.HotbarUIComponent;
import uk.oczadly.karl.gameui.ui.components.InventoryUIComponent;
import uk.oczadly.karl.gameui.ui.components.MinimapUIComponent;
import uk.oczadly.karl.gameui.ui.components.ScaledMinimapUIComponent;

import java.util.ArrayList;
import java.util.List;

public class Main extends Application {
    
    private static UIManager ui = new UIManager();
    private static FXController controller;
    private static Scene scene;
    private static Canvas canvas;
    
    @Override
    public void start(Stage uiStage) throws Exception {
        Stage configStage = new Stage(StageStyle.UTILITY);
        FXMLLoader loader = new FXMLLoader(getClass().getResource("config.fxml"));
        loader.setController(controller = new FXController());
        Pane root = loader.load();
        configStage.setOnCloseRequest(e -> Platform.exit());
        configStage.setTitle("Config");
        configStage.setScene(new Scene(root));
        configStage.setResizable(false);
        configStage.setAlwaysOnTop(true);
        configStage.show();
        
        uiStage.setOnCloseRequest(e -> Platform.exit());
        uiStage.setTitle("Test game window");
        uiStage.initStyle(StageStyle.DECORATED);
        canvas = new Canvas(200, 200);
        Parent rootPane = new Pane(canvas);
        uiStage.setScene(scene = new Scene(rootPane, 320, 240));
        uiStage.show();
    
        scene.widthProperty().addListener((obs, oldVal, newVal) -> draw());
        scene.heightProperty().addListener((obs, oldVal, newVal) -> draw());
        
        updateUiComponents();
    }
    
    public static void draw() {
        int width = (int)scene.getWidth(), height = (int)scene.getHeight();
        
        ui.setConfigs(
                Integer.parseInt(controller.idealGui.getText()),
                Integer.parseInt(controller.resWidth.getText()),
                Integer.parseInt(controller.resHeight.getText()));
        ui.calculate(width, height);
        
        controller.guiScaleLabel.setText(Integer.toString(ui.getScaleFactor()));
        controller.resLabel.setText(width + " x " + height + "\n" + ui.getScaledWidth() + " x " + ui.getScaledHeight());
        
        canvas.setWidth(width + 5);
        canvas.setHeight(height + 5);
        GraphicsContext graphics = canvas.getGraphicsContext2D();
        graphics.setFill(Color.BLACK);
        graphics.fillRect(0, 0, width + 5, height + 5);
        
        // Scaled window boundaries
        if (controller.checkScaleBox.isSelected()) {
            graphics.setStroke(Color.GRAY);
            graphics.strokeRect((width - ui.getScaledWidth()) / 2d, (height - ui.getScaledHeight()) / 2d,
                    ui.getScaledWidth(), ui.getScaledHeight());
        }
        
        // UI components
        for (UIComponent component : ui.getUIComponents()) {
            component.draw(graphics, ui);
        }
    }
    
    public static void updateUiComponents() {
        List<UIComponent> components = new ArrayList<>();
    
        if (controller.checkUiMinimap.isSelected())
            components.add(new MinimapUIComponent());
        if (controller.checkUiMinimapScaled.isSelected())
            components.add(new ScaledMinimapUIComponent());
        if (controller.checkUiHotbar.isSelected())
            components.add(new HotbarUIComponent());
        if (controller.checkUiInventory.isSelected())
            components.add(new InventoryUIComponent());
        
        ui.setUIComponents(components);
        draw();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
