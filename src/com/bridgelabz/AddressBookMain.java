package com.bridgelabz;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("**********Phone Book**********");
        Scanner sc = new Scanner(System.in);
        AddServices add = new AddServices(); // created objects

        AddressBook multi = new AddressBook();

        while (true) {
            System.out.println("Enter to avail services: ");
            System.out.println(
                    "1: To add contact \n2: To edit existing contact \n3: To delete contact "
                            + "\n4: To display contact list \n5: find contacts "
                            + " \n6: Add Multiple Address Book \n7: Add Contact to multi Address Book \n8: display Multiple Address book "
                            + "\n9: find by city\n0: To Exit");

            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    add.numberOfTimes();
                    break;
                case 2:
                    add.edit();
                    break;
                case 3:
                    add.delete();
                    break;
                case 4:
                    add.display();
                    break;
                case 5:
                    add.findContact();
                    break;
                case 6:
                    multi.AddMultipleAddressBook();
                    break;
                case 7:
                    multi.addingContacts();
                    break;
                case 8:
                    multi.printaddressBook();
                    break;
                case 9:
                    add.findbyCity();
                case 0:
                    sc.close();
                    return;
            }
        }

    }
}