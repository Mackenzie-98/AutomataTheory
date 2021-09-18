import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.Iterator;
/**
 * Write a description of class BossFuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossFuego extends Actor
{
    int velocidad= 4;
    int direccion=1;
    boolean cambioDeDireccion=false;
    int disparoAleatorio=0;
    int helice=0;
    boolean segundoDisparo=false;
    public void act() 
    {
        Game gestionNivel=(Game)getWorld();
        if(gestionNivel.getNivel()==1){
            setImage("Boss1.png");

            if(getY()>=25 && !cambioDeDireccion){
                direccion=-1;
            }
            else {
                cambioDeDireccion=true;
            }

            if(getY()<=450 && cambioDeDireccion){
                direccion=1;
            }
            else{
                cambioDeDireccion=false;
            }
            setLocation(900,getY()+(velocidad*direccion));

            disparoAleatorio=Greenfoot.getRandomNumber(100);
            if(disparoAleatorio==50 || disparoAleatorio==75){
                ShotBossFuego disparo= new ShotBossFuego();
                getWorld().addObject(disparo,getX(),getY()+70);
            }

            Actor shot=getOneIntersectingObject(Shot.class);
            if(shot!=null){

                Level1 espacio=(Level1)getWorld();
                getWorld().removeObject(shot);

                espacio.barra.decrementar();
                if(espacio.barra.getContador()<=0){

                    Game nivel=(Game)getWorld();
                    nivel.changeLevel(2);
                    nivel.crearNivel(espacio.vidas.getContador(),espacio.puntos.getContador());

                }
            }
        }
        else if(gestionNivel.getNivel()==2){
            setImage("boss22.png");

            if(getX()>=100 && !cambioDeDireccion){
                direccion=-1;
            }
            else {
                cambioDeDireccion=true;
            }

            if(getX()<=950 && cambioDeDireccion){
                direccion=1;
            }
            else{
                cambioDeDireccion=false;
            }
            move(2*direccion);

            disparoAleatorio=Greenfoot.getRandomNumber(100);
            if((disparoAleatorio==50 || disparoAleatorio==76)&& segundoDisparo==false){
                ShotBossFuego disparo= new ShotBossFuego();
                getWorld().addObject(disparo,getX()-80,getY());
                segundoDisparo=true;
            }
            if((disparoAleatorio==3 || disparoAleatorio==90)&& segundoDisparo==true){
                ShotBossFuego disparo= new ShotBossFuego();
                getWorld().addObject(disparo,getX()+80,getY());
                segundoDisparo=false;
            }

            Actor shot=getOneObjectAtOffset(0,0, Shot.class);
            if(shot!=null){

                Game espacio=(Game)getWorld();
                espacio.removeObject(shot);

                espacio.barra.decrementar();
                if(espacio.barra.getContador()<=0){
                    espacio.changeLevel(3);
                    espacio.crearNivel(espacio.vidas.getContador(),espacio.puntos.getContador());

                }
            }

        }
        else if(gestionNivel.getNivel()==3){
            setImage("Boss3.png");

            if(getX()>=100 && !cambioDeDireccion){
                direccion=-1;
            }
            else {
                cambioDeDireccion=true;
            }

            if(getX()<=950 && cambioDeDireccion){
                direccion=1;
            }
            else{
                cambioDeDireccion=false;
            }
            move(2*direccion);

            disparoAleatorio=Greenfoot.getRandomNumber(100);
            if((disparoAleatorio==25 || disparoAleatorio==50 || disparoAleatorio==76)&& segundoDisparo==false){
                ShotBossFuego disparo= new ShotBossFuego();
                getWorld().addObject(disparo,getX()+40,getY()+40);
                segundoDisparo=true;
            }
            if((disparoAleatorio==25 ||disparoAleatorio==3 || disparoAleatorio==90)&& segundoDisparo==true){
                ShotBossFuego disparo= new ShotBossFuego();
                getWorld().addObject(disparo,getX()-40,getY()+40);
                segundoDisparo=false;
            }

            Actor shot=getOneObjectAtOffset(0,0,Shot.class);
            if(shot!=null){

                Game espacio=(Game)getWorld();
                espacio.removeObject(shot);

                espacio.barra.decrementar();
                if(espacio.barra.getContador()<=0){
                    espacio.changeLevel(6);
                    espacio.crearNivel(espacio.vidas.getContador(),espacio.puntos.getContador());
                }
            }

        }
    }
}
