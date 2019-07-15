package com.tws.refactoring.extract_variable;

public class PriceCalculator {
    private final int QUANTITY_BOUND = 500;
    private final double FIVE_DISCOUNT = 0.05;
    private final double ONE_DISCOUNT = 0.1;
    private final double UP_LIMIT = 100.0;

    public double getPrice(int quantity, int itemPrice) {
        // Price consists of: base price - discount + shipping cost
        double basePrice = getBasePrice(quantity, itemPrice);
        double discountPrice = getDiscountPrice(quantity, itemPrice);
        double shippingCost = getShipingPrice(quantity, itemPrice);
        return basePrice - discountPrice + shippingCost;

    }

    public double getBasePrice(int quantity, int itemPrice) {
        double basePrice = quantity * itemPrice;
        return basePrice;
    }

    public double getDiscountPrice(int quantity, int itemPrice) {
        double discountPrice = Math.max(0, quantity - QUANTITY_BOUND) * itemPrice * FIVE_DISCOUNT;
        return discountPrice;
    }

    public double getShipingPrice(int quantity, int itemPrice) {
        double shippingCost = Math.min(quantity * itemPrice * ONE_DISCOUNT, UP_LIMIT);
        return shippingCost;
    }
}
