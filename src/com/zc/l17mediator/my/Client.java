package com.zc.l17mediator.my;

public class Client
{
    public static void main(String[] args)
    {
        MainBoardMediator mainBoard = new MainBoardMediator();
        
        CDDriver cdDriver = new CDDriver(mainBoard);
        CPU cpu = new CPU(mainBoard);
        AudioCard audioCard = new AudioCard(mainBoard);
        VideoCard videoCard = new VideoCard(mainBoard);
        
        mainBoard.setAudioCard(audioCard);
        mainBoard.setCdDriver(cdDriver);
        mainBoard.setCpu(cpu);
        mainBoard.setVideoCard(videoCard);
        
        cdDriver.readData();
    }
}
