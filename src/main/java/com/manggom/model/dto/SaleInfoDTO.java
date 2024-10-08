package com.manggom.model.dto;

public class SaleInfoDTO {
    private int saleNo;
    private int userNo;
    private String saleDate;
    private int productCode;
    private int saleCount;
    private int salePrice;

    public SaleInfoDTO(int saleNo, int userNo, String saleDate, int productCode, int saleCount, int salePrice) {
        this.saleNo = saleNo;
        this.userNo = userNo;
        this.saleDate = saleDate;
        this.productCode = productCode;
        this.saleCount = saleCount;
        this.salePrice = salePrice;
    }

    @Override
    public String toString() {
        return "판매번호 = " + saleNo +
                ", 회원번호 = " + userNo +
                ", 판매일자 = " + saleDate +
                ", 물품코드 = " + productCode +
                ", 판매량 = " + saleCount +
                ", 판매액 = " + salePrice;
    }

    public int getSaleNo() {
        return saleNo;
    }

    public void setSaleNo(int saleNo) {
        this.saleNo = saleNo;
    }

    public int getUserNo() {
        return userNo;
    }

    public void setUserNo(int userNo) {
        this.userNo = userNo;
    }

    public String getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(String saleDate) {
        this.saleDate = saleDate;
    }

    public int getProductCode() {
        return productCode;
    }

    public void setProductCode(int productCode) {
        this.productCode = productCode;
    }

    public int getSaleCount() {
        return saleCount;
    }

    public void setSaleCount(int saleCount) {
        this.saleCount = saleCount;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }
}
