package com.example.usuario.cartavirtual;

import android.content.Context;
import android.media.Image;
import android.print.PrintDocumentAdapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class Adaptador extends BaseAdapter{


    Context contexto;
    List<DatosMenu> ListaMenu;

    public Adaptador(Context contexto, List<DatosMenu> listaMenu) {
        this.contexto = contexto;
        ListaMenu = listaMenu;
    }


    //Retorna cantidad de elementos de la lista
    @Override
    public int getCount() {
        return ListaMenu.size();
    }

    //Retorna el objeto en la posicion de la lista
    @Override
    public Object getItem(int i) {
        return ListaMenu.get(i);
    }

    //Retornar el Id de la posicion
    @Override
    public long getItemId(int i) {
        return ListaMenu.get(i).getId();
    }

    
    //Metodo que se ejecuta en cada secuencia
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View vista = view;

        LayoutInflater inflate = LayoutInflater.from(contexto);
        vista = inflate.inflate(R.layout.menu, null);

        ImageView imagen = (ImageView)vista.findViewById(R.id.imageView);
        TextView nombre = (TextView)vista.findViewById(R.id.textNombre);
        TextView descripcion = (TextView)vista.findViewById(R.id.textDescripcion);
        TextView costo = (TextView)vista.findViewById(R.id.textCosto);

        nombre.setText(ListaMenu.get(i).getNombre().toString());
        descripcion.setText(ListaMenu.get(i).getDescripcion().toString());
        costo.setText("" + ListaMenu.get(i).getCosto()+" COP");
        imagen.setImageResource(ListaMenu.get(i).getImagen());
        
        return vista;

    }
}
