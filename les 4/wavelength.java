import java.util.Scanner;

public class wavelength {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Voer een golflengte in: ");
        double wavelength = scanner.nextDouble();

        if (wavelength >= 380 && wavelength < 450) {
            System.out.println("De kleur is Violet");
        } else if (wavelength >= 450 && wavelength < 495) {
            System.out.println("De kleur is Blauw");
        } else if (wavelength >= 495 && wavelength < 570) {
            System.out.println("De kleur is Groen");
        } else if (wavelength >= 570 && wavelength < 590) {
            System.out.println("De kleur is Geel");
        } else if (wavelength >= 590 && wavelength < 620) {
            System.out.println("De kleur is Oranje");
        } else if (wavelength >= 620 && wavelength < 750) {
            System.out.println("De kleur is Rood");
        } else {
            System.out.println("De ingevoerde golflengte valt niet binnen het zichtbare spectrum");
        }

        scanner.close();
    }
}