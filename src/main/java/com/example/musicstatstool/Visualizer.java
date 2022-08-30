package com.example.musicstatstool;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Visualizer {

    private VisualizerEngine visualizerEngine;

    public Visualizer() {}

    @Pointcut("execution(* com.example.musicstatstool.WebMusicPlayer.playTrack(int)) && args(index)")
    public void musicIsPlaying(int index) {}

    @After("musicIsPlaying(index)")
    public void record(int index) {
        this.visualizerEngine.generateVisuals(index);
        System.out.println("[Visualizer]: Displaying song visuals for track index " + index);
    }

    public void setVisualizerEngine(VisualizerEngine visualizerEngine) {
        this.visualizerEngine = visualizerEngine;
    }
}
