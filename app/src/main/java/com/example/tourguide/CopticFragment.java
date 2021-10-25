package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CopticFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.monuments_list, container, false);

        final ArrayList<MasterPiece> monumentsList = new ArrayList<>();
        monumentsList.add(new MasterPiece(getString(R.string.coptic_museum), getString(R.string.coptic_museum_info), R.drawable.coptic_museum));
        monumentsList.add(new MasterPiece(getString(R.string.abu_serga), getString(R.string.abu_serga_info), R.drawable.abu_serga_church));
        monumentsList.add(new MasterPiece(getString(R.string.hanging_church), getString(R.string.hanging_church_info), R.drawable.hanging_church));
        monumentsList.add(new MasterPiece(getString(R.string.saint_catherine), getString(R.string.saint_catherine_info), R.drawable.saint_catherine));

        DestinationAdapter adapter = new DestinationAdapter(getActivity(), monumentsList);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }
}