package com.example.pokemon;

public class Pokemon {
    int id;
    String name;
    String imageUrl;

    String power;

    public Pokemon(int id, String name, String imageUrl, String power) {
        this.id = id;
        this.name = name;
        this.imageUrl = imageUrl;
        this.power = power;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }
}
