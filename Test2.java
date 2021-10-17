import java.util.LinkedHashMap;

public class Test2 {

	public static void main(String[] args) {
	
				LinkedHashMap<String , Integer> h = new LinkedHashMap<>();
				h.put("Java Full Stack", 150);
				h.put("Pyhon Full Stack", 150);
				h.put("UI Full Stack", 150);
				
				System.out.println(h);
				
				System.out.println("--------------------------------");
				System.out.println("Course and its Duration");
				for (Object obj : h.entrySet()) {
					System.out.println(obj);
				}
				
				
	}

}
