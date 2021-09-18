import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WallControls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WallControls extends Game
{

    /**
     * Constructor for objects of class WallControls.
     * 
     */
    public WallControls()
    {
        Back back=new Back();
        TextBack texto=new TextBack();
        addObject(back, 900, 550);
        addObject(texto, 903, 551);
    }
}
