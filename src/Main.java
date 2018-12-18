import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Program oblicza sumę liczb nieparzystych z przedziału od 0 do n \n" +
                "Podaj górną granicę przedziału do liczenia: ");
        int n = scanner.nextInt();
        System.out.println("Suma liczb wynosi:" + sumaLiczbNieparzystych(n));
    }

    private static long sumaLiczbNieparzystych(int n) {
        long suma = 0;
        while (n > 0) {
            if (n % 2 != 0) {
                suma += n;
                n -= 2;
            } else {
                n -= 1;
            }
        }
        return suma;
    }
}
