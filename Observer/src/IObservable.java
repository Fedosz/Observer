public interface IObservable {
    void AddObserver(GameObserver o);
    void RemoveObserver(GameObserver o);
    void NotifyObservers();
}
