package com.example.cookart.Adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cookart.R;
import com.example.cookart.models.singleItemModel;

import java.util.ArrayList;

import butterknife.ButterKnife;

public class itemAdapter extends RecyclerView.Adapter<itemAdapter.itemHolder> {
    private Context mContext;
    private ArrayList<singleItemModel> mArrayList;

    public itemAdapter(Context mContext, ArrayList<singleItemModel> mArrayList) {
        this.mContext = mContext;
        this.mArrayList = mArrayList;
    }


    @NonNull
    @Override
    public itemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_item_view,parent, false);
        return new itemHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull itemHolder itemHolder, int position) {
        final singleItemModel current = mArrayList.get(position);
        itemHolder.tvTitle.setText(current.getDescription());

        itemHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, current.getDescription(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public class itemHolder extends RecyclerView.ViewHolder {
        private TextView tvTitle;
        public itemHolder(@NonNull View itemView) {
            super(itemView);
            tvTitle = itemView.findViewById(R.id.text_title);
            ButterKnife.bind(this, itemView);
        }
    }
}
