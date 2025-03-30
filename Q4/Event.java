public class Event implements Priority {

    private String name;
    private int importance; // the importance of the event

    public Event(String name, int importance) {
        this.name = name;
        this.importance = importance;
    }

    @Override
    public int getPriority() {
        return importance;
    }

    public void print() {
        System.out.printf("\nEvent: %-12s Importance: %-3d", name, importance);
    }
}
