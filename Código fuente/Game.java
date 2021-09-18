import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Iterator;
import java.util.List;
/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
    int nivel=0;
    boolean isLevelOn=false;
    Hp vidas;
    Points puntos;
    LevelInfo level;
    BossLife barra;
    int count=0;
    TextState estado;
    public Game()
    {
        super(1000,600, 1);
        setPaintOrder(Inicio.class,State.class,Window.class,Hp.class,Points.class,BossLife.class,LevelInfo.class,Meme.class,Fuego.class,Confetti.class);
        vidas=new Hp(5,"Vidas");
        puntos=new Points(0,"puntos");
        estado=new TextState('A');
    }

    public void addState(char i, char f){
        TittleState titulo1=new TittleState();
        State estado1=new State();
        Transition manito=new Transition();

        TextState letra1=new TextState(i);
        addObject(estado1, 60, 540);
        addObject(letra1, 60, 540);
        addObject(manito, 170, 540);
        addObject(titulo1, 170, 485);

        State estado2=new State();
        TextState letra2=new TextState(f);
        this.estado.setState(f);
        addObject(estado2, 280,540);
        addObject(letra2, 280, 540);

    }

    public void changeLevel(int nivel){
        this.nivel=nivel;
    }

    public int getNivel()
    {
        return this.nivel;
    }

    public void crearNivel(int vidas, int puntos){
        if(getNivel()==0){
            Main menu=new Main();
            Greenfoot.setWorld(menu);

        }
        else if(getNivel()==1 ){
            Level1 nivel1=new Level1(vidas,puntos,estado.getState());
            Greenfoot.setWorld(nivel1);

        }
        else if(getNivel()==2){
            Level2 nivel2=new Level2(vidas,puntos,estado.getState());
            Greenfoot.setWorld(nivel2);
        }
        else if(getNivel()==3){
            Level3 nivel3=new Level3(vidas,puntos,estado.getState());
            Greenfoot.setWorld(nivel3);
        }
        else if(getNivel()==4){
            TabletCredits muro=new TabletCredits();
            Greenfoot.setWorld(muro);
        }
        else if(getNivel()==5){
            WallControls wall=new WallControls();
            Greenfoot.setWorld(wall);
        }
        else if(getNivel()==6){
            End finale=new End(estado.getState());
            Greenfoot.setWorld(finale);
        }else if(getNivel()==7){
            GameOver gameOver=new GameOver(puntos,estado.getState());
            Greenfoot.setWorld(gameOver);
        }else if(getNivel()==8){
            Automata aut=new Automata();
            Greenfoot.setWorld(aut);
        }

    }

    public void crearFuegos(int numero){
        if(getNivel()==1){
            int x=getWidth();
            int y=0;
            for(int i=0;i<numero;i++){
                y=Greenfoot.getRandomNumber(getHeight());
                Fuego bola=new Fuego();
                addObject(bola,x,y);
            }
        }
        else if(getNivel()==2){
            int x=0;
            int y=getHeight();
            for(int i=0;i<numero;i++){
                x=Greenfoot.getRandomNumber(getWidth());
                Fuego bola=new Fuego();
                addObject(bola,x,y);
            }
        }
        else if(getNivel()==3){
            int x=0;
            int y=0;
            for(int i=0;i<numero;i++){
                x=Greenfoot.getRandomNumber(getWidth());
                Fuego bola=new Fuego();
                addObject(bola,x,y);
            }
        }
    }

    public void añadirBoss(){
        if(getNivel()==1){

            List fire=getObjects(Fuego.class);
            Iterator elementos= fire.iterator();
            while(elementos.hasNext())
            {
                Fuego bola=(Fuego)elementos.next();
                removeObject(bola);
            }
            List fireBlue=getObjects(FuegoAzul.class);
            Iterator elementos2= fireBlue.iterator();
            while(elementos2.hasNext())
            {
                FuegoAzul bolaAzul=(FuegoAzul)elementos2.next();
                removeObject(bolaAzul);
            }

            List estados=getObjects(State.class);
            Iterator elementos3= estados.iterator();
            while(elementos3.hasNext())
            {
                State states=(State)elementos3.next();
                removeObject(states);
            }

            BossFuego jefe=new BossFuego();
            addObject(jefe,getWidth()-80,(getHeight()/2)+20);
            Greenfoot.playSound("Diabólico.wav");
            barra= new BossLife(200,0,0,25);
            addObject(barra,525,110);
            Window ventana=new Window();
            addObject(ventana, 0, 1000);

            addState(estado.getState(),'D');
            this.estado.setState('D');
            TextTransition transicion=new TextTransition();
            transicion.setImage("TS30.png");
            addObject(transicion, 170, 580);
        }
        else if(getNivel()==2){

            List fire=getObjects(Fuego.class);
            Iterator elementos= fire.iterator();
            while(elementos.hasNext())
            {
                Fuego bola=(Fuego)elementos.next();
                removeObject(bola);
            }
            List fireBlue=getObjects(FuegoAzul.class);
            Iterator elementos2= fireBlue.iterator();
            while(elementos2.hasNext())
            {
                FuegoAzul bolaAzul=(FuegoAzul)elementos2.next();
                removeObject(bolaAzul);
            }

            List estados=getObjects(State.class);
            Iterator elementos3= estados.iterator();
            while(elementos3.hasNext())
            {
                State states=(State)elementos3.next();
                removeObject(states);
            }
            BossFuego jefe=new BossFuego();
            addObject(jefe,getWidth()/2,(getHeight()-150));
            barra= new BossLife(200,0,0,25);
            addObject(barra,900,110);
            Window ventana=new Window();
            addObject(ventana, 0, 1000);
            addState(estado.getState(),'F');
            this.estado.setState('F');
            TextTransition transicion=new TextTransition();
            transicion.setImage("TS60.png");
            addObject(transicion, 170, 580);
        }
        else if(getNivel()==3){

            List fire=getObjects(Fuego.class);
            Iterator elementos= fire.iterator();
            while(elementos.hasNext())
            {
                Fuego bola=(Fuego)elementos.next();
                removeObject(bola);
            }
            List fireBlue=getObjects(FuegoAzul.class);
            Iterator elementos2= fireBlue.iterator();
            while(elementos2.hasNext())
            {
                FuegoAzul bolaAzul=(FuegoAzul)elementos2.next();
                removeObject(bolaAzul);
            }

            List estados=getObjects(State.class);
            Iterator elementos3= estados.iterator();
            while(elementos3.hasNext())
            {
                State states=(State)elementos3.next();
                removeObject(states);
            }
            BossFuego jefe=new BossFuego();
            addObject(jefe,getWidth()/2,60);
            barra= new BossLife(200,0,0,25);
            addObject(barra,900,110);
            Window ventana=new Window();
            addObject(ventana, 0, 1000);
            addState(estado.getState(),'H');
            this.estado.setState('H');
            TextTransition transicion=new TextTransition();
            transicion.setImage("TS100.png");
            addObject(transicion, 170, 580);
        }

    }
}

