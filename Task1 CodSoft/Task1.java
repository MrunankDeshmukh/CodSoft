import java.util.Scanner;
 
public class Task1{

    public static void main(String []args){

    Scanner num = new Scanner(System.in);
    int chance= 10;
    int score=0;
    int rounds=0;

        
    
    System.out.println("Welcome to the Number Guessing Game");
    System.out.println("You have to guess the number in 10 attempts");


    do{
        int number= 1+ (int)(100*Math.random());
        int attempts=0;
        System.out.println("Round:"+(rounds+1));


    while(attempts<chance){
        System.out.println("Enter your guess between 1 and 100");
        int userguess= num.nextInt();
    attempts++;

    if(userguess<number){
       System.out.println("Congratulations! You guessed the correct number in"+attempts+"attempts");
       score+= chance-attempts;
       break;
    }

    else if (userguess<number){
        System.out.println("Your guess too low");
    }
    else{
        System.out.println("Your guess is too high");
    }
}

if(attempts==chance){
    System.out.println("Your attempts are over");
    System.out.println("The correct number was:"+number);
}

System.out.println("Do you want to play again(write yes or no):");
String choice = num.next();

if(choice.equals("no")){
    break;
}
rounds++;
}while(true);

System.out.println("Thanks for playing the game. Your final score is:"+score);

num.close();
    }
}