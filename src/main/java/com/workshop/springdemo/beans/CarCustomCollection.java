package com.workshop.springdemo.beans;

import java.util.HashSet;
import java.util.Set;
import java.util.Vector;

public class CarCustomCollection {
	private Vector<String> names;
	private HashSet<Engine> engines;
	
	public Vector<String> getNames() {
		return names;
	}

	public void setNames(Vector<String> names) {
		this.names = names;
	}

	public Set<Engine> getEngines() {
		return engines;
	}

	
	public void setEngines(HashSet<Engine> engines) {
		this.engines = engines;
	}

	public void printData(){
		System.out.println("Car names ");
		for (String name : names) {
			System.out.println(name);
		}
		System.out.println("*****************");
		System.out.println("Engine Details");
		for (Engine engine : engines) {
			System.out.println(engine);
		}
	}
	
}
