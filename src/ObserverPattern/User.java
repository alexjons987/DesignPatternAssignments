package ObserverPattern;

public class User implements Observer {
    private final String username;

    public User(String username) {
        this.username = username;
    }

    @Override
    public void update(String news) {
        System.out.printf("User %s received news \"%s\"%n", this.username, news);
    }
}
