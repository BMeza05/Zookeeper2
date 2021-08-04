package com.brian.zookeeper2;


public class Bat extends Mammal {
	
	private int energy;
	
	public void fly(int number) {
		energy = number;
		System.out.println("FWOOOOSHHHHHH--the bat escaped its holding cage, where will it go?!? its energy has decreased by" + energy);
		
	}
	
	public void eatHuamns(int number) {
		energy = number;
		System.out.println("The bat has devoured a human, its energy increases by" + energy );
	}
	
	public void attackTown(int number) {
		energy = number;
		System.out.println("SMASH-*fire raging and crackling* *crumbling building, people screaming* energy decreased by" + energy);
	}


}
