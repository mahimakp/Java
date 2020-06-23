class Student{

	String studentName, grade, address, stream,  contactNo;

	int rollNo; 

	Student ( int rollNo, String studentName ){

		this.rollNo = rollNo;
		this.studentName = studentName;
	}

	Student ( String studentName ){

		this.studentName = studentName;
	}


	void setGrade( String grade ){

		this.grade = grade;
	}
	
	void setAddress( String address ){

		this.address = address;
	}
	
	void setStream( String stream ){

		this.stream = stream;
	}

	void setContactNo( String contactNo ){

		this.contactNo = contactNo;
	}

	int getRollNo(){

		return this.rollNo;
	}

	String getStudentName(){

		return this.studentName;
	}

	String getGrade(){

		return this.grade;
	}

	String getAddress(){

		return this.address;
	}
	
	String getStream(){

		return this.stream;
	}

	String getContactNo(){

		return this.contactNo;
	}

}

class ConstructorsForStudent{

	public static void main(String[] args) {

		Student s1 = new Student( 8026, "Mahima" );
		Student s2 = new Student("Akanksha");

		s1.setGrade("A");
		s1.setStream("Information Technology");
		s1.setAddress(" D44, abc road, vile parle, Mumbai");
		s1.setContactNo( "9127392200" );

		System.out.println(" Name : " + s1.getStudentName()+" \nRoll_no : "+ s1.getRollNo()+" \nGrade : "+s1.getGrade()+"\nAddress : "+s1.getAddress()+" \nContact Number : "+s1.getContactNo());
		System.out.println("Name : "+ s2.getStudentName());


	}

}