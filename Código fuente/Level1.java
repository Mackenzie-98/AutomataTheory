import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Escenario del juego.
 * 
 * @author (Edinsson Adrian Melo Calvo)) 
 * @version (1.0)
 */
public class Level1 extends Game
{
    public Level1(int health, int score,char state)
    {
        changeLevel(1);        
        
        addState(estado.getState(),'B');
        this.estado.setState('B');
        TextTransition transicion=new TextTransition();
        transicion.setImage("TS1.png");
        addObject(transicion, 170, 580);
        Window ventana=new Window();
        addObject(ventana, 0, 1000);
        Meme personaje=new Meme();
        addObject(personaje, 150, 300);
        Propulsion aura=new Propulsion();
        addObject(aura,personaje.getX()-100,personaje.getY());
        crearFuegos(6);
        vidas=new Hp(health,"Lives");
        puntos=new Points(score,"Score");
        level=new LevelInfo(1,"Level");
        Confetti estrellas=new Confetti();
        addObject(estrellas,999,300);
        addObject(puntos,100,90);
        addObject(vidas,100,60);
        addObject(level,100,120);
        

    }
}
