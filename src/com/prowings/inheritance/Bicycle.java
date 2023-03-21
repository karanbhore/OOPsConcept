package com.prowings.inheritance;

public class Bicycle {
	public int gear;
	public int speed;

	public Bicycle(int gear, int speed) {
		this.gear = gear;
		this.speed = speed;
	}

	public void appplyBrake(int decrement) {
		speed -= decrement;
	}

	public void speedUp(int increment) {
		speed += increment;
	}

	public String toString() {
		return ("No of gears are :" + gear + " " + "speed of Bicycle : " + speed);
	}
}

//derived class
class MountainBike extends Bicycle {
	public int seatHeight;

	public MountainBike(int gear, int speed, int startHeight) {
		super(gear, speed);
		seatHeight = startHeight;
	}

	public void setHeight(int newValue) {
		seatHeight = newValue;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return (super.toString() + "\nseatHeight is :" + seatHeight);
	}

//	public String toString() {
//		return (super.toString() + " " + "seat height is" + seatHeight);
}
