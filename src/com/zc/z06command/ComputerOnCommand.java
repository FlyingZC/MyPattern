package com.zc.z06command;

/**
 * 开电脑的命令
 *
 * @author
 */
public class ComputerOnCommand implements Command {
    private Computer computer;

    public ComputerOnCommand(Computer computer) {
        this.computer = computer;
    }

    @Override
    public void execute() {
        computer.on();
    }
}