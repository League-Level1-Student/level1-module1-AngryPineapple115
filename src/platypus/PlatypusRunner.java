package platypus;

public class PlatypusRunner {

	private static String name = "Platy";
	public static void main(String[] args) {
		Platypus platy = new Platypus();
		sayHi();
	}
	
	static void sayHi() {
		
		System.out.println("The platypus " + name + " is smarter than your average platypus.");
		
	}
}