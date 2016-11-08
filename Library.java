import java.util.*;
import java.util.Scanner;
import java.io.*;

/**
 * Write a description of class Library here.
 * 
 * @author jack Chalmers 
 * @version 11-1-16
 */
public class Library
{
    private ArrayList<Book> libraryBooks;
    private String author,title,callNum;
    private int publishYr;
    private boolean chkdOut,newRelease;
    
    public Library()
    {
        libraryBooks = new ArrayList<Book>();
    }
    
    public void importLibrary() throws IOException, FileNotFoundException
    {        
        Scanner inF = new Scanner(new File("bookList.txt"));
        while (inF.hasNextLine())
        {
            author = inF.nextLine();
            title = inF.next();
            callNum = inF.next();
            publishYr = inF.nextInt();
            chkdOut = inF.nextBoolean();
            inF.nextLine();
            
            libraryBooks.add(new Book(title,author,callNum,publishYr,chkdOut,newRelease));
        }
    }
    
    public String toString()
    {
        return ("Author: " + author + "\nTitle: " + title + "\nCall Number: " + callNum + "\nYear Published: " + publishYr + "\nAvailable to check out: " + chkdOut + "\n\n");
    }
    
    
    public void printLibrary()
    {
        for(int i = 0; i < libraryBooks.size(); i++)
        {
            libraryBooks.get(i).toString(); 
        }
    }
    
    public void searchByAuthor()
    {
        Scanner scan = new Scanner(System.in);
        String authorSearch = scan.nextLine();
        System.out.println("Books by " + authorSearch + ": ");
        for(int i = 0; i < libraryBooks.size(); i++)
        {
            if(libraryBooks.get(i).getAuthor().toLowerCase().contains(authorSearch.toLowerCase()))            
                System.out.println(libraryBooks.get(i).toString());            
        }
    }
    
    public void printNewReleases()
    {
        System.out.println("New Releases:");
        for(int i = 0; i < libraryBooks.size(); i++)
        {
            if(libraryBooks.get(i).getIsNewRelease() == true)
                System.out.println(libraryBooks.get(i).toString());
        }
    }
    
    public void printAvailableBooks()
    {
        System.out.println("Available Books:");
        for(int i = 0; i < libraryBooks.size(); i++)
        {
            if(libraryBooks.get(i).getIsCheckedOut() == false)
                System.out.println(libraryBooks.get(i).toString());
        }
    }
    
    public void checkOut()
    {
        Scanner scan = new Scanner(System.in);
        String bookOut = scan.nextLine();
        for(int i = 0; i < libraryBooks.size(); i++)
        {
            if(libraryBooks.get(i).getCallNum().toLowerCase().contains(bookOut.toLowerCase()) && !libraryBooks.get(i).getIsCheckedOut())
            {
                libraryBooks.get(i).setIsCheckedOut(true);
                System.out.println("Thank you for checking out " + libraryBooks.get(i).toString());
            }
            else
                System.out.println("Sorry, That book is not available to be checked out");
        }
    }
    
    public void checkIn()
    {
        Scanner scan = new Scanner(System.in);
        String bookIn = scan.nextLine();
        for(int i = 0; i < libraryBooks.size(); i++)
            if(libraryBooks.get(i).getCallNum().toLowerCase().contains(bookIn.toLowerCase()) && libraryBooks.get(i).getIsCheckedOut())
            {
                libraryBooks.get(i).setIsCheckedOut(false);
                System.out.println("Thank you for checking in " + libraryBooks.get(i).toString());
            }
            else
                System.out.println("Sorry, that is not a book at this library");
    }
    
    public void exitLibrary()
    {
        System.out.println("\fThank You For Visiting the Library Of Babel! Come Again Soon!");
    }
}
