import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Credits here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Credits extends Inicio
{
    /**
     * Act - do whatever the Credits wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        clicked();
    }

    public void clicked(){
        if(Greenfoot.mouseMoved(this)){
            this.setImage("CreditsButtonPressed.png");
        }
        else if(!Greenfoot.mouseMoved(this)){
            this.setImage("CreditsButton.png");
        }
        if(Greenfoot.mouseDragEnded(this)){
            Greenfoot.playSound("click.wav");
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("click.wav");
            Game gestionMenu=(Game)getWorld();
            gestionMenu.changeLevel(4);
            gestionMenu.crearNivel(10,0);

        }

    } 
}
