import java.util.Scanner;

public class FishTank_09 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Duljina = Integer.parseInt(scanner.nextLine());
        int Shirochina = Integer.parseInt(scanner.nextLine());
        int Visochina = Integer.parseInt(scanner.nextLine());
        double Procent = Double.parseDouble(scanner.nextLine());
        int Obemakvarium = Duljina * Shirochina * Visochina;
        double Obemlitri = Obemakvarium * 0.001;
        double VsichkiLitri = Obemlitri - (Obemlitri * Procent / 100);
        System.out.println(VsichkiLitri);

    }
}
