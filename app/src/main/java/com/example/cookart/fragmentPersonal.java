package com.example.cookart;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentPersonal extends Fragment {

    Button save_btm;
    Button create_btn;
    Button done_btn;
    Button seen_btn;
    Button offline_btn;
    Button profile_btn;
    Button favorite_btn;

    public fragmentPersonal() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_fragment_personal, container, false);
        save_btm = view.findViewById(R.id.saved_btn);
        create_btn = view.findViewById(R.id.created_btn);
        done_btn = view.findViewById(R.id.done_btn);
        seen_btn = view.findViewById(R.id.seen_btn);
        offline_btn = view.findViewById(R.id.offline_btn);
        profile_btn = view.findViewById(R.id.profile_btn);
        favorite_btn = view.findViewById(R.id.favorite_btn);

        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        changeFragment(R.id.fragment_person, new createdFragment(), create_btn);
        changeFragment(R.id.fragment_person, new doneFragment(), done_btn);
        changeFragment(R.id.fragment_person, new favoriteFragment(), favorite_btn);
        changeFragment(R.id.fragment_person, new offlineFragment(), offline_btn);
        changeFragment(R.id.fragment_person, new profileFragment(), profile_btn);
        changeFragment(R.id.fragment_person, new saved_fragment(), save_btm);
        changeFragment(R.id.fragment_person, new seenFragment(), seen_btn);


    }

    private void changeFragment(final int idFragmentChange, final Fragment newFragment, Button btn) {
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.replace(idFragmentChange, newFragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
            }
        });
    }

}
