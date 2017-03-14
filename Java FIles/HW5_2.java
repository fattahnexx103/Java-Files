/* 1. B
*  2. C
*  3. A
*  4. C
*  5. A
*  6. B
*  7. D
*  8. A
*  9. A
*  10.C
*  11.D
*  12.D
*  13.D
*  14.B
*  15.B
*/

public class Student{
	private int age;
	private String sid;

	public Student(int a, String id){
		age = a;
		sid = id;
	}
	
	public void setAge(int newAge){
		age = newAge;
	}

	public void setSID(String newSID){
		sid = newSID;

	}

	public int getAge(){
		return age;
	}
	
	public String getSID(){
		return sid;
	}

	public String ageToString(){
		return (""+age);
	}
	
	public String sidToString(){
		return sid;
	}

	public boolean equals(Student one, Student two){
		if (one.getSID() == two.getSID())
			return true;
		return false;	
	}
	
	public Student findYoungest(Student one, Student two){
		if(one.getAge() < two.getAge())
			return one;
		return two;
	}


}