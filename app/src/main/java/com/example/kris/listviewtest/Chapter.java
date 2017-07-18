package com.example.kris.listviewtest;

/**
 * Created by 38348 on 2017/7/17.
 */

public class Chapter {
    private String name;

    private int imageId;

    public Chapter(String name, int imageId){
        this.name = name;
        this.imageId = imageId;
    }

    public String getName(){
        return name;
    }

    public int getImageId(){
        return imageId;
    }
}
