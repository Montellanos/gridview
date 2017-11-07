package com.factorybyte.scrollview.Fragments;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import com.factorybyte.scrollview.Adapters.GridViewAdapter;
import com.factorybyte.scrollview.R;


public class AFragment extends Fragment {

    public static View mRootView;


    public AFragment() {
    }

    int images[] = {R.drawable.uno, R.drawable.dos, R.drawable.tres, R.drawable.cuatro, R.drawable.cinco};


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment



        mRootView = inflater.inflate(R.layout.fragment_a, container, false);


        GridView grid = (GridView) mRootView.findViewById(R.id.grid);

        Log.d("data", "onCreateView: " + grid);

        GridViewAdapter gridViewAdapter =  new GridViewAdapter(this.getContext(), images);

        grid.setAdapter(gridViewAdapter);

        return mRootView;

    }


}
