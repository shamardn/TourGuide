package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class PharaonicFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.monuments_list, container, false);

        final ArrayList<MasterPiece> monumentsList = new ArrayList<>();

        monumentsList.add(new MasterPiece(getString(R.string.abo_simbel_temples), getString(R.string.abo_simbel_temples_info), R.drawable.abo_simbel));
        monumentsList.add(new MasterPiece(getString(R.string.pyramids), getString(R.string.pyramids_info), R.drawable.giza_pyramids));
        monumentsList.add(new MasterPiece(getString(R.string.sphinx), getString(R.string.sphinx_info), R.drawable.sphinx));
        monumentsList.add(new MasterPiece(getString(R.string.valley_of_the_kings), getString(R.string.valley_of_the_kings_info), R.drawable.valley));
        monumentsList.add(new MasterPiece(getString(R.string.egyptian_museum), getString(R.string.egyptian_museum_info), R.drawable.egyptian_museum));
        monumentsList.add(new MasterPiece(getString(R.string.luxor_temple), getString(R.string.luxor_temple_info), R.drawable.luxor));
        monumentsList.add(new MasterPiece(getString(R.string.karnak), getString(R.string.karnak_info), R.drawable.karnak));
        monumentsList.add(new MasterPiece(getString(R.string.saqqara_necropolis), getString(R.string.saqqara_necropolis_info), R.drawable.saqqara));
        monumentsList.add(new MasterPiece(getString(R.string.colossi_of_memnon), getString(R.string.colossi_of_memnon_info), R.drawable.memnon));

        DestinationAdapter adapter = new DestinationAdapter(getActivity(), monumentsList);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }
}