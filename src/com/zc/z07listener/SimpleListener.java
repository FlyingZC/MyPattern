package com.zc.z07listener;

/**
 * @author flyingzc
 * wrapper的一个监听器
 */
public class SimpleListener implements Listener {
    @Override
    public void callEvent(Event event) {
        if (event == null || event.getType() == null)
            return;

        if (event.getType().equals(Lifecycle.BEFORE_START_EVENT)) {
            System.out.println("simpleWrapperListener--before start" );
        } else if (event.getType().equals(Lifecycle.START_EVENT)) {
            System.out.println("simpleWrapperListener--start" );
        } else if (event.getType().equals(Lifecycle.AFTER_START_EVENT)) {
            System.out.println("simpleWrapperListener--after start" );
        }

    }

}