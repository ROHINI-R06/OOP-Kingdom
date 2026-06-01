package kingdom.entities;

import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class FarmTest {

    @Test
    void testFarmInitialization() {
        CityHall cityHall = new CityHall("CITY-01", "Test City");
        Farm farm = new Farm("FARM-01", cityHall);

        assertEquals("FARM-01", farm.getIdentity());
        assertEquals("Farm", farm.getName());
        assertEquals("This is a farm", farm.getDescription());
        assertNotNull(farm.getFoundingDate());
        assertEquals(LocalDate.now(), farm.getFoundingDate());
        assertEquals(cityHall, farm.getCityHall());
    }

    @Test
    void testSetCityHall() {
        CityHall cityHall1 = new CityHall("CITY-01", "Test City 1");
        CityHall cityHall2 = new CityHall("CITY-02", "Test City 2");
        Farm farm = new Farm("FARM-01", cityHall1);

        farm.setCityHall(cityHall2);
        assertEquals(cityHall2, farm.getCityHall());
    }
}
