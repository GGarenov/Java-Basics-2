import java.util.Scanner;

public class Repainting_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int Nailon = Integer.parseInt(scanner.nextLine());
        int Boq = Integer.parseInt(scanner.nextLine());
        double Razreditel = Double.parseDouble(scanner.nextLine());
        double Chasove = Double.parseDouble(scanner.nextLine());
        double SumaNailon = (Nailon + 2) * 1.50;
        double SumaBoq = (Boq + (Boq * 0.10)) * 14.50;
        double SumaRazreditel = Razreditel * 5;
        double VsichkiMateriali = SumaNailon + SumaBoq + SumaRazreditel + 0.40;
        double Maistori = (VsichkiMateriali * 0.30) * Chasove;
        double VsichkoVsichko = VsichkiMateriali + Maistori;
        System.out.println(VsichkoVsichko);

    }
}
