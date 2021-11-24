public class circularnode<E> {
    private E element;
    private circularnode<E> next;
    public E getelement(){//method for acces element in node .
        return element;}
    public circularnode<E> getnext(){  // to access next reference node
        return next;
    }
    public void setnext(circularnode<E> x ){ // method to set next refereance 
        next =x;
    }
    public circularnode(E e ,circularnode<E> node){ // constructor to assign element and next referance 
        element = e; //e is parametor pass to constructor to set  element in list 
        next =node;  //node is parametor pass to constructor to set next referance at creation time;
    }
    



    
}
