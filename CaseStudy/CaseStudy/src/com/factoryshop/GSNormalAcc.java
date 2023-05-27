package com.factoryshop;

public class GSNormalAcc extends NormalAcc {
    private static final float DeliveryCharges = 5.0f;

    public GSNormalAcc(int accNo, String accNm) {
        super(accNo, accNm, 0.0f, DeliveryCharges);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
