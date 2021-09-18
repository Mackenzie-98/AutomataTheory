import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class FuegoAzul here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FuegoAzul extends Actor
{
    World mundo= getWorld();

    int velocidad=-10;
    int contador=0;
    int rotacion=300;
    double direction,posX,posY,vX,vY,aX,aY,dt=0.1;//Movimiento parabólico
    public void addedToWorld(World Level3){
        posX=getX();
        posY=getY();

        aX=0;
        aY=10;

        vX=30;
        vY=-Greenfoot.getRandomNumber(60);
    }

    public void act() 
    {
        Game gestionNivel=(Game)getWorld();

        if(gestionNivel.getNivel()==1){
            setImage("FuegoAzul3.png");
            move(velocidad);
            setRotation(rotacion);

            if(getY()==0){
                rotacion=300;

            }
            if(getY()==599){
                rotacion=45;
            }

            Actor meme=getOneObjectAtOffset(0,0,Meme.class);
            if(meme!=null){
                Greenfoot.playSound("SoundExplosion.wav");
                Smoke humo=new Smoke();
                humo.setImage("explosionsmall3.png");
                getWorld().addObject(humo, meme.getX(), meme.getY());
                getWorld().removeObject(meme);
                gestionNivel.vidas.decrementar();
                if(gestionNivel.vidas.getContador()<=0){
                    gestionNivel.changeLevel(7);
                    gestionNivel.crearNivel(gestionNivel.vidas.getContador(),gestionNivel.puntos.getContador());
                }
                getWorld().addObject(meme,100,300);
                setLocation(getWorld().getWidth(),getWorld().getHeight());
            }
            if(getX()==0){
                contador++;
                if(contador%10==0){
                    velocidad--;
                }
                getWorld().removeObject(this);

            }
        }
        else if(gestionNivel.getNivel()==2){

            setImage("kunai.png");
            List nave=getObjectsInRange(2000,Meme.class);
            Iterator it=nave.iterator();
            if(it.hasNext())
            {
                Meme personaje=(Meme)it.next();
                if(personaje!=null)
                {
                    turn(45);
                    setLocation(personaje.getX(),getY()-8);
                }
            }

            Actor meme=getOneObjectAtOffset(0,0,Meme.class);
            if(meme!=null){
                Greenfoot.playSound("SoundExplosion.wav");
                Level2 espacio=(Level2)getWorld();
                Smoke humo=new Smoke();
                humo.setImage("smoke2.png");
                espacio.addObject(humo, meme.getX(), meme.getY());
                getWorld().removeObject(meme);
                gestionNivel.vidas.decrementar();
                if(gestionNivel.vidas.getContador()<=0){
                    gestionNivel.changeLevel(7);
                    gestionNivel.crearNivel(gestionNivel.vidas.getContador(),gestionNivel.puntos.getContador());

                }
                getWorld().addObject(meme,500,100);
                setLocation(getWorld().getWidth(),getWorld().getHeight());
            }
        }

        else if(gestionNivel.getNivel()==3){
            setImage("ancla2.png");

            if(getX()==0){
                direction=1;

            }
            else if(getX()==999){
                direction=-1;

            }

            if(direction==1){
                posX+=vX*dt+0.5*aX*dt*dt;
                posY+=vY*dt+0.5*aX*dt*dt;

                vX+=aX*dt;
                vY+=aY*dt;

                setLocation((int)posX,(int)posY);
            }
            else if(direction==-1){
                posX-=vX*dt+0.5*aX*dt*dt;
                posY+=vY*dt+0.5*aX*dt*dt;

                vX+=aX*dt;
                vY+=aY*dt;

                setLocation((int)posX,(int)posY);
            }
            if(Greenfoot.getRandomNumber(100)<10){
                setLocation(getX(),getY()+20);
            }

            Actor meme=getOneObjectAtOffset(0,0,Meme.class);
            if(meme!=null){
                Greenfoot.playSound("SoundExplosion.wav");
                Level3 espacio=(Level3)getWorld();
                Smoke humo=new Smoke();
                humo.setImage("smoke2.png");
                espacio.addObject(humo, meme.getX(), meme.getY());
                getWorld().removeObject(meme);
                gestionNivel.vidas.decrementar();
                if(gestionNivel.vidas.getContador()<=0){
                    gestionNivel.changeLevel(7);
                    gestionNivel.crearNivel(gestionNivel.vidas.getContador(),gestionNivel.puntos.getContador());
                }
                getWorld().addObject(meme,500,500);
                setLocation(getWorld().getWidth(),getWorld().getHeight());
            }
            if(getY()==599){
                getWorld().removeObject(this);
            }
        }
    }

    public int getRandomNumber(int start,int end)
    {
        int normal = Greenfoot.getRandomNumber(end-start+1);
        return normal+start;
    }

}

