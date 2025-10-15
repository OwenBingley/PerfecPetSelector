
// Name: Owen Bingley
// Date: October 15, 2025
// Description: This program helps the user find their perfect pet based on
// their favorite color, favorite season, and their name. It uses simple
// if/else logic and makes sure users only type valid inputs.

import java.util.Scanner;

public class Pet {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String color = "";
        String season = "";
        String name = "";
        String pet = "Pet Rock"; // default pet

        // Ask for favorite color
        while (true) {
            System.out.println("Enter your favorite color (red, blue, or green):");
            color = input.nextLine().toLowerCase().trim();

            if (color.equals("red") || color.equals("blue") || color.equals("green")) {
                break;
            } else {
                System.out.println("That’s not a valid color! Please type red, blue, or green.");
            }
        }

        // Ask for favorite season
        while (true) {
            System.out.println("Enter your favorite season (fall, spring, winter, or summer):");
            season = input.nextLine().toLowerCase().trim();

            if (season.equals("fall") || season.equals("spring") || season.equals("winter") || season.equals("summer")) {
                break;
            } else {
                System.out.println("That’s not a valid season! Please type fall, spring, winter, or summer.");
            }
        }

        // Ask for name and make sure it starts with a letter
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

        // Start checking rules
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

        // Additional rule for Axolotl (must come after Ostrich check)
        if (startsWithConsonant && color.equals("blue") && !season.equals("summer") && !season.equals("fall")) {
            if (!pet.equals("Ostrich")) {
                pet = "Axolotl";
            }
        }

        // Default catch-all is Pet Rock (already set by default)
        System.out.println();
        System.out.println("Your perfect pet is: " + pet);
    }
}