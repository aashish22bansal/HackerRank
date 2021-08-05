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

class SortById implements Comparator<Student>{
	public int compare(Student S1, Student S2){
		return S1.getId() - S2.getId();
	}
}

class SortByName implements Comparator<Student>{
	public int compare(Student S1, Student S2){
		return S1.getFname().compareTo(S2.getFname());
	}
}

class SortByCGPA implements Comparator<Student>{
	public int compare(Student S1, Student S2){
		if(Double.compare(S1.getCgpa(),S2.getCgpa())>=0){
			return -1;
		}
		else{
			return 1;
		}
	}
}

//Complete the code
public class Java_Sort
{
	private static boolean isStringLowerCase(String str){
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++){
			if(!Character.isLowerCase(charArray[i])){
				return false;
			}
		}
		return true;
	}

	public static String removeLeadingZeros(String str){
		String regex = "^0+(?!$)";
		str = str.replaceAll(regex,"");
		return str;
	}
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
			String str = Integer.toString(id);
			str = removeLeadingZeros(str);
			id = Integer.parseInt(str);
            if((id<0)||(id>100000)){
                while((id<0)||(id>100000)){
                    System.out.println("Enter the valid ID for student "+(i+1)+": "); 
                    id = in.nextInt();
					str = Integer.toString(id);
					str = removeLeadingZeros(str);
					id = Integer.parseInt(str);
                }
            }

            System.out.println("Enter the Student Name for student "+(i+1)+": "); 
			String fname = in.next();
			if(((fname.length()<5)||(fname.length()>30))||(isStringLowerCase(fname))){
				while(((fname.length()<5)||(fname.length()>30))||(isStringLowerCase(fname))){
					System.out.println("Enter the valid Name for the student "+(i+1)+": "); 
					fname = in.next();
				}
			}

            System.out.println("Enter the Student CGPA for student "+(i+1)+": "); 
			double cgpa = in.nextDouble();
			String text = Double.toString(Math.abs(cgpa));
			int integerPlaces = text.indexOf('.');
			int decimalPlaces = text.length()-integerPlaces-1;
            if(((cgpa<0.0)||(cgpa>4.0))||((decimalPlaces>2)||(decimalPlaces<0))){
                while(((cgpa<0.0)||(cgpa>4.0))||((decimalPlaces>2)||(decimalPlaces<0))){
                    System.out.println("Enter the valid Student CGPA for student "+(i+1)+": "); 
                    cgpa = in.nextDouble();
                }
            }

			// Creating an object for the student
            System.out.println("\nCreating an object for the student: ");
			Student st = new Student(id, fname, cgpa);

			// Adding the object to the list
			studentList.add(st);
			System.out.println("\nThe student has been added to the list!");
			testCases--;
            i++;
		}

        // Sorting a list in java
		Collections.sort(studentList, new SortByCGPA());
		
		// Printing a sorted list
		System.out.println("The names of the students in the sorted order are: ");
      	for(Student st: studentList){
			System.out.println(st.getFname());
		}
	}
}