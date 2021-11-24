import java.io.FileReader;
import java.util.Scanner;
import java.util.Iterator;



public class Testpositionlist {  
    public static void display(linkedpositionallist<String> plist)
    {               Iterator<String> itr;
                    itr=plist.elements().iterator();
                    itr=plist.elements().iterator();    //making object of elmentitrator 
                    while(itr.hasNext())
                        {  
                            System.out.print(itr.next()+"\t");
                        }
                    System.out.print("\n");
    }
    public static void main(String[] args) throws IllegalAccessException {
        //making positional list object 
        linkedpositionallist<String> plist=new linkedpositionallist<String>();
        Iterator<String> itr;
        Iterator<position<String>> pitr;
       
        int n;
        String word;
        Scanner scan = new Scanner(System.in);
        System.out.println("Making list of names : ");
        do
        {   System.out.print("\n1.Add element at front of list  \n2.Add element at end of list \n3.remove element  \n4.display list \n5.size of list \n6.Add element at before position \n7.Add element at after  position \n8.set element ");

        System.out.print("\nwhich operation like to perform ? :");
        n=scan.nextInt();
        scan.nextLine();
        switch(n)
        {   case 1 :
            System.out.print("Before list : ");
            display(plist);
            System.out.print("\nEnter element :");
            word=scan.nextLine();
            plist.addfirst(word);//adding name at front of list 
            System.out.print("After  list : ");
            display(plist);
            break;
            case 2 :
                     System.out.print("Before list : ");
                    display(plist);
                    System.out.print("\nEnter element :");
                    word=scan.nextLine();
                    plist.addlast(word);
                    System.out.print("After  list : ");
                    display(plist);
                    
            break;
            case 3 :
                    System.out.print("Before list : ");
                    display(plist);
                    System.out.print("\nEnter the position of word in list  to remove : ");
                    n=scan.nextInt();
                    pitr=plist.positions().iterator(); //object to iterate position
                    for (int i =0;i<n-1;++i)
                    {
                        pitr.next();   //obtaining desired position by position iterator 
                    }
                    plist.remove(pitr.next());
                    
                    System.out.print("After  list : ");
                    display(plist);
            break;

            case 4 :
                    display(plist);

            case 5 :
                System.out.print(" list : ");
                display(plist);
                System.out.print("\nSize of list  : "+plist.size());
               
            break;
            case 6 :
                    System.out.print("\nnew element adding before which position ?");
                    n=scan.nextInt();
                    scan.nextLine();
                    System.out.print("Before list : ");
                    display(plist);
                    System.out.print("\nEnter element :");
                    word=scan.nextLine();
                    pitr=plist.positions().iterator(); //object to iterate position
                    for (int i =0;i<n-1;++i)
                        {
                            pitr.next();   //obtaining desired position by position iterator 
                        }

                    plist.addbefore(pitr.next(),word );
                    
                    System.out.print("After  list : ");
                    display(plist);
                    
            break;
            case 7 :
                    System.out.print("Before list : ");
                    display(plist);
                    System.out.print("\nEnter element :");
                    word=scan.nextLine();
                    System.out.print("\nnew element adding after  which position ?");
                    n=scan.nextInt();
                    
                    pitr=plist.positions().iterator(); //object to iterate position
                    for (int i =0;i<n-1;++i)
                        {
                            pitr.next();   //obtaining desired position by position iterator 
                        }

                    plist.addafter(pitr.next(), word );
                    
                    System.out.print("After  list : ");
                    display(plist);
                    
            break; 
            case 8 : 
                    System.out.print("Before list : ");
                    display(plist);
                    System.out.print("\nEnter element :");
                    word=scan.nextLine();
                    System.out.print("\nEnter position  which element be set  :");
                    n=scan.nextInt();
            
                    pitr=plist.positions().iterator(); //object to iterate position
                    for (int i =0;i<n-1;++i)
                        {
                                 pitr.next();   //obtaining desired position by position iterator 
                        }

                    plist.set(pitr.next(), word );
                    System.out.print("After  list : ");
                    display(plist);
               
        }          
        }while(n!=0);
        scan.close();
        
    }
    
}
