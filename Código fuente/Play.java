import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Inicio
{

    boolean sound=false;
    public Play(){

    }

    public void act() 
    {
        clicked();
    }

    public void clicked(){
        if(Greenfoot.mouseMoved(this)){
            this.setImage("StartL.png");
        }
        else if(!Greenfoot.mouseMoved(this)){
            this.setImage("ButtonBar1.png");
        }
        if(Greenfoot.mouseDragEnded(this)){
            Greenfoot.playSound("click.wav");
        }
        if(Greenfoot.mouseClicked(this)){
            Game gestionNivel=(Game)getWorld();
            Greenfoot.playSound("Play.wav");
            gestionNivel.changeLevel(1);
            gestionNivel.crearNivel(5,0);
        }

    }

}
