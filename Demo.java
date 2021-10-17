import java.io.FileInputStream;
import java.util.Properties;
import java.util.Scanner;


public class Demo {

	public static void main(String[] args) throws Exception {
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a Course name :- ");
		String Course = in.next();
		System.out.println("Enter Duration");
		String duration = in.next();
		
		System.out.println("Enter a Course name :- ");
		String Course1 = in.next();
		System.out.println("Enter Duration");
		String duration1 = in.next();
		
		System.out.println("Enter a Course name :- ");
		String Course2 = in.next();
		System.out.println("Enter Duration");
		String duration2 = in.next();
		
		
		String File = "src/course_details.properties";
		
		Properties props = new Properties();
		props.load(new FileInputStream(File));
		
		String courseName = props.getProperty("courseName");
		String Duration = props.getProperty("Duration");
		
		String courseName1 = props.getProperty("courseName1");
		String Duration1 = props.getProperty("Duration1");
		
		String courseName2 = props.getProperty("courseName2");
		String Duration2 = props.getProperty("courseName2");
		
		if(Course.equals(courseName) && duration.equals(Duration)) {
			System.out.println("Sucessfully Enter");
		}else {
			System.out.println("Failed to Enter");
		}
		if(Course1.equals(courseName1) && duration1.equals(Duration1)) {
			System.out.println("Sucessfully Enter");
		}else {
			System.out.println("Failed to Enter");
		}
		
		if(Course2.equals(courseName2) && duration2.equals(Duration2)) {
			System.out.println("Sucessfully Enter");
		}else {
			System.out.println("Failed to Enter");
		}

		
			}

}
