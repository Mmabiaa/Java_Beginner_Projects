package Bug_Tracking_Sytem;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BugTracker {
    private List<Bug> bugs;

    public BugTracker() {
        bugs = new ArrayList<>();
    }

    public void addBug(String description, String severity) {
        Bug newBug = new Bug(description, severity);
        bugs.add(newBug);
        System.out.println("Bug added successfully!");
    }

    public void viewBugs() {
        if (bugs.isEmpty()) {
            System.out.println("No bugs found.");
            return;
        }
        
        System.out.println("List of Bugs:");
        for (Bug bug : bugs) {
            System.out.println(bug);
        }
    }

    public void updateBugStatus(int id, String newStatus) {
        for (Bug bug : bugs) {
            if (bug.getId() == id) {
                bug.setStatus(newStatus);
                System.out.println("Bug status updated successfully!");
                return;
            }
        }
        System.out.println("Bug with ID " + id + " not found.");
    }
}