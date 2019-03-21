package com.example.cookart.Adapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cookart.R;
import com.example.cookart.models.kindOfFoodModel;

import java.util.ArrayList;

public class kindOfFoodAdapter extends RecyclerView.Adapter<kindOfFoodAdapter.viewHolder> {
    private Context context;
    private ArrayList<kindOfFoodModel> mArrayList;

    public kindOfFoodAdapter() {}
    public kindOfFoodAdapter(Context context, ArrayList<kindOfFoodModel> mArrayList) {
        this.context = context;
        this.mArrayList = mArrayList;
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_kind_of_food, parent, false);
        return new viewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int position) {
        final kindOfFoodModel current = mArrayList.get(position);
        viewHolder.tv_kindOfFoodTitle.setText(current.getDescription());
        viewHolder.iv_kindOfFood.setOnClickListener(new View.OnClickListener() {
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

    public class viewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_kindOfFood;
        private TextView tv_kindOfFoodTitle;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            iv_kindOfFood = itemView.findViewById(R.id.iv_kindOfFood);
            tv_kindOfFoodTitle = itemView.findViewById(R.id.tv_kindOfFoodTitle);
        }
    }
}
