package com.zc.l17mediator.my;

public class Colleague {
    private MainBoardMediator mediator;

    public Colleague(MainBoardMediator mediator) {
        this.mediator = mediator;
    }

    public MainBoardMediator getMediator() {
        return mediator;
    }

    public void setMediator(MainBoardMediator mediator) {
        this.mediator = mediator;
    }

}
