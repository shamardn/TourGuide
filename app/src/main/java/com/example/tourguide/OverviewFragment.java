package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class OverviewFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.monuments_list, container, false);

        final ArrayList<MasterPiece> monumentsList = new ArrayList<>();
        monumentsList.add(new MasterPiece(getString(R.string.pharaonic), getString(R.string.pharaonic_info), R.drawable.giza_pyramids));
        monumentsList.add(new MasterPiece(getString(R.string.coptic), getString(R.string.coptic_info), R.drawable.hanging_church));
        monumentsList.add(new MasterPiece(getString(R.string.islamic), getString(R.string.islamic_info), R.drawable.azhar_mosque));

        DestinationAdapter adapter = new DestinationAdapter(getActivity(), monumentsList);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }
}