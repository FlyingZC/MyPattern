package com.zc.l17mediator;

public class FrenchBuyer extends Buyer
{

    public FrenchBuyer(Mediator mediator)
    {
        super(mediator, "FrenchMoney");
        mediator.registerFrenchBuyer(this);
    }
}
