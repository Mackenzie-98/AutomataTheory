import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Main extends Game
{
    public Main(){
        Prompter apuntador=new Prompter();
        addObject(apuntador, 102, 550);

        Theory botonTeoria=new Theory();

        TittleState titulo=new TittleState();
        State estado=new State();
        TextState letra=new TextState('A');
        this.estado.setState('A');

        addObject(estado, 175, 550);
        addObject(letra, 175, 550);
        addObject(titulo, 175, 485);
        Window ventana=new Window();
        addObject(ventana, 0, 1000);
        Inicio image=new Inicio();
        Play boton1=new Play();


        Controls boton2=new Controls();
        Credits boton3=new Credits();
        Exit boton4 =new Exit();
        addObject(boton1, 500, 300);
        addObject(boton2,440,530);
        addObject(boton3,740,530);
        addObject(boton4,890,530);
        addObject(botonTeoria,590,530);
        addObject(image, 510, 90);
        Confetti estrellas=new Confetti();
        addObject(estrellas,999,300);
    }
}

