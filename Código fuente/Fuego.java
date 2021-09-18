import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
/**
 * Write a description of class Fuego here.
 * 
 * @author (Edinsson Adrian Melo Calvo-1151484) 
 * @version (1.0)
 */
public class Fuego extends Actor
{

    int velocidad=-5;

    public void act() 
    { 
        Game gestionNivel=(Game)getWorld();

        if(gestionNivel.getNivel()==1){
            setImage("FueoAmarrilla2.png");
            move(velocidad);
            Game escenario=(Game)getWorld();
            int y=Greenfoot.getRandomNumber(escenario.getHeight());

            if(getX()==0){
                Level1 espacio=(Level1)getWorld();
                setLocation(escenario.getWidth(),y);

                if(espacio.puntos.getContador()>=20 && espacio.puntos.getContador()<=50){
                    velocidad-=2;
                    move(velocidad);
                }
                else if(espacio.puntos.getContador()>=50 && espacio.puntos.getContador()<=120){
                    velocidad-=2;
                    move(velocidad);
                }
                else if(espacio.puntos.getContador()>=120 && espacio.puntos.getContador()<=150){
                    velocidad-=2;
                    move(velocidad);

                }
                else if(espacio.puntos.getContador()>=200 && espacio.puntos.getContador()<=250){
                    velocidad-=2;
                    move(velocidad);
                }
                else if(espacio.puntos.getContador()>=300 && espacio.puntos.getContador()<=1000){
                    velocidad-=5;
                    move(velocidad);
                }

            }
            //Intersección del personaje y las bolas de fuego.
            Actor meme=getOneObjectAtOffset(0,0,Meme.class);
            Actor aura=getOneObjectAtOffset(0, 0, Propulsion.class);
            Level1 espacio=(Level1)getWorld();
            if(meme!=null &&aura!=null){
                Greenfoot.playSound("SoundExplosion.wav");
                Smoke humo=new Smoke();
                humo.setImage("smoke2.png");
                espacio.addObject(humo, meme.getX(), meme.getY());
                getWorld().removeObject(meme);
                getWorld().removeObject(aura);

                espacio.vidas.decrementar();
                if(gestionNivel.vidas.getContador()<=0){
                    gestionNivel.changeLevel(7);
                    gestionNivel.crearNivel(gestionNivel.vidas.getContador(),gestionNivel.puntos.getContador());
                }
                getWorld().addObject(meme,150,300);
                getWorld().addObject(aura,50,300);
                setLocation(escenario.getWidth(),y);
            }

        }
        else if(gestionNivel.getNivel()==2){
            setImage("Misil4.png");
            setLocation(getX(),getY()+velocidad);

            Game escenario=(Game)getWorld();
            int x=Greenfoot.getRandomNumber(escenario.getWidth());

            if(getY()==0){
                Level2 espacio=(Level2)getWorld();
                setLocation(x,escenario.getHeight());

                if(espacio.puntos.getContador()>=20 && espacio.puntos.getContador()<=50){
                    velocidad-=1;
                    move(velocidad);
                }
                else if(espacio.puntos.getContador()>=50 && espacio.puntos.getContador()<=120){
                    velocidad-=1;
                    move(velocidad);
                }
                else if(espacio.puntos.getContador()>=120 && espacio.puntos.getContador()<=150){
                    velocidad-=1;
                    move(velocidad);

                }
                else if(espacio.puntos.getContador()>=200 && espacio.puntos.getContador()<=250){
                    velocidad-=1;
                    move(velocidad);
                }
                else if(espacio.puntos.getContador()>=300 && espacio.puntos.getContador()<=1000){
                    velocidad-=1;
                    move(velocidad);
                }

            }
            //Intersección del personaje y las bolas de fuego.
            Actor meme=getOneIntersectingObject(Meme.class);
            Actor aura=getOneObjectAtOffset(0, 0, Propulsion.class);
            Level2 espacio=(Level2)getWorld();
            if(meme!=null &&aura!=null){
                Greenfoot.playSound("SoundExplosion.wav");
                Smoke humo=new Smoke();
                humo.setImage("smoke2.png");
                espacio.addObject(humo, meme.getX(), meme.getY());
                espacio.removeObject(meme);
                espacio.removeObject(aura);
                espacio.vidas.decrementar();
                if(gestionNivel.vidas.getContador()<=0){
                    gestionNivel.changeLevel(7);
                    gestionNivel.crearNivel(gestionNivel.vidas.getContador(),gestionNivel.puntos.getContador());
                }
                espacio.addObject(meme,500,100);
                espacio.addObject(aura,500,70);
                setLocation(x,escenario.getHeight());
            } 
        }
        else if(gestionNivel.getNivel()==3){
            setImage("Piraña2.png");
            setLocation(getX(),getY()-velocidad);

            Game escenario=(Game)getWorld();
            int x=Greenfoot.getRandomNumber(escenario.getWidth());

            if(getY()==escenario.getHeight()-1){
                Level3 espacio=(Level3)getWorld();
                setLocation(x,0);

                if(espacio.puntos.getContador()>=20 && espacio.puntos.getContador()<=50){
                    velocidad-=1;
                    move(velocidad);
                }
                else if(espacio.puntos.getContador()>=50 && espacio.puntos.getContador()<=120){
                    velocidad-=1;
                    move(velocidad);
                }
                else if(espacio.puntos.getContador()>=120 && espacio.puntos.getContador()<=150){
                    velocidad-=1;
                    move(velocidad);

                }
                else if(espacio.puntos.getContador()>=200 && espacio.puntos.getContador()<=250){
                    velocidad-=1;
                    move(velocidad);
                }
                else if(espacio.puntos.getContador()>=300 && espacio.puntos.getContador()<=1000){
                    velocidad-=1;
                    move(velocidad);
                }

            }
            //Intersección del personaje y las bolas de fuego.
            Actor meme=getOneIntersectingObject(Meme.class);
            Actor aura=getOneObjectAtOffset(0, 0, Propulsion.class);
            Level3 espacio=(Level3)getWorld();
            if(meme!=null &&aura!=null){
                Greenfoot.playSound("SoundExplosion.wav");
                Smoke humo=new Smoke();
                humo.setImage("smoke2.png");
                espacio.addObject(humo, meme.getX(), meme.getY());
                espacio.removeObject(meme);
                espacio.removeObject(aura);
                espacio.vidas.decrementar();
                if(gestionNivel.vidas.getContador()<=0){
                    gestionNivel.changeLevel(7);
                    gestionNivel.crearNivel(gestionNivel.vidas.getContador(),gestionNivel.puntos.getContador());
                }
                espacio.addObject(meme,500,500);
                espacio.addObject(aura,500,70);
                setLocation(x,escenario.getHeight());
            } 
        }
    }
}

