package occ.cs272.h07;

import java.util.NoSuchElementException;

/**
   A linked list is a sequence of nodes with efficient
   element insertion and removal. This class 
   contains a subset of the methods of the standard
   java.util.LinkedList class.
 */
public class LinkedList
{  
    private Node first;

    /** 
      Constructs an empty linked list.
     */
    public LinkedList()
    {
        first = null;
    }

    /**
      Returns the first element in the linked list.
      @return the first element in the linked list
     */
    public Object getFirst()
    {  
        if (first == null) { throw new NoSuchElementException(); }
        return first.data;
    }

    /**
      Removes the first element in the linked list.
      @return the removed element
     */
    public Object removeFirst()
    {  
        if (first == null) { throw new NoSuchElementException(); }
        Object element = first.data;
        first = first.next;
        return element;
    }

    /**
      Adds an element to the front of the linked list.
      @param element the element to add
     */
    public void addFirst(Object element)
    {  
        Node newNode = new Node();
        newNode.data = element;
        newNode.next = first;
        first = newNode;
    }


    /** 
     * @param n
     * @return the object data stored at the node reached by following n links
     */
    public Object get(int n)
    {
        // TODO: Complete this method . . .
        Object element = getNode(n).data;
        return element;
        //return . . .
    }

    /**
     * Sets the data to newElement at the node reached by following n links
     * @param n
     * @param newElement
     */
    public void set(int n, Object newElement)
    {
        // TODO: Complete this method . . .
        Node newNode = new Node();
        getNode(n);
        newNode.data = newElement;
        newNode.next = first;
        first = newNode;
    }

    /**
     * Returns the node reached by following n links.
     * Throws NoSuchElementException if no such node.
     * @param n
     * @return the node reached by following n links
     */
    private Node getNode(int n)
    {
        // TODO: Complete this method . . .
        //       (Start with first and traverse from there using next.
        //        No need to use iterator.)
        if (first == null) 
        {
            throw new NoSuchElementException(); 
        }
        Node newNode = first;
        for(int i = 0; i < n; i++)
        {
            newNode = newNode.next;
        }
        return newNode;
        //return . . .
    }

    /**
     * @param obj
     * @return true if the list contains obj, false otherwise
     */
    public boolean contains(Object obj)
    {
        // TODO: Complete this method . . .
        //       (Start with first and traverse from there using next.
        //        No need to use iterator.)
        Node newNode = first;
        boolean result = false;
        while(newNode != null)
        {
            if(newNode.data == obj)
            {
                result = true;
            }
            newNode = newNode.next;
        }
        return result;
        //return . . .
    }

    @Override
    public String toString()
    {
        String out = "[";
        
        // TODO: Complete this method . . .
        // Format: [obj1, obj2, obj3, ...]
        // Use .toString() to convert object data of each element to String
        // Build the answer using out += ...
        Node newNode = first;
        while(newNode != null)
        {
            out += newNode.toString();
            newNode = newNode.next;
        }
        
        return out + "]";
    }

    /**
      Returns an iterator for iterating through this list.
      @return an iterator for iterating through this list
     */
    public ListIterator listIterator()
    {  
        return new LinkedListIterator();
    }

    class Node
    {  
        public Object data;
        public Node next;
    }

    class LinkedListIterator implements ListIterator
    {  
        private Node position;
        private Node previous;
        private boolean isAfterNext;

        /**
         Constructs an iterator that points to the front
         of the linked list.
         */
        public LinkedListIterator()
        {  
            position = null;
            previous = null;
            isAfterNext = false;
        }

        /**
         Moves the iterator past the next element.
         @return the traversed element
         */
        public Object next()
        {  
            if (!hasNext()) { throw new NoSuchElementException(); }
            previous = position; // Remember for remove
            isAfterNext = true;

            if (position == null)
            {
                position = first;
            }
            else
            {
                position = position.next;
            }

            return position.data;
        }

        /**
         Tests if there is an element after the iterator position.
         @return true if there is an element after the iterator position
         */
        public boolean hasNext()
        {  
            if (position == null)
            {
                return first != null;
            }
            else
            {
                return position.next != null;
            }
        }

        /**
         Adds an element before the iterator position
         and moves the iterator past the inserted element.
         @param element the element to add
         */
        public void add(Object element)
        {  
            if (position == null)
            {
                addFirst(element);
                position = first;
            }
            else
            {  
                Node newNode = new Node();
                newNode.data = element;
                newNode.next = position.next;
                position.next = newNode;
                position = newNode;
            }

            isAfterNext = false;
        }

        /**
         Removes the last traversed element. This method may
         only be called after a call to the next() method.
         */
        public void remove()
        {  
            if (!isAfterNext) { throw new IllegalStateException(); }

            if (position == first)
            {
                removeFirst();
            }
            else 
            {  
                previous.next = position.next;
            }
            position = previous;
            isAfterNext = false;
        }

        /**
         Sets the last traversed element to a different value. 
         @param element the element to set
         */
        public void set(Object element)
        {
            if (!isAfterNext) { throw new IllegalStateException(); }
            position.data = element;
        }
    }
}
