package com.example.my_food;

public class ModelFood {

    private int image;
    private String name;

    public ModelFood(int image, String name, String place, String price, String item_image1) {
        this.image = image;
        this.name = name;
        this.place = place;
        this.price = price;
        this.item_image1 = item_image1;
    }

    private String place;
    private String price;
    private String item_image1;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getItem_image1() {
        return item_image1;
    }

    public void setItem_image1(String item_image1) {
        this.item_image1 = item_image1;
    }
}
