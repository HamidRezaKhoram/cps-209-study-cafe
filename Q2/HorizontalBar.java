package Q2;

public class HorizontalBar {

    private String label;
    private int length;
    private int month;

    // Constructor to initialize label, length, and month
    public HorizontalBar(String label, int len, int month) {
        this.label = label;
        this.length = len;
        this.month = month;
    }

    // Getter for the label
    public String getLabel() {
        return label;
    }

    // Setter for the label
    public void setLabel(String label) {
        this.label = label;
    }

    // Getter for the length of the bar
    public int getLength() {
        return length;
    }

    // Setter for the length of the bar
    public void setLength(int length) {
        this.length = length;
    }

    // Getter for the month (date)
    public int getMonth() {
        return month;
    }

    // Setter for the month
    public void setMonth(int month) {
        this.month = month;
    }

    /*
     * Print a horizontal bar on a single line as a label followed by a " " followed
     * by "|" followed by a string containing a series of '*' characters that total
     * the length of this horizontal bar (see instance variable length above)
     */
    public void print() {
        // your code here
    }
}
