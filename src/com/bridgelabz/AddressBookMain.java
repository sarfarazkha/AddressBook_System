package com.bridgelabz;

public class AddressBookMain {

    public static void main(String[] args) {

        AddressBook obj = new AddressBook();
        obj.setFirstName("sarfaraz");
        obj.setLastName("khan");
        obj.setCity("nagpur");
        obj.setAddress("Hosa Yallapur Hosa Oni");
        obj.setEmail("abc@123");
        obj.setState("Maharashtra");
        obj.setZip(580001);
        obj.setPhone(9999999);
        System.out.println(obj.getFirstName());
        System.out.println(obj.getLastName());
        System.out.println(obj.getPhone());
        System.out.println(obj.getEmail());
        System.out.println(obj.getAddress());
        System.out.println(obj.getCity());
        System.out.println(obj.getState());
        System.out.println(obj.getZip());
    }
}
