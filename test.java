import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int n,fE,lE; //variable for accepting first and last element form user for addfirst and addlast ///method .
        cicularlist<Integer> clist = new cicularlist<Integer>();//making object 
        Scanner scan = new Scanner(System.in);//acept input chose
        do{
        System.out.print("\nEnter 1 for size \nEnter 2 for check list is empty \nEnter 3 for first element \nEnter 4 for last element \nEnter 5 for add  element at front \nEnter 6 for adding element at end \nEnter 7 for remove first element from list \nEnter 0 for exit   ");
        System.out.print("\nEnter approprivate option : ");
        n=scan.nextInt();
        switch(n)
        {
            case 1 : 
            System.out.print("\nSize of list  :  "+clist.size);
            break;
            case 2 : 
            if(clist.isEmpty())
            System.out.print("\nList is empty ");
            else 
            System.out.print("\nList is not empty ");
            break;
            case 3 : 
            if(!clist.isEmpty())
            System.out.print("\nFirst element of list : "+ clist.first());
            else 
            System.out.print("\nnot possible due to List is empty ");
            break;
            case 4 :
            if(!clist.isEmpty())
            System.out.print("\nlast element of list : "+ clist.last());
            else 
            System.out.print("\nnot possible due to List is empty ");
            break;
            case 5 : 
            System.out.print("\nEnter element : ");
            fE=scan.nextInt();
            clist.addfirst(fE);
            break;
            case  6 : 
            System.out.print("\nEnter element : ");
            lE=scan.nextInt();
            clist.addlast(lE);
            break;
            case  7 :
            if(!clist.isEmpty())
            {   System.out.print("\nFirst element "+clist.removefirst()+" is removd sucessfully");
            }
            else 
            System.out.print("\nremoving element is not possible due to list is empty"); 
            break;

        }
    }while(n!=0);
    scan.close();
    
    }
    }
    

