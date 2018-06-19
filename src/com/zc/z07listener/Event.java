package com.zc.z07listener;

/**
 * @author flyingzc
 * 事件对象
 */
public class Event
{
    
    public Event(Lifecycle lifecycle, String type)
    {
        this(lifecycle, type, null);
    }
    
    public Event(Lifecycle lifecycle, String type, Object data)
    {
        super();
        this.data = data;
        this.lifecycle = lifecycle;
        this.type = type;
    }

    //--------------------------- Instance Variables
    private Object data = null;
    
    private Lifecycle lifecycle = null;
    
    private String type;

    public Object getData()
    {
        return data;
    }

    public Lifecycle getLifecycle()
    {
        return lifecycle;
    }

    public String getType()
    {
        return type;
    }

}
