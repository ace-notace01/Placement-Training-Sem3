package STEP.week1;
import java.util.*;
public class Game {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        Random random=new Random();
        System.out.println("Enter the number of round: ");
        int rounds = sc.nextInt();
        int wins=0,draws=0,loss=0;
        String choices[]={"Rock","Paper","Scissor"};
        int userInput, computerChoice;
        System.out.println("Enter 0 for Rock, 1 for Paper and 2 for Scissor");
        for(int i=0;i<rounds;i++){
            System.out.println("Player's Move");
            userInput=sc.nextInt();
            computerChoice=random.nextInt(3);
            System.out.println("Computer's Move: "+computerChoice);
            if(computerChoice==userInput){
                draws++;
                System.out.println("Its a DRAW");
            }else if((choices[computerChoice].equals("Rock")&&choices[userInput].equals("Paper"))||(choices[computerChoice].equals("Paper")&&choices[userInput].equals("Scissor"))||(choices[computerChoice].equals("Scissor")&&choices[userInput].equals("Rock"))){
                wins++;
                System.out.println("You WIN");
            }else{
                System.out.println("You LOOSE");
                loss++;
            }
        }
        System.out.println("Wins: "+wins+" Draws:"+draws+" Losses:"+loss);
        sc.close();

    } 
}
