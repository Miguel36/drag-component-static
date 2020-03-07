package com.example.componentdragstatic;

public class ComponentDragModel {

    private String title;
    private String button;
    private int image;

    public ComponentDragModel(String title, String button, int image) {
        this.title = title;
        this.button = button;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getButton() {
        return button;
    }

    public void setButton(String button) {
        this.button = button;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
