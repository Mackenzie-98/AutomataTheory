import greenfoot.*;

/**
 * Write a description of class LastState here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LastState extends State
{
    char estadoAnterior;
    public LastState(char s){
        this.estadoAnterior=s;
    }
    public void act() 
    {
        
    }
    public void setState(char s){
        this.estadoAnterior=s;
    }
    public char getState(){
    return this.estadoAnterior;
    }
}
