/*
 * CS2050 - Computer Science II - Fall 2022
 * Instructor: Thyago Mota
 * Description: Homework 06 - Sorting Objects
 * Student name:
 */
import java.util.Arrays;
public class InstagramUser implements Comparable<InstagramUser> {

    private String username;
    private int followers;

    public InstagramUser(String username, int followers) throws InstantiationException {
        this.username = username;
        if (followers < 0) throw new InstantiationException("#followers cannot be negative!");
        this.followers = followers;
    }

    // TODOd #1: override compareTo such that more popular users (higher number of followers) appear before less popular users
    @Override
    public int compareTo(InstagramUser other) {
        if (this.followers > other.followers)
            return -1;
        else if (this.followers < other.followers)
            return 1;
        else
            return 0;
    }

    @Override
    public String toString() {
        return "InstagramUser{" +
                "username='" + username + '\'' +
                ", followers=" + followers +
                '}';
    }

    // TODOd #2: adapt partition so it would work with any Comparable array
    // hint: change the type of data from int to Comparable
    private static int partition(Comparable data[], int start, int end) {
        int pivot = end;
        int partition = start;
        int current = start;
        while (current < pivot) {
            // hint: change the if expression
            if (data[current].compareTo(data[pivot]) < 0) {
                Comparable temp = data[partition];
                data[partition] = data[current];
                data[current] = temp;
                partition++;
            }
            current++;
        }
        Comparable temp = data[pivot];
        data[pivot] = data[partition];
        data[partition] = temp;
        return partition;
    }

    // TODOd #3: adapt the quick sort algorithm so it would work with any Comparable array
    // hint: change the type of data from int to Comparable
    public static void quickSort(Comparable data[], int start, int end) {
        if (start < end) {
            int partition = partition(data, start, end);
            quickSort(data, start, partition - 1);
            quickSort(data, partition + 1, end);
        }
    }

    public static void main(String[] args) throws InstantiationException {
        // TODOd #4: create a static array of 5 Instagram accounts
        InstagramUser[] instaUsers = {
                new InstagramUser("user1", 500),
                new InstagramUser("user2", 10000),
                new InstagramUser("user3", 22000),
                new InstagramUser("user4", 80),
                new InstagramUser("user5", 6000)
        };

        // TODOd #5: sort the accounts from most popular to least popular using quick sort and then display the accounts
        quickSort(instaUsers, 0, instaUsers.length - 1);
        System.out.println(Arrays.toString(instaUsers));
    }
}



