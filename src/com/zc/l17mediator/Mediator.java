package com.zc.l17mediator;

// 中介者类,负责完成两个买家(印度买家 和 法国买家)与美国卖家 之间的沟通,以及货币转换
public class Mediator
{
    // 引入买家,卖家,货币转换
    private Buyer indianBuyer;

    private Buyer frenchBuyer;

    private AmericanSeller amerianSeller;

    private DollarConverter dollarConverter;//货币转换类

    public Mediator()
    {

    }

    /**
     * 投标金额 和 货币单位
     * 调用dollarConverter方法实现将不同货币转换的功能.
     * 再询问卖家,若投标被接受,则返回结果
     * @param bid
     * @param unitOfCurrency
     * @return
     */
    public boolean placeBid(float bid, String unitOfCurrency)
    {
        float dollarAmount = dollarConverter.convertCurrencyToDollar(bid, unitOfCurrency);
        return amerianSeller.isBidAccepted(dollarAmount);
    }

    public void registerIndianBuyer(IndianBuyer indianBuyer)
    {
        this.indianBuyer = indianBuyer;
    }

    public void registerFrenchBuyer(FrenchBuyer frenchBuyer)
    {
        this.frenchBuyer = frenchBuyer;
    }

    public void registAmericanSeller(AmericanSeller americanSeller)
    {
        this.amerianSeller = americanSeller;
    }

    public void registDollarConverter(DollarConverter dollarConverter)
    {
        this.dollarConverter = dollarConverter;
    }
}
