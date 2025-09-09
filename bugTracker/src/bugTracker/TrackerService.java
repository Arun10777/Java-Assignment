package bugTracker;

import java.util.ArrayList;
import java.util.List;

public class TrackerService {
    private List<Project> projects;

    public TrackerService() {
        projects = new ArrayList<>();
    }

    public void addProject(Project p) {
        projects.add(p);
        System.out.println("Project " + p.getName() + " added.");
    }

    // Overloaded createIssue
    public void createIssue(Project p, Issue i) {
        p.addIssue(i);
    }

    public void createIssue(Project p, Issue i, String[] tags) {
        // tags not stored here, just print for demo
        p.addIssue(i);
        System.out.print("Tags: ");
        for (String tag : tags) System.out.print(tag + " ");
        System.out.println();
    }

    public void assignIssue(Project p, int issueId, User user) {
        for (Issue i : p.getBacklog()) {
            if (i.getIssueId() == issueId) {
                i.setAssignee(user);
                System.out.println("Issue " + issueId + " assigned to " + user.getName());
                return;
            }
        }
        System.out.println("Issue not found");
    }

    public void updateStatus(Project p, int issueId, String newStatus) {
        for (Issue i : p.getBacklog()) {
            if (i.getIssueId() == issueId) {
                i.changeStatus(newStatus);
                return;
            }
        }
        System.out.println("Issue not found");
    }

    public void listIssuesBySeverity(Project p, String severity) {
        p.listIssuesBySeverity(severity);
    }
}
