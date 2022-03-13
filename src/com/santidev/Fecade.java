package com.santidev;

public class Fecade {

    private Light light;
    private Music music;
    private Video video;

    public Fecade(){
        light = new Lamp();
        music = new MusicPlayer();
        video = new VideoPlayer();
    }

    public void sing(){
        System.out.println("Start singing with");
        light.flash();
        music.play();
    }

    public void dance(){
        System.out.println("Start dancing with");
        light.flash();
        music.play();
        video.show();
    }

    public void act(){
        System.out.println("Start acting with");
        light.flash();
        video.show();
    }
}
