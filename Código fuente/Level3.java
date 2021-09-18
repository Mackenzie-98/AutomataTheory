import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends Game
{

    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3(int vidas, int puntos,char state)
    {    
        changeLevel(3);
        
        addState(state,'G');
        this.estado.setState('G');
        TextTransition transicion=new TextTransition();
        transicion.setImage("TH.png");
        addObject(transicion, 170, 580);
        Window ventana=new Window();
        addObject(ventana, 0, 1000);
        Meme asustado = new Meme();
        Meme personaje=new Meme();
        addObject(personaje, 500,500);
        Propulsion aura=new Propulsion();
        addObject(aura,personaje.getX(),personaje.getY()+100);
        this.puntos=new Points(puntos,"Score");
        this.vidas=new Hp(vidas,"Lives");
        crearFuegos(5);
        level=new LevelInfo(3,"Level");
        addObject(this.puntos,100,90);
        addObject(this.vidas,100,60);
        addObject(level,100,120);
    }
}
