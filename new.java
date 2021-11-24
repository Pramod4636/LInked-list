
import java.util.Iterator; 
import java.util.NoSuchElementException; 
 
public class LinkedList<T> implements PositionalList<T>{ 
 
    private static class Node<T> implements Position<T> { 
        private T element; 
        private Node<T> next; 
        private Node<T> prev; 
 
        public Node(Node<T> p,T e,Node<T> n) { 
            element = e; 
            next = n; 
            prev = p; 
        } 
 
        @Override 
        public T getElement() { 
            return element; 
        } 
 
        public Node<T> getNext() { 
            return next; 
        } 
 
        public Node<T> getPrev() { 
            return prev; 
        } 
 
        public void setElement(T e) { 
            element = e; 
        } 
         
        public void setNext(Node<T> n) { 
            next = n; 
        } 
 
        public void setPrev(Node<T> p) { 
            prev = p; 
        } 
    } 
 
    private Node<T> header; 
    private Node<T> trailer; 
    private int size; 
 
    LinkedList() { 
        header = new Node<T>(null,null,null); 
        trailer = new Node<T>(header,null,null); 
        header.setNext(trailer); 
        size = 0; 
    } 
 
    private Node<T> validate(Position<T> p) throws IllegalArgumentException{ 
        if(!(p instanceof Node)) throw new IllegalArgumentException("invalid position"); 
        Node<T> node = (Node<T>)p; 
        if(node.getNext()==null) throw new IllegalArgumentException("p is not in the list"); 
        return node; 
    } 
 
    private Position<T> position(Node<T> n) { 
        if(n == header || n == trailer) return null; 
        return n; 
    } 
 
    private Position<T> addBetween(Node<T> prev,Node<T> next,T element) { 
        Node<T> newNode = new Node<T> (prev,element,next); 
        prev.setNext(newNode); 
        next.setPrev(newNode); 
        size++; 
        return position(newNode); 
    } 
 
    @Override 
    public Position<T> first() { 
        return position(header.getNext()); 
    } 
 
    @Override 
    public Position<T> last() { 
        return position(trailer.getPrev()); 
    } 
 
    @Override 
    public Position<T> before(Position<T> p) { 
        Node<T> node = validate(p); 
        Position<T> pos = position(node.getPrev());  
        return pos; 
    } 
 
    @Override 
    public Position<T> after(Position<T> p) { 
        Node<T> node = validate(p); 
        Position<T> pos = position(node.getNext());  
        return pos; 
    } 
 
    @Override 
    public boolean isEmpty() { 
        return size == 0; 
    } 
 
    @Override 
    public int size() { 
        return size; 
    } 
 
    @Override 
    public Position<T> addFirst(T e) { 
        Node<T> newNode = new Node<T>(header,e,header.getNext()); 
        header.getNext().setPrev(newNode); 
        header.setNext(newNode); 
        size++; 
        return position(newNode); 
    } 
 
    @Override 
    public Position<T> addLast(T e) { 
        Node<T> newNode = new Node<T>(trailer.getPrev(),e,trailer); 
        trailer.getPrev().setNext(newNode); 
        trailer.setPrev(newNode); 
        size++; 
        return position(newNode); 
    } 
 
    @Override 
    public Position<T> addBefore(Position<T> p, T e) { 
        Node<T> node = validate(p); 
        Position<T> newPos = addBetween(node.getPrev(), node, e); 
        return newPos; 
    } 
 
    @Override 
    public Position<T> addAfter(Position<T> p, T e) { 
        Node<T> node = validate(p); 
        Position<T> newPos = addBetween(node, node.getNext(), e); 
        return newPos; 
    } 
 
    @Override 
    public T set(Position<T> p, T e) { 
        Node<T> node = validate(p); 
        T element = node.getElement(); 
        node.setElement(e); 
        return element; 
    } 
 
    @Override 
    public T remove(Position<T> p) {
Node<T> node = validate(p); 
        T element = node.getElement(); 
        node.getPrev().setNext(node.getNext()); 
        node.getNext().setPrev(node.getPrev()); 
        node.setElement(null); 
        node.setNext(null); 
        node.setPrev(null); 
        size--; 
        return element; 
    } 
 
    /** defining iterators and iterables */ 
 
    private class PositionIterator implements Iterator<Position<T>> { 
 
        Position<T> cursor = first(); 
        Position<T> recent = null; 
 
        @Override 
        public boolean hasNext() { 
            return !(cursor == null); 
        } 
 
        @Override 
        public Position<T> next() throws NoSuchElementException { 
            if(cursor == null) throw new NoSuchElementException("No element left to iterate!"); 
            recent = cursor; 
            cursor = after(cursor); 
            return recent; 
        } 
 
        @Override 
        public void remove() throws NoSuchElementException { 
            if(recent == null) throw new NoSuchElementException("No element to remove"); 
            LinkedList.this.remove(recent); 
            recent = null; 
        } 
    } 
 
    private class PositionIterable implements Iterable<Position<T>> { 
 
        @Override 
        public Iterator<Position<T>> iterator() { 
            return new PositionIterator(); 
        } 
         
    }  
 
    private Iterable<Position<T>> positions() { 
        return new PositionIterable(); 
    } 
 
    private class ElementIterator implements Iterator<T> { 
 
        Iterator<Position<T>> posIterator = positions().iterator();  
 
        @Override 
        public boolean hasNext() { 
            return posIterator.hasNext(); 
        } 
 
        @Override 
        public T next() { 
            return posIterator.next().getElement(); 
        } 
 
        @Override 
        public void remove() { 
            posIterator.remove(); 
        } 
         
    } 
 
    private class ElementIterable implements Iterable<T> { 
 
        @Override 
        public Iterator<T> iterator() { 
            return new ElementIterator(); 
        } 
         
    } 
 
    public Iterable<T> elements() { 
        return new ElementIterable(); 
    } 
}



