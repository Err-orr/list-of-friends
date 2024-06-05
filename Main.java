import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<String> friends = new ArrayList<>();
        ArrayList<String> bestFriends = new ArrayList<>();
        String name = "";
        int bestie = 0;
        System.out.println("Welcome! Please enter your friends' first name. Enter \"d\" when you're done.");
        while (!name.equals("d")) {
            name = scan.nextLine();
            if (name.equals("d")) {
                break;
            } else {
                friends.add(name);
            }
        }
        System.out.println("You have entered " + friends.size() + " friends.");
        System.out.println("Here is your list of friends:");
        for (int i = 0; i < friends.size(); i++) {
            System.out.println((i + 1) + ". " + friends.get(i));
        }
        System.out.println("The two friends that have been randomly chosen to go to the movies with you are ...");
        System.out.println(friends.get((int) (Math.random() * friends.size())));
        System.out.println(friends.get((int) (Math.random() * friends.size())));
        System.out.println("Which friends would you like to take off your friend list and add to your best friend list? (Indicate with the number next to each name. Type \"-1\" to end.)");
        while (bestie != -1) {
            bestie = scan.nextInt();
            if (bestie == -1) {
                break;
            } else {
                bestFriends.add(friends.get(bestie - 1));
            }
        }
        System.out.println("Here is your list of best friends:");
        for (int j = 0; j < bestFriends.size(); j++) {
            System.out.println((j + 1) + ". " + bestFriends.get(j));
        }
    }
}