package com.example.foode;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class RePassFragment extends Fragment {

    View repassfragment;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        repassfragment = inflater.inflate(R.layout.fragment_re_pass, container, false);
        return repassfragment;
    }
}