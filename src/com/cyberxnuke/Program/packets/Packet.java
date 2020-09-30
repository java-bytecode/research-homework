/**
 * 
 */
package com.cyberxnuke.Program.packets;

import com.cyberxnuke.Program.loginSystem.UserLogin;
import com.sun.source.tree.ArrayTypeTree;
import com.sun.source.tree.Tree;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * @author CyberxNuke
 *
 */
/*
	id = key
	value = [ComputerID, Message]
 */


public final class Packet {
	protected static int id;
	protected static final long computerID;
	protected String message;

	ArrayList cIdMsg = new ArrayList<>();
	TreeMap<Integer, ArrayList> pMap = new TreeMap<>();

	UserLogin loginObj;

	{
		message = null;
	}

	static {
		id = 0;
		computerID = 0x100L;
	}
	
	public Packet(UserLogin loginObj){
		this.loginObj = loginObj;
	}

	
	public void createPacket(String packetMessage) {
		if (loginObj.checkLoginStatus()) {
			id = id + 1;
			cIdMsg.add(computerID);
			cIdMsg.add(packetMessage);
			pMap.put(id, cIdMsg);
		} else {
			System.out.println("PacketSystem: Packet Creation Failed." + " Please login!");
		}
	}

	public void viewPacket() throws Exception {
		if (loginObj.checkLoginStatus()) {

			for(int num: pMap.keySet()){
				System.out.println("ID: " + num + " Computer ID: " + cIdMsg.get(0) + " Message: " + cIdMsg.get(1));
			}

		} else {
			throw new Exception("PacketSystem: Cannot View Packet." + " Please login!");
		}
	}
	
	public void viewPacket(int id) throws IllegalArgumentException {
		if (loginObj.checkLoginStatus()) {
			if(pMap.containsKey(id)){
				System.out.println("\n" + "ID: " + id + " Computer ID: " + cIdMsg.get(0) + " Message: " + cIdMsg.get(1));
			} else {
				throw new IllegalArgumentException("PacketSystem: Packet ID not found.");
			}

		} else {
			System.out.println("PacketSystem: Cannot View Packet." + " Please login!");

		}

	}
	
	
}
