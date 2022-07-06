package FirstStepsInCodingExercise;

import java.util.Scanner;

public class VacantionBookList_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int totalPages = Integer.parseInt(scanner.nextLine());
        int pagesPerHour = Integer.parseInt(scanner.nextLine());
        int totalDays = Integer.parseInt(scanner.nextLine());
        int sum = totalPages / pagesPerHour / totalDays;
        System.out.println(sum);

    }
}
