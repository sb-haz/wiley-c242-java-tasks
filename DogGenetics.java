import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args) {

        // Get dog name user input
        System.out.println("What is your dog's name?");
        Scanner dogScanner = new Scanner(System.in);
        String dogName = dogScanner.nextLine();

        System.out.println("Well then, I have this highly reliable report on " + dogName + "'s prestigious background right here.");
        System.out.println(dogName + " is:");

        // Calculate dog breed percentages
        Random random = new Random();
        int breedOne = random.nextInt(100/4);
        int breedTwo = random.nextInt(100/4);
        int breedThree = random.nextInt(100/4);
        int breedFour = random.nextInt(100/4);
        int breedFive = 100 - breedOne - breedTwo - breedThree - breedFour;

        // Print dog breed percentages
        System.out.println(breedOne + "% St. Bernard");
        System.out.println(breedTwo + "% Chihuahua");
        System.out.println(breedThree + "% Dramatic RedNosed Asian Pug");
        System.out.println(breedFour + "% Common Cur");
        System.out.println(breedFive + "% King Doberman");
    }
}
