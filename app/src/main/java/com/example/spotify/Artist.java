package com.example.spotify;

public class Artist {

    private int image;
    private String name;
    private String type;

    public Artist(int image, String name, String type) {
        this.image = image;
        this.name = name;
        this.type = type;
    }

    public int getImage() {
        return image;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }
}
