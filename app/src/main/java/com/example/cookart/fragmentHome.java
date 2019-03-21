package com.example.cookart;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


import com.example.cookart.Adapter.itemAdapter;
import com.example.cookart.models.singleItemModel;

import java.util.ArrayList;

import butterknife.ButterKnife;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentHome extends Fragment {



    // vars
    // creat value for new cooking recipe
    private ArrayList<singleItemModel> arrayNewCookingRecipe = new ArrayList<>();
    private itemAdapter newCookingRecipeAdapter;
    private RecyclerView rvNewCookingRecipe;

    // populor food
    private ArrayList<singleItemModel> arrayListPopularFood = new ArrayList<>();
    private itemAdapter popularFoodAdapter;
    private RecyclerView rvPopularFood;

    // recently food

    private ArrayList<singleItemModel> arrayListFoodRecently = new ArrayList<>();
    private itemAdapter recentlyFoodAdapter;
    private RecyclerView rvRecentlyFood;


    public fragmentHome() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Log.d(TAG, "onCreateView: ");
        View view = inflater.inflate(R.layout.fragment_fragment_home, container, false);
        ButterKnife.bind(this, view);
        // recyclerview new cooking recipe
        newCookingRecipeAdapter = new itemAdapter(getActivity(), arrayNewCookingRecipe);
        rvNewCookingRecipe = view.findViewById(R.id.rvNewCookingRecipe);
        rvNewCookingRecipe.setAdapter(newCookingRecipeAdapter);
        rvNewCookingRecipe.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.HORIZONTAL, false));
        setDataOnNewCookingRecipe();

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


    private void setDataOnNewCookingRecipe() {
        for (int i = 0 ; i <= 10; i++) {
            singleItemModel singleItemModel = new singleItemModel();
            singleItemModel.setDescription("new recipe" + i);
            singleItemModel.setName("name" + i);
            arrayNewCookingRecipe.add(singleItemModel);
        }
        newCookingRecipeAdapter.notifyDataSetChanged();
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
