import java.util.Scanner;

public class Kwadrat {
    Scanner scan = new Scanner(System.in);
    void kwadrat(){
        System.out.println("Podaj bok kwadratu ");
        double a = scan.nextDouble();
        double wynik = a*a;
        System.out.println("Obwód kwadratu wynosi " + wynik );
    }
}
