package com.example.lab2;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.net.URL;
import java.util.ResourceBundle;

public class lab2Controller implements Initializable {

    @FXML
    private ImageView imageView;

    @FXML
    private Label phoneName;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Phone iPhone= new Phone("iPhone 14 Pro", "imgs/apple-14-blue-pos1.png");
        initializeView(iPhone);
    }
    private void initializeView(Phone phone){
        //imageView.setImage(new Image(Phone.class.getResourceAsStream("imgs/apple-14-blue-pos1.png")));
        imageView.setImage(phone.getImage());
        phoneName.setText(phone.getModel());
    }
}