package com.example.cookart;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cookart.Adapter.itemAdapter;
import com.example.cookart.Adapter.kindOfFoodAdapter;
import com.example.cookart.models.kindOfFoodModel;
import com.example.cookart.models.singleItemModel;

import java.util.ArrayList;

import butterknife.ButterKnife;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentCookingRecipe extends Fragment {
    //vars
    // list kind of food
    private ArrayList<kindOfFoodModel> arrayListKindFood = new ArrayList<>();
    private kindOfFoodAdapter kindOfFoodAdapter;
    private RecyclerView rvKindOfFood;

    // populor food
    private ArrayList<singleItemModel> arrayListPopularFood = new ArrayList<>();
    private itemAdapter popularFoodAdapter;
    private RecyclerView rvPopularFood;

    // recently food

    private ArrayList<singleItemModel> arrayListFoodRecently = new ArrayList<>();
    private itemAdapter recentlyFoodAdapter;
    private RecyclerView rvRecentlyFood;

    public fragmentCookingRecipe() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: ");
        View view = inflater.inflate(R.layout.fragment_fragment_cooking_recipe, container, false);
        ButterKnife.bind(this, view);
        // set recycler kind of food
        kindOfFoodAdapter = new kindOfFoodAdapter(getActivity(), arrayListKindFood);
        rvKindOfFood = view.findViewById(R.id.rvKindOfFood);
        rvKindOfFood.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        rvKindOfFood.setAdapter(kindOfFoodAdapter);
        setDataOnKindOfFoodRecyclerView();


        // set recycler view popular food
        popularFoodAdapter = new itemAdapter(getActivity(), arrayListPopularFood);
        rvPopularFood = view.findViewById(R.id.rvPopularFood);
        rvPopularFood.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        rvPopularFood.setAdapter(popularFoodAdapter);
        setDataOnPopularFood();

        // set recently food

        recentlyFoodAdapter = new itemAdapter(getActivity(), arrayListFoodRecently);
        rvRecentlyFood = view.findViewById(R.id.rvRecentlySee);
        rvRecentlyFood.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        rvRecentlyFood.setAdapter(recentlyFoodAdapter);
        setDataOnRecentlyFood();


        return view;

    }

    private  void setDataOnPopularFood() {
        for(int i = 0; i < 10; i++) {
            singleItemModel popularFoodModel = new singleItemModel();
            popularFoodModel.setDescription("food:" + i);
            popularFoodModel.setName("name:" + i);
            arrayListPopularFood.add(popularFoodModel);
        }
        popularFoodAdapter.notifyDataSetChanged();
    }

    private void setDataOnKindOfFoodRecyclerView() {
        for (int i = 0; i <= 10; i++) {
            kindOfFoodModel kindOfFoodModel = new kindOfFoodModel();
            kindOfFoodModel.setDescription("food: " + i);
            kindOfFoodModel.setName("name:" + i);
            arrayListKindFood.add(kindOfFoodModel);
        }
        kindOfFoodAdapter.notifyDataSetChanged();
    }

    private void setDataOnRecentlyFood() {
        for(int i = 0; i <= 10; i++) {
            singleItemModel recentlyFood = new singleItemModel();
            recentlyFood.setName("recently food " + i);
            recentlyFood.setDescription("recently food " + i);
            arrayListFoodRecently.add(recentlyFood);
        }
        recentlyFoodAdapter.notifyDataSetChanged();
    }
}

