package ObserverPattern;

public class AnotherUserClass implements Observer {
    private final String username;

    public AnotherUserClass(String username) {
        this.username = username;
    }

    @Override
    public void update(String news) {
        System.out.printf("Some other user called %s received news \"%s\"%n", this.username, news);
    }
}
