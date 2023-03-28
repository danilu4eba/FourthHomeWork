package com.example.fourthhomework;

import java.io.Serializable;

public class Car implements Serializable {
   private  String name;
    private String description;

    public String getName() {
        return name;
    }

    public Car(String name, String description, int image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    private int image;
}
