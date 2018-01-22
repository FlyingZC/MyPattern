package com.zc.l17mediator.mymediatordemo;

/**
 * @author flyingzc
 * 主板 中介者 负责和其他部件(同事)交互
 * 
 * 1.光驱 读取光盘上的数据->告知主板
 * 2.主板 得到通知 将数据交给 cpu处理
 * 3.cpu处理时将数据分为视频数据和音频数据,完成后通知主板
 * 4.主板将cpu处理后的数据,分别交给显卡和声卡,去显示视频和发出声音
 */
public class MainBoardMediator
{
    private CDDriver cdDriver;
    private CPU cpu;
    private AudioCard audioCard;
    private VideoCard videoCard;
    
    public void notification(Colleague colleague)
    {
        if(colleague == cdDriver)
        {
            //2.得到通知后 将数据交给cpu处理
            this.cpu.handleData(cdDriver.getCdData());
        }
        if(colleague == cpu)
        {
            this.audioCard.play(cpu.getAudioData());
            this.videoCard.play(cpu.getVideoData());
        }
    }

    public CDDriver getCdDriver()
    {
        return cdDriver;
    }

    public void setCdDriver(CDDriver cdDriver)
    {
        this.cdDriver = cdDriver;
    }

    public CPU getCpu()
    {
        return cpu;
    }

    public void setCpu(CPU cpu)
    {
        this.cpu = cpu;
    }

    public AudioCard getAudioCard()
    {
        return audioCard;
    }

    public void setAudioCard(AudioCard audioCard)
    {
        this.audioCard = audioCard;
    }

    public VideoCard getVideoCard()
    {
        return videoCard;
    }

    public void setVideoCard(VideoCard videoCard)
    {
        this.videoCard = videoCard;
    }
    
}
