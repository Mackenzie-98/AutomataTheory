import greenfoot.*;

/**
 * Write a description of class Theory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Theory extends Inicio
{
    /**
     * Act - do whatever the Theory wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        clicked();
    }    

    public void clicked(){
        if(Greenfoot.mouseMoved(this)){
            this.setImage("AutomataButtonPressed.png");
        }
        else if(!Greenfoot.mouseMoved(this)){
            this.setImage("AutomataButton.png");
        }
        if(Greenfoot.mouseDragEnded(this)){
            Greenfoot.playSound("click.wav");
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("click.wav");
            Game gestionMenu=(Game)getWorld();
            gestionMenu.changeLevel(8);
            gestionMenu.crearNivel(10,0);

        }

    }
}
