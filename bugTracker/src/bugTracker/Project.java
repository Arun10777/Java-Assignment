package bugTracker;

import java.util.ArrayList;
import java.util.List;

public class Project {
    private int projectId;
    private String name;
    private String repoUrl;
    private List<Issue> backlog;
    private List<User> team;

    public Project(int projectId, String name, String repoUrl) {
        this.projectId = projectId;
        this.name = name;
        this.repoUrl = repoUrl;
        this.backlog = new ArrayList<>();
        this.team = new ArrayList<>();
    }

    public int getProjectId() { return projectId; }
    public String getName() { return name; }
    public String getRepoUrl() { return repoUrl; }
    public List<Issue> getBacklog() { return backlog; }
    public List<User> getTeam() { return team; }

    public void addUser(User user) {
        team.add(user);
        System.out.println("User " + user.getName() + " added to project " + name);
    }

    public void addIssue(Issue issue) {
        backlog.add(issue);
        System.out.println("Issue " + issue.getIssueId() + " added to project " + name);
    }

    public void listIssuesBySeverity(String severity) {
        System.out.println("Issues with severity " + severity + " in project " + name + ":");
        for (Issue i : backlog) {
            if (i.getSeverity().equalsIgnoreCase(severity)) {
                i.display();
            }
        }
    }

    public void projectDashboard() {
        System.out.println("\n--- Project Dashboard: " + name + " ---");
        System.out.println("Repo URL: " + repoUrl);
        System.out.println("Team Members:");
        for (User u : team) {
            System.out.println("- " + u.getName() + " (" + u.getRole() + ")");
        }
        System.out.println("Backlog Issues:");
        for (Issue i : backlog) {
            i.display();
        }
    }
}
