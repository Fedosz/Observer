import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ConcreteObservable {
    private Set<IObserver> observers;

    public ConcreteObservable() {
        observers = new HashSet<IObserver>();
    }

    public void AddObserver(IObserver o) {
        observers.add(o);
    }

    public void RemoveObserver(IObserver o) {
        observers.remove(o);
    }

    public void NotifyObservers() {
        for (IObserver observer: observers) {
            observer.Update();
        }
    }

}
