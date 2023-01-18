package com.bridgelabz;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to address book program");

        AddressBook a1 = new AddressBook();
        a1.newContact();
        a1.newContact();

        System.out.println(a1.list);

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

        System.out.println(a1.list);
    }
}