import java.util.*;
public class AddressBook {
    static Scanner sc=new Scanner(System.in);
    String firstname,lastname,address,city,state,email;
    long zip,phone_number;
    static ArrayList<AddressBook> adb=new ArrayList<>();
    AddressBook(){
        System.out.println("Hello!!");
    }
    void add(String first,String last,String address,String city,String state,Long zip,long phone,String email){
        this.firstname=first;
        this.lastname=last;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phone_number=phone;
        this.email=email;
        System.out.println(">>>New contact added!");
        adb.add(this);
    }
    static void find(String firstname){
        int a=0;
        for(AddressBook ad:adb){
            if(ad.firstname.equals(firstname)){
                a=1;
                System.out.println("Details:-");
                System.out.println("Firstname: "+ad.firstname);
                System.out.println("Lastname: "+ad.lastname);
                System.out.println("Address: "+ad.address);
                System.out.println("City: "+ad.city);
                System.out.println("State: "+ad.state);
                System.out.println("Zipcode: "+ad.zip);
                System.out.println("Phone number: "+ad.phone_number);
                System.out.println("Mail Id: "+ad.email);
                break;
            }
        }
        if(a==0){
            System.out.println(">>>Contact not found");
        }
    }
    static void edit(String firstname){
        int a=0;
        for(AddressBook ad:adb){
            if(ad.firstname.equals(firstname)){
                a=1;
                int op;
                do{
                    System.out.println("\nEdit options:-");
                    System.out.println("1. Lastname");
                    System.out.println("2. Address");
                    System.out.println("3. City");
                    System.out.println("4. State");
                    System.out.println("5. Zipcode");
                    System.out.println("6. Phone number");
                    System.out.println("7. Mail-Id");
                    System.out.println("8. Exit");
                    System.out.print("Select option to edit: ");
                    op=sc.nextInt();
                    switch (op){
                        case 1:
                            System.out.print("Enter lastname: ");
                            ad.lastname=sc.next();
                            System.out.println("Lastname Updated!");
                            break;
                        case 2:
                            System.out.print("Enter address: ");
                            ad.address=sc.next();
                            System.out.println("Address Updated!");
                            break;
                        case 3:
                            System.out.print("Enter city: ");
                            ad.city=sc.next();
                            System.out.println("City Updated!");
                            break;
                        case 4:
                            System.out.print("Enter state: ");
                            ad.state=sc.next();
                            System.out.println("State Updated!");
                            break;
                        case 5:
                            System.out.print("Enter zipcode: ");
                            ad.zip=sc.nextLong();
                            System.out.println("Zipcode Updated!");
                            break;
                        case 6:
                            System.out.print("Enter phone number: ");
                            ad.phone_number=sc.nextLong();
                            System.out.println("Phone number Updated!");
                            break;
                        case 7:
                            System.out.print("Enter mail-id: ");
                            ad.email=sc.next();
                            System.out.println("E-mail Updated!");
                            break;
                        case 8:
                            System.out.println("Contact updated!");
                            break;
                        default:
                            System.out.println(">>>Select valid option to edit");
                    }
                }while(op!=8);
            }
        }
        if(a==0){
            System.out.println(">>>Contact not found");
        }
    }
}
