import java.util.*;

public class MyMain {
		public static void main(String[] args){ 
	        
			Scanner sc = new Scanner(System.in);
			int NoOfEvents = sc.nextInt();
			TreeSet<Student> queue = new TreeSet<Student>();
			for (int i=NoOfEvents;i > 0;i--) 
			{
				
				String st = sc.next();
				
				
				
				if (st.equalsIgnoreCase("ENTER")) 
				{
					String name = sc.next();
					double cgpa = sc.nextDouble();
					int token = sc.nextInt();
					queue.add(new Student(name, cgpa,token));
				}
				
				else if (st.equalsIgnoreCase("SERVED")) 
				{
					if (queue.size() > 0) {
						Student s = queue.first();
						queue.remove(s);
					}
				}
			}
			
			if (queue.size() == 0) 
			{
				System.out.println("EMPTY");
			}
			
			for (Student student : queue) 
			{
				System.out.println(student.getName());
			}
			
	         
        }
}
	        
	        
	         
		


