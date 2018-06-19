package com.zc.l17mediator;

// 买家基类
public class Buyer
{
    private Mediator mediator;

    private String unitOfCurrency;

    public Buyer(Mediator mediator, String unitOfCurrency)
    {
        this.mediator = mediator;
        this.unitOfCurrency = unitOfCurrency;
    }
    /**尝试竞拍购买*/
    public boolean attemptToPurchase(float bid)
    {
        System.out.println("Buyer attempting a bid of : " + bid + " " + unitOfCurrency);
        return mediator.placeBid(bid, unitOfCurrency);
    }
}
