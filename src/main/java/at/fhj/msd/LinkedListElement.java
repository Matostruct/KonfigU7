package at.fhj.msd;

/**
 Attributes for each LinkedListElement:
 1) letter: containing the information within the list element as a char
 2) next: contains the next element of the list
 3) previous: contains the previous element of the list
 */

public class LinkedListElement {
    Drink drink;
    LinkedListElement next;
    LinkedListElement previous;

    public LinkedListElement(Drink drink, LinkedListElement previous, LinkedListElement next) {
        this.drink = drink;
        this.next = next;
        this.previous = previous;
    }

    /*
    Getter and setter
     */

    public Drink getDrink() {
        return drink;
    }

    public LinkedListElement getNextListElement() {
        return next;
    }

    public LinkedListElement getPreviousListElement() {
        return previous;
    }

    public void setNextListElement(LinkedListElement next) {
        this.next = next;
    }

    public void setPreviousListElement(LinkedListElement previous) {
        this.previous = previous;
    }
}
