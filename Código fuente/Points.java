import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
import java.awt.Font;

/**
 * Marcador de vidas y puntos.
 * 
 * @author (Edinsson Adrian Melo Calvo-1151484) 
 * @version (1.0)
 */
public class Points extends Actor
{
    GreenfootImage imagen;
    static int contador;
    String mensaje;
    public Points(int contador,String mensaje)
    {


            this.contador=contador;
            this.mensaje=mensaje;
            imagen= new GreenfootImage(200,100);
            imagen.setColor(new Color(250,250,250,250));
            imagen.setFont(new Font("OCR A Extended",Font.BOLD,24));
            dibujarImagen();
        
    }

    public void dibujarImagen(){
        imagen.clear();
        imagen.drawString(mensaje+":"+contador, 20, 20);
        setImage(imagen);

    }

    public void incrementar(){
        this.contador++;
        dibujarImagen();
    }

    public void decrementar(){
        this.contador--;
        dibujarImagen();
    }

    public int getContador(){
        return this.contador;
    }

    public void act(){
    }
    
    
}
