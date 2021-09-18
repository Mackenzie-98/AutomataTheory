import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class End here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class End extends Game
{

    /**
     * Constructor for objects of class End.
     * 
     */
    public End(char state)
    {
        changeLevel(6);
        addState(state,'I');
        this.estado.setState('I');
        TextTransition transicion=new TextTransition();
        transicion.setImage("TH.png");
        addObject(transicion, 170, 580);
        Window ventana=new Window();
        addObject(ventana, 0, 1000);
        Greenfoot.playSound("Aplausos.wav");
        Confetti celebracion=new Confetti();
        Back back=new Back();
        Restart texto=new Restart();
        addObject(back, 900, 550);
        addObject(texto, 900, 550);
        addObject(celebracion,500,0);
    }
}