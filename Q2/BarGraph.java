package Q2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
 *
 * This class simulates a horizontal bar graph using text characters ('*').
 * A bar graph consists of a list of HorizontalBar objects.
 * Each HorizontalBar object has a label, a date (integer month) and an integer length.
 *
 * A bar with label "Mar" and length 5 will output as follows "Mar |*****\n".
 *
 * Run BarGraphTester.java to see the expected output of a complete bar graph.
 */
public class BarGraph {

    ArrayList<HorizontalBar> barGraph;

    public BarGraph() {
        barGraph = new ArrayList<HorizontalBar>();
    }

    public void addBar(HorizontalBar bar) {
        // Add the HorizontalBar object bar to the barGraph

    }

    void printGraph() {
        // Print the horizontal bar graph

    }

    void sortBarsByLength() {
        // Sort the HorizontalBar objects in the barGraph by length (smallest to largest)
    }

    // Create a helper class LengthComparator that implements the Comparator interface
    // and compares two Horizontal Bar objects based on their length

    void sortBarsByDate() {
        // Sort the Horizontal Bar objects in the barGraph by date (i.e. month) (earliest to latest)
    }
    // Create a helper class DateComparator that implements the Comparator interface
    // and compares two Horizontal Bar objects based on their month

}
