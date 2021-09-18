import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Escenario del juego.
 * 
 * @author (Edinsson Adrian Melo Calvo)) 
 * @version (1.0)
 */
public class Level2 extends Game
{
    BossLife barra;
    public Level2(int vidas, int puntos,char state)
    {
        changeLevel(2);
        addState(state,'E');
        this.estado.setState('E');
        TextTransition transicion=new TextTransition();
        transicion.setImage("TH.png");
        addObject(transicion, 170, 580);
        Window ventana=new Window();
        addObject(ventana, 0, 1000);
        Meme asustado = new Meme();
        Meme personaje=new Meme();
        addObject(personaje, 500,100);
        Propulsion aura=new Propulsion();
        addObject(aura,personaje.getX(),personaje.getY()-100);
        this.puntos=new Points(puntos,"Score");
        this.vidas=new Hp(vidas,"Lives");
        crearFuegos(10);
        level=new LevelInfo(2,"Level");
        addObject(this.puntos,100,90);
        addObject(this.vidas,100,60);
        addObject(level,100,120);
    }



}
