package com.example.trafficLight;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import com.example.trafficLight.model.*;

public class Dummy {
	
	static long delay = 1000L;
	static long period = 1000L;

	static List<CombinedSignal> signalList = new ArrayList<>();
	
	public static void main(String[] args) {


		
		CombinedSignal green = new CombinedSignal(SignalColour.GREEN,Boolean.TRUE);
		CombinedSignal red = new CombinedSignal(SignalColour.RED,Boolean.FALSE);
		CombinedSignal yellow = new CombinedSignal(SignalColour.YELLOW,Boolean.FALSE);
		
		signalList.add(green);
		signalList.add(red);
		signalList.add(yellow);
		
		initilizeTimer(signalList);
	}
	
	private  void changeRedGreenStatus() {
		 signalList.stream()
		 .filter((signal)-> signal.getSignalColour()!= SignalColour.YELLOW)
		 .forEach((signal)->{signal.setStatus(!signal.getStatus());});
		 
	}

	private static void initilizeTimer(List<CombinedSignal> signalList){
		Dummy dummyTimer = new Dummy();
		
		TimerTask task = new TimerTask() {
			public void run() {
				dummyTimer.changeRedGreenStatus();
			}

		};
		Timer timer = new Timer("Timer");

		timer.schedule(task,delay,period);

		TimerTask task2 = new TimerTask() {
			public void run() {
				dummyTimer.changeYellowStatus();
			}

		};
		
		Timer timer2 = new Timer("Timer");

		timer2.schedule(task2,delay,period);
		
	}

	protected void changeYellowStatus() {
		 signalList.stream()
		 .filter((signal)-> signal.getSignalColour()== SignalColour.YELLOW)
		 .forEach((signal)->{signal.setStatus(!signal.getStatus());});
	
	
	}


}
