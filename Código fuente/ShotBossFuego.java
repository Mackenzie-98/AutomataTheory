import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShotBossFuego here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShotBossFuego extends Actor
{

    public void act() 
    {
        Game gestionNivel=(Game)getWorld();
        if(gestionNivel.getNivel()==1){
            setImage("shotBossFuego.png");
            move(-10);
            Actor meme=getOneObjectAtOffset(0,0,Meme.class);
            Propulsion aura= (Propulsion)getOneIntersectingObject(Propulsion.class);

            if(getX()==0){
                getWorld().removeObject(this);
            }

            if(meme!=null){
                Greenfoot.playSound("SoundExplosion.wav");
                Level1 espacio=(Level1)getWorld();
                Smoke humo=new Smoke();
                humo.setImage("smoke2.png");
                espacio.addObject(humo, meme.getX(), meme.getY());
                getWorld().removeObject(meme);
                getWorld().removeObject(aura);
                espacio.vidas.decrementar();
                if(espacio.vidas.getContador()<=0){
                    gestionNivel.changeLevel(7);
                    gestionNivel.crearNivel(gestionNivel.vidas.getContador(),gestionNivel.puntos.getContador());
                }
                getWorld().addObject(meme,150,300);
                getWorld().addObject(aura,50,300);
                getWorld().removeObject(this);
            }

        }
        else if(gestionNivel.getNivel()==2){
            setImage("Misil2.png");
            setLocation(getX(),getY()-5);
            Actor meme=getOneObjectAtOffset(0,0,Meme.class);
            Propulsion aura= (Propulsion)getOneIntersectingObject(Propulsion.class);

            if(getY()==0){
                getWorld().removeObject(this);
            }

            if(meme!=null){
                Greenfoot.playSound("SoundExplosion.wav");
                Level2 espacio=(Level2)getWorld();
                Smoke humo=new Smoke();
                humo.setImage("smoke2.png");
                espacio.addObject(humo, meme.getX(), meme.getY());
                espacio.removeObject(meme);
                espacio.removeObject(aura);
                espacio.vidas.decrementar();
                if(espacio.vidas.getContador()<=0){
                    gestionNivel.changeLevel(7);
                    gestionNivel.crearNivel(gestionNivel.vidas.getContador(),gestionNivel.puntos.getContador());
                }

                espacio.addObject(meme,500,150);
                espacio.removeObject(this);
            }

        }
        else if(gestionNivel.getNivel()==3){
            setImage("Torpedo.png");
            setLocation(getX(),getY()+10);
            Actor meme=getOneObjectAtOffset(0,0,Meme.class);
            Propulsion aura= (Propulsion)getOneIntersectingObject(Propulsion.class);

            if(getY()==599){
                getWorld().removeObject(this);
            }

            if(meme!=null){
                Greenfoot.playSound("SoundExplosion.wav");
                Level3 espacio=(Level3)getWorld();
                Smoke humo=new Smoke();
                humo.setImage("smoke2.png");
                espacio.addObject(humo, meme.getX(), meme.getY());
                espacio.removeObject(meme);
                espacio.removeObject(aura);
                espacio.vidas.decrementar();
                if(espacio.vidas.getContador()<=0){
                    gestionNivel.changeLevel(7);
                    gestionNivel.crearNivel(gestionNivel.vidas.getContador(),gestionNivel.puntos.getContador());
                }

                espacio.addObject(meme,500,500);
                espacio.removeObject(this);
            }
        }
    }
}
