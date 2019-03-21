package com.example.cookart.models;
// this for single item in listview recycler
public class singleItemModel {
    private String name;
    private  String usl;
    private String description;

    public singleItemModel() {}
    public singleItemModel(String name, String url) {
        this.setName(name);
        this.setUsl(url);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsl() {
        return usl;
    }

    public void setUsl(String usl) {
        this.usl = usl;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
