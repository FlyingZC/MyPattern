package com.zc.l14command;

import java.util.ArrayList;
import java.util.List;

//调用者
public class Switch
{
    private List<Command> commandHistory = new ArrayList<Command>();

    public Switch()
    {

    }

    /**
     * 调用者存储并执行命令
     * @param cmd
     */
    public void storeAndExecute(Command cmd)
    {
        this.commandHistory.add(cmd);//可选的
        cmd.execute();
    }
}
