package bugTracker;

public class TrackerAppMain {
    public static void main(String[] args) {
        TrackerService service = new TrackerService();

        Project p1 = new Project(1, "Project Apollo", "https://repo.apollo.com");
        service.addProject(p1);

        User u1 = new User(101, "Arun", "HR", "alice@example.com");
        User u2 = new User(102, "vishnu", "TL", "bob@example.com");
        Manager m1 = new Manager(103, "Koushal", "carol@example.com");

        p1.addUser(u1);
        p1.addUser(u2);
        p1.addUser(m1);

        Issue issue1 = new Issue(1001, "Login page error", "Fails on wrong password", "High");
        Bug bug1 = new Bug(1002, "Crash on Save", "App crashes when saving file", "Critical", "Open app, try to save file");

        service.createIssue(p1, issue1);
        service.createIssue(p1, bug1, new String[] {"crash", "save"});

        service.assignIssue(p1, 1001, u2);
        service.assignIssue(p1, 1002, u1);

        service.updateStatus(p1, 1001, "IN_PROGRESS");
        service.updateStatus(p1, 1002, "RESOLVED");

        m1.approveIssue(1002);

        p1.projectDashboard();

        service.listIssuesBySeverity(p1, "Critical");
    }
}
