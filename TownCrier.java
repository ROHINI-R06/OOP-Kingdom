package kingdom.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import kingdom.contracts.AbstractTownCrier;
import kingdom.core.KingdomRegistry;
import java.util.ArrayList;
import java.util.List;

public class TownCrier extends AbstractTownCrier {

    static {
        // Registers your entity with the kingdom engine automatically
        KingdomRegistry.register(TownCrier.class);
    }

    @JsonProperty("identity")
    private String id;

    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    // Tracker list to store all announcements
    private List<String> announcements = new ArrayList<>();

    // Default constructor
    public TownCrier() {
        super();
    }

    // Required Method 1: Broadcast a new message
    @Override
    public void announce(String message) {
        if (message != null) {
            this.announcements.add(message);
        }
    }

    // Required Method 2: Return total count of messages
    @Override
    public int getAnnouncementCount() {
        return this.announcements.size();
    }

    // Required Method 3: Return the most recent message
    @Override
    public String getLatestAnnouncement() {
        if (this.announcements.isEmpty()) {
            return "No announcements made yet.";
        }
        return this.announcements.get(this.announcements.size() - 1);
    }
}