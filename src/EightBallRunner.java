import java.util.Scanner;

public class EightBallRunner {
    public static void main(String[] args) {

        // Tell the user to enter a question
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to the Magic 8 Ball!");
        System.out.print("Enter your yes-no question and I will answer it: ");
        String question = scan.nextLine();
        int answer = (int) (1 + Math.random()*6);
        if (answer == 1)
        {
            System.out.println("My sources say yes. (Source: trust me bro)");
        }
        else if (answer == 2)
        {
            System.out.println("According to my calculations, if you drop the 2 and factor off the x the answer is yes.");
        }
        else if (answer == 3)
        {
            System.out.println("nah bro you really thought?");
        }
        else if (answer == 4)
        {
            System.out.println("is the sky made of alpacas?");
        }
        else if (answer == 5)
        {
            System.out.println("Go to https://tinyurl.com/3fdz5pmp to receive your answer.");
        }
        else if (answer == 6)
        {
            System.out.println("idk bro ask again in 2-3 business days.");
        }
        if (answer == 1)
        {
            System.out.println("My sources say yes. (Source: trust me bro)");
        }
        if (answer == 2)
        {
            System.out.println("According to my calculations, if you drop the 2 and factor off the x the answer is yes.");
        }
        if (answer == 3)
        {
            System.out.println("nah bro you really thought?");
        }
        if (answer == 4)
        {
            System.out.println("is the sky made of alpacas?");
        }
        if (answer == 5)
        {
            System.out.println("Whatever you do, don't translate \"up\" to Romanian");
        }
        if (answer == 6)
        {
            System.out.println("idk bro ask again in 2-3 business days.");
        }
        /*
        // Get a random number from 1 to 6


        // Use selection statements (if, if-else, else-if)
        // to choose from 1 of 6 responses to yes-no questions, then print it out!
        int score = 83;
        String grade = "";

        if (score >= 90)
         {
            grade = "A";
        }
        else if (score >= 80)
        {
            grade = "B";
        }
        else if (score >= 70)
        {
            grade = "C";
        }
        else if (score >= 60)
        {
            grade = "D";
        }
        else if (score < 60)
        {
            grade = "F";
        }
        System.out.println("Your grade is: " + grade);
*/
    }
}
