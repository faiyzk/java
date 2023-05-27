package com.factoryshop;

public abstract class NormalAcc extends ShopAcc {
    private float deliveryCharges;

    public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
        super(accNo, accNm, charges);
        this.deliveryCharges = deliveryCharges;
    }

    @Override
    public void bookProduct(float price) {
        System.out.println("Product booked with price: $" + price + " (Including delivery charges: $" + deliveryCharges + ")");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: Normal";
    }
}
