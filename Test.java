import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
			
			HashMap< String, Integer > hm = new HashMap<>();
			hm.put("Java Full Stack", 150);
			hm.put("Python Full Stack", 150);
			hm.put("UI Full Stack", 80);
			System.out.println("Course       Duration");
			
			for (Object obj : hm.entrySet()) {
				System.out.println(obj);
				
			}
			
				
	
		
	}

}
