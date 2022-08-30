package com.example.musicstatstool;

import org.springframework.stereotype.Component;

@Component("visualizerEngineImpl")
public class VisualizerEngineImpl implements VisualizerEngine {
    public VisualizerEngineImpl() {}

    public String getVisualization() {
        return "This is an awesome visualization for the song.";
    }

    private String[] visualizationPool;
    public void setVisualizationPool(String[] vizualiationPool) {
        this.visualizationPool = vizualiationPool;
    }

    public void generateVisuals(int index) {
        System.out.println("[Visualizer Engine]: Generating visuals...");
    }
}
