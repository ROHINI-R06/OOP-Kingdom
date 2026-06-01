package kingdom;

import com.fasterxml.jackson.annotation.JsonProperty;
import kingdom.entities.CityHall;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kingdom {
    @JsonProperty
    private List<CityHall> cities;

    public Kingdom() {
        this.cities = new ArrayList<>();
    }

    public void addCity(CityHall city) {
        if (city != null) {
            cities.add(city);
        }
    }

    public List<CityHall> getCities() {
        return Collections.unmodifiableList(cities);
    }
}