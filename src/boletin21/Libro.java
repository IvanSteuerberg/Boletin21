package boletin21;

/**
 *
 * @author irodriguezsteuerberg
 */
public class Libro {
 String titulo;
 String autor;
 float prezo;
 int unidades;



/*  Para facer o mantemento  utiliza un menú cos seguintes puntos :
a) engadir  engade un novo libro ao noso ficheiro
b) consultar dado o título dun libro visualizar o seu precio . se o libro non o temos na librería visualizamos unha mensaxe
c) visualizar visualiza todos os datos do ficheiro
d) borrar  borra os libros que teñan 0 unidades
e) modificar  modifica o precio dun libro determinado
*/

    public Libro() {
    }

    public Libro(String nome, String autor, float prezo, int unidades) {
        this.titulo = nome;
        this.autor = autor;
        this.prezo = prezo;
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return titulo + ", " + autor + ", " + prezo + ", " + unidades+",";
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }
    
    



}
