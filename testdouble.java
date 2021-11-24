import java.util.Scanner;

public class testdouble {
     public static void main(String[] args) {
         
       
     int n,fE,lE; //variable for accepting first and last element form user for addfirst and addlast ///method .
        Scanner scan =new Scanner(System.in);
        doublelist<Integer> dlist = new doublelist<Integer>();//making object 
        //acept input chose
        do{
        System.out.print("\nEnter 1 for size \nEnter 2 for check list is empty \nEnter 3 for first element \nEnter 4 for last element \nEnter 5 for add  element at front \nEnter 6 for adding element at end \nEnter 7 for remove first element from list \nEntr8 for remove last element from list  \nEnter 0 for exit   ");
         System.out.print("\nEnter approprivate option : ");
        n=scan.nextInt();
        switch(n)
        {
            case 1 : 
            System.out.print("\nSize of list  :  "+dlist.size);
            break;
            case 2 : 
            if(dlist.isEmpty())
            System.out.print("\nList is empty ");
            else 
            System.out.print("\nList is not empty ");
            break;
            case 3 : 
            if(!dlist.isEmpty())
            System.out.print("\nFirst element of list : "+ dlist.first());
            else 
            System.out.print("\nNo element in list ");
            break;
            case 4 :
            if(!dlist.isEmpty())
            System.out.print("\nlast element of list : "+ dlist.last());
            else 
            System.out.print("\nNO element in list ");
            break;
            case 5 : 
            System.out.print("\nEnter element : ");
            fE=scan.nextInt();
            dlist.addfirst(fE);
            System.out.print(fE+" is added succesully");
            break;
            case  6 : 
            System.out.print("\nEnter element : ");
            lE=scan.nextInt();
            dlist.addlast(lE);
            System.out.print(lE+" is added succesully");
            break;
            case  7 :
            if(!dlist.isEmpty())
            {   System.out.print("\nFirst element "+dlist.removerfirst()+" is removd sucessfully");
            }
            else 
            System.out.print("\nremoving element is not possible due to list is empty"); 
            break;
            case 8 :
            if(!dlist.isEmpty())
            {   System.out.print("\nFirst element "+dlist.removlast()+" is removd sucessfully");
            }
            else 
            System.out.print("\nremoving element is not possible due to list is empty"); 
            break;


        }
    }while(n!=0);
    scan.close();
    
    
}
}