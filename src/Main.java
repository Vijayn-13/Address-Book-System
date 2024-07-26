//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Scanner sc=new Scanner(System.in);
        int op;
        do {
            System.out.println("\nMenu Driven Program:- ");
            System.out.println("1. Add new contact");
            System.out.println("2. Edit contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Add multiple contacts");
            System.out.println("5. Refactor multiple contacts");
            System.out.println("6. Display details");
            System.out.println("7. Exit");
            System.out.print("Select any option: ");
            op=sc.nextInt();
            switch(op){
                case 1:
                    AddressBook ad=new AddressBook();
                    //String first,String last,String address,String city,String state,Long zip,long phone,String email
                    System.out.print("Enter first name: ");
                    String a=sc.next();
                    System.out.print("Enter last name: ");
                    String b=sc.next();
                    System.out.print("Enter address: ");
                    String c=sc.next();
                    System.out.print("Enter city: ");
                    String d=sc.next();
                    System.out.print("Enter state: ");
                    String e=sc.next();
                    System.out.print("Enter Zipcode: ");
                    long f=sc.nextLong();
                    System.out.print("Enter phone number: ");
                    long g=sc.nextLong();
                    System.out.print("Enter mail-id: ");
                    String h=sc.next();
                    ad.add(a,b,c,d,e,f,g,h);
                    break;
                case 2:
                    System.out.println("Option2");
                    break;
                case 3:
                    System.out.println("Option3");
                    break;
                case 4:
                    System.out.println("Option4");
                    break;
                case 5:
                    System.out.println("Option5");
                    break;
                case 6:
                    System.out.print("Enter first name: ");
                    String str=sc.next();
                    AddressBook.find(str);
                    break;
                case 7:
                    System.out.println(">>>Program closed by the user");
                    break;
                default:
                    System.out.println(">>>Select valid option");
            }
        }while(op!=7);
    }
}