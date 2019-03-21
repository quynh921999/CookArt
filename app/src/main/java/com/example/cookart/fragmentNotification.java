package com.example.cookart;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.cookart.Adapter.singleNotificationAdapter;
import com.example.cookart.models.singleNotificationModel;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class fragmentNotification extends Fragment {

    private ArrayList<singleNotificationModel> ArrayNotification = new ArrayList<>();
    private singleNotificationAdapter singleNotificationAdapter;
    private RecyclerView rvNotification;
    public fragmentNotification() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view =  inflater.inflate(R.layout.fragment_fragment_notification, container, false);
        singleNotificationAdapter = new singleNotificationAdapter(getActivity(), ArrayNotification);
        rvNotification = view.findViewById(R.id.rv_notification);
        rvNotification.setLayoutManager(new LinearLayoutManager(getActivity(), LinearLayoutManager.VERTICAL, false));
        rvNotification.setAdapter(singleNotificationAdapter);
        setDataOnNotification();
        return view;
    }

    private void setDataOnNotification() {
        for (int i = 0; i <= 10; i++) {
            singleNotificationModel singleNotificationModel = new singleNotificationModel();
            singleNotificationModel.setMessegeContent("test content " + i);
            ArrayNotification.add(singleNotificationModel);
        }

        singleNotificationAdapter.notifyDataSetChanged();
    }
}
