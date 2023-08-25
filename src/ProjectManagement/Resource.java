package ProjectManagement;

public class Resource {
    private String name;

    public Resource(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName() {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "name='" + name + '\'' +
                '}';
    }
}
