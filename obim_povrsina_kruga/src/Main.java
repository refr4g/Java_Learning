import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        double pi = 3.14d;
        Scanner skener = new Scanner(System.in);
        System.out.print("Unesite poluprecnik kruga: ");
        int r = skener.nextInt();

        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.FLOOR);

        double obim = 2*r*pi;
        double obim_2_decimale = Double.parseDouble(df.format(obim));
        double povrsina = r*r*pi;
        double povrsina_2_decimale = Double.parseDouble(df.format(povrsina));
        System.out.println("Obim kruga je " + obim_2_decimale + "cm");
        System.out.println("Povrsina kruga je " + povrsina_2_decimale + "cm2");

    }
}