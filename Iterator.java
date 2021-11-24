//ITERATORS INTERFACE :
public interface Iterator<E> {
    
    public boolean hasnext();   //it gives true if atleast one element present after given element
    
    public E next() throws IllegalAccessException;    //gives next element
    
    public void remove() throws IllegalAccessException;  //remove recant called element from collection of elements 
}
