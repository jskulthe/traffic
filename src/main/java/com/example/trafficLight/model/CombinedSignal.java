package com.example.trafficLight.model;

public class CombinedSignal {
	
	SignalColour signalColour;
	SignalStatus signalStatus;
	Long time;
	
	public SignalColour getSignalColour() {
		return signalColour;
	}
	public void setSignalColour(SignalColour signalColour) {
		this.signalColour = signalColour;
	}
	public SignalStatus getSignalStatus() {
		return signalStatus;
	}
	public void setSignalStatus(SignalStatus signalStatus) {
		this.signalStatus = signalStatus;
	}
	public Long getTime() {
		return time;
	}
	public void setTime(Long time) {
		this.time = time;
	}
}
