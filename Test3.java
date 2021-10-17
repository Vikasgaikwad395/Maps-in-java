import java.util.TreeMap;

public class Test3 {

	public static void main(String[] args) {

					TreeMap<Integer, String > m = new TreeMap<Integer, String>();
					
					m.put(150, "Java Full Stack");
					m.put(150, "Python Full Stack");
					m.put(80, "UI Full Stack");
					
					
					for (Object obj : m.entrySet()) {
						System.out.println(obj);
						
						
					}
	}

}
