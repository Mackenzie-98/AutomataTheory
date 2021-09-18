import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Controls here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Controls extends Inicio
{
    /**
     * Act - do whatever the Controls wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
       clicked();
    }    

    public void clicked(){
        if(Greenfoot.mouseMoved(this)){
            this.setImage("GamingButtonPressed.png");
        }
        else if(!Greenfoot.mouseMoved(this)){
            this.setImage("GamingButton.png");
        }
                if(Greenfoot.mouseDragEnded(this)){
            Greenfoot.playSound("click.wav");
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("click.wav");
            Game gestionMenu=(Game)getWorld();
            gestionMenu.changeLevel(5);
            gestionMenu.crearNivel(10,0);

        }
    }
}
