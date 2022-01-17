package com.phone;

public class Galaxy extends Phone implements Ringable {

	public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
	@Override
    public String Ring() {
      return this.getRingTone();
    }
    @Override
    public String unlock() {
    	return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
      System.out.println("Version: " + this.getVersionNumber());
      System.out.println("RingTone: " + this.getRingTone());
      System.out.println("Battery: " + this.getBatteryPercentage());
      System.out.println("Carrier: " + this.getCarrier());
    }
}