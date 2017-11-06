package com.factorybyte.scrollview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.factorybyte.scrollview.R;

import org.w3c.dom.Text;

/**
 * Created by Jorge on 6/11/2017.
 */

public class MyAdapter extends BaseAdapter {

    Context context;
    int images[];
    String textos[];
    LayoutInflater inflater;

    public MyAdapter(Context context, int images[], String textos[]){
        this.images = images;
        this.textos = textos;
        inflater = (LayoutInflater.from(context));
    }


    @Override
    public int getCount() {
        return images.length;
    }
    @Override
    public Object getItem(int i) {
        return null;
    }
    @Override
    public long getItemId(int i) {
        return 0;
    }
    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view = inflater.inflate(R.layout.grid_item, null);
        ImageView image = (ImageView) view.findViewById(R.id.imageView);
        image.setImageResource(images[i]);
        TextView text = (TextView) view.findViewById(R.id.textView);
        text.setText(textos[i]);
        return view;
    }





}
