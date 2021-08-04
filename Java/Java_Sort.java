import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.*;

class Student{
	private int id;
	private String fname;
	private double cgpa;
	public Student(int id, String fname, double cgpa) {
		super();
		this.id = id;
		this.fname = fname;
		this.cgpa = cgpa;
	}
	public int getId() {
		return id;
	}
	public String getFname() {
		return fname;
	}
	public double getCgpa() {
		return cgpa;
	}
}

//Complete the code
public class Java_Sort
{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
		int testCases = Integer.parseInt(in.nextLine());
        if((testCases<2)||(testCases>1000)){
            while((testCases<2)||(testCases>1000))
            {
                System.out.println("Enter a valid number of students: ");
                testCases = Integer.parseInt(in.nextLine());
            }
        }
		
		List<Student> studentList = new ArrayList<Student>();
        int i = 0;
		while(testCases>0){
            System.out.println("Enter the Student ID for student "+(i+1)+": "); 
			int id = in.nextInt();
            if((id<0)||(id>100000)){
                while((id<0)||(id>100000)){
                    System.out.println("Enter the valid Student ID for student "+(i+1)+": "); 
                    id = in.nextInt();
                }
            }
            System.out.println("Enter the Student Name for student "+(i+1)+": "); 
			String fname = in.next();
            System.out.println("Enter the Student CGPA for student "+(i+1)+": "); 
			double cgpa = in.nextDouble();
            if((cgpa<0.0)||(cgpa>4.0)){
                while((cgpa<0.0)||(cgpa>4.0)){
                    System.out.println("Enter the valid Student CGPA for student "+(i+1)+": "); 
                    cgpa = in.nextDouble();
                }
            }
			// Creating an object for the student
            System.out.println("\nCreating an object for the student: ");
			Student st = new Student(id, fname, cgpa);
			studentList.add(st);
			System.out.println("\nThe student has been added to the list!");
			testCases--;
            i++;
		}

        // Sorting a list in java
		Collections.sort(studentList.getFname());
		// Printing a sorted list
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}



