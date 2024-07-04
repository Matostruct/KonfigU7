package at.fhj.msd;

/**
 * Class that implements an iQueue, a Queue for drinks
 */

import java.util.*;

public class DrinkQueue {
    private Queue<Drink> listOfDrinks;
    private int maxSize;

    public DrinkQueue(int maxSize, Queue<Drink> listOfDrinks) {
        this.maxSize = maxSize;
        this.listOfDrinks = listOfDrinks;
    }

    /**
     * As long as there is still room for more drinks (maxSize)
     * add a new one
     *
     * @param drink the drink that is to be added
     * @return boolean true if successfully added, false if not
     */

    public boolean offer(Drink drink) {
        if (listOfDrinks.size() <= maxSize) {
            listOfDrinks.add(drink);
            return true;
        } else {
            return false;
        }
    }

    /**
     * Works as the poll in IQueue by removing and returning the
     * 1st element in the queue.
     * @return Drink that is removed from the list
     */

    public Drink poll() {
        return listOfDrinks.poll();
    }

    /**
     * Works like poll but throws a NoSuchElementException if the list is empty
     * @return Drink the is first in the queue
     * @throws NoSuchElementException if the queue is empty
     */

    public Drink remove() {
        Drink drink = listOfDrinks.poll();
        if (drink == null)
            throw new NoSuchElementException();
        else
            return drink;
    }

    /**
     * looks at the firste element of the queue and returns it without deletion
     * @return Drink that is in the queue or null if empty list
     */

    public Drink peek() {
        return listOfDrinks.peek();
    }

    /**
     * Works like peek but insted of returning null throws a NoSuchElementException
     * @return Drink that is at the head of the queue
     * @throws NoSuchElementException if the Queue is empty
     */

    public Drink element() {
        Drink drink = listOfDrinks.peek();
        if (drink == null)
            throw new NoSuchElementException();
        else
            return drink;
    }
}
