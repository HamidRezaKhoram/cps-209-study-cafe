public class Task implements Priority {

    private String name;
    private int urgency; // the urgency of the task

    public Task(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }

    @Override
    public int getPriority() {
        return urgency;
    }

    public void print() {
        System.out.printf("\nTask: %-12s Urgency: %-3d", name, urgency);
    }
}
