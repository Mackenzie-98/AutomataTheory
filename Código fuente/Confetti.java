import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Confetti here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Confetti extends Actor
{
    /**
     * Act - do whatever the Confetti wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Game gestionNivel=(Game)getWorld();
        if(gestionNivel.getNivel()==1 ||gestionNivel.getNivel()==0){
            move(-5);
            setImage("estrellas.png");
            if(getX()==0){
                setLocation(999,300);
            }
        }
        else if(gestionNivel.getNivel()==6){
            this.setImage("Confetti.png");
            setLocation(getX(),getY()+5);
            if(getY()==599){
                setLocation(getX(),0);
            }
        }    
    }
}

