package com.example.trafficLight.model;

public class CombinedSignal {
	
	SignalColour signalColour;
	Boolean status;
	
	public CombinedSignal(SignalColour colour, Boolean status) {
		this.signalColour = colour;
		this.status = status;
	
	}
	public SignalColour getSignalColour() {
		return signalColour;
	}
	public void setSignalColour(SignalColour signalColour) {
		this.signalColour = signalColour;
	}
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
}
