package Q3;

import java.util.Collections;
import java.util.LinkedList;
import java.util.ListIterator;

public class MusicCollection {

    public static final int POP = 0;
    public static final int ROCK = 1;
    public static final int CLASSICAL = 2;

    LinkedList<MusicAlbum>[] albumLists;

    public MusicCollection() {
        albumLists = new LinkedList[3];
        // Create 3 LinkedList objects and assign each as an array element of albumLists

    }

    public void addAlbum(MusicAlbum album, int genre) {
        // Check to see if genre is 0, 1 or 2

        // Check to see if already in the linked list

        // Add album to the appropriate linked list

        // Sort the album list

    }

    public void print() {
        // Implement the print method

    }
}
