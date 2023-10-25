/*   You have to implement a library using Java Class "Library"
        Methods: addBook, issueBook, returnBook, showAvailableBooks
        Properties: Array to store the available books,
        Array to store the issued books
 */

package Minor_Project;

import java.util.Scanner;

interface Method {
    void addBook(String bookName);
    void showAvailableBooks();
    void issueBook(String bookName);
    void returnBook(String bookName);
}

class Library implements Method {
    String[] book = new String[10];
    String[] recentBook = new String[10];
    int bookCount = 0;
    @Override
    public void addBook(String bookName) {
        if (bookCount < 10) {
            book[bookCount] = bookName;
            recentBook[bookCount] = bookName;
            bookCount++;
        } else {
            System.out.println("Library is full. Cannot add more books.");
        }
    }
    @Override
    public void showAvailableBooks() {
        if (bookCount == 0) {
            System.out.println("No books available in the library.");
        } else {
            System.out.println("Available books:");
            for (int i = 0; i < bookCount; i++) {
                System.out.println("* " + book[i]);
            }
        }
    }
    @Override
    public void issueBook(String bookName) {
        for (int i = 0; i < bookCount; i++) {
            if (book[i].equalsIgnoreCase(bookName)) {
                book[i] = book[i] + " (Issued)";
                System.out.println(bookName + " has been issued.");
                return;
            }
        }
        System.out.println(bookName + " not found in the library.");
    }
    @Override
    public void returnBook(String bookName) {
        for (int i = 0; i < bookCount; i++) {
            if (recentBook[i].equalsIgnoreCase(bookName) && book[i].contains(" (Issued)")) {
                // Update the book name by removing the " (Issued)" part
                book[i] = book[i].replace(" (Issued)", "");
                System.out.println(bookName + " has been returned.");
                return;
            }
        }
        System.out.println(bookName + " is either not found in the library or has not been issued.");
    }
}

public class Project_03_Code {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Library lib = new Library();
        lib.addBook("Java");
        lib.addBook("Python");
        lib.addBook("HTML");

        System.out.println("1. Add Book\n2. Issue Book\n3. Return Book\n4. Show Available Books\n5. Exit");
        int num = 0;
        while (num != 5) {
            System.out.print("Enter the Process Number : ");
            num = scan.nextInt();
            if (num == 1) {
                System.out.print("Enter Book Name : ");
                String newBook = scan.next();
                lib.addBook(newBook);
            } else if (num == 4) {
                lib.showAvailableBooks();
            }
            else if (num == 2) {
                lib.showAvailableBooks();
                System.out.print("Which Book You have Issue : ");
                String issueBook = scan.next();
                lib.issueBook(issueBook);
            }
            else if (num == 3) {
                System.out.print("Which Book You have Return : ");
                String returnBook = scan.next(); // Change this line
                lib.returnBook(returnBook);
            }
        }
    }
}