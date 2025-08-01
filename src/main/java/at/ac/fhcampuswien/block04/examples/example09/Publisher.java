package at.ac.fhcampuswien.block04.examples.example09;

public interface Publisher {
    void subscribe(Subscriber subscriber);

    void unsubscribe(Subscriber subscriber);

    void notifySubscribers();
}