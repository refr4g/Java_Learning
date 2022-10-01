package cmdlineCalc;
import static java.lang.System.out;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        double prvi_broj, drugi_broj, rezultat;
        char operator;
        Scanner skener = new Scanner(System.in);

        out.println("Unesite operaciju(+, -, *, /): ");
        operator = skener.next().charAt(0);

        if(operator != '+' && operator != '-' && operator != '*' && operator != '/'){
            out.println("Uneli ste pogresnu operaciju ili ste uneli vise operacija !");
        }

        out.println("Unesite prvi broj: ");
        prvi_broj = skener.nextDouble();

        out.println("Unesite drugi broj: ");
        drugi_broj = skener.nextDouble();

        switch (operator) {
            case '+' -> {
                rezultat = prvi_broj + drugi_broj;
                out.println("Sabirak uneta dva broja je: " + rezultat);
            }
            case '-' -> {
                rezultat = prvi_broj - drugi_broj;
                out.println("Razlika dva uneta broja je: " + rezultat);
            }
            case '*' -> {
                rezultat = prvi_broj * drugi_broj;
                out.println("Proizvod dva uneta broja je: " + rezultat);
            }
            case '/' -> {
                rezultat = prvi_broj / drugi_broj;
                out.println("Kolicnik dva uneta broja je: " + rezultat);
            }
        }
    }
}
