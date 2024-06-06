import java.io.*;
import java.util.*;

class Person {
    String name;
    String address;
    String telephoneNumber;
    String mobileNumber;
    String headOfFamily;
    String uniqueId;

    public Person(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily, String uniqueId) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueId = uniqueId;
    }
}

public class Directory {
    Map<String, Person> directory = new HashMap<>();

    public void createEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name: ");
        String name = scanner.nextLine();
        System.out.println("Enter address: ");
        String address = scanner.nextLine();
        System.out.println("Enter telephone number (if available): ");
        String telephoneNumber = scanner.nextLine();
        System.out.println("Enter mobile number (if available): ");
        String mobileNumber = scanner.nextLine();
        System.out.println("Enter head of the family: ");
        String headOfFamily = scanner.nextLine();
        System.out.println("Enter unique ID: ");
        String uniqueId = scanner.nextLine();

        if (directory.containsKey(uniqueId)) {
            System.out.println("Unique ID already exists. Please enter a different ID.");
            createEntry();
        } else {
            Person person = new Person(name, address, telephoneNumber, mobileNumber, headOfFamily, uniqueId);
            directory.put(uniqueId, person);
            System.out.println("Entry created successfully.");
        }
    }

    public void editEntry() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the unique ID of the entry to edit: ");
        String uniqueId = scanner.nextLine();

        if (directory.containsKey(uniqueId)) {
            Person person = directory.get(uniqueId);
            System.out.println("Enter new name (or press Enter to keep the same): ");
            String name = scanner.nextLine();
            if (!name.isEmpty()) {
                person.name = name;
            }
            System.out.println("Enter new address (or press Enter to keep the same): ");
            String address = scanner.nextLine();
            if (!address.isEmpty()) {
                person.address = address;
            }
            System.out.println("Enter new telephone number (or press Enter to keep the same): ");
            String telephoneNumber = scanner.nextLine();
            if (!telephoneNumber.isEmpty()) {
                person.telephoneNumber = telephoneNumber;
            }
            System.out.println("Enter new mobile number (or press Enter to keep the same): ");
            String mobileNumber = scanner.nextLine();
            if (!mobileNumber.isEmpty()) {
                person.mobileNumber = mobileNumber;
            }
            System.out.println("Enter new head of the family (or press Enter to keep the same): ");
            String headOfFamily = scanner.nextLine();
            if (!headOfFamily.isEmpty()) {
                person.headOfFamily = headOfFamily;
            }
            System.out.println("Entry edited successfully.");
        } else {
            System.out.println("No entry found with the given unique ID.");
        }
    }

    public void searchByKeyword() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the keyword to search: ");
        String keyword = scanner.nextLine();

        for (Person person : directory.values()) {
            if (person.name.toLowerCase().contains(keyword.toLowerCase()) ||
                person.address.toLowerCase().contains(keyword.toLowerCase()) ||
                person.telephoneNumber.toLowerCase().contains(keyword.toLowerCase()) ||
                person.mobileNumber.toLowerCase().contains(keyword.toLowerCase()) ||
                person.headOfFamily.toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Name: " + person.name);
                System.out.println("Address: " + person.address);
                System.out.println("Telephone Number: " + person.telephoneNumber);
                System.out.println("Mobile Number: " + person.mobileNumber);
                System.out.println("Head of the Family: " + person.headOfFamily);
                System.out.println("Unique ID: " + person.uniqueId);
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Directory directory = new Directory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. Create an entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.println("Choose an option: ");
            int option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    directory.createEntry();
                    break;
                case 2:
                    directory.editEntry();
                    break;
                case 3:
                    directory.searchByKeyword();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please choose a valid option.");
            }
        }
    }
}