package org.usfirst.frc.team1699.utils.autonomous;

public class CommandNotFoundException extends RuntimeException {

	// Auto-generated Serial ID
	private static final long serialVersionUID = 3380041418989057044L;

	// This is an exception that it thrown when a command is not found inside the CommandNameArray or CommandIdArray
	public CommandNotFoundException() {
		super();
	}

	public CommandNotFoundException(String arg0) {
		super(arg0);
	}
	
}
