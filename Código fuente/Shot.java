import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Shot extends Actor
{

    public Shot(){
    }

    public void act() 
    {
        Game gestionNivel=(Game)getWorld();
        if(gestionNivel.getNivel()==1){
            
            setImage("proyectil2.png");
            move(40);
            Actor fuegoAzul=getOneObjectAtOffset(0,0,FuegoAzul.class);
            Actor fuego=getOneObjectAtOffset(0,0,Fuego.class);
            Level1 espacio=(Level1)getWorld();
            if(fuego!=null){
                Smoke humo=new Smoke();
                espacio.addObject(humo, fuego.getX(),fuego.getY());
                espacio.removeObject(fuego);
                if(espacio.puntos.getContador()%2==0){
                    espacio.removeObject(this);
                }
                espacio.puntos.incrementar();
                espacio.crearFuegos(1);
                if(espacio.puntos.getContador()%3==0){
                    FuegoAzul bola= new FuegoAzul();
                    espacio.addObject(bola,gestionNivel.getWidth(),Greenfoot.getRandomNumber(gestionNivel.getHeight()));
                }
                if(gestionNivel.puntos.getContador()==30){
                    espacio.añadirBoss();
                }

            }
            else if(fuegoAzul!=null){
                Smoke humo=new Smoke();
                humo.setImage("small.png");

                if(gestionNivel.puntos.getContador()%2==0){
                    gestionNivel.addObject(humo, fuegoAzul.getX(),fuegoAzul.getY());
                    gestionNivel.removeObject(fuegoAzul);

                }
                gestionNivel.puntos.incrementar();	
                getWorld().removeObject(this);
                if(gestionNivel.puntos.getContador()==30){
                    gestionNivel.añadirBoss();
                }
            }
            else if(getX()==getWorld().getWidth()-1){
                getWorld().removeObject(this);
            }
        }
        else if(gestionNivel.getNivel()==2){
            setImage("shoot2.png");
            setLocation(getX(),getY()+10);
            Level2 espacio=(Level2)getWorld();
            Actor fuegoAzul=getOneObjectAtOffset(0,0,FuegoAzul.class);
            Actor fuego=getOneObjectAtOffset(0,0,Fuego.class);

            if(fuego!=null){
                Smoke humo=new Smoke();
                humo.setImage("small.png");
                espacio.addObject(humo, fuego.getX(),fuego.getY());
                espacio.removeObject(fuego);
                espacio.removeObject(this);
                espacio.puntos.incrementar();
                espacio.crearFuegos(1);
                if(espacio.puntos.getContador()%10==0){
                    FuegoAzul bola= new FuegoAzul();
                    espacio.addObject(bola,Greenfoot.getRandomNumber(espacio.getWidth()),espacio.getHeight());

                }
                if(espacio.puntos.getContador()==60){
                    espacio.añadirBoss();
                }

            }
            else if(fuegoAzul!=null){
                Smoke humo=new Smoke();
                humo.setImage("small.png");
                if(espacio.puntos.getContador()%10==0){
                    espacio.addObject(humo, fuegoAzul.getX(),fuegoAzul.getY());
                    espacio.removeObject(fuegoAzul);

                }
                espacio.puntos.incrementar();

                espacio.removeObject(this);

                if(espacio.puntos.getContador()==60){
                    espacio.añadirBoss();

                }
            }
            else if(getY()==getWorld().getHeight()-1){
                espacio.removeObject(this);
            }            
        }
        else if(gestionNivel.getNivel()==3){
            setImage("shoot3.png");
            setLocation(getX(),getY()-10);
            Level3 espacio=(Level3)getWorld();
            Actor fuegoAzul=getOneObjectAtOffset(0,0,FuegoAzul.class);
            Actor fuego=getOneObjectAtOffset(0,0,Fuego.class);

            if(fuego!=null){
                Smoke humo=new Smoke();
                humo.setImage("Burbujas11.png");
                espacio.addObject(humo, fuego.getX(),fuego.getY());
                espacio.removeObject(fuego);
                espacio.removeObject(this);
                espacio.puntos.incrementar();
                espacio.crearFuegos(1);
                if(espacio.puntos.getContador()%10==0){
                    FuegoAzul bola= new FuegoAzul();
                    if(Greenfoot.getRandomNumber(2)==1){
                        espacio.addObject(bola, 999,200);
                    }
                    else{
                        espacio.addObject(bola, 0,200);
                    }

                }
                if(espacio.puntos.getContador()==100){
                    espacio.añadirBoss();
                }

            }
            else if(fuegoAzul!=null){
                Smoke humo=new Smoke();
                humo.setImage("Burbujas11.png");
                if(espacio.puntos.getContador()%10==0){
                    espacio.addObject(humo, fuegoAzul.getX(),fuegoAzul.getY());
                    espacio.removeObject(fuegoAzul);

                }
                espacio.puntos.incrementar();

                espacio.removeObject(this);

                if(espacio.puntos.getContador()==100){
                    espacio.añadirBoss();

                }
            }
            else if(getY()==0){
                espacio.removeObject(this);
            }            
        }  
    }
}
