package com.quizapplications.girlsfirstclass.Model;

public class ModelClass {

    private String name,email;
    private int image;


    public ModelClass(String name, String email, int image) {
        this.name = name;
        this.email = email;
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getImage() {
        return image;
    }
}
