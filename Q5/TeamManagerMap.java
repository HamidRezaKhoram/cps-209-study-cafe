import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/*
 * This class contains a map that maps a team leader's name to a list of employee names.
 * Each leader can manage multiple employees.
 */
public class TeamManagerMap {

    // Declare a map called teams that maps a String representing a team leader's name
    // to an ArrayList of Strings (employees).

    public TeamManagerMap() {
        // Create an empty tree map and assign it to variable teams.
    }

    /*
     * Adds an employee to the team managed by the specified leader.
     */
    public void add(String leader, String employee) {
        // If the team does not exist for the given leader, create a new list and add the employee.
        // If the team already exists, add the employee to the existing list of employees.

    }

    /*
     * Prints the team members for each leader in the map.
     */
    public void printTeamMembers() {
        // Loop through the keys (team leaders) and for each leader, print their team size and list of employees.

    }
}
