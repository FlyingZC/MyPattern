package com.zc.z07listener;

public class Bootstrap implements Lifecycle {
    private static boolean started = false;
    private LifecycleSupport lifecycle = new LifecycleSupport();

    public static void main(String[] args) {
        Bootstrap boot = new Bootstrap();
        // 注册监听
        Listener listener = new SimpleListener();
        boot.addLifecycleListener(listener);
        try {
            boot.start();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }
    }

    /**
     * 单一启动/关闭机制,只需要启动最高级的组件,其余组件会由各自的父组件去启动.同样关闭这些组件时,也只需要关闭最高层组件即可
     */
    public synchronized void start() throws LifecycleException {//先判断组件是否已经启动过了,若是,则抛出lifecycleException异常
        if (started)
            throw new LifecycleException("SimpleContext has already started" );
        //触发before_start_event事件,则对该事件进行监听的所有监听器都会收到通知.
        // Notify our interested LifecycleListeners,转调用lifecycleSupport类中的fireLifecycleEvent方法,它会负责将调用所有lifecycleListener数组中的事件方法
        lifecycle.fireLifecycleEvent(Lifecycle.BEFORE_START_EVENT, null);
        started = true;//表明已经启动
        try {   // 启动组件 和 子容器
            // Start our subordinate components, if any
/*            if ((loader != null) && (loader instanceof Lifecycle))
                ((Lifecycle) loader).start();

            // Start our child containers, if any,调用子容器的start方法
            Container children[] = findChildren();
            for (int i = 0; i < children.length; i++)
            {
                if (children[i] instanceof Lifecycle)
                    ((Lifecycle) children[i]).start();
            }

            // Start the Valves in our pipeline (including the basic),
            // if any
            if (pipeline instanceof Lifecycle)
                ((Lifecycle) pipeline).start();*/
            // Notify our interested LifecycleListeners,在所有组件和子容器都启动后,触发start_event
            lifecycle.fireLifecycleEvent(Lifecycle.START_EVENT, null);
        } catch (Exception e) {
            e.printStackTrace();
        }
        // 触发after_start_event事件
        // Notify our interested LifecycleListeners
        lifecycle.fireLifecycleEvent(Lifecycle.AFTER_START_EVENT, null);
    }

    @Override
    public void addLifecycleListener(Listener listener) {
        lifecycle.addLifecycleListener(listener);
    }

    @Override
    public Listener[] findLifecycleListeners() {
        return lifecycle.findLifecycleListeners();
    }

    @Override
    public void removeLifecycleListener(Listener listener) {
        lifecycle.removeLifecycleEvent(listener);
    }

    @Override
    public void stop() {
        lifecycle.fireLifecycleEvent(Lifecycle.BEFORE_STOP_EVENT, null);
        lifecycle.fireLifecycleEvent(Lifecycle.STOP_EVENT, null);
        lifecycle.fireLifecycleEvent(Lifecycle.AFTER_STOP_EVENT, null);
    }
}
