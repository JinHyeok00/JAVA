package lambdaTask1;

public class PrintNameTest{
	public static void printFullName(PrintName printName, String lastName, String firstName) {
	      System.out.println(printName.getFullName(lastName, firstName));
	}
	
	public static void main(String[] args) {
		
		PrintNameTest.printFullName((l, f) -> l + f, "한", "동석");
	}
	
	
	
//	public static void printFullName(String lastName, String firstName) {
//		PrintName printName;
//		printName = (l, f) ->{
//			return l+f;
//		};
//		System.out.println(printName.getFullName(lastName, firstName));
//	}
//	public static void main(String[] args) {
//		
//		PrintNameTest.printFullName("한", "동석");
//	}
	
//	public static String printFullName(String lastName, String firstName) {
//		PrintName printName;
//		printName = (l, f) ->{
//			return l+f;
//		};
//		return printName.getFullName(lastName, firstName);
//	}
//	public static void main(String[] args) {
//		
//		System.out.println(PrintNameTest.printFullName("한", "동석"));
//	}
	
//	public static String printFullName(String lastName, String firstName) {
//		PrintName printName;
//		printName = (l, f) ->{
//			return l+f;
//		};
//		return printName.getFullName(lastName, firstName);
//	}
//	public static void main(String[] args) {
//		
//		System.out.println(PrintNameTest.printFullName("한", "동석"));
//	}
	
}
	

