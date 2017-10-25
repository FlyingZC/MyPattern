package com.zc.l02abstractfactory.myfactorymethoddemo;

public class Computer
{
    private CPU cpu;
    private KeyBoard keyBoard;
    private String logo;
    
    public String getLogo()
    {
        return logo;
    }
    public void setLogo(String logo)
    {
        this.logo = logo;
    }
    public CPU getCpu()
    {
        return cpu;
    }
    public void setCpu(CPU cpu)
    {
        this.cpu = cpu;
    }
    public KeyBoard getKeyBoard()
    {
        return keyBoard;
    }
    public void setKeyBoard(KeyBoard keyBoard)
    {
        this.keyBoard = keyBoard;
    }
    @Override
    public String toString()
    {
        return "Computer [cpu=" + cpu + ", keyBoard=" + keyBoard + ", logo=" + logo + "]";
    }
    
}
