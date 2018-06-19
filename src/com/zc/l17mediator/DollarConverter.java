package com.zc.l17mediator;

/**
 * @author flyingzc
 * 货币 币种金额转换
 */
public class DollarConverter
{
    private Mediator mediator;

    public static final float DOLLAR_UNIT = 1.0F;

    public static final float FRENCH_UNIT = 0.7F;

    public static final float INDIAN_UNIT = 45.0F;

    public DollarConverter(Mediator mediator)
    {
        this.mediator = mediator;
        mediator.registDollarConverter(this);
    }

    private float converFrenchToDollar(float frenchMoney)
    {
        float dollar = frenchMoney * (DOLLAR_UNIT / FRENCH_UNIT);
        System.out.println("converting " + frenchMoney + " FrenchMoney to " + dollar + " dollars");
        return dollar;
    }

    private float converIndianToDollar(float indianMoney)
    {
        float dollar = indianMoney * (DOLLAR_UNIT / INDIAN_UNIT);
        System.out.println("converting " + indianMoney + "FrenchMoney to " + dollar + " dollars");
        return dollar;
    }

    /**
     * 根据不同货币种类 转换为 美元
     * @param amount
     * @param unitOfCurr
     * @return
     */
    public float convertCurrencyToDollar(float amount, String unitOfCurr)
    {
        if ("FrenchMoney".equalsIgnoreCase(unitOfCurr))
        {
            return converFrenchToDollar(amount);
        }
        if ("IndianMoney".equalsIgnoreCase(unitOfCurr))
        {
            return converIndianToDollar(amount);
        }
        throw new RuntimeException("货币类型有误");
    }
}
