
public class doublelist<E> {
  public  int size;
  public doublenode<E> headier;
  public doublenode<E> tailer;
  //constructor for creatig headier and tailer and linking each other 
  public doublelist(){
   headier = new doublenode<E>(null,null,null);
   tailer = new doublenode<E>(null,headier ,null);
   tailer.setprevious(headier);
  } 
    public int size()                                 //gives number elements 
    { return size;}
   
    public boolean isEmpty()               //return true if no element otherwise false
    { return size==0;}                                    
    
    public E first()                                   //return first element   
    { if(!isEmpty())                                  
        return headier.getnext().getelement();          //returning element if list not empty
      else
      { System.out.println("list is empty nothing to remove");   
        return null;
      }
    } 
    
    public E last()                                                 //return last element 
    {
        if(!isEmpty())
        return tailer.getprevious().getelement();                   //return element if list is not empty
        else
        {  System.out.println("list is empty nothing to remove");   
           return null;
        }
    }
   
    public E removerfirst()         //remove first element 
    {   if(!isEmpty())                //remove if list is not empty
        { E removedelement;                    
          removedelement=headier.getnext().getelement();      //storing removing element
          headier.setnext(headier.getnext().getnext());    //linking 2nd node in headier next reference
          headier.getnext().setprevious(headier);        //linking headeir to prev of old 2nd node 
          --size;
          return removedelement;
        }
        else                           //return null if list is empty
        {
            System.out.print("\nList is empty nothing to remove ");
            return null;
        }
    }
    public E removlast()
    {   if(!isEmpty())
        { E removeelement;
          removeelement=tailer.getprevious().getelement();
          tailer.getprevious().getprevious().setnext(tailer);
          tailer.setprevious(tailer.getprevious().getprevious());
          --size;
         return removeelement;
        }
        else                           //return null if list is empty
        {
            System.out.print("\nList is empty nothing to remove ");
            return null;
        }
            

    }

    public void addbetween(E e,doublenode<E> pre,doublenode<E> suc)
    {
        doublenode<E> Newnode = new doublenode<E>(e, pre, suc);
        pre.setnext(Newnode);
        suc.setprevious(Newnode);
    }
  public void addfirst(E e )
  {   if(isEmpty())
      addbetween(e,headier, tailer);
      else
      addbetween(e, headier, headier.getnext());
      ++size;
  }
  public void addlast(E e )
  {   if(isEmpty())
      addbetween(e, headier, tailer);
      else 
      addbetween(e,tailer.getprevious(),tailer);
      ++size;
  }
  /*   
    public void addfirst(E e)       //add element at the front of list           
    {    
        if(isEmpty())                 
        {   //making new node with previous and next referance  
            doublenode<E> Newnode= new doublenode<E>(e,headier, tailer);
             headier.setnext(Newnode);
             tailer.setprevious(Newnode);
             ++size;

        }
        else
        { //making new node with previous and next referance 
          doublenode<E> Newnode= new doublenode<E>(e,headier, headier.getnext());    
          headier.getnext().setprevious(Newnode);   //linking newnode to previous of old 1st node 
          headier.setnext(Newnode);  //linking newnode next to headier
          ++size;
        }
    }   
    
    public void addlast(E e)    //add element at end of list
    {   if(isEmpty())
        { 
          doublenode<E> Newnode = new doublenode<E>(e, headier, tailer);
          headier.setnext(Newnode);
          tailer.setprevious(Newnode);
        }
        else{
         //making new node with previous and next referance 
         doublenode<E> Newnode = new doublenode<E>(e, tailer.getprevious(), tailer);
         tailer.getprevious().setnext(Newnode);  //linking newnode to next of old last node
         tailer.setprevious(Newnode);    //linking newnode privous of tailer
        }
    }
*/ 

}
