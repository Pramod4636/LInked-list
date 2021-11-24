//node of double linked list 
public class doublenode<E> {     //E type for generic class  
    E element ;                  //store element
    doublenode<E> previous;      // previous reference
    doublenode<E> next;          // next reference

    public doublenode(E e ,doublenode<E> p,doublenode<E> n)   //method for set initial values
    {
        element =e;
        previous=p;
        next=n;
    } 

    public E getelement()                  //acces element 
    { return element;}
    public doublenode<E> getnext()         //acces next referenc
    { return next;}
    public doublenode<E> getprevious()     //acess previous reference
    { return previous;}
    public void setnext(doublenode<E> n)   //assign next referece
    { next=n;}
    public void setprevious(doublenode<E> p)  //assign previous referece
    { previous= p;}


}
