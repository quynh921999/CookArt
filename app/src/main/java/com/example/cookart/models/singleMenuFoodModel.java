package com.example.cookart.models;

public class singleMenuFoodModel {
    private String name;
    private String url;

    public singleMenuFoodModel() {}
    public singleMenuFoodModel(String name, String url) {
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
}
