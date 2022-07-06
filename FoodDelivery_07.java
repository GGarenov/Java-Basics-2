package FirstStepsInCodingExercise;
import java.util.Scanner;
public class FoodDelivery_07 {
    public static void main(String[] args) {
        Scanner Scanner = Scanner = new Scanner(System.in);
        int Chicken = Integer.parseInt(Scanner.nextLine());
        int Fish = Integer.parseInt(Scanner.nextLine());
        int Vegetarian = Integer.parseInt(Scanner.nextLine());
        double mainMenu = Chicken * 10.35 + Fish * 12.40 + Vegetarian * 8.15;
        double Desert = mainMenu * 20 / 100;
        double TotalPrice = (mainMenu + Desert) + 2.50;

        System.out.println(TotalPrice);




    }
}
