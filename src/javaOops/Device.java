package javaOops;

public class Device {
	
	// Only Constructors 
	
	private int deviceID;
	private String deviceName;
	private double devicePrice;
	
	Device(){
		// Do Nothing
	}
	
	Device(int deviceID, String deviceName, double devicePrice){
		this.deviceID = deviceID;
		this.deviceName = deviceName;
		this.devicePrice = devicePrice;
	}
	
	Device(String deviceName){
		this.deviceName = deviceName;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	
	public double getDevicePrice() {
		return devicePrice;
	}

}
