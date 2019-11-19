package com.example.trafficLight;

import java.sql.Timestamp;
import java.util.Date;
import java.util.Timer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TrafficLightApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrafficLightApplication.class, args);
		Timer timer = new Timer();
		//timer.schedule(new MyTask("john"), new Date(new Date().getTime() + 5000));
		//timer.schedule(new MyTask("jack"), 0, 3000);
		 Date date= new Date();

		 long time = date.getTime();
	     	 System.out.println("Time in Milliseconds: " + time);

		 Timestamp ts = new Timestamp(time);
		 System.out.println("Current Time Stamp: " + ts);
		
	}

}
