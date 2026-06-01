package kingdom.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.LocalDate;
import kingdom.contracts.FarmContract;
import kingdom.core.KingdomRegistry;

public class Farm implements FarmContract {

    static {
        KingdomRegistry.register(Farm.class);
    }

    @JsonProperty("identity")
    private String id;

    @JsonProperty
    private String name;

    @JsonProperty
    private String description;

    @JsonProperty
    private LocalDate foundingDate;

    @JsonProperty
    private CityHall cityHall;

    @JsonProperty
    private Status status;

    // Default constructor for serialization
    public Farm() {
        this.id = "FARM-" + java.util.UUID.randomUUID().toString().substring(0, 8).toUpperCase();
        this.name = "Auto-generated Farm";
        this.description = "A newly built farmland dynamically added to the kingdom.";
        this.foundingDate = LocalDate.now();
        this.status = Status.UNDER_CONSTRUCTION;
    }

    public Farm(String id, CityHall cityHall) {
        this.id = id;
        this.name = "Farm";
        this.description = "This is a farm";
        this.foundingDate = LocalDate.now();
        this.status = Status.OPERATIONAL;
        this.cityHall = cityHall;
    }

    @Override
    public void setCityHall(CityHall cityHall) {
        this.cityHall = cityHall;
    }

    @Override
    public CityHall getCityHall() {
        return this.cityHall;
    }

    public String getIdentity() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getDescription() {
        return this.description;
    }

    public LocalDate getFoundingDate() {
        return this.foundingDate;
    }

    public Status getStatus() {
        return this.status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}