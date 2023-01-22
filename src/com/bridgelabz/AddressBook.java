package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBook {

    static Scanner sc = new Scanner(System.in);
    AddressBook a1 = new AddressBook();
    ArrayList<Contacts> list = new ArrayList<>();

    public void addnewContact(){
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

        Contacts cList = new Contacts(firstName, lastName, address, zip, city,state,phone,email);

        list.add(cList);
    }
    public void editContact(){
        System.out.println("Enter name whose details you want to edit");
        String name = AddressBook.sc.nextLine();
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
    public  void deleteContact(){
        System.out.println("Delete a contact using name " );
        String name = AddressBook.sc.nextLine();
        name = AddressBook.sc.nextLine();

        int count=0;

        for(Contacts x : a1.list){
            if(x.getFirstName().equals(name)){
                a1.list.remove(count);
                break;
            }
            count++;
        }
        System.out.println(a1.list);

    }
}
