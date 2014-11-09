package mainPackage;

/**
 * @author Tobias
 */
public class Project {

    private String projectName, current, total;

    public Project(String input1, String input2, String input3) {
        this.projectName = input1;
        this.current = input2;
        this.total = input3;
    }

    @Override
    public String toString() {
        return "" + projectName + " | " + current + " | " + total;
    }
}
