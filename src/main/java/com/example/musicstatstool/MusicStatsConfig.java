package com.example.musicstatstool;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan
public class MusicStatsConfig {

    /**
     * AOP
     * @return
     */
    @Bean("MusicStatsRecorder")
    public MusicStatsRecorder musicStatsRecorder() {
        return new MusicStatsRecorder();
    }

//    @Bean
//    public MusicPlayer webMusicPlayer() {
//        return new WebMusicPlayer();
//    }
}
