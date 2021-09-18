import greenfoot.*;

/**
 * Write a description of class Exit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Exit extends Inicio
{
    Game gestionNivel=(Game)getWorld();
    public void act() 
    {
        clicked();
    }
    public void clicked(){
        if(Greenfoot.mouseMoved(this)){
            
            this.setImage("ExitButtonPressed.png");
        }
        else if(!Greenfoot.mouseMoved(this)){

            this.setImage("ExitButton.png");
        }
        if(Greenfoot.mouseDragEnded(this)){
            Greenfoot.playSound("click.wav");
        }
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("click.wav");
            System.exit(0);
            
        }
 
    } 
    
}
