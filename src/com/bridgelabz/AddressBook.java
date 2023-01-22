package com.bridgelabz;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AddressBook {

    static Scanner sc = new Scanner(System.in);


    ArrayList<Contacts> list = new ArrayList<>();

    public void addnewContact() {
        System.out.println("Enter First Name");
        String firstName = sc.nextLine();

        System.out.println("Enter last Name");
        String lastName = sc.nextLine();

        System.out.println("Enter State");
        String state = sc.nextLine();

        System.out.println("Enter City");
        String city = sc.nextLine();

        System.out.println("Enter Address");
        String address = sc.nextLine();

        System.out.println("Enter phone number");
        long phone = sc.nextLong();

        System.out.println("Enter email");
        String email = sc.nextLine();

        System.out.println("Enter zip");
        int zip = sc.nextInt();

        Contacts cList = new Contacts(firstName, lastName, address, zip, city, state, phone, email);

        list.add(cList);
    }

    public void editContact() {
        System.out.println("if you want to edit person details, y/n : ");
        String name = "";

        if (AddressBook.sc.nextLine().equals("y")) {
            System.out.println("Enter name whose details you want to edit");
            AddressBook a1 = new AddressBook();
            for (Contacts x : a1.list) {
                if (x.getFirstName().equals(name)) {
                    System.out.println("Enter which details you want to edit eg. firstName, lastName etc ");
                    String check = AddressBook.sc.nextLine();
                    switch (check) {
                        case "firstName":
                            System.out.println("Rename first Name to  ");
                            x.setFirstName(AddressBook.sc.nextLine());
                            break;
                        case "lastName":
                            System.out.println("Rename last Name to  ");
                            x.setLastName(AddressBook.sc.nextLine());
                            break;
                        case "address":
                            System.out.println("Rename address to  ");
                            x.setAddress(AddressBook.sc.nextLine());
                            break;
                        case "city":
                            System.out.println("Rename city to  ");
                            x.setCity(AddressBook.sc.nextLine());
                            break;
                        case "zip":
                            System.out.println("Rename zip to  ");
                            x.setZip(AddressBook.sc.nextInt());
                            break;
                        case "phone":
                            System.out.println("Rename phone to  ");
                            x.setPhone(AddressBook.sc.nextLong());
                            break;
                        case "email":
                            System.out.println("Rename email to  ");
                            x.setEmail(AddressBook.sc.nextLine());
                            break;
                        case "state":
                            System.out.println("Rename state to  ");
                            x.setState(AddressBook.sc.nextLine());
                            break;
                        default:
                            System.out.println("invalid entry");
                    }
                }
            }
        }
    }

    public void deleteContact() {
        AddressBook a1 = new AddressBook();
        System.out.println("do you want to delete a person details, y/n : ");
        if (AddressBook.sc.nextLine().equals("y")) {
            System.out.println("Delete a contact using name ");
            String name;
            name = AddressBook.sc.nextLine();

            int count = 0;

            for (Contacts x : a1.list) {
                if (x.getFirstName().equals(name)) {
                    a1.list.remove(count);
                    break;
                }
                count++;
            }
            System.out.println(a1.list);

        }
    }
    public void addMultipleAddressBook(){
        AddressBook a1 = new AddressBook();
        Map<Integer,AddressBook> dictonary = new HashMap<>();
        dictonary.put(1,a1);
        for(Map.Entry<Integer,AddressBook> x : dictonary.entrySet()){
            System.out.println(x.getKey()+" : "+x.getValue());
        }
    }
}
