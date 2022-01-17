package com.phone;

public class IPhone extends Phone implements Ringable {

	public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
		super(versionNumber, batteryPercentage, carrier, ringTone);
	}
    @Override
    public String Ring() {
		return this.getRingTone();
    }
    @Override
    public String unlock() {
    	return "Unlocked with fingerprint scanner";
    }
    @Override
    public void displayInfo() {
        System.out.println("Version: " + this.getVersionNumber());
        System.out.println("RingTone: " + this.getRingTone());
        System.out.println("Battery: " + this.getBatteryPercentage());
        System.out.println("Carrier: " + this.getCarrier());
    }
}