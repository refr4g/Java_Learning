import static java.lang.System.out;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner skener = new Scanner(System.in);

        int dan = skener.nextInt();
        int mesec = skener.nextInt();
        int godina = skener.nextInt();

        switch (mesec) {
            case 1, 3, 5, 7, 8, 10 -> {
                if (dan == 31) {
                    dan = 1;
                    mesec++;
                }
                else{
                    dan++;
                }
                out.println("" + dan + "." + mesec + "." + godina + ".");
            }
            case 4, 6, 9, 11 -> {
                if (dan == 30) {
                    dan = 1;
                    mesec++;
                }
                else {
                    dan++;
                }
                out.println("" + dan + "." + mesec + "." + godina + ".");
            }
            case 12 -> {
                if (dan < 31) {
                    dan++;
                }
                else {
                    dan = 1;
                    mesec = 1;
                    godina++;
                }
                out.println("" + dan + "." + mesec + "." + godina + ".");
            }
            case 2 -> {
                if (godina % 4 == 0 && godina % 100 != 0 || godina % 400 == 0) {
                    if (dan == 29) {
                        dan = 1;
                        mesec++;
                    }
                    else {
                        dan++;
                    }
                } else {
                    if (dan == 28){
                        dan = 1;
                        mesec++;
                    }
                    else if (dan == 29){
                        out.println("Uneta godina nije prestupna, shodno tome nema 29 dana u februaru.");
                        break;
                    }
                    else {
                        dan++;
                    }
                }
                out.println("" + dan + "." + mesec + "." + godina + ".");
            }
        }
    }
}
