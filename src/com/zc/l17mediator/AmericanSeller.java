package com.zc.l17mediator;
//获取对中介者的引用和所设置的priceInDollars值(用于销售产品的价格).
public class AmericanSeller {
	private Mediator mediator;
	private float priceInDollars;//竞拍的底价
	public AmericanSeller(Mediator mediator,float priceInDollars){
		this.mediator=mediator;
		this.priceInDollars=priceInDollars;
		mediator.registAmericanSeller(this);
	}
	/**
	 * 获取美元报价,若该报价最高,会接收该报价
	 * @param bidInDollars 投标金额
	 * @return
	 */
	public boolean isBidAccepted(float bidInDollars){
		if(bidInDollars>=priceInDollars){
			System.out.println("Seller accepts bid of"+bidInDollars);
			return true;
		}else{
			System.out.println("Seller rejects bid of"+bidInDollars);
			return false;
		}
	}
}
