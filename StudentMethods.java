package student.management.system;
import java.util.*;

public class StudentMethods {

	private HashMap<Integer,Student> hm = new HashMap<Integer,Student>();
	Scanner sc = new Scanner(System.in);

	public void addStudent() {

		System.out.println("Enter id :");
		int id = sc.nextInt();
		sc.nextLine();
		if(hm.containsKey(id)) {
			System.out.println("Record present for id :"+id);
			System.out.println(hm.entrySet());
		}else {
			System.out.println("Enter name :");
			String name = sc.nextLine();
			System.out.println("Enter mobile number :");
			String mobileNumber= sc.nextLine();
			System.out.println("Enter address :");
			String address = sc.nextLine();
			hm.put(id,new Student(name,mobileNumber,address));		
		}

	}

	public void removeStudent() {
		System.out.println("Enter id of student : ");
		int id = sc.nextInt();
		sc.skip("");
		if(!hm.containsKey(id)) {
			System.out.println("Record not found for id "+id);
		}else {
			hm.remove(id);
			System.out.println("Record deleted successfully");
		}
	}

	public void updateStudentInfo() {
		System.out.println("Enter id of student : ");
		int id = sc.nextInt();
		sc.skip("");
		if(!hm.containsKey(id)) {
			System.out.println("Record not found for id "+id);
		}else {
			System.out.println("Enter name :");
			String name = sc.nextLine();
			System.out.println("Enter mobile number :");
			String mobileNumber= sc.nextLine();
			System.out.println("Enter address :");
			String address = sc.nextLine();
			hm.put(id,new Student(name,mobileNumber,address));		
			System.out.println("Record updated successfully");
		}
	}

	public void displayStudents() {
		if(hm.isEmpty())
			System.out.println("No record found");
		else {
			System.out.println("id    name     mobile number     address");
			for(Map.Entry<Integer,Student> entry : hm.entrySet()) {
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}

}
