public class TeamManagerMapTester {

    public static void main(String[] args) {
        TeamManagerMap map = new TeamManagerMap();

        // Example team leaders and employees
        String[] leaders = {
            "TeamA",
            "TeamB",
            "TeamC",
            "TeamA",
            "TeamB",
            "TeamC",
        };
        String[] employees = {
            "Alice",
            "Bob",
            "Charlie",
            "Dave",
            "Eve",
            "Frank",
        };

        for (int i = 0; i < leaders.length; i++) {
            map.add(leaders[i], employees[i]);
        }

        map.printTeamMembers();
        // Expected output:
        // TeamA: 2 - Alice, Dave
        // TeamB: 2 - Bob, Eve
        // TeamC: 2 - Charlie, Frank
    }
}
