package com.example.cookart;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cookart.Adapter.singleMenuFoodAdapter;
import com.example.cookart.models.singleMenuFoodModel;

import java.util.ArrayList;

import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentMenu extends Fragment {

    // vars
    private ArrayList<singleMenuFoodModel> arrayFoodMenu = new ArrayList<>();
    private singleMenuFoodAdapter singleMenuFoodAdapter;
    private RecyclerView rv_MenuFood;

    public fragmentMenu() {
        // Required empty public constructor
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_fragment_menu, container, false);
        ButterKnife.bind(this, view);
        singleMenuFoodAdapter = new singleMenuFoodAdapter(getActivity(), arrayFoodMenu);
        rv_MenuFood = view.findViewById(R.id.rv_listMenuFood);
        rv_MenuFood.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rv_MenuFood.setAdapter(singleMenuFoodAdapter);
        setDataOnListMenuFood();
        return view;
    }

    private void setDataOnListMenuFood() {
        for (int i = 0; i <=10; i++) {
            singleMenuFoodModel singleMenuFoodModel = new singleMenuFoodModel();
            singleMenuFoodModel.setName("food" + i);
            arrayFoodMenu.add(singleMenuFoodModel);
        }
        singleMenuFoodAdapter.notifyDataSetChanged();
    }

}
