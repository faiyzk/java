package com.factoryshop;

public abstract class PrimeAcc extends ShopAcc {
    private boolean isPrime;

    public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
        super(accNo, accNm, charges);
        this.isPrime = isPrime;
    }

    @Override
    public void bookProduct(float price) {
        System.out.println("Product booked with price: $" + price);
    }

    @Override
    public String toString() {
        return super.toString() + "\nAccount Type: Prime";
    }
}
