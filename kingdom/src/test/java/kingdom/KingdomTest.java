package kingdom;

import kingdom.entities.CityHall;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KingdomTest {

    @Test
    void testKingdomInitialization() {
        Kingdom kingdom = new Kingdom();
        assertTrue(kingdom.getCities().isEmpty());
    }

    @Test
    void testAddCity() {
        Kingdom kingdom = new Kingdom();
        CityHall cityHall = new CityHall("CITY-01", "Test City");

        kingdom.addCity(cityHall);

        assertEquals(1, kingdom.getCities().size());
        assertEquals(cityHall, kingdom.getCities().get(0));
    }
}
