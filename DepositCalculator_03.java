package FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepositCalculator_03 {
    public static void main(String[] args) {


    Scanner scanner = new Scanner(System.in);
//3. Калкулатор депозити
//
//Напишете програма, която изчислява каква сума ще получите в края на депозитния период при определен лихвен процент. Използвайте следната формула:
//
//сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)
//
//Вход
//
//От конзолата се четат 3 реда:
//
//1. Депозирана сума – реално число в интервала [100.00 … 10000.00]
//
//2. Срок на депозита (в месеци) – цяло число в интервала [1…12]
//
//3. Годишен лихвен процент – реално число в интервала [0.00 …100.00]


    double deposit = Double.parseDouble(scanner.nextLine());
//    Казваме, на конзолата че пишем депозита
    int months = Integer.parseInt(scanner.nextLine());
//    Казваме на конзолата, че пишем месеците
    double percent = Double.parseDouble(scanner.nextLine());
//    Казваме на конзолата, че пишем процентите
    double sum = deposit + months * ((deposit * percent / 100 / 12));
//    Накрая и казваме като напишем тези 3 неща да ни сметне формулата
    System.out.println(sum);
//   Казваме и да ни принтира всичко, което ни е сметнала до сега
    }
}


