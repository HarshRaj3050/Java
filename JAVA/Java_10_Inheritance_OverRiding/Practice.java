package Java_10_Inheritance_OverRiding;

import java.util.Scanner;

interface Method {
    void addBook(String bookName);
    void showAvailableBooks();
}

class Library implements Method {
    String[] book = new String[10];
    int bookCount = 0;

    public void addBook(String bookName) {
        if (bookCount < 10) {
            book[bookCount] = bookName;
            bookCount++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }

    public void showAvailableBooks() {
        if (bookCount == 0) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Available books:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println(book[i]);
            }
        }
    }
}

public class Practice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library lib = new Library();
        lib.addBook("Java");
        lib.addBook("Python");
        lib.addBook("HTML");

        System.out.println("1. Add Book\n2. Issue Book\n3. Return Book\n4. Show Available Books\n5. Exit");
        int num = 0;

        while (num != 5) {
            System.out.print("Enter the Number : ");
            num = scan.nextInt();
            if (num == 1) {
                System.out.print("Enter Book Name : ");
                String newBook = scan.next();
                lib.addBook(newBook);
            } else if (num == 4) {
                lib.showAvailableBooks();
            }
        }
    }
}

