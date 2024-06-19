package com.raj;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

public class Main {
    public static void main(String[] args) {

        var context=new AnnotationConfigApplicationContext(Projectconfig.class);
   Person person=context.getBean(Person.class);
        System.out.println( person.getName());
        person.getVehicle().getVehser().getSpeakers().makesound();
        person.getVehicle().getVehser().getTyres().rotate();


    }
}