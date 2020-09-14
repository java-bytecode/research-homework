package practice;

public class Program1 {
	
	protected int side1;
	protected int side2;
	protected int side3;
	
	static String quadName;
	
	static {
		quadName = "ABCD";
		System.out.println("Default Static Message from Parent!");
	}
	// Init Block
	{
		side1 = 1;
		side2 = 10;
		side3 = 100;
	    System.out.println("Init from Parent!");
	}
	
	public Program1(int i) {
		// Do Nothing
		System.out.println("Parent Constructor, Printing Random Numbers: 11929");
	}

	/**
	 * @return the side1
	 */
	public int getSide1() {
		return side1;
	}

	/**
	 * @param side1 the side1 to set
	 */
	public void setSide1(int side1) {
		this.side1 = side1;
	}

	/**
	 * @return the side2
	 */
	public int getSide2() {
		return side2;
	}

	/**
	 * @param side2 the side2 to set
	 */
	public void setSide2(int side2) {
		this.side2 = side2;
	}

	/**
	 * @return the side3
	 */
	public int getSide3() {
		return side3;
	}

	/**
	 * @param side3 the side3 to set
	 */
	public void setSide3(int side3) {
		this.side3 = side3;
	}

	/**
	 * @return the quadName
	 */
	public static String getQuadName() {
		return quadName;
	}

	/**
	 * @param quadName the quadName to set
	 */
	public static void setQuadName(String quadName) {
		Program1.quadName = quadName;
	}
	
	public void generateMessage() {
		System.out.println("Hello world from Parent!");
	}
	
	

}

//class Execute {
////	public static void main(String[] args) {
////		Program1 prg = new Program1();
////		
////		//System.out.print(Program1.quadName);
////	}
//}
