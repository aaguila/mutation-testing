package com.qajungle;

public enum ProductCode {

    P1("soda"),
    P2("lays"),
    P3("kitkat"),
    P4("incorrect");

    private String productName;

    ProductCode(String productName) {
        this.productName = productName;
    }

    public String productName() {
        return productName;
    }
}