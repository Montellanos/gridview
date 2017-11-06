package com.factorybyte.scrollview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.SearchView;

import com.factorybyte.scrollview.Adapters.MyAdapter;


public class MainActivity extends AppCompatActivity {


    GridView grid;
    SearchView search;

    int images[] = {R.drawable.uno, R.drawable.dos, R.drawable.tres, R.drawable.cuatro, R.drawable.cinco};
    String textos []= {"Mi texto cargado", "Texto 2", "tres", "cuatro", "cinco"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        search = (SearchView) findViewById(R.id.search);

        search.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                Log.d("data", "onQueryTextSubmit: " + query);
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                Log.d("data", "onQueryTextChange: " + newText);
                return false;
            }
        });



        /*grid = (GridView) findViewById(R.id.grid);


        MyAdapter adapter = new MyAdapter(this.getApplicationContext(), images, textos);



        grid.setAdapter(adapter);


        grid.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.d("press", "onItemClick:" + position);

                Intent intent = new Intent(MainActivity.this, ImageDetailActivity.class);

                intent.putExtra("image" , images[position]);

                startActivity(intent);
            }
        });
*/




}
}
