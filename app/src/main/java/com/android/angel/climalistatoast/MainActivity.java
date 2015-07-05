package com.android.angel.climalistatoast;


import java.util.ArrayList;
import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import com.android.angel.climalistatoast.AdaptadorCategoria;
import com.android.angel.climalistatoast.Categoria;

public class MainActivity extends Activity {

    ListView listado;
    ArrayList<Categoria> categoria;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listado=(ListView) findViewById(R.id.listado);
        categoria=new ArrayList<Categoria>();
        categoria.add(new Categoria("Lunes", "Soleado - 34 Grad. 29 Grad.", R.drawable.sol));
        categoria.add(new Categoria("Martes", "Nublado - 29 Grad. 24 Grad.", R.drawable.nublado));
        categoria.add(new Categoria("Miercoles", "Lluvioso - 29 Grad.  25 Grad.", R.drawable.lluvia));
        categoria.add(new Categoria("Jueves", "Lluvioso - 29 Grad. 25 Grad.", R.drawable.lluvia));
        categoria.add(new Categoria("Viernes", "Soleado - 29 Grad. 25 Grad.", R.drawable.sol));
        categoria.add(new Categoria("Sabado", "Lluvioso - 30 Grad. 26 Grad.", R.drawable.lluvia));
        categoria.add(new Categoria("Domingo", "Nublado - 33 Grad. 29 Grad.", R.drawable.nublado));
        AdaptadorCategoria adaptador = new AdaptadorCategoria(categoria,MainActivity.this.getApplicationContext());
        listado.setAdapter(adaptador);

        listado.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> a, View view, int position, long id) {

                Toast.makeText(getApplicationContext(), categoria.get(position).toString(), Toast.LENGTH_SHORT).show();
                //Toast.makeText(getApplicationContext(), titulo[position], Toast.LENGTH_SHORT).show();


            }
        });


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
