package at.fhj.msd;

/**
 * Class that implements an iQueue, a Queue for drinks
 */

import java.util.*;

public class DrinkQueue {

    private static int size = 0;
    private LinkedListElement head;
    private LinkedListElement tail;

    public LinkedListElement getHead() {
        return head;
    }

    public LinkedListElement getTail() {
        return tail;
    }

    private int maxSize;
    public DrinkQueue(int maxSize) {
        this.maxSize = maxSize;
    }

    /**
     * Checks whether the queue is empty or not.
     *
     * @return <code>true</code> if the queue is empty; <code>false</code> otherwise.
     */
    public boolean isEmpty(){
        return (head == null && tail == null);
    }

    /**
     * Adds an element to the end of the queue.
     *
     * @param drink the drink that is to be added
     * @return boolean true if successfully added, false if not
     */
    public boolean offer(Drink drink){
        if (size <= maxSize) {
            if (isEmpty()) {
                head = tail = new LinkedListElement(drink, null, null);
            } else if (head == tail) { //means that there is only one element in the list
                tail = new LinkedListElement(drink, head, null); //create new ListElement which is the tail
                head.setNextListElement(tail); // set the tail as the next ListElement of the head
            } else {
                tail = new LinkedListElement(drink, tail, null); //create a new ListElement which becomes the new tail
                tail.getPreviousListElement().setNextListElement(tail); //set the next ListElement of the now second to
                // last List Element to tail
            }
            size++;
            return true;
        } else {
            return false;
        }
    }
    /**
     * Returns the Process object at the start of the queue. Note that the element is thus removed from the
     * queue. If the queue is empty, the method returns <code>null</code>.
     * @return process at the start of the queue.
     */
    public Drink poll(){
        if (isEmpty()) {
            return null;
        } else if (head == tail) { //if only one element is in the list
            Drink temp = head.getDrink();
            tail = head = null; //set both head and tail null (e.g. emptying the list)
            size = 0;
            return temp;
        } else { //if the list has more than one element.
            Drink temp = head.getDrink();
            head = head.getNextListElement(); // set the next ListElement as the new head and
            head.setPreviousListElement(null);// remove the "pointer" to the previous head. This should suffice, since
            //there is no reference on the "old" head the garbage collector should be able to release the memory.
            size--;
            return temp;
        }
    }

    /**
     * Returns the Process object at the start of the queue. Note that the element remains in the queue.
     * If the queue is empty, the method returns <code>null</code>.
     * @return process at the start of the queue.
     */
    public Drink peek(){
        if (head == null && tail == null){
            return null;
        } else {
            return head.getDrink();
        }
    }

    /**
     * Works like poll but throws a NoSuchElementException if the list is empty
     * @return Drink the is first in the queue
     * @throws NoSuchElementException if the queue is empty
     */

    public Drink remove() {
        Drink drink = poll();
        if (drink == null)
            throw new NoSuchElementException();
        else
            return drink;
    }

    /**
     * Works like peek but instead of returning null throws a NoSuchElementException
     * @return Drink that is at the head of the queue
     * @throws NoSuchElementException if the Queue is empty
     */

    public Drink element() {
        Drink drink = peek();
        if (drink == null)
            throw new NoSuchElementException();
        else
            return drink;
    }
}
