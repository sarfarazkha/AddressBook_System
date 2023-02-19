package com.bridgelabz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class AddressBook {

    Contacts person = new Contacts();
    List<Contacts> contactDetailsList = new ArrayList<>();

    public void addContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of contacts you want to enter");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {

            System.out.println("Enter the first name of person");
            String fName = scanner.next();

            if (fName.equals(person.getFirstName())) {
                System.out.println("The entered person is already exist. Enter new name");
            } else {
                System.out.println("Enter the contact details of person ");

                writeContact();
                System.out.println("contact added Successfully");
            }
        }
    }


    public void writeContact() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First Name : ");
        String firstName = scanner.next();
        System.out.println("Enter Last Name : ");
        String lastName = scanner.next();
        System.out.println("Enter Address : ");
        String address = scanner.next();
        System.out.println("Enter City : ");
        String city = scanner.next();
        System.out.println("Enter State : ");
        String state = scanner.next();
        System.out.println("Enter ZipCode : ");
        int zipCode = scanner.nextInt();
        System.out.println("Enter Mobile Number : ");
        long mobileNumber = scanner.nextLong();
        System.out.println("Enter EmailId : ");
        String emailId = scanner.next();

        person = new Contacts(firstName, lastName, address, zipCode, state, city, mobileNumber, emailId);
        contactDetailsList.add(person);
    }

    public void searchByName(String name) {

        List<Contacts> collect = contactDetailsList.stream().filter(p -> p.getFirstName().equalsIgnoreCase(name))
                .collect(Collectors.toList());

        for (Contacts contact : collect) {
            System.out.println("Search result: " + contact);
        }
    }

    public void searchByCity(String city) {
        List<Contacts> collect = contactDetailsList.stream().filter(p -> p.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
        for (Contacts contact : collect) {
            System.out.println("Search result: " + contact);
        }
    }

    public void searchByState(String state) {
        List<Contacts> collect = contactDetailsList.stream().filter(p -> p.getCity().equalsIgnoreCase(state))
                .collect(Collectors.toList());
        for (Contacts contact : collect) {
            System.out.println("Search result: " + contact);
        }
    }

    public void countContactsByUsingCity(String cityName) {
        long count = 0;
        long count1 = contactDetailsList.stream().filter(g -> g.getCity().equalsIgnoreCase(cityName)).count();
        for (Contacts contact : contactDetailsList) {
            count1 = count1 + count;
        }
        System.out.println("Contact List :" + count1);

    }

    public void sortByName() {
        List<Contacts> list = contactDetailsList.stream().collect(Collectors.toList());
        list.stream().sorted((g1, g2) -> ((String) g1.getFirstName()).compareTo(g2.getFirstName()))
                .forEach(contact -> System.out.println(contact.getFirstName() + " " + contact.getLastName()));
    }

    public void editContact() {
        System.out.println("Enter firstname of contact you want edit");
        Scanner scanner = new Scanner(System.in);
        String editName = scanner.next();
        for (int i = 0; i < contactDetailsList.size(); i++) {
            String name = contactDetailsList.get(i).getFirstName();
            if (name.equalsIgnoreCase(editName)) {
                System.out.println("Enter name is exit. you can edit the details");
                while (true) {
                    System.out.println(
                            "Enter\n 1. To edit all details\n 2. To edit certain detail\n 3. for previous menu");
                    int choose = scanner.nextInt();
                    switch (choose) {
                        case 1:
                            contactDetailsList.remove(i);
                            writeContact();
                            break;
                        case 2:
                            while (true) {
                                System.out.println(
                                        "Enter\n 1. for First Name\n 2. for Last Name\n 3. for City\n 4. for State\n"
                                                + " 5. for Zip Code\n 6. for Phone\n 7. forEmail\n 8. for previous menu");
                                int option = scanner.nextInt();
                                switch (option) {
                                    case 1:
                                        System.out.println("Enter new First Name");
                                        String newFirstName = scanner.next();
                                        contactDetailsList.get(i).setFirstName(newFirstName);
                                        break;
                                    case 2:
                                        System.out.println("Enter new Last Name");
                                        String newLastName = scanner.next();
                                        contactDetailsList.get(i).setLastName(newLastName);
                                        break;
                                    case 3:
                                        System.out.println("Enter new City");
                                        String newCity = scanner.next();
                                        contactDetailsList.get(i).setCity(newCity);
                                        break;
                                    case 4:
                                        System.out.println("Enter new State");
                                        String newState = scanner.next();
                                        contactDetailsList.get(i).setState(newState);
                                        break;
                                    case 5:
                                        System.out.println("Enter new ZipCode");
                                        int newZip = scanner.nextInt();
                                        contactDetailsList.get(i).setZip(newZip);
                                        break;
                                    case 6:
                                        System.out.println("Enter new Phone Number");
                                        int newPNumber = scanner.nextInt();
                                        contactDetailsList.get(i).setPhone(newPNumber);
                                        break;
                                    case 7:
                                        System.out.println("Enter new Email");
                                        String newEmail = scanner.next();
                                        contactDetailsList.get(i).setEmail(newEmail);
                                        break;
                                    case 8:
                                        return;
                                    default:
                                        System.out.println("Entered choice is incorrect!.. please enter correct choice");
                                }
                            }
                        case 3:
                            return;
                        default:
                            System.out.println("Entered choice is incorrect!.. please enter correct choice");
                    }
                }
            } else {
                System.out.println("enter name not exist");
            }
        }
    }

    public void deleteContact() {
        System.out.println("Enter the first name of contact you want to delete");
        Scanner scanner = new Scanner(System.in);
        String deleteName = scanner.next();
        for (int i = 0; i < contactDetailsList.size(); i++) {
            if (deleteName.equalsIgnoreCase(contactDetailsList.get(i).getFirstName())) {
                contactDetailsList.remove(i);
                System.out.println("contact delete successfully");
            } else {
                System.out.println("enter name dose not exit");
            }
        }
    }

    public void viewByOptions() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter\n 1. By name\n 2. By city\n 3. By state\n 4. for previous menu");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Enter name: ");
                    String name = scanner.nextLine();
                    searchByName(name);
                    break;
                case 2:
                    System.out.println("Enter city: ");
                    String city = scanner.nextLine();
                    searchByCity(city);
                    break;
                case 3:
                    System.out.println("Enter state: ");
                    String state = scanner.nextLine();
                    searchByState(state);
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Entered choice is incorrect!.. please enter correct choice");
            }
        }
    }
}