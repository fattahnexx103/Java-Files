public class TestStudent{
	public static void main(String[] args){
		Student student1 = new Student(21,"123456789");
		Student student2 = new Student(19, "987654321");

		
		if (student1.findYoungest(student1, student2) == student1)
			System.out.println("Youngest Student is " + student1.getAge() + " years old and the" 
				+ " student ID is " + student1.getSID() + "."); 
		else 
			System.out.println("Youngest Student is " + student2.getAge() + " years old and the" 
				+ " student ID is " + student2.getSID() + "."); 						

	}
}