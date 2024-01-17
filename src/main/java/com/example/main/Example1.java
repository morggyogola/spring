package com.example.main;

import com.example.beans.Vehicle;
import com.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLOutput;

public class Example1 {
    public static void main(String[] args) {
        //Non Spring
        Vehicle vehicle = new Vehicle();
        vehicle.setName("Mazda");
        System.out.println("Vehicle name from non spring context is "+vehicle.getName());

        //Spring context
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Vehicle veh1 = context.getBean("audiVehicle",Vehicle.class);
        System.out.println("Vehicle name fro Spring Context is:"+veh1.getName());

        Vehicle veh2 = context.getBean("ferrariVehicle",Vehicle.class);
        System.out.println("Vehicle name fro Spring Context is:"+veh2.getName());

        Vehicle veh3 = context.getBean("hondaVehicle",Vehicle.class);
        System.out.println("Vehicle name fro Spring Context is:"+veh3.getName());
    }
}
