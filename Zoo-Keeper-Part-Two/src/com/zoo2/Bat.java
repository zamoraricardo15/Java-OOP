package com.zoo2;

public class Bat extends Mammal {


		public void fly() {
	        this.setEnergy(this.getEnergy()-50);
			System.out.println("The bat is flying");

		}
		
		public void eatHumans() {
			System.out.println("The bat is eating humans, hide!");
	        this.setEnergy(this.getEnergy()+25);
		}
		
		public void attackTown() {
			System.out.println("The bat is attacking the town");
	        this.setEnergy(this.getEnergy()-100);
		
		}
		

	
}
