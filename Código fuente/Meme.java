import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Personaje principal.
 * 
 * @author (Edinsson Adrian Melo Calvo-1151484) 
 * @version (1.0)
 */
public class Meme extends Actor
{
    boolean isShotting=false;
    int controlDisparo=0;

    public Meme(){
    }

    public void act() 
    {
        Game gestionNivel=(Game)getWorld();
        if(gestionNivel.vidas.getContador()==3){
            setImage("NaveRota1.png");
        }
        else if (gestionNivel.vidas.getContador()==2){
            setImage("NaveRota2.png");
        }
        else if(gestionNivel.vidas.getContador()==1){
            setImage("NaveRota3.png");
        }
        else if(gestionNivel.vidas.getContador()<=0){
            setImage("NaveRota4.png");
        }

        if(gestionNivel.getNivel()==1){

            int y=getY();
            if(getX()<=920){
                if(Greenfoot.isKeyDown("right")){
                    move(7);
                }
            }
            if(getX()>=80){
                if(Greenfoot.isKeyDown("left")){
                    move(-7);
                }
            }
            if(Greenfoot.isKeyDown("up")){
                y-=7;
                setLocation(getX(), y);
            }
            if(Greenfoot.isKeyDown("down")){
                y+=7;
                setLocation(getX(), y);
            }

            setShot();
        }
        else if(gestionNivel.getNivel()==2){
            int y=getY();
            setImage("NaveRotada.png");
            if(gestionNivel.vidas.getContador()==3){
                setImage("NaveRota11.png");
            }
            else if (gestionNivel.vidas.getContador()==2){
                setImage("NaveRota22.png");
            }
            else if(gestionNivel.vidas.getContador()==1){
                setImage("NaveRota33.png");
            }
            else if(gestionNivel.vidas.getContador()<=0){
                setImage("NaveRota44.png");
            }

            if(getX()<=920){
                if(Greenfoot.isKeyDown("right")){
                    move(10);
                }
            }
            if(getX()>=80){
                if(Greenfoot.isKeyDown("left")){
                    move(-10);
                }
            }
            if(getY()>=100){
                if(Greenfoot.isKeyDown("up")){
                    y-=7;
                    setLocation(getX(), y);
                }
            }
            if(getY()<=550){

                if(Greenfoot.isKeyDown("down")){
                    y+=7;
                    setLocation(getX(), y);
                }
            }

            setShot();
        }
        else if(gestionNivel.getNivel()==3){
            int y=getY();
            setImage("NaveRotada2.png");
            if(gestionNivel.vidas.getContador()==3){
                setImage("NaveRota111.png");
            }
            else if (gestionNivel.vidas.getContador()==2){
                setImage("NaveRota222.png");
            }
            else if(gestionNivel.vidas.getContador()==1){
                setImage("NaveRota333.png");
            }
            else if(gestionNivel.vidas.getContador()<=0){
                setImage("NaveRota444.png");
            }

            if(getX()<=920){
                if(Greenfoot.isKeyDown("right")){
                    move(10);
                }
            }
            if(getX()>=80){
                if(Greenfoot.isKeyDown("left")){
                    move(-10);
                }
            }
            if(getY()>=100){
                if(Greenfoot.isKeyDown("up")){
                    y-=7;
                    setLocation(getX(), y);
                }
            }
            if(getY()<=550){

                if(Greenfoot.isKeyDown("down")){
                    y+=7;
                    setLocation(getX(), y);
                }
            }

            setShot();
        }

    }
    public void setShot(){
        Game gestionNivel=(Game)getWorld();
        if(gestionNivel.getNivel()==1){
            if(isShotting==false && Greenfoot.isKeyDown("Space")){

                Greenfoot.playSound("shotsound.mp3");
                Shot shot = new Shot();
                getWorld().addObject(shot,getX()+30,getY());
                isShotting=true;
                controlDisparo++;

            }
            else if(isShotting==true && Greenfoot.isKeyDown("Space")==false){
                isShotting=false;
            }

        }
        else if(gestionNivel.getNivel()==2){
            if(isShotting==false && Greenfoot.isKeyDown("Space")){

                Greenfoot.playSound("Laser.wav");

                Shot shot2= new Shot();
                Shot shot3=new Shot();

                getWorld().addObject(shot2,getX()+40,getY());
                getWorld().addObject(shot3,getX()-40,getY());
                isShotting=true;
                controlDisparo++;
            }
            else if(isShotting==true && Greenfoot.isKeyDown("Space")==false){
                isShotting=false;
            }
        }
        else if(gestionNivel.getNivel()==3){
            if(isShotting==false && Greenfoot.isKeyDown("Space")){

                Greenfoot.playSound("tembak.wav");
                Shot shot = new Shot();
                Shot shot2= new Shot();
                Shot shot3=new Shot();
                Shot shot4=new Shot();
                Shot shot5=new Shot();
                
                shot2.setRotation(20);
                shot3.setRotation(340);
                shot4.setRotation(20);
                shot5.setRotation(340);
                getWorld().addObject(shot,getX(),getY());
                getWorld().addObject(shot2,getX()+40,getY());
                getWorld().addObject(shot3,getX()-40,getY());
                getWorld().addObject(shot4,getX()+80,getY());
                getWorld().addObject(shot5,getX()-80,getY());
                isShotting=true;
                controlDisparo++;
            }
            else if(isShotting==true && Greenfoot.isKeyDown("Space")==false){
                isShotting=false;
            }
        }
    }
}

