package hust.soict.cs01.javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class PainterController {

    @FXML
    private ToggleGroup Tool;

    @FXML
    private Pane drawingAreaPane;

    private Color drawColor = Color.BLACK; // Default pen color

    @FXML
    void clearButtonPressed(ActionEvent event) {
        drawingAreaPane.getChildren().clear();
    }

    @FXML
    void drawingAreaMouseDragged(MouseEvent event) {
        Circle newCircle = new Circle(event.getX(), event.getY(), 4, drawColor);
        drawingAreaPane.getChildren().add(newCircle);
    }

    @FXML
    void handleColorRadioButton(ActionEvent event) {
        RadioButton selectedRadioButton = (RadioButton) Tool.getSelectedToggle();
        if (selectedRadioButton.getText().equals("Pen")) {
            drawColor = Color.BLACK;
        } else if (selectedRadioButton.getText().equals("Eraser")) {
            drawColor = Color.WHITE;
        }
    }
}
