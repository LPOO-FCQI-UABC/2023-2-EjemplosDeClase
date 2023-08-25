package ProjectManagement;

import java.util.Vector;

public class Project {
    private String name;
    private Vector<Resource> theResources = new Vector<>();

    public Project(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vector<Resource> getTheResources() {
        return theResources;
    }

    public void setTheResources(Vector<Resource> theResources) {
        this.theResources = theResources;
    }

    @Override
    public String toString() {
        return "Project{" +
                "name='" + name + '\'' +
                ", theResources=" + theResources +
                '}';
    }
}
