public class Bug {
    private static int idCounter = 0; // Static counter for unique IDs
    private int id;
    private String description;
    private String status; // e.g., "Open", "In Progress", "Resolved"
    private String severity; // e.g., "Low", "Medium", "High"

    public Bug(String description, String severity) {
        this.id = ++idCounter;
        this.description = description;
        this.status = "Open";
        this.severity = severity;
    }

    // Getters and setters
    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getStatus() {
        return status;
    }

    public String getSeverity() {
        return severity;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Bug ID: " + id + ", Description: " + description + ", Status: " + status + ", Severity: " + severity;
    }
}