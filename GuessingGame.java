import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        Random ran = new Random();
        int randomno = ran.nextInt(100) + 1;

        while(true){

            System.out.print("Enter the Guessing Numbewr : ");
            int guessingno = sc.nextInt();

            if(guessingno == randomno){
                System.out.println("Correct! You Win");
                break;
            }
            else if(randomno > guessingno){
                System.out.println("Wrong! The Number is Higher. Guess it again");
            }
            else{
                System.out.println("Wrong! The Number is Lower. Guess it again");
            }
        }

    }
}
