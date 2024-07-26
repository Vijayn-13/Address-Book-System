public class AddressBook {
    /*first and last names, address,
    city, state, zip, phone number and
    email…*/
    String firstname,lastname,address,city,state,email;
    long zip,phone_number;
    AddressBook(){
        System.out.println("Hello");
    }
    AddressBook(String first,String last,String address,String city,String state,Long zip,long phone,String email){
        this.firstname=first;
        this.lastname=last;
        this.address=address;
        this.city=city;
        this.state=state;
        this.zip=zip;
        this.phone_number=phone;
        this.email=email;
    }
}
