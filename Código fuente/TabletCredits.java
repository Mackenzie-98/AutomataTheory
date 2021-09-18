import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TextCredits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TabletCredits extends Game
{
    /**
     * Constructor for objects of class TextCredits.
     * 
     */
    public TabletCredits()
    {
        Back back=new Back();
        TextBack texto=new TextBack();
        addObject(back, 900, 550);
        addObject(texto, 900, 549);
    }
    
}
