package bugTracker;

public class Manager extends User {
    public Manager(int id, String name, String email) {
        super(id, name, "Manager", email);
    }

    public void approveIssue(int issueId) {
        System.out.println("Manager " + getName() + " approved issue ID: " + issueId);
    }
    @Override
    public void displayUser() {
        System.out.println("Manager: " + getName() + " | Email: " + getEmail());
    }
}
