package at.fhj.msd;

public interface IQueue {
  /** 
   * I am a better comment, I am almost perfect:
   * This Interface serves as a blueprint for the StringQueue
   * and any other classes that might need it.
   * */
  //adds an element to the queue and returns true if successful, false if there was no space left
  public abstract boolean offer(String obj);

  //returns and deletes the 1st element; returns null if there is no element in the Queue
  public abstract String poll();

  //same as poll but returns a NoSuchElement exception if the Queue was empty
  public abstract String remove();

  //returns the 1st element without deleting it; if there is no element in the Queue returns null
  public abstract String peek();

  //same as peek but returns a NoSuchElement exception if the Queue was empty
  public abstract String element();
}