package Lab8.Task2;

import java.util.Arrays;

public class Main {
    // Тип БД
    static Customer castomers[] = new Customer[3];
    public static void main(String[] args) {
        castomers[0] =  new Customer("Velcom", "Ленинградская 2", 25.2, "Комфорт XL", "Иван", 26 );
        castomers[1] =  new Customer("Velcom", "Ленинградская 2", 35.2, "Комфорт XS", "Семен", 46 );
        castomers[2] =  new Customer("Velcom", "Ленинградская 2", 55.2, "Комфорт XXL", "Дмитрий", 20 );

        // Цена от 30р до 40
        for (int i = 0; i <= castomers.length - 1; i++) {
            if(castomers[i].getPrice() > 30 && castomers[i].getPrice() < 40) {
                System.out.println("Тариф: " + castomers[i].getTitle() + " - " + castomers[i].getPrice() + "BYN");
            }
        }
    }
}
