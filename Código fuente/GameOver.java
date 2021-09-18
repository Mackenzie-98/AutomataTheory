import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GameOver here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GameOver extends Game
{

    /**
     * Constructor for objects of class GameOver.
     * 
     */
    public GameOver(int puntos,char state)
    {
        
        changeLevel(7);
        addState(state,'C');
        this.estado.setState('C');
        TextTransition transicion=new TextTransition();
        transicion.setImage("TL0.png");
        addObject(transicion, 170, 580);
        Window ventana=new Window();
        addObject(ventana, 0, 1000);
        this.puntos=new Points(puntos,"Score");
        Back back=new Back();
        Restart texto=new Restart();
        addObject(this.puntos, 515, 380);
        addObject(back, 900, 550);
        addObject(texto, 900, 550);
    }
}
