package com.example.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ListView listaDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaDatos = (ListView) findViewById(R.id.listViewContenedor);

        //Definimos un arreglo de tipo String
        final String[] datos = new String[] {"Elemento 1", "Elemento 2", "Elemento 3", "Elemento 4", "Elemento 5", "Elemento 6"};

        //Generamos un ArrayAdapter, primero asignamos la actividad en la que estamos, indicamos la vista y por último, indicamos el arreglo
        //con el que funcionará.
        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, datos);

        listaDatos.setAdapter(adaptador);

        listaDatos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "Opción seleccionada: " + parent.getItemAtPosition(position).toString(), Toast.LENGTH_SHORT).show();
            }
        });
    }


}
