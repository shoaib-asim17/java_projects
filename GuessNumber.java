//program to implement a game which generates a random number and checks from the user input whether the number matches or not

import java.util.Scanner;
//import java.util.Random;
import java.util.Random;
public class GuessNumber{

    public static void main(String[] args) {
        
        
        
            
            Game gm = new Game();
            boolean guess = false;
          //  gm.No_Of_Rounds();
           
            
        int i;
        System.out.println("Enter number of rounds you want to play :: ");
        Scanner r= new Scanner(System.in);
        int rounds=r.nextInt();
        for(i=1;i<=rounds;i++)
        {
            
            int inp=1;
            while(!guess && inp<=4)
            {
                
                
    
                    gm.userInput();
                    
                    
                
                guess=gm.isCorrect();
            
                inp++;
            
                
            }
            System.out.println("round "+ i +" is completed");
           
        }

            
            
        
        }
}
class Game {

    int generated_Random_number;
    int user_number;
    int no_of_guesses=0;
    

    
    void userInput()
    {
    
        

            System.out.println("Enter guess number : ");
            Scanner sc = new Scanner(System.in);
             user_number= sc.nextInt();
        
        
    }
    
     Game()
    {
        Random rand=new Random();
        generated_Random_number=rand.nextInt(100);

    }

    boolean isCorrect()
    {
        no_of_guesses++;
        if(user_number == generated_Random_number)
        {
            System.out.println("your guess is correct "+no_of_guesses);
            return true;
        }
        else if (user_number<generated_Random_number) 
        {
            System.out.println("your guess is too low...");    
        }
        else if(user_number>generated_Random_number)
        {
            System.out.println("your guess is too high...");
        }
        
        return false;
        
    }
   



}
