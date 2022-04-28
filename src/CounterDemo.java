// Name: 
// Instructor: Dave Woods
// CSE 174, Spring 2020
// Date: 4/10/2020
// Filename: CounterTester.java
// Description: Code to demonstrate Counter class that implements a simple counter.
//

public class CounterDemo
{
  public static void main(String[] args)
  {

// create a new counter    
    Counter basketballGame = new Counter();
//  add a couple of counts
    basketballGame.count();
    basketballGame.count();
    
// display the current count 
    int basketballGameCount = basketballGame.getValue();
    System.out.println("Current basketball game count should be 2.  It is: "+basketballGameCount);
    
// create a second counter and add some counts
    Counter movie = new Counter();
    movie.count();
    movie.count();
    movie.count();
// display current count for movie
    int movieCount = movie.getValue();
    System.out.println("Current movie count should be 3.  It is: "+movieCount);        
  }
}