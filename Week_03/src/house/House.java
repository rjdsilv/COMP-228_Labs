package house;

import furniture.Table;

public class House {
	private int numberOfRooms;
	private Door door;
	private Table table;
	
	public House(int numberOfRooms) {
		this.numberOfRooms = numberOfRooms;
	}
	
	public int getNumberOfRooms() {
		return numberOfRooms;
	}
	
	public Door getDoor() {
		return door;
	}
	
	public void setDoor(Door door) {
		this.door = door;
	}
	
	public Table getTable() {
		return table;
	}
	
	public void setTable(Table table) {
		this.table = table;
	}
	
	public String describeHouse() {
		return "Beaultiful house on the lake.";
	}
}
