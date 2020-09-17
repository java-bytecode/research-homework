/**
 * 
 */
package javaOops;

/**
 * @author CyberxNuke
 *
 */
public class DriverCode {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double testNumber = 10.80;
		System.out.println((int) testNumber);
		
		System.out.println();
		
		// Device.java
		
		Device alexCamera = new Device();
		Device arriCamera = new Device(1, "Arri Camera", 1000); // Automatic conversion from Integer to Double
		Device imaxCamera = new Device("Imax Camera");
		
		System.out.println("$" + arriCamera.getDevicePrice());
		
		System.out.println();
		
		// Camera.java
		
		Camera hpeCamera = new Camera();
		System.out.println(hpeCamera.getDeviceName()); // null
		System.out.println(hpeCamera.getDevicePrice()); // 0.0
		
		System.out.println();
		
		Camera kotakCamera = new Camera(10, 20);
		System.out.println(kotakCamera.getDeviceName()); // null
		System.out.println(kotakCamera.getDevicePrice()); // 0.0
		System.out.println(kotakCamera.cameraSize);
		
		System.out.println();
		
		Camera canonCamera = new Camera(2, "Canon Camera", 1000, 20, 30);
		System.out.println(canonCamera.getDeviceName()); // null
		System.out.println(canonCamera.getDevicePrice()); // 0.0
		System.out.println(canonCamera.cameraSize);
		
		System.out.println();
		
		// Upcasting: Implicit
		
		Device digiCamera = new Camera(3, "Digi Camera", 500, 20, 30);
		System.out.println(digiCamera.getDeviceName()); // null
		System.out.println(digiCamera.getDevicePrice()); // 0.0
		// System.out.println(canonCamera.cameraSize);
		
		System.out.println();	
		
		// Downcasting: Explicit
		
		Camera digiCameraDownCast = (Camera) digiCamera;
		System.out.println(digiCameraDownCast.getDeviceName()); // null
		System.out.println(digiCameraDownCast.getDevicePrice()); // 0.0
		System.out.println(digiCameraDownCast.cameraSize);
		
		// Downcasting
		// Doesn't work
		
		Device arri2Device = new Device(4, "Arri 2 Camera", 5000);
		Camera arri2Camera = (Camera) arri2Device;
		
		System.out.println(arri2Camera.getDeviceName()); // null
		System.out.println(arri2Camera.getDevicePrice()); // 0.0
	//	System.out.println(arri2Camera.cameraSize);
		
		

	}

}
