package com.factoryshop;



public abstract class ShopAcc {
    private int accNo;
    private String accNm;
    private float charges;
    
    public static void main(String[] args) {
		
    	
	}

    public ShopAcc(int accNo, String accNm, float charges) {
        this.accNo = accNo;
        this.accNm = accNm;
        this.charges = charges;
    }

    public abstract void bookProduct(float price);

    public void items(float price) {
        System.out.println("Items purchased for $" + price);
    }

    @Override
    public String toString() {
        return "Account Number: " + accNo + "\nAccount Name: " + accNm + "\nCharges: $" + charges;
    }
}




