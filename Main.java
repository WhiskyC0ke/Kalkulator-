import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        Kwadrat kwadrat = new Kwadrat();
        Prostokat prostokat = new Prostokat();
        Trojkat trojkat = new Trojkat();

        Scanner scanner= new Scanner(System.in);
        for (;;){
            int wybor;
            System.out.println("\n");
            System.out.println("Wybierz figurę do obliczeń:\n" +
                    "1. Kwadrat\n" +
                    "2. Prostokąt\n" +
                    "3. Trójkąt\n" +
                    "4. Wyjście");
            wybor=scanner.nextInt();
            if (wybor>0 && wybor<5) {
                switch (wybor) {
                    case 1:
                        kwadrat.kwadrat();
                        break;
                    case 2:
                        prostokat.prostokat();
                        break;
                    case 3:
                        prostokat.prostokat();
                        break;
                    case 4:
                        System.exit(0);
                        break;

                }
            }else {
                System.out.println("Błąd");
            }
        }

    }
}