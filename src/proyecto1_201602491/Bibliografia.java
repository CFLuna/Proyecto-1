/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_201602491;

/**
 *
 * @author W7-JUEGOS
 */
public class Bibliografia {
    int[] tipo;
    String[] autor;
    String[] titulo;
    String[] descripcion;
    String[] palabraclave;
    int[] edicion;
    String[] temas;
    String[] frecuencia;
    int[] ejemplares;
    String[] area;
    int[] copias;
    int[] disponibles;
    int contadorb;
    
    public Bibliografia(){
        tipo = new int[100];
        autor = new String[100];
        titulo = new String[100];
        descripcion = new String[100];
        palabraclave = new String[100];
        edicion = new int[100];
        temas = new String[100];
        frecuencia = new String[100];
        ejemplares = new int[100];
        area = new String[100];
        copias = new int[100];
        disponibles = new int[100];
        contadorb=0;
    }
    
    public void nuevaBibliografia(int tipo, String autor, String titulo, String descripcion, String palabraclave, int edicion, String temas, String frecuencia, int ejemplares, String area, int copias, int disponibles){
        this.tipo[contadorb]=tipo;
        this.autor[contadorb]=autor;
        this.titulo[contadorb]=titulo;
        this.descripcion[contadorb]=descripcion;
        this.palabraclave[contadorb]=palabraclave;
        this.edicion[contadorb]=edicion;
        this.temas[contadorb]=temas;
        this.frecuencia[contadorb]=frecuencia;
        this.ejemplares[contadorb]=ejemplares;
        this.area[contadorb]=area;
        this.copias[contadorb]=copias;
        this.disponibles[contadorb]=disponibles;
        contadorb++;
    }
}
