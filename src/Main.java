//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.*;

public class Main {

    static class contact {
        String fn;
        String ln;
        String adr;
        String city;
        String state;
        Long zip;
        long phone;
        String email;
    }
    public static void main(String[] args) {

        System.out.println("Hello and welcome!");
        Scanner sc=new Scanner(System.in);
        int op;
        String str;
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
                    System.out.print("Enter first name: ");
                    str=sc.next();
                    AddressBook.edit(str);
                    break;
                case 3:
                    System.out.print("Enter first name: ");
                    str=sc.next();
                    AddressBook.delete(str);
                    break;
                case 4:
                    System.out.print("Enter number of contacts to add: ");
                    int n=sc.nextInt();
                    ArrayList<contact> ls=new ArrayList<>();
                    for(int i=0;i<n;i++){
                        System.out.println("\nEnter details for contact "+(i+1)+":-");
                        Main.contact ct=new Main.contact();
                        System.out.print("Enter first name: ");
                        ct.fn=sc.next();
                        System.out.print("Enter last name: ");
                        ct.ln=sc.next();
                        System.out.print("Enter address: ");
                        ct.adr=sc.next();
                        System.out.print("Enter city: ");
                        ct.city=sc.next();
                        System.out.print("Enter state: ");
                        ct.state=sc.next();
                        System.out.print("Enter Zipcode: ");
                        ct.zip=sc.nextLong();
                        System.out.print("Enter phone number: ");
                        ct.phone=sc.nextLong();
                        System.out.print("Enter mail-id: ");
                        ct.email=sc.next();
                        ls.add(ct);
                    }
                    AddressBook.multiple_contacts(ls);
                    break;
                case 5:
                    System.out.println("Option5");
                    break;
                case 6:
                    System.out.print("Enter first name: ");
                    str=sc.next();
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