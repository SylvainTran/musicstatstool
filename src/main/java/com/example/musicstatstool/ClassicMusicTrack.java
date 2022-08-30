package com.example.musicstatstool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class ClassicMusicTrack implements MusicTrack {

    public String artistName;
    public String trackName;
    public String lyrics;

    @Autowired
    public ClassicMusicTrack(@Value("Eagles") String artistName, @Value("Hotel California") String trackName, @Value("...") String lyrics) {
        this.artistName = artistName;
        this.trackName = trackName;
        this.lyrics = lyrics;
    }

    public void play() {
        System.out.println(lyrics);
    }
}
