package com.example.cookart.Adapter;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Context;

import com.example.cookart.R;
import com.example.cookart.models.kindOfFoodModel;
import com.example.cookart.models.singleMenuFoodModel;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class singleMenuFoodAdapter extends RecyclerView.Adapter<singleMenuFoodAdapter.singleMenuFoodViewHolder> {

    private Context context;
    private ArrayList<singleMenuFoodModel> mArrayList = new ArrayList<>();


    public singleMenuFoodAdapter() {}
    public singleMenuFoodAdapter(Context context, ArrayList<singleMenuFoodModel> mArrayList) {
        this.context = context;
        this.mArrayList = mArrayList;
    }

    @NonNull
    @Override
    public singleMenuFoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_list_menu, parent, false);
        return new singleMenuFoodViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull singleMenuFoodViewHolder singleMenuFoodViewHolder, int position) {
        final singleMenuFoodModel current = mArrayList.get(position);
        singleMenuFoodViewHolder.tv_NameFood.setText(current.getName());
        singleMenuFoodViewHolder.iv_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, current.getName(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public class singleMenuFoodViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_food;
        private TextView tv_NameFood;
        public singleMenuFoodViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_food = itemView.findViewById(R.id.iv_foodImageMenu);
            tv_NameFood = itemView.findViewById(R.id.tv_nameFoodMenu);
        }
    }
}
