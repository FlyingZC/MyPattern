package com.zc.l17mediator;

public class MediatorTest {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        Buyer indianBuyer = new IndianBuyer(mediator);
        Buyer frenchBuyer = new FrenchBuyer(mediator);
        // 美元竞拍售价
        float sellingPriceInDollars = 10.0f;
        AmericanSeller americanSeller = new AmericanSeller(mediator, sellingPriceInDollars);
        DollarConverter dollarConverter = new DollarConverter(mediator);
        float indianBidMoney = 5.0f;
        // 以后优化成竞争
        while (!indianBuyer.attemptToPurchase(indianBidMoney)) {
            indianBidMoney += 3.0f;
        }
        float frenchBidMoney = 3.0f;
        while (!frenchBuyer.attemptToPurchase(frenchBidMoney)) {
            frenchBidMoney += 5f;
        }
    }
}
