package com.android.angel.climalistatoast;

import android.view.LayoutInflater;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
/**
 * Created by Angel on 05/07/2015.
 */


public class AdaptadorCategoria extends BaseAdapter {

    private ArrayList<Categoria> categoria;
    LayoutInflater inflater;
    private Context contexto;

    public AdaptadorCategoria(ArrayList<Categoria> cat,Context con){
        this.categoria=cat;
        inflater=LayoutInflater.from(con);
        this.contexto=con;

    }

    @Override
    public int getCount() {
        return categoria.size();
    }

    @Override
    public Object getItem(int position) {
        return categoria.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=inflater.inflate(R.layout.lista, null);
        Categoria cat=categoria.get(position);
        ImageView img= (ImageView) convertView.findViewById(R.id.imagen);
        TextView titulo= (TextView) convertView.findViewById(R.id.titulo);
        TextView subtitulo= (TextView) convertView.findViewById(R.id.subtitulo);

        img.setImageDrawable(contexto.getResources().getDrawable(cat.getImagen()));
        titulo.setText(cat.getTitulo());
        subtitulo.setText(cat.getSubtitulo());

        return convertView;
    }
}
