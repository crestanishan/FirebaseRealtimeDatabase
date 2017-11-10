package com.example.nishan.firebaserealtimedatabase;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nishan on 11/8/17.
 */

public class ArtistList extends ArrayAdapter<Artist> {
     private Activity context;
     private List<Artist> artistList;

    TextView textViewName;


    public ArtistList(Activity context, List<Artist>artistList) {
        super(context, R.layout.list_layout,artistList );
        this.context = context;
        this.artistList = artistList;
    }

    @NonNull
    @Override
    public View getView(int position,  View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.list_layout,null,true);

        TextView textViewName = (TextView)listViewItem.findViewById(R.id.textViewName);
        TextView textViewGenre  = (TextView)listViewItem.findViewById(R.id.textViewGenre);

        Artist artist = artistList.get(position);

        textViewName.setText(artist.getArtistName());
        textViewGenre.setText(artist.getArtistGenre());

        return listViewItem;
    }

}
