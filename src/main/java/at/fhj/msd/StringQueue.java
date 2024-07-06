package at.fhj.msd;
/**
 * Class to implement a iQueue, a Queue for strings
 */

import java.util.*;

public class StringQueue implements IQueue {

  private List<String> elements = new ArrayList<String>();
  private int maxSize = 5;

  /**
   * Constructor, called with int value for the size of the Queue
   * @param initialSize
   */
  public StringQueue(int initialSize) {
    maxSize = initialSize;
  } //corrected naming issue (maxsize and maxSize)

  /**
   * offer, called with int value for the size of the Queue
   * @param obj put a Drink Objekt ontop of the Drink queue
   * @return boolean if offer succeeded or not
   */
  @Override
  public boolean offer(String obj) {
    if (elements.size() != maxSize) {
      elements.add(obj);
      return true; //corrected the order of the return statements
    } else {
      return false;
    }
  }

  /**
   *
   * gets an element off the queue
   * returns + del 1st element, if there is nothing in there error NoSuchElementException
   * @return name of Drink , element
   * @return if nothing in there -> if queue is empty
   *
   */

  @Override
  public String poll() {
    String element = peek();

    if (element != null) { //changed from(elements.size() == 0) since the later doesn't work correctly
      elements.remove(0);
    }

    return element;
  }

  /**
   *
   * gets an element off the queue
   * returns + del 1st element, if there is nothing in there error NoSuchElementException
   * @return name of Drink , element
   * @throws NoSuchElementException if nothing in there -> if queue is empty
   *
   */
  @Override
  public String remove() {
    String element = poll();
    // removed (element = "";) since you can't set a null element to an empty string
    if (element == null)
      throw new NoSuchElementException("there's no element any more");
    else //added an else statement to prevent the function from returning a null element
      return element;
  }
  /**
   *
   * look what the name of the next drink is
   * @return 1st element without delete, otherwise null
   *
   */
  @Override
  public String peek() {
    String element;
    if (!elements.isEmpty())
      element = elements.get(0);
    else
      element = null;

    return element;
  }
  /**
   *
   * look what the name of the next drink is
   * @return 1st element without delete,
   * @throws NoSuchElementException if there is nothing in there error
   *
   */

  @Override
  public String element() {
    String element = peek();
    if (element == null)
      throw new NoSuchElementException("there's no element any more");

    return element;
  }

}