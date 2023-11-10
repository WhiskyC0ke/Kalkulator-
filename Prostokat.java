import java.util.Scanner;

public class Prostokat {
    Scanner scan = new Scanner(System.in);
    void prostokat(){
        System.out.println("Podaj pierwszy bok prostokąta ");
        double a = scan.nextDouble();
        System.out.println("Podaj drugi bok prostokąta");
        double b = scan.nextDouble();
        double  wynik = a*b;
        System.out.println("Pole prostokąta " + wynik);
    }
}
