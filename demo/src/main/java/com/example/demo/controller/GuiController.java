package com.example.demo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class GuiController {
    @FXML
    private TextField numberA;
    @FXML
    private TextField numberB;
    @FXML
    private Text result1;
    @FXML
    private Text result2;
    AppController controller= new AppController();
    @FXML
    public void action1(ActionEvent ae){
        int ris=controller.somma(Integer.parseInt(numberA.getText()),Integer.parseInt(numberB.getText()));
        if(ris==0)
            result1.setText("inserisci numeri >0");
        else
            result1.setText(String.valueOf(ris));

    }
    @FXML
    public void action2(ActionEvent ae){
        int ris=controller.sottrazione(Integer.parseInt(numberA.getText()),Integer.parseInt(numberB.getText()));
        if(ris==0)
            result2.setText("inserisci numeri >0");
        else
            result2.setText(String.valueOf(ris));
    }

}