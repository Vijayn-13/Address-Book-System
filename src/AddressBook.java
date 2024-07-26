import java.util.ArrayList;

public class AddressBook {
    /*first and last names, address,
    city, state, zip, phone number and
    email…*/
    String firstname,lastname,address,city,state,email;
    long zip,phone_number;
    static ArrayList<AddressBook> adb=new ArrayList<>();
    AddressBook(){
        System.out.println("Hello");
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
        System.out.println("New contact added!");
        adb.add(this);
    }
    static void find(String name){
        int a=0;
        for(AddressBook ad:adb){
            if(ad.firstname.equals(name)){
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
            System.out.println("Contact not found");
        }
    }
}
