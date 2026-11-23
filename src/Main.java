
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



        String[] characters ={
                "Goku",
                "Ichigo",
                "Yusuke",
                "Dai",
                "Luffy",
                "Naruto",
                "Tarble"
        };

        System.out.println("\nHere are the potential characters it could be");


        for(int i = 0; i < characters.length; i ++){
            System.out.println((i + 1) + ": " + characters[i]);
        }



        String [][] animeClues ={
                {"I am a saiyan", "in my 20s my power level was around 8000", "I am married to a princess"},
                {"I only recently have been using my true power", "I am the strongest of the big three" , "My dad gave up something important"},
                {"I used to not give it my all", "I once used my life energy to win a fight", "My special move is the rei-gun"},
                {"I am the son of a dragon", "I was taught by the hero", "i wield the dragon crest"},
                {"I am the son of dragon", "I have the strongest will", "i carry the will of D"},
                {"I am the son of a alien", "I broke the cycle of reincaranation", "I am a Jinjuriki"},
                {"I am a saiyan","My planet was destroyed at the hands of Freezer","And I haven't seen my older brother in a long time"}


        };

        System.out.println();

        for(int i = 0; i < animeClues[0].length; i++){
            System.out.println("Clue " + (i + 1) + ": " + animeClues[0][i]);
        }


        System.out.println("Please enter your answer.");
        String playerGuess = scanner.nextLine();

        String correctAns = characters[0];


        if(playerGuess.equalsIgnoreCase(correctAns)){
            System.out.println("Correct!!!");

        }
        else{
            System.out.println("Incorrect");
        }









        scanner.close();








    }
}
