import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;
/**
 * Write a description of class BossLife here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BossLife extends Actor
{
    GreenfootImage imagen;
    int contador;
    int x,y;
    int altura;
    int contenedorRectangular=0;
    String mensaje;
    public BossLife(int contador,int x, int y,int altura)
    {
        this.contador=contador;
        this.contenedorRectangular=contador;
        imagen= new GreenfootImage(250,150);
        imagen.setFont(new Font("STENCIL",Font.BOLD,24));
        this.x=x;
        this.y=y;
        this.altura=altura;
        dibujarImagen();
    }	

    public void dibujarImagen(){
        imagen.clear();
        imagen.setColor(new Color(255,51,05));
        imagen.drawRect(x,y,contenedorRectangular,altura);
        imagen.fillRect(x,y,contador, altura);
        imagen.setColor(new Color(255,255,255));
        setImage(imagen);

    }	

    public void incrementar(){
        this.contador++;
        dibujarImagen();
    }

    public void decrementar(){
        Game gestionNivel=(Game)getWorld();
        if(gestionNivel.getNivel()==1){
            this.contador-=4;
            dibujarImagen();
        }
        else if(gestionNivel.getNivel()==2){
            this.contador-=3;
            dibujarImagen();
        }
        else if(gestionNivel.getNivel()==3){
            this.contador-=2;
            dibujarImagen();
        }
    }

    public int getContador(){
        return this.contador;
    }

    public void act(){

    }
}