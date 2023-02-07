public class Journalist implements GameObserver {
    final private Game project;
    final private String name;
    final private String magazine;

    public Journalist(Game prj, String name, String magazine) {
        project = prj;
        this.name = name;
        this.magazine = magazine;
    }

    public void Update() {
        System.out.println("I am " + name + " from game magazine " + magazine + " and we are happy" +
                " to meet the new game " + project.getName() + " in genre " + project.getGenre());
        System.out.println();
    }
}
