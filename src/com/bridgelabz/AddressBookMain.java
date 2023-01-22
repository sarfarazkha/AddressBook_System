package com.bridgelabz;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to address book program");

        AddressBook a1 = new AddressBook();
        a1.addnewContact();

        a1.addnewContact();
        System.out.println(a1.list);

        a1.editContact();

        a1.deleteContact();
    }
}