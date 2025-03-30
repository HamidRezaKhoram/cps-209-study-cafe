public class Main {

    public static void main(String[] args) {
        MyPriorityQueue pq = new MyPriorityQueue();

        // Test with Task objects
        pq.add(new Task("Complete Homework", 3));
        pq.add(new Task("Prepare Presentation", 5));
        pq.add(new Task("Attend Meeting", 2));
        pq.add(new Task("Check Emails", 1));

        System.out.println("Tasks in order of priority:");
        while (!pq.isEmpty()) {
            Task t = (Task) pq.remove();
            t.print();
        }

        // Test with Event objects
        pq.add(new Event("New Year Celebration", 8));
        pq.add(new Event("Emergency Meeting", 10));
        pq.add(new Event("Team Outing", 6));
        pq.add(new Event("Lunch Break", 4));

        System.out.println("\nEvents in order of priority:");
        while (!pq.isEmpty()) {
            Event e = (Event) pq.remove();
            e.print();
        }
    }
}
