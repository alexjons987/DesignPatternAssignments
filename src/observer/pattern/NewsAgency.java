package observer.pattern;

import java.util.ArrayList;

public class NewsAgency {
    ArrayList<Observer> observers = new ArrayList<>();

    public void publishNews(String news) {
        System.out.printf("News! %s%n", news);
        notifyObservers(news);
    }

    // Observer methods
    public void notifyObservers(String news) {
        for (Observer observer : this.observers) {
            observer.update(news);
        }
    }

    public void addObserver(Observer observer) {
        this.observers.add(observer);
    }
}
