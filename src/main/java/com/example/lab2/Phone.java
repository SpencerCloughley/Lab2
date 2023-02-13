package com.example.lab2;

import javafx.scene.image.Image;

public class Phone {
    private String model;
    private String fileName;

    public Phone(String model, String fileName) {
        setModel(model);
        setFileName(fileName);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
    public Image getImage(){
        return new Image(Phone.class.getResourceAsStream(fileName));
    }
}
