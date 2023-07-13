package com.mycompany.movementobj;
public class Player extends Movement
{
    @Override
    public void moveup()
    {
        System.out.println("Player Move Up");
    }
    @Override
    public void movedown()
    {
        System.out.println("Player Move Down");
    }
    @Override
    public void moveleft()
    {
        System.out.println("Player Move left");
    }
    @Override
    public void moveright()
    {
        System.out.println("Player Move Right");
    }
    
}
