// Name: 
// Instructor: Dave Woods
// CSE 174, Spring 2020
// Date: 4/10/2020
// Filename: Counter.java
// Description: Class to implement a simple counter object.
//

/**
 * Class to implement a simple tally counter 
 */
public class Counter
{
  
// variable to hold the current count
  private int value;
  
/**
 * Add 1 to the current value of the counter.
 */
  public void count()
  {
    value = value + 1;
  }
  
/**
 * Getter to get the current value of the counter.
 * @return The current value of the counter.
 */
  public int getValue()
  {
    return value;
  }
    
}