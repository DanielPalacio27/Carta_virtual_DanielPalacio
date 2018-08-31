package com.example.usuario.cartavirtual;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class Menu extends AppCompatActivity {

    ListView listaDatos;
    ArrayList<DatosMenu> Lista;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu2);

        listaDatos = (ListView)findViewById(R.id.lstDatosMenu);

        Lista = new ArrayList<DatosMenu>();

        Lista.add(new DatosMenu(1, "Arepa venezolana", "Arepa venezolana con pollo y carne desmechada", 7000, R.drawable.arepavenezolana));
        Lista.add(new DatosMenu(2, "Hamburguesa", "Deliciosa hamburguesa con queso cheddar, tocineta, tomate, cebolla y guacamole", 13000, R.drawable.hamburguesa));
        Lista.add(new DatosMenu(3, "Papas locas", "Papas fritas con chorizo, queso parmesano y carne molida", 9000, R.drawable.papaslocas));
        Lista.add(new DatosMenu(4, "Sushi", "Sushi con aguacate, surimi, sesamo y mayonesa", 20000, R.drawable.sushi));

        Adaptador madaptador = new Adaptador(getApplicationContext(), Lista);

        listaDatos.setAdapter(madaptador);

    }
}
