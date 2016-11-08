import java.util.*;
import java.util.Scanner;
import java.io.*;
/**
 * Controlls the library
 * 
 * @author Jack Chalmers 
 * @version 10-31-16
 */
public class LibraryDriver
{
   public static void main(String[] args) throws IOException, FileNotFoundException
   {
       Library lib = new Library();
       lib.importLibrary();
       int userChoice;
       Scanner scan = new Scanner(System.in);
       userChoice = scan.nextInt();
       System.out.print("Welcome to the Library of Babel!\n What would you like to do today?\1. List Full Library\n2. List Available Books For Checkout\n3. Search By Author\n 4. Print New Realeases\n5. Check Out A Book\n6. Check In A Book\n 7. Exit Library of Babel");
       if(userChoice == 1)
            lib.printLibrary();
       else if(userChoice == 2)
            lib.printAvailableBooks();
       else if(userChoice == 3)
            lib.searchByAuthor();
       else if(userChoice == 4)
            lib.printNewReleases();
       else if(userChoice == 5)
            lib.checkOut();
       else if(userChoice == 6)
            lib.checkIn();
       else if(userChoice == 7)
            lib.exitLibrary();
   }
}
