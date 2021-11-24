class positionnode<E> implements position<E> {
    private E element;                //reference to store element 
    private  positionnode<E> next;    //reference to store next node 
    private positionnode<E> previous; //reference to store previous node
    public int size;

    public positionnode(E e,positionnode<E> pre,positionnode<E> n) //set all variable value at time of creation
    {   
        element=e;
        next=n;
        previous=pre;
    }

    public E getelement()          //return element  if list is not empty
    { return element;}

    public positionnode<E> getnext()   //gives  next node
    {  return next;}
    
    public positionnode<E> getprevious()  //gives poprevious node
    {  return previous;}
    
    public void setprevious(positionnode<E> node )  //sets prvious node
    { previous=node;}

    public void setnext(positionnode<E> node)    //sets next node
    { next =node;}

    public void setelement(E e )
    { element=e;}
}
