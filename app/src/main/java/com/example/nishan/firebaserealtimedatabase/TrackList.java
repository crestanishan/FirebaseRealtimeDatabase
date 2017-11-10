package com.example.nishan.firebaserealtimedatabase;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

/**
 * Created by nishan on 11/9/17.
 */

public class TrackList  extends ArrayAdapter<Track>{

    private Activity context;
    List<Track> tracks;

    TextView textViewName;


    public TrackList(Activity context, List<Track>tracks) {
        super(context, R.layout.tracklist_layout,tracks );
        this.context = context;
        this.tracks= tracks;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();

        View listViewItem = inflater.inflate(R.layout.tracklist_layout,null,true);

        TextView textViewName = (TextView)listViewItem.findViewById(R.id.textViewName);
        TextView textViewRating  = (TextView)listViewItem.findViewById(R.id.textViewRating);

       Track track = tracks.get(position);

        textViewName.setText(track.getTrackname());
        textViewRating.setText(String.valueOf(track.getTrackRating()));

        return listViewItem;
    }
}
