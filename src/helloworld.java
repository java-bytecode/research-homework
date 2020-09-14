
public class helloworld {
	
	static int name = 10;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(name);
//		int[] arr = {1,2,3,4,5};
//		for(int elem: arr) {
//			System.out.println(elem);
//		}
//		
//		if (3>1) {
//			System.out.println("True!");
//		} else {
//			System.out.println("Not true!");
//		}
//		
//		switch(1){
//			case 1: 
//				System.out.print("TRUE");
//				break;
//			case 2:
//				System.out.print("FALSE");
//			default:
//				break;
//	}
		
		first:for(int x = 0; x < 10; x++) {
						
			for(int y = 0; y < 1; y++) {
				if ((x % 2) == 0) {
					continue first;
				}
				
				System.out.println("Numbers: " + x);
				
			}
			
		}
	}

}
