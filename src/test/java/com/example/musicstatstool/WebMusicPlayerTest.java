package com.example.musicstatstool;

import org.junit.jupiter.api.Test;
import org.junit.contrib.java.lang.system.StandardOutputStreamLog;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(classes=MusicStatsConfig.class)
public class WebMusicPlayerTest {

    public final StandardOutputStreamLog log = new StandardOutputStreamLog();

    @Autowired
    private WebMusicPlayer wbm;

    @Test
    void contextLoads() {
    }

    @Test
    void tracksShouldNotBeNull() {
        //wbm = new WebMusicPlayer();
        assertNotNull(wbm.tracks);
    }

    @Test
    void webMusicPlayerShouldNotBeNull() {
        assertNotNull(wbm);
    }

    @Test
    void testWebMusicPlayer() {
        wbm.playTracks();
        assertEquals(wbm.tracks.size(), wbm.tracksPlayed);
    }

    @Test
    public void testMusicStatsRecorder() {
        wbm.playTrack(0);
        wbm.playTrack(1);
        assertEquals(wbm.tracks.size(), wbm.tracksPlayed);
    }
}
