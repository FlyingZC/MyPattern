package com.zc.z07listener;

/**
 * @author flyingzc
 * 生命周期接口
 */
public interface Lifecycle
{
    //--------------Manifest Constants
    public static final String BEFORE_START_EVENT = "before_start";
    
    public static final String START_EVENT = "start";
    
    public static final String AFTER_START_EVENT = "after_start";
    
    public static final String BEFORE_STOP_EVENT = "before_stop";
    
    public static final String STOP_EVENT = "stop";
    
    public static final String AFTER_STOP_EVENT = "after_stop";
    
    //------------Public Methods
    public void addLifecycleListener(Listener listener);
    
    public Listener[] findLifecycleListeners();
    
    public void removeLifecycleListener(Listener listener);
    
    public void start() throws LifecycleException;
    
    public void stop();
    
}
