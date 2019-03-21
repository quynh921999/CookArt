package com.example.cookart.models;

public class kindOfFoodModel {
    private String name;
    private String url;
    private String description;

    public kindOfFoodModel() {}
    public kindOfFoodModel(String name, String url) {
        this.setName(name);
        this.setUrl(url);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
