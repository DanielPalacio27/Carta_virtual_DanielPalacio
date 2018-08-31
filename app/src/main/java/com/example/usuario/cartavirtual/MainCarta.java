package com.example.usuario.cartavirtual;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainCarta extends AppCompatActivity {

    private Button consUbicacion;
    private Button consMenu;
    private Button reserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_carta);

        consUbicacion = (Button)findViewById(R.id.consUbicacion);
        consMenu = (Button)findViewById(R.id.consMenu);
        reserva = (Button)findViewById(R.id.reservarMesa);

        consMenu.setOnClickListener(new OnClickListener(){

            public void onClick(View arg0)
            {
                Intent inten = new Intent(MainCarta.this, Menu.class);
                startActivity(inten);
            }

        });

        consUbicacion.setOnClickListener(new OnClickListener(){

            public void onClick(View arg0)
            {
                Intent inten = new Intent(MainCarta.this, Ubicacion.class);
                startActivity(inten);
            }
        });

        reserva.setOnClickListener(new OnClickListener(){

            public void onClick(View arg0)
            {
                Intent intent = getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(intent);
            }

        });

    }


}
