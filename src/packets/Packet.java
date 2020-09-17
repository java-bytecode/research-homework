/**
 * 
 */
package packets;

import loginSystem.UserLogin;

/**
 * @author CyberxNuke
 *
 */
public final class Packet {
	protected int id;
	protected static final long computerID = 0x100L;
	protected String message;
	UserLogin loginObj;
//	
//	{
//		id = 0;
//		message = null;
//	}
	
	public Packet(UserLogin loginObj){
		this.loginObj = loginObj;
	}

	
	public void createPacket(int packetID, String packetMessage) {
		if (loginObj.checkLoginStatus()) {
			id = packetID;
			message = packetMessage;
		} else {
			System.out.println("PacketSystem: Packet Creation Failed." + " Please login!");
		}
	}
	
	public String viewPacket() {
		if (loginObj.checkLoginStatus()) {
			return "id: " + id + " computerID: " + computerID + " message: " + message + "\n";
		} else {
			System.out.println("PacketSystem: Cannot View Packet." + " Please login!");
			return "-1";
		}
	}
	
	
}
