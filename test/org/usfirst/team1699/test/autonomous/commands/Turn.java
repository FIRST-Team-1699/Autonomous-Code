package org.usfirst.team1699.test.autonomous.commands;

public class Turn extends org.usfirst.frc.team1699.utils.command.Command{

	public Turn(String name, int id) {
		super(name, id);
	}

	@Override
	public void init() {
		
	}

	@Override
	public void run() {
		
	}

	@Override
	public void runAuto(int distance, double speed, boolean useSensor) {
		System.out.println(distance + " " + speed + " " + useSensor);
		
	}

	@Override
	public boolean autoCommandDone() {
		return false;
	}

	@Override
	public void outputToDashboard() {
		
	}

	@Override
	public void zeroAllSensors() {
		
	}

}