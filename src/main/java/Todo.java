/**
 * Tasks of the Todo type.
 */
public class Todo extends Task{

    public Todo(String description) {
        super(description);
    }

    public String type() {
        return "[T]";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
