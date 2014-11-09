package mainPackage;

import java.util.ArrayList;

/**
 * @author Tobias
 */

public class ControlEngine {
    
    private ArrayList<Project> projects; 
    
    public ControlEngine() {
        projects = new ArrayList<Project>();
    }
    
    public void createProject(String input1, String input2, String input3)
    {
    Project newProject = new Project(input1, input2, input3);
    projects.add(newProject);
    //projects.add(newProject);
    }
    
    public ArrayList<Project> getProject() {
        return projects;
    }
}
