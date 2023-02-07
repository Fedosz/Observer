import java.util.Map;

public class Developer implements GameObserver {
    final private Game project;
    final private String name;

    public Developer(Game prj, String name) {
        project = prj;
        this.name = name;
    }

    public void Update() {
        System.out.println("I am " + name + ", the game developer, and here are " +
                "the tech requirements for new game " + project.getName() + ":");
        for (Map.Entry<String, Integer> req : project.getRequirements().entrySet()) {
            System.out.println(req.getKey() + " not lower " + req.getValue());
        }
        System.out.println();
    }
}
