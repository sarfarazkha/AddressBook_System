package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("*************************Address Book*****************************");
        Scanner sc = new Scanner(System.in);

        AddressBook obj = new AddressBook();

        while (true) {
            System.out.println("Enter \n 1. Add  new AddressBook\n 2. Add contact in AddressBook\n "
                    + "3. edit the contact in AddressBook\n 4. delete the contact in AddressBook\n 5. delete the AddressBook\n "
                    + "6. Print the AddressBook\n 7. Print the contacts in AddressBook\n 8. Search by City. \n 9. Search by State \n 0. To exit");
            Scanner scanner = new Scanner(System.in);
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    obj.addAddressBook();
                    break;
                case 2:
                    obj.addContact();
                    break;
                case 3:
                    obj.editContactInBook();
                    break;
                case 4:
                    obj.deleteContactInBook();
                    break;
                case 5:
                    obj.deleteAddressBook();
                    break;
                case 6:
                    obj.printBook();
                    break;
                case 7:
                    obj.printContactsInBook();
                    break;
                case 8:
                    obj.searchByCity();
                    ;
                    break;
                case 9:
                    obj.searchByState();
                    break;
                case 0:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter the wrong input");
            }
        }
    }
}