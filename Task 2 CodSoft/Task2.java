import java.util.Scanner;

public class Task2{

    public static void main(String []args){

        Scanner student= new Scanner(System.in);

        System.out.println("This is a Student Grade Calculator");

        System.out.println("Enter your marks for each subject (out of 100)");

        System.out.println("English:");
        int english= student.nextInt();

        System.out.println("Marathi:");
        int marathi= student.nextInt();

        System.out.println("Maths:");
        int maths= student.nextInt();

        System.out.println("Science:");
        int science= student.nextInt();

        System.out.println("Social Studies:");
        int socialstudies= student.nextInt();

        int total = english + marathi + maths + science + socialstudies;
        System.out.println("Total Marks Obtained(out of 500):"+total);
        

        double percentage = total/5;
        System.out.println("Percentage:"+percentage);

        if(percentage<=100 && percentage>=90){
            System.out.println("Grade A+");
        }
        else if(percentage<90 && percentage>=80){
            System.out.println("Grade:A");
        }
        else if(percentage<80 && percentage>=70){
            System.out.println("Grade B+");
        }
        else if(percentage<70 && percentage>=60){
            System.out.println("Grade B");
        }
        else if(percentage<60 && percentage>=50){
            System.out.println("Grade C+");
        }
        else if(percentage<50 && percentage>=40){
            System.out.println("Grade C");
        }
        else if(percentage<40 && percentage>=35){
            System.out.print("Grade D+");
        }
        else{
            System.out.println("Grade:F");
        }
        student.close();
    }
}