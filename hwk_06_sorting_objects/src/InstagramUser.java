]/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 06 - Sorting Objects
 * Student name:
 */

public class InstagramUser implements Comparable<InstagramUser> {

    private String username;
    private int    followers;

    public InstagramUser(String username, int followers) throws InstantiationException {
        this.username = username;
        if (followers < 0) throw new InstantiationException("#followers cannot be negative!");
        this.followers = followers;
    }

    // TODO #1: override compareTo such that more popular users (higher number of followers) appear before less popular users
    @Override
    public int compareTo(InstagramUser other) {
        return 0;
    }

    @Override
    public String toString() {
        return "InstagramUser{" +
                "username='" + username + '\'' +
                ", followers=" + followers +
                '}';
    }

    // TODO #2: adapt partition so it would work with any Comparable array
    // hint: change the type of data from int to Comparable
    private static int partition(int data[], int start, int end) {
        int pivot = end;
        int partition = start;
        int current = start;
        while (current < pivot) {
            // hint: change the if expression
            if (data[current] < data[pivot]) {
                int temp = data[partition]; // hint: change the type of data from int to Comparable
                data[partition] = data[current];
                data[current] = temp;
                partition++;
            }
            current++;
        }
        int temp = data[pivot]; // change the type of data from int to Comparable
        data[pivot] = data[partition];
        data[partition] = temp;
        return partition;
    }

    // TODO #3: adapt the quick sort algorithm so it would work with any Comparable array
    // hint: change the type of data from int to Comparable
    public static void quickSort(int data[], int start, int end) {
        if (start < end) {
            int partition = partition(data, start, end);
            quickSort(data, start, partition - 1);
            quickSort(data, partition + 1, end);
        }
    }

    public static void main(String[] args) throws InstantiationException {
        // TODO #4: create a static array of 5 instagram accounts
        Comparable instaUsers[] = {
        };

        // TODO #5: sort the accounts from most popular to least popular using quick sort and then display the accounts

    }
}
