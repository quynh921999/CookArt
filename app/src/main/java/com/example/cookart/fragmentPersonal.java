package com.example.cookart;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentPersonal extends Fragment {


    public fragmentPersonal() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_personal, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        view.findViewById(R.id.save_btn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.to_savedFragment));
        view.findViewById(R.id.created_btn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.to_createdFragment));
        view.findViewById(R.id.done_btn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.to_doneFragment));
        view.findViewById(R.id.favorite_btn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.to_favoriteFragment));
        view.findViewById(R.id.offline_btn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.to_favoriteFragment));
        view.findViewById(R.id.seen_btn).setOnClickListener(Navigation.createNavigateOnClickListener(R.id.to_offlineFragment));
    }
}
