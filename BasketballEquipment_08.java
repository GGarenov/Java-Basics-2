import java.util.Scanner;

public class BasketballEquipment_08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Year = Integer.parseInt(scanner.nextLine());
        double SneakersTotalPrice = Year - (Year * 40 / 100);
        double EkipTotalPrice = SneakersTotalPrice - (SneakersTotalPrice * 0.20);
        double BallTotalPrice = EkipTotalPrice / 4;
        double Aksesoari = BallTotalPrice / 5;
        double totalTotal = Year + SneakersTotalPrice + EkipTotalPrice + BallTotalPrice + Aksesoari;
        System.out.println(totalTotal);



    }
}
