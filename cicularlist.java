//class for cirularlist
public class cicularlist<E> {
    private circularnode<E> tail=null;
    public int size=0;

    public boolean isEmpty(){ // check list is empty or not by using size variable used maintain size .
    return size==0;
    }
    public E first(){ //method for acces first element in list   : first element is element in tail next referance node it possible when atleast one node is present in list .
        if(!isEmpty())
        return tail.getnext().getelement();
        else
        {
            System.out.println("no element list is empty .");
            return null;
        }

    }
    public E last(){ //method for acces last element in list   : last element is element in tail node 
        if(!isEmpty())
        return tail.getelement();
        else
        {
            System.out.println("no element list is empty .");
            return null;
        }
        
    }
    public void addfirst(E fe) // method for adding element at start of list 
    {   if(isEmpty())
        {   circularnode<E> New = new circularnode<E>(fe,null);
            tail=New; //new node becomes tail 
            tail.setnext(New);
            ++size;
        } 
        else
        {
            circularnode<E> New = new circularnode<E>(fe, tail.getnext());
            tail.setnext(New); 
            ++size;
        }
    }
    public void addlast(E le ) // method for adding element at last of list 
    {   //new node is made with elment and next referance passing
        if(isEmpty())
        {circularnode<E> New = new circularnode<E>(le,null);
         tail=New; //new node becomes tail 
         tail.setnext(New);
         
        }
        else 
        {
            circularnode<E> New = new circularnode<E>(le,tail.getnext());
            tail=New;
            
        }
        ++size;
    }
    public E removefirst()
    {
        if(!isEmpty())
        {   E temp ;
            temp = tail.getnext().getelement();
            tail.setnext(tail.getnext().getnext());
            --size;
            return temp;
        }
        else 
        {
           System.out.println("removing is not possible due to list is empty ");
           return null;
        }
    }

    public void rotate()
    {
        tail=tail.getnext();
    }

    
}
