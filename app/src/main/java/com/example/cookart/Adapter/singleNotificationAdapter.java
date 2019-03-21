package com.example.cookart.Adapter;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.cookart.R;
import com.example.cookart.models.singleItemModel;
import com.example.cookart.models.singleNotificationModel;

import java.util.ArrayList;

public class singleNotificationAdapter extends RecyclerView.Adapter<singleNotificationAdapter.singleNotificationViewHolder> {
    private Context context;
    private ArrayList<singleNotificationModel> mArrayList = new ArrayList<>();

    public singleNotificationAdapter() {}
    public singleNotificationAdapter(Context context, ArrayList<singleNotificationModel> mArrayList) {
        this.context = context;
        this.mArrayList = mArrayList;
    }

    @NonNull
    @Override
    public singleNotificationViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view  = LayoutInflater.from(parent.getContext()).inflate(R.layout.single_notification_layout,parent, false);
        return new singleNotificationViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull singleNotificationViewHolder singleNotificationViewHolder, int position) {
        final singleNotificationModel current = mArrayList.get(position);
        singleNotificationViewHolder.tv_messgeContent.setText(current.getMessegeContent());

        singleNotificationViewHolder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, current.getMessegeContent(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return mArrayList.size();
    }

    public class singleNotificationViewHolder extends RecyclerView.ViewHolder {
        private TextView tv_messgeContent;
        private ImageView iv_NotificationImage;
        public singleNotificationViewHolder(@NonNull View itemView) {
            super(itemView);
            tv_messgeContent = itemView.findViewById(R.id.message_content);
            iv_NotificationImage = itemView.findViewById(R.id.nofitication_image);
        }
    }
}
