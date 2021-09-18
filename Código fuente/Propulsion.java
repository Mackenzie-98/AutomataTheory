import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.Iterator;
/**
 * Write a description of class Propulsion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Propulsion extends Actor
{ 

    public Propulsion(){

    }
    public void act() 
    {
        Game gestionNivel=(Game)getWorld();
        if(gestionNivel.getNivel()==1){

            GreenfootImage imagen=getImage();
            imagen.setTransparency(getRandomNumber(0, 250));

            List nave=getObjectsInRange(2000,Meme.class);
            Iterator it=nave.iterator();
            if(it.hasNext())
            {
                Meme personaje=(Meme)it.next();
                if(personaje!=null)
                {
                    setLocation(personaje.getX()-100,personaje.getY());
                }
            }
        }
        else if(gestionNivel.getNivel()==2){
            setImage("PropulsionRotada.png");
            GreenfootImage imagen=getImage();
            imagen.setTransparency(getRandomNumber(0, 250));

            List nave=getObjectsInRange(2000,Meme.class);
            Iterator it=nave.iterator();
            if(it.hasNext())
            {
                Meme personaje=(Meme)it.next();
                if(personaje!=null)
                {
                    setLocation(personaje.getX(),personaje.getY()-100);
                }
            }
        }
        else if(gestionNivel.getNivel()==3){
            setImage("PropulsionRotada2.png");
            GreenfootImage imagen=getImage();
            imagen.setTransparency(getRandomNumber(0, 250));

            List nave=getObjectsInRange(2000,Meme.class);
            Iterator it=nave.iterator();
            if(it.hasNext())
            {
                Meme personaje=(Meme)it.next();
                if(personaje!=null)
                {
                    setLocation(personaje.getX()-3,personaje.getY()+100);
                }
            }
        }
        
    }
        
        public int getRandomNumber(int start,int end)
        {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;

    }
}

