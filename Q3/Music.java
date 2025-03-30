package Q3;

public class Music {

    public static void main(String[] args) {
        MusicCollection collection = new MusicCollection();
        String[] titles = {
            "Album A",
            "Album A",
            "Best of Rock",
            "Classical Masterpieces",
            "Indie Vibes",
            "Rock Legends",
            "Synthwave Dreams",
        };
        String[] artists = {
            "Artist X",
            "Artist X",
            "Rock Band",
            "Composer Y",
            "Indie Artist",
            "Rock Star",
            "Synth Producer",
        };
        int[] genre = {
            MusicCollection.POP,
            MusicCollection.POP,
            MusicCollection.ROCK,
            5,
            MusicCollection.CLASSICAL,
            MusicCollection.ROCK,
            MusicCollection.POP,
        };
        int[] released = { 2020, 2020, 2015, 2008, 2023, 1998, 2022 };

        // Create MusicAlbum objects using the titles, artists, genre and released arrays above.
        // Add each MusicAlbum object to the MusicCollection called collection above.
        // Make sure you catch exceptions that could be thrown - see class MusicCollection for possible exceptions
        // If an exception is thrown, print the message in the Exception object and continue to add the next album

        // Prints the linked lists
        collection.print();

        System.out.println(
            "\nExpected:\n" +
            "Album A, Artist X already in collection\n" +
            "Unknown Genre: 5\n\n" +
            "Pop: [[Synthwave Dreams, Synth Producer, 2022], [Album A, Artist X, 2020]]\n" +
            "Rock: [[Rock Legends, Rock Star, 1998], [Best of Rock, Rock Band, 2015]]\n" +
            "Classical: [[Classical Masterpieces, Composer Y, 2008]]"
        );
    }
}
