package com.example.staggeredgirdviewex.model;

public class FruitsModel {
    String fruitsName;
    int fruitsImage;

    public FruitsModel(String fruitsName, int fruitsImage) {
        this.fruitsName = fruitsName;
        this.fruitsImage = fruitsImage;
    }

    public String getFruitsName() {
        return fruitsName;
    }

    public void setFruitsName(String fruitsName) {
        this.fruitsName = fruitsName;
    }

    public int getFruitsImage() {
        return fruitsImage;
    }

    public void setFruitsImage(int fruitsImage) {
        this.fruitsImage = fruitsImage;
    }
}
