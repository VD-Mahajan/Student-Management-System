package student.management.system;

public class Student {
	private String name;
	private String mobileNumber;
	private String address;

	public Student(String name,String mobileNumber,String address) {
		this.name=name;
		this.mobileNumber=mobileNumber;
		this.address=address;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMobileNumber() {
		return mobileNumber;
	}
	
	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return name+" "+mobileNumber+" "+address;
	}
}
