/*
 * CS2050 - Computer Science II - Spring 2023
 * Instructor: Thyago Mota
 * Student(s): Caleb Thompson
 * Description: The Song class
 */

public class Song implements Comparable<Song> {

    private String title;
    private String artist;
    private int    rank;

    public static final int MIN_RANK   = 1;
    public static final int MAX_RANK   = 5;

    // TODOd #1: implement the constructor
    // if rank is invalid, set it to MIN_RANK
    public Song(String title, String artist, int rank) {
        this.title = title;
        this.artist = artist;
        if(rank >= MIN_RANK && rank <= MAX_RANK)
            this.rank = rank;
        else
            this.rank = MIN_RANK;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public int getRank() {
        return rank;
    }

    // TODOd #2: implement the compareTo override based on song titles (alphabetically)
    @Override
    public int compareTo(Song other) {
        if (title.compareTo(other.getTitle()) == 0)
            return 0;
        else if (title.compareTo(other.getTitle()) < 0)
            return -1;
        else
            return 1;
    }

    @Override
    public String toString() {
        return "[" + "'" + title + "','" + artist + "', rank=" + rank + "]";
    }
}
