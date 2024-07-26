import java.util.*;
public class AddressBook {
    static Scanner sc=new Scanner(System.in);
    String firstname;
    String lastname;
    String address;
    String city;
    String state;
    String email;
    long zip,phone_number;
    AddressBook(){
        //Constructor
    }
    static ArrayList<AddressBook> adb;
    static Map<String,ArrayList<AddressBook>> adb_owners=new HashMap<>();
    AddressBook(String name) {
        if(!adb_owners.containsKey(name)) {
            adb=new ArrayList<>();
            adb_owners.put(name,adb);
            System.out.println(">>>Addressbook created");
        }
        else{
            adb=adb_owners.get(name);
            System.out.println(">>>Addressbook switched to "+name);
        }
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
    static void display(String name){
        int a=0;
        for(Map.Entry<String,ArrayList<AddressBook>> mp:adb_owners.entrySet()){
            if(mp.getKey().equals(name)){
                a=1;
                if(mp.getValue().isEmpty()){
                    System.out.println(">>>No contact added in this addressbook");
                    break;
                }
                for(AddressBook adr:mp.getValue()){
                    System.out.println("Details:-");
                    System.out.println("Firstname: "+adr.firstname);
                    System.out.println("Lastname: "+adr.lastname);
                    System.out.println("Address: "+adr.address);
                    System.out.println("City: "+adr.city);
                    System.out.println("State: "+adr.state);
                    System.out.println("Zipcode: "+adr.zip);
                    System.out.println("Phone number: "+adr.phone_number);
                    System.out.println("Mail Id: "+adr.email);
                }
                break;
            }
        }
        if(a==0){
            System.out.println(">>>AddressBook not found");
        }
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
                            System.out.println(">>>Contact updated!");
                            System.out.println(">>>To view updated details, Select option 6");
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
    static void delete(String firstname){
        int a=0;
        for(AddressBook ad:adb){
            if(ad.firstname.equals(firstname)){
                a=1;
                adb.remove(ad);
                System.out.println(">>>Contact deleted");
                break;
            }
        }
        if(a==0){
            System.out.println(">>>Contact not found");
        }
    }
    static void multiple_contacts(ArrayList<Main.contact> ls){
        List<AddressBook> lsd=new ArrayList<>();
        for(Main.contact arr:ls){
            AddressBook ad=new AddressBook();
            ad.firstname=arr.fn;
            ad.lastname=arr.ln;
            ad.address=arr.adr;
            ad.city=arr.city;
            ad.state=arr.state;
            ad.zip=arr.zip;
            ad.phone_number=arr.phone;
            ad.email=arr.email;
            lsd.add(ad);
        }
        adb.addAll(lsd);
        System.out.println(">>>Multiple contacts added successfully!");
    }
}
