import greenfoot.*;

/**
 * Write a description of class Automata here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Automata extends Game
{

    /**
     * Constructor for objects of class Automata.
     * 
     */
    public Automata()
    {
        changeLevel(8);
        Back back=new Back();
        TextBack texto=new TextBack();
        addObject(back, 900, 577);
        addObject(texto, 903, 578);
    }
}
