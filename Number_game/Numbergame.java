package Number_game;
import java.util.random.*;
import java.io.*;
import java.util.Random;
import java.util.Scanner;

class Ngame{

    int number,guessed_number,round,chances;
    String user;
    Scanner sc=new Scanner(System.in);
    Random random=new Random();

    
    public void startgame(){
        System.out.println("Enter the username");
        user=sc.nextLine();
        number=random.nextInt(100);
        round=1;
        chances=5;
        while(chances!=0){
            System.out.println("Input your guess");
            guessed_number=sc.nextInt();
            if(number>guessed_number){
                System.out.println(" Your guess is too low");
                chances--;
            }
            else if(number<guessed_number){
                System.out.println("Your guess is too high");
                chances--;
            }
            else{
            System.out.println("Congratulations your guess is correct");
            break;
            }
            if (chances==0) {
                System.out.println("Game Over\nThe number was "+number);
            }
        }
    }    
}
public class Numbergame {

    public static void main(String[] args) {
        Ngame n1=new Ngame();
        n1.startgame();
    }
}