import java.math.BigDecimal;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        //  V metodě main vytvoř proměnné pro uložení následujících položek
//  Vytvořeným proměnným přiřaď hodnoty

        String item = "Trekové boty Sedmimílovky";
        int quantity = 3;
        double weight = 0.45;
        BigDecimal pricePerPiece = BigDecimal.valueOf (1800);;
        LocalDate dateOfIssue = LocalDate.of(2022,4,7);
        boolean isDiscounted = true;
        double discount = 0.05;

//  Zkus nyní změnit počet párů obuvy na 2 páry a cenu zvyš na 1990 Kč

        quantity = 2;
        pricePerPiece = BigDecimal.valueOf(1900);


//  Vypočti a vypiš na obrazovku celkovou hmotnost zásilky.
//  Vypočti a vypiš na obrazovku celkovou cenu zásilky.

        double totalWeight = quantity * weight;
        System.out.println("Celková hmotnost zásilky je: " + totalWeight + "kg");

        BigDecimal totalPrice = pricePerPiece.multiply(BigDecimal.valueOf(quantity));
        System.out.println("Celková cena zásilky bez započtením slevy je: " + totalPrice + "Kč");

        if (isDiscounted == true){
            totalPrice = totalPrice.multiply(BigDecimal.valueOf(1-discount));
        }
        System.out.println("Celková cena zásilky se započtením slevy je: " + totalPrice + "Kč");


//  Uprav výpočet celkové ceny: k celkové ceně zásilky přičti cenu dopravy 45 Kč

        totalPrice = totalPrice.add(BigDecimal.valueOf(45));
        System.out.println("Celková cena po přičtení poštovného činí: " + totalPrice + "Kč\n");


// výpis všech položek z faktury
        for (int numberOfCycles = 1; numberOfCycles <= quantity; numberOfCycles++ ) {
            System.out.println("Položka č.: " + numberOfCycles + "\nNázev položky: " + item +
                    "\nVáha jedné položky: " + weight + "\nCena položky (bez slevy): " + pricePerPiece +
                    "\nDatum vytavení faktury: " + dateOfIssue);
            if (isDiscounted == true){
                double discountPrint = discount * 100;
                System.out.println("Započtená sleva: " + discountPrint + "%");
            }

            System.out.println("\n");
        }



    }
}