import ProjectManagement.Project;
import ProjectManagement.Resource;

import java.security.ProtectionDomain;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {


        Project project = new Project("Proyect 1");

        Resource resource1 = new Resource("Resource 1");

        project.getTheResources().add(resource1);

        System.out.println(project);
    }
}