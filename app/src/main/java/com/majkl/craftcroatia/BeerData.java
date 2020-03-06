package com.majkl.craftcroatia;

public class BeerData {

    private String title;
    private String address;
    private int drawable;

    public BeerData(String title, String address, int drawable) {
        this.title = title;
        this.address = address;
        this.drawable = drawable;
    }

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public int getDrawable() {
        return drawable;
    }
}
