package com.raj;

public class BoseSpeakers implements Speakers{
    @Override
    public String makesound() {
        System.out.println("Bose-Sound");
        return null;
    }
}
