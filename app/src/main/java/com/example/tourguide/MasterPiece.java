package com.example.tourguide;

public class MasterPiece {
    private String mpName;
    private String mpInfo;
    private int mpImage;

    public MasterPiece(String mpName, String mpInfo, int mpImage) {
        this.mpName = mpName;
        this.mpInfo = mpInfo;
        this.mpImage = mpImage;
    }

    public String getMpName() {
        return mpName;
    }

    public String getMpInfo() {
        return mpInfo;
    }

    public int getMpImage() {
        return mpImage;
    }

}
