package com.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class IslamicFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.monuments_list, container, false);

        final ArrayList<MasterPiece> monumentsList = new ArrayList<>();

        monumentsList.add(new MasterPiece(getString(R.string.azhar), getString(R.string.azhar_info), R.drawable.azhar_mosque));
        monumentsList.add(new MasterPiece(getString(R.string.salah_castle), getString(R.string.salah_castle_info), R.drawable.citadel));
        monumentsList.add(new MasterPiece(getString(R.string.muhammad_ali_mosque), getString(R.string.muhammad_ali_mosque_info), R.drawable.mosque_of_muhammad_ali));
        monumentsList.add(new MasterPiece(getString(R.string.ibn_tulun_mosque), getString(R.string.ibn_tulun_mosque_info), R.drawable.ibn_tulun_mosque));

        DestinationAdapter adapter = new DestinationAdapter(getActivity(), monumentsList);
        ListView listView = (ListView) view.findViewById(R.id.list);
        listView.setAdapter(adapter);

        return view;
    }
}