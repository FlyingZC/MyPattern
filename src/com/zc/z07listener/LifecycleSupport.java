package com.zc.z07listener;

/**
 * @author flyingzc
 * 实现Lifecycle接口,并对某个事件注册了监听器的组件 必须提供lifecycle接口中3个与监听器相关的方法
 */
public final class LifecycleSupport
{
    public LifecycleSupport()
    {
        this.lifecycle = lifecycle;
    }
    
    private Lifecycle lifecycle = null;
    
    private Listener[] listeners = new Listener[0];
    
    public void addLifecycleListener(Listener listener)
    {
        synchronized(listeners)
        {
            Listener[] results = new Listener[listeners.length + 1];
            results[results.length - 1] = listener;
            for (int i = 0; i < listeners.length; i++)
            {
                results[i] = listeners[i];
            }
            listeners = results;
        }
    }
    
    public Listener[] findLifecycleListeners()
    {
        return listeners;
    }
    
    public void fireLifecycleEvent(String type, Object data)
    {
        Event event = new Event(lifecycle, type, data);
        Listener[] interested = null; 
        synchronized (listeners)
        {
            interested = listeners.clone();
        }
        for (int i = 0; i < interested.length; i++)
        {
            interested[i].callEvent(event);
        }
    }
    
    public void removeLifecycleEvent(Listener listener)
    {
        synchronized(listeners)
        {
            int n = -1;
            for (int i = 0; i < listeners.length; i++)
            {
                if (listeners[i] == listener)
                    n = i;
            }
            if (n < 0)
                return;
            Listener[] results = new Listener[listeners.length - 1];
            int j = 0;
            for (int i = 0; i < listeners.length; i++)
            {
                if (i != n)
                    results[j++] = listeners[i];
            }
            listeners = results;
        }
    }
}
