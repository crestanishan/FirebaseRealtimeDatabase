package com.example.nishan.firebaserealtimedatabase;

/**
 * Created by nishan on 11/8/17.
 */

public class Artist {

    String artistId;
    String artistName;
    String artistGenre;

    public Artist(){

    }

    public Artist( String artistId,  String artistName,  String artistGenre){
        this.artistId = artistId;
        this.artistName = artistName;
        this.artistGenre = artistGenre;
    }

    public String getArtistId(){
        return artistId;
    }

    public String getArtistName(){
        return artistName;
    }


    public String getArtistGenre() {
        return artistGenre;
    }
}
