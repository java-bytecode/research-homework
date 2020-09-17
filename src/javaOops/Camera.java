/**
 * 
 */
package javaOops;

/**
 * @author CyberxNuke
 *
 */
public class Camera extends Device {	
	
		int cameraSize;
	
		Camera(){
			//super(0, "dummyCamera", 0);
		}
		
		Camera(int h, int w){
			setCameraSize(h, w);
		}
		
		Camera(int deviceID, String deviceName, double devicePrice){
			super(deviceID, deviceName, devicePrice);
		}
		
		Camera(int deviceID, String deviceName, double devicePrice, int h, int w){
			super(deviceID, deviceName, devicePrice);
			setCameraSize(h,w);
		}
		
		public void setCameraSize(int h, int w) {
			cameraSize = h * w;
		}
}
