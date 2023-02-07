import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println();

        Game game = new Game("World of Peace Craft", "MMO RPG");

        Developer developer = new Developer(game, "Dave");
        Journalist journalist = new Journalist(game, "Alex", "Meta Gaming");
        Player player = new Player(game, "Kingsley");

        game.AddAchievement("Big Boss");
        game.AddAchievement("Invincibles");
        game.AddAchievement("The Master");
        game.AddAchievement("Collector");
        game.AddAchievement("Dark magic");
        game.AddAchievement("You shall not pass!");

        game.AddRequirement("Windows", 10);
        game.AddRequirement("GB RAM", 8);
        game.AddRequirement("CPU Cores", 6);
        game.AddRequirement("GB VRAM", 2);
        game.AddRequirement("GB Memory", 50);

        game.AddObserver(developer);
        game.AddObserver(journalist);
        game.AddObserver(player);

        game.Release();
    }
}