package com.android.angel.climalistatoast;

/**
 * Created by Angel on 05/07/2015.
 */
public class Categoria {

    private String titulo;
    private String subtitulo;
    private int imagen;

    public Categoria(String titulo, String subtitulo, int imagen) {
        super();
        this.titulo = titulo;
        this.subtitulo = subtitulo;
        this.imagen = imagen;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getSubtitulo() {
        return subtitulo;
    }

    public void setSubtitulo(String subtitulo) {
        this.subtitulo = subtitulo;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    @Override
    public String toString() {
        return "Usted selecciono el dia: " + titulo;
    }

}

