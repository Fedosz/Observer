public class Player implements GameObserver {
    final private Game project;
    final private String name;

    public Player(Game prj, String name) {
        project = prj;
        this.name = name;
    }

    public void Update() {
        System.out.println("I am " + name + " the new big fan of game " + project.getName() +
                " and here is the name of each achievement you can get:");
        for (String ach : project.getAchievements()) {
            System.out.println(ach);
        }
        System.out.println();
    }
}
