package baseline;

import java.util.Scanner;

public class Solution34 {
    public static void main(String[] args) {
        //Sometimes you have to locate and remove an entry from a list based on some criteria.
        // You may have a deck of cards and need to discard one so it’s no longer in play,
        // or you may need to remove values from a list of valid inputs once they’ve been used.
        // Storing the values in an array makes this process easier.
        // Depending on your language,
        // you may find it safer and more efficient to create a new array instead of modifying the existing one.
        //Create a small program that contains a list of employee names.
        String[] employees = new String[]{"John Smith", "John Doe", "Jane Smith", "Jane Doe","Ronald McDonald"};
        String newList[] = new String[employees.length - 1];
        // Print out the list of names when the program runs the first time.
        System.out.printf("There are %d employees:%n", employees.length);
        for (int i = 0; i < employees.length; i++){
            System.out.printf("%s%n", employees[i]);
        }

        // Prompt for an employee name and remove that specific name from the list of names.
        System.out.printf("%nEnter an employee name to remove: ");
            Scanner input = new Scanner(System.in);
            String empName = input.nextLine();
            for (int i = 0, j = 0; i < employees.length; i++){
                if (!empName.equals(employees[i])){
                    newList[j] = employees[i];
                    j++;
                }
            }
        // Display the remaining employees, each on its own line.
        System.out.printf("%nThere are %d employees:%n", newList.length);
        for (int i = 0; i < newList.length; i++) {
            System.out.printf("%s%n", newList[i]);
        }
    }
}
