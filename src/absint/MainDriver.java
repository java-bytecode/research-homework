package absint;

public class MainDriver {
	
	public static void main(String[] args) {
	
	Test obj = new Test();
	
	obj.lens();
	obj.setCameraName("Nikon");
	System.out.println("\n" + obj.getCameraName());
	}
}
