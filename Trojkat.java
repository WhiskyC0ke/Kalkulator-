import java.util.Scanner;

public class Trojkat {
    Scanner scan = new Scanner(System.in);
    void trojkat(){
        System.out.println("Podaj podstawę trójkąta ");
        double a = scan.nextDouble();
        System.out.println("Podaj wysokość trójkąta ");
        double h = scan.nextDouble();
        double wynik = a*h;
        System.out.println("Pole trójkąta wynosi: " + wynik);
    }
}
