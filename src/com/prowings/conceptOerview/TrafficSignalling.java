package com.prowings.conceptOerview;

public class TrafficSignalling {

	private String color;
	private int duration;

	public TrafficSignalling() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TrafficSignalling(String color, int duration) {
		super();
		this.color = color;
		this.duration = duration;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	@Override
	public String toString() {
		return "TrafficSignalling [color=" + color + ", duration=" + duration + "]";
	}

	public void signalCheck() {
		System.out.println("traffic signals are on");
		if (this.color == "red") {

			if (this.color == "red") {
				System.out.println("stop!!! turn off your vehicles wait for 40 sec ");
				System.out.println("this is red signaling");
			}

		} else if (this.getColor() == "yellow") {

			if (this.color == "yellow") {
				System.out.println("move slowly red signal is comming");
				System.out.println("this is yellow signaling");
			}

		} else if (this.getColor() == "green") {

			if (this.color == "green") {
				System.out.println("move slowly");
				System.out.println("this is green signaling");
			}

		}

	}

	public static void main(String[] args) {
		TrafficSignalling trafficSignalling1 = new TrafficSignalling("red", 40);
		TrafficSignalling trafficSignalling2 = new TrafficSignalling("yellow", 40);
		TrafficSignalling trafficSignalling3 = new TrafficSignalling("green", 40);

		trafficSignalling3.signalCheck();
		System.out.println();
		trafficSignalling2.signalCheck();
		System.out.println();
		trafficSignalling1.signalCheck();
		System.out.println();
		

	}

}
