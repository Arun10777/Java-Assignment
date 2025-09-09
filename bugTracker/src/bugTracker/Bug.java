package bugTracker;

public class Bug extends Issue {
    private String stepsToReproduce;

    public Bug(int issueId, String title, String description, String severity, String stepsToReproduce) {
        super(issueId, title, description, severity);
        this.stepsToReproduce = stepsToReproduce;
    }

    public String getStepsToReproduce() { return stepsToReproduce; }
    public void setStepsToReproduce(String steps) { this.stepsToReproduce = steps; }

    @Override
    public void display() {
        super.display();
        System.out.println("Steps to Reproduce: " + stepsToReproduce);
    }
}
