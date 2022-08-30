package com.example.musicstatstool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class MusicstatstoolApplication {
    static ApplicationContext context = null;

    public static void main(String[] args) {
        // SpringApplication.run(MusicstatstoolApplication.class, args);

        // Mixing xml and annotation contexts:
        ApplicationContext context = new ClassPathXmlApplicationContext("MusicStatsConfig.xml");
        // Annotation context only
        // context = new AnnotationConfigApplicationContext(MusicStatsConfig.class);

        MusicPlayer wmp = context.getBean(MusicPlayer.class);
        wmp.playTrack(0);
        wmp.playTrack(1);
        wmp.playTrack(0);
    }
}
