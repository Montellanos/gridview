package com.factorybyte.scrollview.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import com.factorybyte.scrollview.R;

/**
 * Created by Jorge on 7/11/2017.
 */

public class GridViewAdapter extends BaseAdapter{


    Context context;
    int images[];
    LayoutInflater inflater;

    public GridViewAdapter(Context context, int images[]){
        this.images = images;
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
        return view;
    }



}
