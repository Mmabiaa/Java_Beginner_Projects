import java.io.*;
import java.util.*;
public class TaskManager {
    private List<Task> tasks = new ArrayList<>();
    private int nextId = 1;

    // Load tasks from file
    public void loadTasks(String filename){
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))){
            tasks = (List<Task>)ois.readObject();
            nextId = tasks.size() + 1;
        }catch(FileNotFoundException e){
            System.out.println("No previous task found, starting afresh.");
        }catch (IOException e){
            e.printStackTrace();
        }catch(Exception e){System.out.println("Unexpected Error Occured");}
    }

    // Method to Save Tasks
    public void saveTasks(String filename){
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))){
            oos.writeObject(tasks);
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    // Method to add task
    public void addTask(String description){
        Task newTask = new Task(nextId++, description);
        tasks.add(newTask);
        System.out.println("Task added: " + newTask);
    }

    // Method to remove a task
    public void deleteTask(int id){
        tasks.removeIf(task -> task.getID() == id);
        System.out.println("Task with id " + id + " has been deleted.");
    }

    //Display all tasks
    public void displayTask(){
        if (tasks.isEmpty()){
            System.out.println("No tasks avaialable");
            return;
        }
        System.out.println("Current Task: ");
        for (Task task : tasks){
            System.out.println(task);
            System.out.println("----------------------------------------------------");
        }
    }

    // Toggle the completion status of a task
    public void toggleTaskCompletion(int id){
        for (Task task : tasks){
            if(task.getID() == id){
            task.toggleCompletion();
            System.out.println("Toggled completion for task " + task);
            return;
            }
        }
        System.out.println("Task with ID "+ id + " was not found!");
    }
}
