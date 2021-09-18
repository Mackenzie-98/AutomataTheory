import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Explosion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Smoke extends Actor
{
    /**
     * Act - do whatever the Explosion wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Game gestionNivel=(Game)getWorld();
        if(gestionNivel.getNivel()==1){
            move(-5);
            if(getX()==0){
                getWorld().removeObject(this);
            }
        }
        else if(gestionNivel.getNivel()==2){
            int y=getY();
            setLocation(getX(),y-5);
            if(getY()==0){
                getWorld().removeObject(this);
            }
        }
        else if(gestionNivel.getNivel()==3){
            int y=getY();
            setLocation(getX(),y+5);
            if(getY()==gestionNivel.getHeight()-1){
                getWorld().removeObject(this);
            }
        }
    }
}
