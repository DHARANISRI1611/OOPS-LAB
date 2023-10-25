
package library;
import java.util.Scanner;
public class Library {
    private static final int BOOK_COUNT = 5;
    private static final boolean[] availableBooks = new boolean[BOOK_COUNT];

    public static void main(String[] args) {
        for (int i = 0; i < BOOK_COUNT; i++) {
            availableBooks[i] = true;
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter 1 to check out a book, 2 to return a book, or 3 to quit:");
            int choice = scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1 -> {
                    System.out.print("Enter the book number to check out: ");
                    int checkoutBook = scanner.nextInt();
                    scanner.nextLine();  
                    new CheckOutThread(checkoutBook).start();
                }
                case 2 -> {
                    System.out.print("Enter the book number to return: ");
                    int returnBook = scanner.nextInt();
                    scanner.nextLine(); 
                    new ReturnThread(returnBook).start();
                }
                case 3 -> {
                    System.out.println("Exiting the program.");
                    return;
                }
                default -> System.out.println("Invalid choice. Try again.");
            }
        }
    }

    static class CheckOutThread extends Thread {
        private final int bookNumber;

        public CheckOutThread(int bookNumber) {
            this.bookNumber = bookNumber;
        }

        @Override
        public void run() {
            synchronized (availableBooks) {
                if (bookNumber >= 0 && bookNumber < BOOK_COUNT) {
                    if (availableBooks[bookNumber]) {
                        availableBooks[bookNumber] = false;
                        System.out.println("Book " + bookNumber + " has been checked out.");
                    } else {
                        System.out.println("Book " + bookNumber + " is already checked out.");
                    }
                } else {
                    System.out.println("Invalid book number.");
                }
            }
        }
    }

    static class ReturnThread extends Thread {
        private final int bookNumber;

        public ReturnThread(int bookNumber) {
            this.bookNumber = bookNumber;
        }

        @Override
        public void run() {
            synchronized (availableBooks) {
                if (bookNumber >= 0 && bookNumber < BOOK_COUNT) {
                    if (!availableBooks[bookNumber]) {
                        availableBooks[bookNumber] = true;
                        System.out.println("Book " + bookNumber + " has been returned.");
                    } else {
                        System.out.println("Book " + bookNumber + " is already available in the library.");
                    }
                } else {
                    System.out.println("Invalid book number.");
                }
            }
        }
    }
}
