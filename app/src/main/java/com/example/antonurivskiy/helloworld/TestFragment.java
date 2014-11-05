package com.example.antonurivskiy.helloworld;

import android.content.Context;
import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class TestFragment extends Fragment {

    public TestFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_test, container, false);
        Context context = v.getContext();
        TextView tvHello = (TextView) v.findViewById(R.id.fragment_hello_tv);
        tvHello.setText("and this is hello tv from fragment");
        return v;
    }



}
