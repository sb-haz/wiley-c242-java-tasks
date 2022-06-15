import java.util.Scanner;

public class HealthyHearts {
    public static void main(String[] args) {

        // Get user age
        System.out.println("What is your age?");
        Scanner dogScanner = new Scanner(System.in);
        int userAge = dogScanner.nextInt();

        // Calculate max HR, lower & upper healthy HR
        int userMaxHeart = 220 - userAge;
        int userLowerHR = (int) Math.round(userMaxHeart*0.5);
        int userUpperHR = (int) Math.round(userMaxHeart*0.85);

        // Show info to user
        System.out.printf("Your maximum heart rate should be %d beats per minute %n", userMaxHeart);
        System.out.printf("Your target HR Zone is %d - %d beats per minute %n", userLowerHR, userUpperHR);

    }
}
