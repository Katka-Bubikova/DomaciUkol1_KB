import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {

    private static BigDecimal cenaCelkem;

    public static void ukol1() {
        System.out.println("Hello world!"); //chybejici uvozovky
    }
    public static void ukol2() {
        String uzivatel = "Karel"; //chybejici uvozovky
        System.out.println(uzivatel);
    }

    public static void ukol3() {
        int pocetLekci = 10;  //misto String dan int
        System.out.println(pocetLekci);
    }

    public static void ukol4() {
        double cena = 10.0;  //desetinna tecka misto carky
        System.out.println(cena);
    }

    public static void ukol5() {
        BigDecimal cena1 = BigDecimal.valueOf(0.0);   //uprava za BigDecimal
                                                      //cena1 pouzita, aby se to nebilo s dalsim ukolem
        for (int i = 0; i < 10; i++) {
             cena1 = cena1.add(BigDecimal.valueOf(0.1));

        }
        System.out.println(cena1);

    }
//
    public static void ukol6() {
        BigDecimal cena2 = BigDecimal.valueOf(0);       //uprava BigDecimal zapisu
        cena2 = cena2.add(BigDecimal.valueOf(0.1));
        System.out.println(cena2);
    }

    public static void ukol7() {
        int vykonMotoru = 120;   //odstraneny uvozovky
        System.out.println("Výkon Motoru je: "+vykonMotoru+" kW.");
    }

    public static void ukol8() {
        int velikostKosile = 37;
        System.out.println("Velikost košile je: "+velikostKosile+".");  //upraven zapis concat
    }

    public static void ukol9() {  //kouzelna formulka nebyla kompletni
        System.out.println("Metoda *skoro* bez chybičky!");
    }

    public static void main(String[] args) {
        System.out.println("Oprav chyby a spusť všechny metody!");
        System.out.println("Komentáře odstraníš klávesovou "
                +"zkratkou <Ctrl>+</> - použij lomítko "
                +"na numerické klávesnici.");
        ukol1();
        ukol2();
        ukol3();
        ukol4();
        ukol5();
        ukol6();
        ukol7();
        ukol8();
        ukol9();

        //PRODEJCI MRKVE
        System.out.println("***Část 2 - prodejci mrkve***");
        String name = "Jan Novák";
        LocalDate dateOfBirth = LocalDate.of(1990,1,1);
        int numberOfContracts = 10;
        BigDecimal tonsOfCarrots = BigDecimal.valueOf(12.3);
        String city = "Popudinské Močidľany";
        String spz = "BT510CX";
        BigDecimal gasPer100km = BigDecimal.valueOf(7.64);
        String ipAddress = "12.1.1.99";

        BigDecimal avgAmountPerContract = tonsOfCarrots.divide(BigDecimal.valueOf(numberOfContracts));
        System.out.println("Průměrné množství prodané mrkve na smlouvu: "+avgAmountPerContract);

    }
}