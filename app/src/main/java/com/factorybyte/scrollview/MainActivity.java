package com.factorybyte.scrollview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.factorybyte.scrollview.Adapters.MyAdapter;


public class MainActivity extends AppCompatActivity {


    GridView grid;

    int images[] = {R.drawable.uno, R.drawable.dos, R.drawable.tres, R.drawable.cuatro, R.drawable.cinco};
    String textos []= {"Mi texto cargado", "Texto 2", "tres", "cuatro", "cinco"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        grid = (GridView) findViewById(R.id.grid);


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





}
}
