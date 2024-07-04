package at.fhj.msd;


/**
 * Interface for faster Queue Development, providing basic syntax of programmcalls
 */
public interface IQueue {
  /** 
   *
   *  adds a Drink- object to queue, true if okay
   *
   **/
  public abstract boolean offer(String obj);

  /**
   *
   *  Get an element off the queue
   *  returns + del 1st element; null if nothing in there
   *
   */

  public abstract String poll();

  /**
   *
   * Get an element off the queue
   * returns + del 1st element, if there is nothing in there error NoSuchElementException
   *
   */
  public abstract String remove();

  /**
   *
   * look what the name of the next drink is
   * 1st element without delete, otherwise null
   *
   */
   
  public abstract String peek();

  /**
   *
   * look what the name of the next drink is
   * 1st element without delete, if there is nothing in there error NoSuchElementException
   *
   */
  
  public abstract String element();
}