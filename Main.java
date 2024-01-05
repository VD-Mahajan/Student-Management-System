package student.management.system;
import java.util.*;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		char choice;
		StudentMethods st = new StudentMethods();

		do {
			System.out.println("===========================");
			System.out.println("1) Add Student");
			System.out.println("2) Remove Student");
			System.out.println("3) Update Student");
			System.out.println("4) Display Student");
			System.out.println("===========================");
			
			int ch = sc.nextInt();
			
			switch(ch) {
			case 1:{
				st.addStudent();
				break;
			}
			case 2:{
				st.removeStudent();
				break;
			}
			case 3:{
				st.updateStudentInfo();
				break;
			}
			case 4:{
				st.displayStudents();
				break;
			}
			default:
				System.out.println("Invalid choice ");
			}
			
			System.out.println("Do you want to continue:(Y/y)");
			choice = sc.next().charAt(0);
		}while(choice=='Y' || choice=='y');
	}
}
