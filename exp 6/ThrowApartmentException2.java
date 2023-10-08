
package throwapartmentexception2;

import java.util.Scanner;
public class ThrowApartmentException2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            Apartment[] apartments = new Apartment[6];

            for (int i = 0; i < 6; i++) {
                System.out.println("Enter street address:");
                String streetAddress = scanner.nextLine();

                System.out.println("Enter apartment number:");
                String apartmentNumber = scanner.nextLine();

                System.out.println("Enter number of bedrooms:");
                int numberOfBedrooms = Integer.parseInt(scanner.nextLine());

                System.out.println("Enter rent:");
                double rent = Double.parseDouble(scanner.nextLine());

                apartments[i] = new Apartment(streetAddress, apartmentNumber, numberOfBedrooms, rent);
                System.out.println("Apartment created successfully.");
            }

            System.out.println("\nList of Apartments:");
            for (Apartment apartment : apartments) {
                System.out.println(apartment);
            }

        } catch (ApartmentException2 e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
    
    public static void main(String[] args) {
       
    }
    
}
