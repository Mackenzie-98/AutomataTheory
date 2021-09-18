import greenfoot.*;

/**
 * Write a description of class TextState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TextState extends State
{
    char estadoAnterior;
    public void act() 
    {
    }

    public TextState(char state){
        estadoAnterior=state;
        this.setImage(state+".png");
    }
    public void setState(char s){
        this.estadoAnterior=s;
    }
    public char getState(){
    return this.estadoAnterior;
    }
    public void changeState(char state){
        switch(state){
            case 'A':this.setImage("A.png");break;
            case 'B':this.setImage("B.png");break;
            case 'C':this.setImage("C.png");break;
            case 'D':this.setImage("D.png");break;
            case 'E':this.setImage("E.png");break;
            case 'F':this.setImage("F.png");break;
            case 'G':this.setImage("G.png");break;
            case 'H':this.setImage("H.png");break;
            case 'I':this.setImage("I.png");break;
            case 'J':this.setImage("J.png");break;
        }
    }
}
