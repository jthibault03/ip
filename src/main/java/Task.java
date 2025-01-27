
/**
 * Parent class of task types Deadline, Event, and Todo.
 */
public class Task {
    public String description;
    protected boolean isDone;

    public Task(String description) {
        this.description = description;
        this.isDone = false;
    }

    /**
     * Marks a "done" task with an "X".
     */
    public String getStatusIcon() {
        return (isDone ? "X" : " ");
    }

    public String toString() {
        return "[" + getStatusIcon() + "] " + getDescription();
    }

    public String getDescription() {
        return description;
    }

    public String type() {
        return "[T]";
    }

    public void markAsDone() {
        isDone = true;
    }

    public void markAsUndone() {
        isDone = false;
    }
}
