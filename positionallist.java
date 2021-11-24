public interface positionallist<E> {
//ACCESSOR METHODS  :

    public int size();    //gives number of element present in list 

    public boolean isempty();      //true if list is empty otherwise false
  
    public position<E> first() ;                 //gives the position of first element
   
    public position<E> last();                   //gives the position of last elemnt 

    public position<E> after(position<E> p) throws IllegalAccessException;   //return position after given position
   
    public position<E> before(position<E> p) throws IllegalAccessException;  //return position before given position
   
//UPDATE METHODS :

    public position<E> addfirst(E e) throws IllegalAccessException;             //add element at front of list and return its position 

    public position<E> addlast(E e ) throws IllegalAccessException ;              //add element at end of list and return  position

    public position<E> addbefore(position<E> p ,E e) throws IllegalAccessException;//adding element before given position and return new position
   
    public position<E> addafter(position<E> p,E e) throws IllegalAccessException ;//adding element after given position and return  new  position

    public E set(position<E> p,E e ) throws IllegalAccessException ;     //set given elment at given position and return removed element  

    public E remove(position<E> p) throws IllegalAccessException ;      //remove element at given position 
   
  


    
}
