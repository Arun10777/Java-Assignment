package bugTracker;

public class Issue {
    private int issueId;
    private String title;
    private String description;
    private String severity;  
    private String status;    
    private User assignee;

    public Issue(int issueId, String title, String description, String severity) {
        this.issueId = issueId;
        this.title = title;
        this.description = description;
        this.severity = severity;
        this.status = "NEW";
        this.assignee = null;
    }

    public int getIssueId() { return issueId; }
    public String getTitle() { return title; }
    public String getDescription() { return description; }
    public String getSeverity() { return severity; }
    public String getStatus() { return status; }
    public User getAssignee() { return assignee; }

    public void setTitle(String title) { this.title = title; }
    public void setDescription(String description) { this.description = description; }
    public void setSeverity(String severity) { this.severity = severity; }
    public void setStatus(String status) { this.status = status; }
    public void setAssignee(User assignee) { this.assignee = assignee; }

    public void changeStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Issue " + issueId + " status changed to " + newStatus);
    }

    public void display() {
        System.out.println("Issue ID: " + issueId + " | Title: " + title + " | Severity: " + severity +
                " | Status: " + status + " | Assignee: " + (assignee != null ? assignee.getName() : "None"));
    }
}
