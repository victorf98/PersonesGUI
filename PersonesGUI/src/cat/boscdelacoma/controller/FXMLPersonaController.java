/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package cat.boscdelacoma.controller;

import cat.boscdelacoma.model.business.entities.Persona;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/**
 *
 * @author Victo
 */
public class FXMLPersonaController implements Initializable {
    private Persona persona;
    
    private Label label;
    @FXML
    private Button btnDesar;
    @FXML
    private Button btnSaludar;
    @FXML
    private Label labelNom;
    @FXML
    private TextField textNom;
    @FXML
    private Label labelDni;
    @FXML
    private TextField textDni;
    @FXML
    private Label labelEdat;
    @FXML
    private TextField textEdat;
    
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText("Hello World!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        persona = new Persona();
    }    

    @FXML
    private void btnDesarAction(ActionEvent event) {
        persona.setDni(textDni.getText());
        persona.setNom(textNom.getText());
        persona.setEdat(Short.parseShort(textEdat.getText()));
    }

    @FXML
    private void btnSaludarAction(ActionEvent event) {
        mostrarDialog(persona);
    }

    private void mostrarDialog(Persona persona) {
        Alert dialog = new Alert(Alert.AlertType.INFORMATION);
        dialog.setTitle("Hola" + persona.getNom());
        dialog.setContentText("Nom" + persona.getNom());
        dialog.setContentText("Dni" + persona.getDni());
        dialog.setContentText("Edat" + persona.getEdat());
    }

    
}
