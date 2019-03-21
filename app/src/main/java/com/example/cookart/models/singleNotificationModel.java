package com.example.cookart.models;

public class singleNotificationModel {
    private String urlImage;
    private String messegeContent;

    public singleNotificationModel() {}

    public singleNotificationModel(String urlImage, String messegeContent) {
        this.setMessegeContent(messegeContent);
        this.setUrlImage(urlImage);
    }


    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getMessegeContent() {
        return messegeContent;
    }

    public void setMessegeContent(String messegeContent) {
        this.messegeContent = messegeContent;
    }
}
