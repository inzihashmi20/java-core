package collections;

import java.util.HashSet;

/**
 * HashSetDemo
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();

        emails.add("inzihashmi@gmail.com");
        emails.add("paul@gmail.com");
        emails.add("petter@gmail.com");
        emails.add("paul@gmail.com");
        emails.add("inzihashmi@gmail.com");
        System.out.println("Check whether mails exist or not: ");
        System.out.println(emails.contains("paul@gmail.com"));
        System.out.println(emails.contains("petter@gmail.com"));

        System.out.println();
        System.out.println("Removing paul@gmail.com");
        System.out.println("Removed: " + emails.remove("paul@gmail.com"));
        System.out.println(emails);

        System.out.println();
        System.out.println("Total Emails : " + emails.size());

        System.out.println(emails);

        System.out.println("Duplicate Demonstration");

        System.out.println(emails.add("paul@gmail.com"));
        System.out.println(emails.add("paul@gmail.com"));

        System.out.println("Adding new unique emails:");
        System.out.println(emails.add("Camron@gmail.com"));
        System.out.println(emails.add("paully@gmail.com"));
        System.out.println(emails.add("steve@gmail.com"));
        System.out.println(emails.add("josh@gmail.com"));
        System.out.println(emails.add("Jonny@gmail.com"));

        for (String email : emails) {
            System.out.println(email);
        }

        emails.clear();

        System.out.println("After clear():");
        System.out.println(emails);
        System.out.println("Size: " + emails.size());

    }

}