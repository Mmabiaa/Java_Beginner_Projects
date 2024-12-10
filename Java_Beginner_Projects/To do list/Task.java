import java.io.*;

// Task class representing a single task
public class Task implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String description;
    private boolean completed;

    public  Task(int id, String description){
        this.id = id;
        this.description = description;
        this.completed = false;
    }

    public int getID(){
        return id;
    }

    public String getDescription(){
        return description;
    }

    public boolean isCompleted(){
        return completed;
    }

    public void toggleCompletion(){
        this.completed = !this.completed;
    }

    @Override
    public String toString(){
        return "[" + (completed ? "X" : " ") + "] " + description;
    }
}
