package com.example.tourguide;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class DestinationAdapter extends ArrayAdapter<MasterPiece> {

    public DestinationAdapter(@NonNull Context context, ArrayList<MasterPiece> monumentsList) {
        super(context, 0, monumentsList);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }

        MasterPiece masterPiece = getItem(position);

        TextView mpName = (TextView) view.findViewById(R.id.mp_name);
        mpName.setText(masterPiece.getMpName());

        TextView mpInfo = (TextView) view.findViewById(R.id.mp_info);
        mpInfo.setText(masterPiece.getMpInfo());

        ImageView mpImage = (ImageView) view.findViewById(R.id.mp_image);
        mpImage.setImageResource(masterPiece.getMpImage());

        return view;
    }
}
