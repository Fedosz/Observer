import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Game {
    private String name;
    private String genre;
    private Set<String> achievements;
    private Map<String, Integer> requirements;

    private Set<GameObserver> observers;

    public Game(String name, String genre) {
        achievements = new HashSet<String>();
        observers = new HashSet<GameObserver>();
        requirements = new HashMap<String, Integer>();
    }

    public void AddRequirement(String tec, Integer ver) {

    }

    public void AddAchievement(String achieve) {

    }

    public void AddObserver(GameObserver o) {
        observers.add(o);
    }

    public void RemoveObserver(GameObserver o) {
        observers.remove(o);
    }

    public void Release() {
        for (GameObserver observer: observers) {
            observer.Update();
        }
    }

}
