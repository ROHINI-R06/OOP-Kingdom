package kingdom.core;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import java.time.LocalDate;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS, include = JsonTypeInfo.As.PROPERTY, property = "@class")
@JsonIdentityInfo(generator = ObjectIdGenerators.IntSequenceGenerator.class, property = "@id")
public interface KingdomEntity {
    String getIdentity();

    String getName();

    String getDescription();

    LocalDate getFoundingDate();

    Status getStatus();

    public enum Status {
        OPERATIONAL,
        UNDER_CONSTRUCTION,
        DAMAGED,
    }
}
