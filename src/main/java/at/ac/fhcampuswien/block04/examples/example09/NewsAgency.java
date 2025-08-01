package at.ac.fhcampuswien.block04.examples.example09;

import java.util.ArrayList;
import java.util.List;

/* Observer:
   - behavioral pattern that lets you define a
       subscription mechanism to notify multiple objects
       about any events that happen to the observed objects
   - use cases:
       - use the Observer pattern when changes to the state
           of one object may require changing other objects,
           and the actual set of objects is unknown beforehand
           or changes dynamically
       - use the pattern when some objects in your app
           must observe others, but only for a limited time
           or in specific cases. */
public class NewsAgency implements Publisher {
    private String news;
    private final List<Subscriber> channels = new ArrayList<Subscriber>();

    @Override
    public void subscribe(Subscriber subscriber) {
        this.channels.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        this.channels.remove(subscriber);
    }

    @Override
    public void notifySubscribers() {
        for (Subscriber subscriber : channels) {
            subscriber.update(this.news);
        }
    }

    public void updateNews(String news) {
        this.news = news;
        notifySubscribers();
    }
}