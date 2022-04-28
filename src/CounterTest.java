//JUnit test code for Counter class

import junit.framework.TestCase;

public class CounterTest extends TestCase
{
    /**
   * Test Counter count method with one count.
   */
  public void testCount1() {
    Counter testCounter = new Counter();
    testCounter.count();
    
    int expected = 1;
    int actual = testCounter.getValue();
    
    assertEquals("Test with one count",expected, actual);
  }
  
    /**
   * Test Counter count method with one count.
   */
  public void testCountRandom() {
    Counter testCounter = new Counter();
    
    
    int counts = (int)(Math.random() * 100);
    int expected = counts;
    for (int i=1;i<=counts;i++)
    {
      testCounter.count();
    }
    int actual = testCounter.getValue();
    
    assertEquals("Test with random number of counts",expected, actual);
  }  
}