package ToDoList_project;

/**
 * The Task class represents a task in the ToDoList application.
 * Each task has a title, a description, and a completion status.
 */
public class Task {
    private String title;         // The title of the task
    private String description;   // The description of the task
    private boolean completed;    // Indicates whether the task is completed or not

    /**
     * Constructs a new Task object with the given title and description.
     *
     * @param title       the title of the task
     * @param description the description of the task
     */
    public Task(String title, String description) {
        this.title = title;
        this.description = description;
        this.completed = false; // Initially, the task is not completed
    }

    /**
     * Returns the title of the task.
     *
     * @return the title of the task
     */
    public String getTitle() {
        return title;
    }

    /**
     * Returns the description of the task.
     *
     * @return the description of the task
     */
    public String getDescription() {
        return description;
    }

    /**
     * Checks if the task is completed.
     *
     * @return true if the task is completed, false otherwise
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Marks the task as completed.
     */
    public void markCompleted() {
        this.completed = true; // Mark the task as completed
    }
}


