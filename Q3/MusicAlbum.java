package Q3;

class MusicAlbum implements Comparable<MusicAlbum> {

    private String artist;
    private String title;
    private int year;

    public MusicAlbum(String title, String artist, int year) {
        this.title = title;
        this.artist = artist;
        this.year = year;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int compareTo(MusicAlbum other) {
        return this.year - other.year;
    }

    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        MusicAlbum otherAlbum = (MusicAlbum) other;
        return (
            year == otherAlbum.year &&
            title.equals(otherAlbum.title) &&
            artist.equals(otherAlbum.artist)
        );
    }

    @Override
    public String toString() {
        return "[" + title + ", " + artist + ", " + year + "]";
    }
}
