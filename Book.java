
/**
 * Write a description of class Book here.
 * 
 * @author Jack Chalmers 
 * @version 9/22/16
 */
public class Book
{
    private String title;
    private String author;
    private int publishYear;
    private String callNum;
    private boolean isCheckedOut;
    private boolean isNewRelease;

    /**
     * Constructor for objects of class Book
     */
    public Book()
    {
        title = "";
        author = "";
        publishYear = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public Book(String title, String author, String callNum, int publishYear, boolean isCheckedOut)
    {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.callNum = callNum;
        this.isCheckedOut = isCheckedOut;
        
    }
    
    public String toString()
    {
        return ("The book " + title + " was written by " + author + " in " + publishYear + " with a call num of " + callNum + " and it is " + isCheckedOut + ", it is " + isNewRelease);
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public int getPublishYear()
    {
        return publishYear;
    }
    
    public String getCallNum()
    {
        return callNum;
    }
    
    public boolean getIsCheckedOut()
    {
        return isCheckedOut;
    }
    
    public boolean getIsNewRelease()
    {
        return isNewRelease;
    }
    
    
    /*Set methods*/
    public void setCallNum(String callNum)
    {
        this.callNum = callNum;
    }
    
    public void setIsCheckedOut(boolean isCheckedOut)
    {
        this.isCheckedOut = isCheckedOut;
    }
    
    public void setIsNewRelease(boolean isNewRelease)
    {
        this.isNewRelease = isNewRelease;
    }
}
