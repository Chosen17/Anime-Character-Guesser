
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);




        System.out.println("_________________ANIME GUESSER!!!!_________________");

        System.out.println("What is your name?");
        String name = scanner.nextLine();

        System.out.println("Welcome " + name + " to this anime guesser program");
        System.out.println("where you give me your favourite anime and I ask you questions about certain characters which you have to guess who i am speaking about.");


        System.out.println("What is your favourite anime currently");
        String favAnime = scanner.nextLine();

        System.out.println("What is your favourite anime character?");
        String favChar = scanner.nextLine();


        System.out.println("\n========PLAYER PROFILE========");
        System.out.println("Name: " + name);
        System.out.println("Favourite Anime: " + favAnime);
        System.out.println("Favourite Anime Character: " + favChar);




        String[] clues ={
                "I am a saiyan",
                "My planet was destroyed at the hands of Freezer",
                "And I haven't seen my older brother in a long time"
        };

        System.out.println();

        System.out.println("Here are your clues.");

        for(int i = 0; i < clues.length; i++){
            System.out.println("Clue " + (i + 1) + ": " + clues[i]);

        }

        System.out.println("Please enter your answer.");
        String playerGuess = scanner.nextLine();    // ANS is "Tarble";

        String correctAns = "Tarble";


        if(playerGuess.equalsIgnoreCase(correctAns)){
            System.out.println("Correct!!!");

        }
        else{
            System.out.println("Incorrect");
        }









        scanner.close();








    }
}
