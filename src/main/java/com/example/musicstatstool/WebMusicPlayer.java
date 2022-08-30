package com.example.musicstatstool;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class WebMusicPlayer implements MusicPlayer {

    public int tracksPlayed = 0;

    public List<MusicTrack> tracks;

    public WebMusicPlayer() {
        tracks = new ArrayList<>();
        tracks.add(new ClassicMusicTrack("Eagles", "Hotel California", "\"On a dark desert highway\\n\" +\n" +
                "                \"Cool wind in my hair\\n\" +\n" +
                "                \"Warm smell of colitas\\n\" +\n" +
                "                \"Rising up through the air\\n\" +\n" +
                "                \"Up ahead in the distance\\n\" +\n" +
                "                \"I saw a shimmering light\\n\" +\n" +
                "                \"My head grew heavy and my sight grew dim\\n\" +\n" +
                "                \"I had to stop for the night\";"));
        tracks.add(new ClassicMusicTrack("Beatles", "Some Beatle track", "Some Beatle song"));
    }

    public void playTracks() {
        for (MusicTrack track: tracks) {
            track.play();
            ++tracksPlayed;
        }
    }

    public void playTrack(int index) {
        tracks.get(index).play();
        ++tracksPlayed;
    }

    public List<MusicTrack> getTracks() {
        return tracks;
    }
}
