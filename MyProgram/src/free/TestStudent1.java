package free;

class Student{
	int      id;
    String name;
}

public class TestStudent1 {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student();
		Student s2=new Student();
		s1.id=101;
		s2.id=102;
		s1.name="Bheemaraya";
		s2.name="Raya";
		
		System.out.println(s1.id  +" "+ s1.name );
		System.out.println(s2.id  +" "+ s2.name );

	}

}
