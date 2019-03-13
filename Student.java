
public class Student implements Comparable<Student>{

			
	
		private int token;
		private String name;
		private double cgpa;
		
		//Parameterized constructor
		
		public Student(String fname, double cgpa, int id) {
			super();
			this.token = id;
			this.name = fname;
			this.cgpa = cgpa;
		}

		public int getToken() {
			return token;
		}

		public String getName() {
			return name;
		}

		public double getCgpa() {
			return cgpa;
		}

		// Comparing 2 objects and rearranging them in the Tree
		public int compareTo(Student arg0) {
			int out = 0;
			out = -1 * (new Double(cgpa)).compareTo(new Double(arg0.cgpa));
			
			//If 2 cgpa's are equal then comparing the names
			
			if (out == 0) {
				out = name.compareTo(arg0.name);
			//Comparing the token numbers
				if (out == 0) {
					out = (new Integer(token).compareTo(new Integer(arg0.token)));
					if(out==0)
					{
						System.out.println("NO TWO TOKENS CAN BE SAME");
					}
				}
			}
			return out;
		}
		
		
	
}
