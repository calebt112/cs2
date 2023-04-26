/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s):
 * Description: The PlayList class
 */

import java.io.*;
import java.util.*;

public class PlayList {

    public static final String FILE_NAME  = "playlist.csv";
    public static final int OPTION_PRINT  = 1;
    public static final int OPTION_ADD    = 2;
    public static final int OPTION_SEARCH = 3;
    public static final int OPTION_REMOVE = 4;
    public static final int OPTION_CLEAR  = 5;
    public static final int OPTION_QUIT   = 6;
    public static Scanner sc = new Scanner(System.in);

    private BST<Song> bst;

    public PlayList() throws FileNotFoundException {
        bst = new BST<>();
        loadSongs();
    }

    // TODOd #5: open the csv file for reading and parse all songs into the (already instantiated) BST object (you must use the bst instance variable)
    private void loadSongs() throws FileNotFoundException {
        try {
            Scanner in = new Scanner(new FileInputStream(FILE_NAME));
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String data[] = line.split(",");
                String title = data[0];
                String artist = data[1];
                int rank = Integer.parseInt(data[2]);
                Song song = new Song(title, artist, rank);
                bst.add(song);
            }
            in.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Error: file not found!");
        }
    }

    // TODO #6: open the csv file for writing and iterates over the bst object, writing its songs into the csv file
    public void saveSongs() throws FileNotFoundException {
        try {
            PrintWriter out = new PrintWriter(new FileOutputStream(FILE_NAME));
            out.println(bst);
            out.close();
        }
        catch (FileNotFoundException ex) {
            System.out.println("Error: file not found!");
        }
    }

    @Override
    public String toString() {
        return bst.toString();
    }

    // TODOd #7: read all info for a song to be added into the binary tree
    public void addSong() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Title? ");
        String title = sc.nextLine();
        System.out.print("Artist? ");
        String artist = sc.nextLine();
        System.out.print("Rank? ");
        int rank = Integer.parseInt(sc.nextLine());
        Song song = new Song(title, artist, rank);
        bst.add(song);
    }

    // TODO #8: clear the bst after a confirmation
    public void clear() {

    }

    // TODO #9: search for a song in the playlist by title
    public void searchSong() {

    }

    // TODO #10: remove a song given its title
    public void removeSong() {
        
    }

    public static int getOption() {
        while (true) {
            System.out.println("Options: 1:print 2:add 3:search 4:remove 5:clear 6:quit");
            System.out.print("? ");
            String line = sc.nextLine();
            try {
                int option = Integer.parseInt(line);
                if (option == OPTION_PRINT || option == OPTION_ADD || option == OPTION_SEARCH || option == OPTION_REMOVE || option == OPTION_CLEAR || option == OPTION_QUIT)
                    return option;
            }
            catch (NumberFormatException ex) {  }
            System.out.println("Error!");
        }
    }

    public static void main(String[] args) throws FileNotFoundException {
        System.out.println("Welcome to my playlist!");
        PlayList playList = new PlayList();
        boolean quit = false;
        while (!quit) {
            int option = getOption();
            switch (option) {
                case OPTION_PRINT:
                    System.out.println(playList);
                    break;
                case OPTION_ADD:
                    playList.addSong();
                    break;
                case OPTION_SEARCH:
                    playList.searchSong();
                    break;
                case OPTION_REMOVE:
                    playList.removeSong();
                    break;
                case OPTION_CLEAR:
                    playList.clear();
                    break;
                case OPTION_QUIT:
                    System.out.println("Saving playlist changes...");
                    playList.saveSongs();
                    System.out.println("Done!");
                    quit = true;
            }
        }
        System.out.println("Bye!");
    }
}
