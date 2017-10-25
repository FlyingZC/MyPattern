package com.zc.l17mediator;

public class IndianBuyer extends Buyer{
	public IndianBuyer(Mediator mediator) {
		super(mediator, "IndianMoney");
		mediator.registerIndianBuyer(this);
	}

}
