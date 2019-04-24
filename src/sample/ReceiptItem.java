/*
 * Copyright (c) RESONANCE JSC, 22.04.2019
 */

package sample;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @author Dmitriy Bludov
 */

public class ReceiptItem {
    private String name;
    // TODO: 24.04.2019 barcode, code and vendoreCode best types?
    private String barcode;
    private int code;
    private int vendorCode;

    private boolean isDiscountAllowed;
    private boolean isExcisable;
    private boolean isDividable;
    private boolean isFreePrice;
    private boolean isFiscal;
    private char tax1;
    private char tax2;
    private BigDecimal price;

    private float quantity = 1.0f;

    void setPrice(BigDecimal newPrice) {
        this.price = newPrice;
    }

    void addQuantity(float quantity) {
        this.quantity += quantity;
    }

    void setQuantity(float newQuantity) {
        this.quantity = newQuantity;
    }

    float getQuantity() {
        return quantity;
    }

    // TODO: 24.04.2019 Update equals and hashCode methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ReceiptItem that = (ReceiptItem) o;
        return code == that.code &&
                vendorCode == that.vendorCode &&
                isDiscountAllowed == that.isDiscountAllowed &&
                isExcisable == that.isExcisable &&
                isDividable == that.isDividable &&
                isFreePrice == that.isFreePrice &&
                isFiscal == that.isFiscal &&
                tax1 == that.tax1 &&
                tax2 == that.tax2 &&
                Objects.equals(name, that.name) &&
                barcode.equals(that.barcode) &&
                Objects.equals(price, that.price);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, barcode, code, vendorCode, isDiscountAllowed, isExcisable, isDividable, isFreePrice, isFiscal, tax1, tax2, price);
    }
}