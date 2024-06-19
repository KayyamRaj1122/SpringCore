package com.raj;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class SonySpeakers implements  Speakers{
    @Override
    public String makesound() {
        System.out.println("Sony-Sound");

        return null;
    }
}
