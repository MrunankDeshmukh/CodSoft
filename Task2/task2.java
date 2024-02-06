import java.util.Scanner;

public class task2 {
    public static void main(String []args){
    Scanner marks = new Scanner(System.in);
    System.out.println("This is a Student Grade Calculator");
    System.out.println("Enter Student's full name:");
    String name = marks.nextLine();
    System.out.println("Enter class (Eg:-1,2,3...):");
    int class_of_study = marks.nextInt();
    System.out.println("Enter maeks for each subject:");
    System.out.println("English:");
    int eng = marks.nextInt();
    System.out.println("Hindi:");
    int hindi= marks.nextInt();
    System.out.println("Marathi:");
    int marathi = marks.nextInt();
    System.out.println("Maths:");
    int maths = marks.nextInt();
    System.out.println("Science:");
    int science = marks.nextInt();
    System.out.println("Social Studies:");
    int sst = marks.nextInt();
    int total = eng + hindi + marathi + maths + science + sst;
    total = marks.nextInt();
 
 
 
    System.out.println("Student's name:"+name);
    System.out.println("Class:"+class_of_study);
    System.out.println("Toatl marks gained (out of 600):"+(eng + hindi + marathi + maths + science + sst));
    System.out.println("Percentage:"+((total)%6));
    
    char grade = calculateGrade(Percentage);

    marks.close();
    }
 

    
}
