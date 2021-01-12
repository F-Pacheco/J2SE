package com.educacionIT.digitalers.ExamenTecnico;

import com.educacionIT.digitalers.Entidades.Coleccion;
import com.educacionIT.digitalers.Entidades.Pista;
import com.educacionIT.digitalers.Entidades.PlayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    Coleccion coleccion = new Coleccion("Coleccion1");
    Pista pista1 = new Pista("amor", 1, 5, "goyeneche", "canciones", 1955, 2);
    Pista pista2 = new Pista("rara", 2, 9, "asdasd", "asadd", 1325, 4);
    Pista pista3 = new Pista("qwe", 3, 3, "xzc", "sdfd", 1984, 1);
    PlayList playlist = new PlayList("Playlist1");
    
   System.out.println( playlist.addElemento(pista1));
   
    playlist.addElemento(pista2);
    playlist.addElemento(pista3);
    
    System.out.println("cantidad de elementos: "+ playlist.getCantElementos());
    System.out.println("duracion de playlist: "+playlist.getDuracion());
    
    }
}
