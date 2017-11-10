package com.example.nishan.firebaserealtimedatabase;

/**
 * Created by nishan on 11/9/17.
 */

public class Track {
    private String trackId;
    private String trackname;
    private int trackRating;

    public Track(){

    }

   public Track(String trackId, String trackname, int trackRating){

       this.trackId = trackId;
       this.trackname = trackname;
       this.trackRating = trackRating;

   }

    public String getTrackId() {
        return trackId;
    }

    public String getTrackname() {
        return trackname;
    }

    public int getTrackRating() {
        return trackRating;
    }
}
