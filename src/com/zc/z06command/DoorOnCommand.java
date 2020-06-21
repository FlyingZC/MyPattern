package com.zc.z06command;

public class DoorOnCommand implements Command {
    Door door = new Door();

    public DoorOnCommand(Door door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.open();
    }

}
