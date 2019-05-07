package com.example.homepage.HomePage.Model;

public class Product {
    private int productImage;
    private String productId, checkStock, productName, firstButton, secondButton, thirdButton, fourthButton, fifthButton, productCount1, productCount2, productCount3, discount1, discount2, discount3;
    private double price, price1, price2, price3;

    public Product(int productImage, String productId, String checkStock, String productName, String firstButton, String secondButton, String thirdButton, String fourthButton, String fifthButton,
                   String productCount1, String productCount2, String productCount3, String discount1, String discount2, String discount3, double price, double price1, double price2, double price3) {
        this.productImage = productImage;
        this.productId = productId;
        this.checkStock = checkStock;
        this.productName = productName;
        this.firstButton = firstButton;
        this.secondButton = secondButton;
        this.thirdButton = thirdButton;
        this.fourthButton = fourthButton;
        this.fifthButton = fifthButton;
        this.productCount1 = productCount1;
        this.productCount2 = productCount2;
        this.productCount3 = productCount3;
        this.discount1 = discount1;
        this.discount2 = discount2;
        this.discount3 = discount3;
        this.price = price;
        this.price1 = price1;
        this.price2 = price2;
        this.price3 = price3;
    }

    public String getProductId() {
        return productId;
    }

    public int getProductImage() {
        return productImage;
    }

    public String getCheckStock() {
        return checkStock;
    }

    public String getProductName() {
        return productName;
    }

    public String getFirstButton() {
        return firstButton;
    }

    public String getSecondButton() {
        return secondButton;
    }

    public String getThirdButton() {
        return thirdButton;
    }

    public String getFourthButton() {
        return fourthButton;
    }

    public String getFifthButton() {
        return fifthButton;
    }

    public String getProductCount1() {
        return productCount1;
    }

    public String getProductCount2() {
        return productCount2;
    }

    public String getProductCount3() {
        return productCount3;
    }

    public String getDiscount1() {
        return discount1;
    }

    public String getDiscount2() {
        return discount2;
    }

    public String getDiscount3() {
        return discount3;
    }

    public double getPrice() {
        return price;
    }

    public double getPrice1() {
        return price1;
    }

    public double getPrice2() {
        return price2;
    }

    public double getPrice3() {
        return price3;
    }
}

