package com.example.musicstatstool;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.HashMap;

@Aspect
public class MusicStatsRecorder implements Recorder {

    private HashMap<Integer, Integer> musicRecordsStats = new HashMap<>();

    //@Pointcut("execution(* com.example.musicstatstool.WebMusicPlayer.playTrack(int)) && args(index)")
    public void musicIsPlaying(int index) {}

    public void updateTrackPlayed(int index) {
        // check if exists
        int currentCount = getPlayCount(index);
        musicRecordsStats.put(index, currentCount+1);
    }

    public int getPlayCount(int index) {
        return musicRecordsStats.containsKey(index) ? musicRecordsStats.get(index) : 0;
    }

    //@After("musicIsPlaying(index)")
    public void record(int index) {
        // Update number of times this song has been played so far
        // How many songs played in total in this session
        // etc...
        updateTrackPlayed(index);
        System.out.println("[Music Stats Recorder]: Song has been played " + getPlayCount(index) + " times.");
    }

    public void recordAll(ProceedingJoinPoint jp, int index) {
        try {
            System.out.println("Before recording.");

            System.out.println("Setup ...");

            jp.proceed();

            record(index);
        } catch (Throwable e) {
            System.out.println("Error recording.");
        }
    }

}
