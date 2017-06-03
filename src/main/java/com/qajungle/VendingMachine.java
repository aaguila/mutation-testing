package com.qajungle;

import java.security.InvalidParameterException;

public class VendingMachine {

    private int p1Quantity;
    private int p2Quantity;
    private int p3Quantity;

    public VendingMachine(int p1Quantity, int p2Quantity, int p3Quantity) {
        this.p1Quantity = p1Quantity;
        this.p2Quantity = p2Quantity;
        this.p3Quantity = p3Quantity;
    }

    public int buyProduct(ProductCode productCode, int quantity) {
        switch (productCode) {
            case P1:
                if (this.p1Quantity >= quantity) {
                    this.p1Quantity -= quantity;
                    return this.p1Quantity;
                } else {
                    productSoldOut(productCode);
                }
            case P2:
                if (this.p2Quantity >= quantity) {
                    this.p2Quantity -= quantity;
                    return this.p2Quantity;
                } else {
                    productSoldOut(productCode);
                }
            case P3:
                if (this.p3Quantity >= quantity) {
                    this.p3Quantity -= quantity;
                    return this.p3Quantity;
                } else {
                    productSoldOut(productCode);
                }
            default:
                throw new InvalidParameterException("Invalid product code. Try again ;)");
        }
    }

    private int productSoldOut(ProductCode productCode) {
        throw new InvalidParameterException(productCode.productName() + " sold out. Select another one ;)");
    }
}
