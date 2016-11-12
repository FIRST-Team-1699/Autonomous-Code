/**
 * A class that houses an array list and makes sure that each id is unique
 * 
 * @author squirlemaster42
 */
package org.usfirst.frc.team1699.utils.command;

import java.util.ArrayList;

public class CommandIdArray {
	// Should store name and id and make sure that no id or name is a duplicate

	private ArrayList<Integer> list;

	public CommandIdArray() {
		list = new ArrayList<Integer>();
	}

	public void addId(int id) {
		if (list.contains(id)) {
			System.err.println("Id has already been used.");
			return;
		}

		list.add(id);
	}

	public ArrayList<Integer> getList() {
		return list;
	}
}
