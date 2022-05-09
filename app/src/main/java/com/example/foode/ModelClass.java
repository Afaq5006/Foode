package com.example.foode;

public class ModelClass {
    private int imageview;
    private String textview1;

    ModelClass(int imageview ,String textview1){
        this.imageview = imageview;
        this.textview1 = textview1;

    }
    public int getImageview(){return imageview;}

       public String getTextview1(){ return textview1;}

}
