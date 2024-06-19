package com.raj;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Vehicleservices {
    @Autowired
    private Speakers speakers;
    @Autowired
    private Tyres tyres;

    public Speakers getSpeakers() {
        return speakers;
    }

    public void setSpeakers(Speakers speakers) {
        this.speakers = speakers;
    }

    public void movevehicle(){
        String status=tyres.rotate();
        System.out.println(status);
    }

    public Tyres getTyres() {
        return tyres;
    }

    public void setTyres(Tyres tyres) {
        this.tyres = tyres;
    }

    public void playmusic(){
        String music=speakers.makesound();
        System.out.println(music );
    }
}
