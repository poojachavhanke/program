package program;
import java.util.Scanner;

public class profinal {
	
		static String companyName;
		int Id;
		String Name;
		float Salary;
		
		static {
			companyName="Future Developers";
		}
		
		profinal(int Id,String Name,float Salary)
		{
			this.Id = Id;
			this.Name = Name;
			this.Salary = Salary;
		}
		void Display()
		{
			System.out.println("Employee Id :"+Id);
			System.out.println("Employee Name :"+Name);
			System.out.println("Employee Salary :"+Salary);
			System.out.println("Employee Company Name :"+companyName);
		}
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.printf("Enter Student Id :-");
			int id = sc.nextInt();
			System.out.printf("Enter Student Name :-");
			String name = sc.next();
			System.out.printf("Enter Student Salary :-");
			float salary = sc.nextFloat();
			profinal e1 = new profinal(id,name,salary);
			e1.Display();
			sc.close();
		}
	}
	


