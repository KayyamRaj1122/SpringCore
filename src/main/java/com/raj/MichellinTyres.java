package com.raj;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MichellinTyres implements Tyres {
    public String rotate() {
        System.out.println("Michellin tyre is moving");

        return null;
    }
}
