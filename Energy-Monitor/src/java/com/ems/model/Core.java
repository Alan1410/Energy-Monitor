package com.ems.model;

/**
 *
 * @author Alan
 * @param <T>
 */
public abstract class Core<T>
{
    private int id;

    public int getId()
    {
        return id;
    }

    public void setId( int id ) 
    {
        this.id = id;
    }
}