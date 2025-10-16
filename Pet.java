
// Name: Owen Bingley
// Date: October 15, 2025
// Description: This program helps the user find their perfect pet based on their favorite color, favorite season, and their name. 
import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String color = "";       // declares color
        String season = "";      // declares season
        String name = "";      // declares name
        String pet = "Pet Rock"; // default pet
         // precondition: the input from the user
        // post condition: the input from the user convertied into code readable by the computer or prints saying that the ppre condition was not valid.
         // Asks for favorite color and takes the input and responds with the apropriate output
        while (true) {
            System.out.println("Enter your favorite color (red, blue, or green):");
            color = input.nextLine().toLowerCase().trim();

            if (color.equals("red") || color.equals("blue") || color.equals("green")) {
                break;
            } else {
                System.out.println("That’s not one of the colors!  type red, blue, or green.");
            }
        }
          // precondition: the input from the user
        // post condition: the input from the user convertied into code readable by the computer or prints saying that the ppre condition was not valid.
        // Asks for favorite season and takes the input and responds with the apropriate output
        while (true) {
            System.out.println("Enter your favorite season (fall, spring, winter, or summer):");
            season = input.nextLine().toLowerCase().trim();

            if (season.equals("fall") || season.equals("spring") || season.equals("winter") || season.equals("summer")) {
                break;
            } else {
                System.out.println("That not a season!  type fall, spring, winter, or summer.");
            }
        }
         // precondition: the input from the user
        // post condition: the input from the user convertied into code readable by the computer or prints saying that the ppre condition was not valid.
        // Asks for name and makes sure it starts with a letter and takes the input and responds with the apropriate output
        while (true) {
            System.out.println("Enter your name:");
            name = input.nextLine().trim();

            if (name.length() > 0) {
                char firstLetter = name.toLowerCase().charAt(0);
                if ("abcdefghijklmnopqrstuvwxyz".indexOf(firstLetter) >= 0) {
                    break;
                } else {
                    System.out.println("Your name must start with a letter!");
                }
            } else {
                System.out.println("You must enter a name!");
            }
        }

        char firstLetter = name.toLowerCase().charAt(0);
        boolean startsWithVowel = "aeiou".indexOf(firstLetter) >= 0;
        boolean startsWithConsonant = !startsWithVowel;
        // pre conditions: the inputs from the users.
        // post coditions: the pet selected from the inputs.
        // checks the rules and sets pet as difernt strings
        if (color.equals("blue") && season.equals("fall")) {
            pet = "Alligator";
        } 
        else if (color.equals("blue") && season.equals("spring")) {
            pet = "Ostrich";
        } 
        else if (color.equals("green") && startsWithConsonant && season.equals("winter")) {
            pet = "Giraffe";
        } 
        else if (color.equals("green") && !season.equals("fall")) {
            pet = "Dog";
        } 
        else if (color.equals("red")) {
            if (startsWithVowel) {
                pet = "Porcupine";
            } else {
                pet = "Panda";
            }
        } 
        else if (season.equals("summer")) {
            if (!pet.equals("Dog") && !pet.equals("Panda") && !pet.equals("Porcupine")) {
                pet = "Pony";
            }
        }
        //pre condition: stored values from users inputs
        //post condition: changes pet or keeps it the same
        // additional rule for axolotl  
        if (startsWithConsonant && color.equals("blue") && !season.equals("summer") && !season.equals("fall")) {
            if (!pet.equals("Ostrich")) {
                pet = "Axolotl";
            }
        }

        // set by defalt to pet rock if you do not qualify for a different pet
        System.out.println();
        System.out.println("Your perfect pet is: " + pet);
    }
}