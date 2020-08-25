package controladores;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class CalculoImcController {

    @FXML
    private TextField txtPeso;

    @FXML
    private TextField txtAltura;

    @FXML
    private Label lblResult;

    @FXML
    void calculaImc() {
    	double peso = Double.parseDouble(txtPeso.getText());
    	double altura = Double.parseDouble(txtAltura.getText());
    	double imc = peso / (altura * altura);

    	
    	lblResult.setText("Res: "+imc);
    }

}
