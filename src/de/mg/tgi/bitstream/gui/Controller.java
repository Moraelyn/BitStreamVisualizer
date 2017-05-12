package de.mg.tgi.bitstream.gui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.chart.LineChart;
import javafx.scene.control.TextField;

/**
 * FXML-Controller
 *
 * @author moraelyn
 * @version 0.1
 */
public class Controller {
    @FXML
    LineChart<Number, Number> outputChart;
    @FXML
    TextField bitInput;

    @FXML
    public void checkInputBits(ActionEvent actionEvent) {
        char[] bits = bitInput.getText().toCharArray();
        boolean[] bitStates = new boolean[bits.length];
        try {
            for (int i = 0; i < bits.length; i++) {
                switch (bits[i]) {
                    case '0':
                        bitStates[i] = false;
                        break;
                    case '1':
                        bitStates[i] = true;
                        break;
                    default:
                        throw new NumberFormatException("Illegales Zeichen: " + bits[i]);
                }
            }
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
        }
        drawBitsOnChart(bitStates);
    }

    private void drawBitsOnChart(boolean[] bits) {
        // TODO: 12.05.17 Chart lernen  + implementieren
    }
}
