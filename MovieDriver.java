


import java.util.Scanner;

public class MovieDriver 
{
  public static void main(String[] args) 
  {
    
    Scanner keyboard = new Scanner(System.in);
    
    Movie movieObject = new Movie();
    
      // Variables
      String title;
      String rating;
      int soldTickets;
      String answer; 
    
    do 
    {
      
      System.out.print("******************************************************");
      
      // The user enters a movie title.
      System.out.print("\nEnter the title of a movie: ");
      title = keyboard.nextLine();
      movieObject.setTitle(title);
      
      // Ask the user to enter the rating of the movie.
      System.out.print("\nEnter the rating of the movie: ");
      rating = keyboard.nextLine();
      movieObject.setRating(rating);
      
      // Ask the user to enter how many tickets the movie sold.
      System.out.print("\nEnter the number of tickets this movie sold: ");
      soldTickets = keyboard.nextInt();
      movieObject.setSoldTickets(soldTickets);
      System.out.println();
      
      // Print a summary of the information the user has entered.
      System.out.print(movieObject.toString());
      System.out.println();
      
      // Ask the user if another movie is to be entered.
      System.out.print("\nWould You Like to enter another Movie(y/n)? ");
      answer = keyboard.next();
      keyboard.nextLine();
      System.out.println();
      
    }
    
      // If the user would like to enter another movie, this will allow the program to run again.
      while (answer.equalsIgnoreCase("y"));
    
      // This message is printed out once the user is done entering movies.	
      System.out.print("\ngoodbye!");
    
    }
}
