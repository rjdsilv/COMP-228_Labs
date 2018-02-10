package driver;

import furniture.Table;
import house.Door;
import house.House;

public class Driver {
	public static void main(String[] args) {
		House house = new House(4);
		Door door = new Door();
		Table table = new Table();
		
		door.setMaterial("Metal");
		table.setMaterial("Wood");
		house.setDoor(door);
		house.setTable(table);
		
		String doorMaterial = house.getDoor().getMaterial();
		String tableMaterial = house.getTable().getMaterial();
		
		System.out.println("Door material is: " + doorMaterial);
		System.out.println("Table material is: " + tableMaterial);
	}
}
