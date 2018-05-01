package com.example.alumno.vwmove;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;


public class NotificationsFragment extends Fragment {

    ArrayList<String> itemsList;
    ArrayList<String> secondaryInf;
    ArrayAdapter<String> adapter;

    Button notif;
    Button fAlarm;

    ListView lv;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_notifications, container, false);

        lv = (ListView)view.findViewById(R.id._dynamicList);
        notif = (Button)view.findViewById(R.id.buttonNot);
        fAlarm = (Button)view.findViewById(R.id.buttonFails);

        itemsList = new ArrayList<>();
        for(int j = 0; j < 10; j++) {
            itemsList.add("Hola no."+j);
        }

        adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_multiple_choice, itemsList);


        lv.setAdapter(adapter);

        return view;
    }

}
