package kingdom.entities;

import org.junit.jupiter.api.Test;
import kingdom.core.KingdomEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

class CityHallTest {
    CityHall cityHall = new CityHall("CITYHALL-001", "CITY HALL");

    @Test
    void testIdentity() {
        assertEquals("CITYHALL-001", cityHall.getIdentity());
    }

    @Test
    void testName() {
        assertEquals("CITY HALL", cityHall.getName());
    }

    @Test
    void testFoundingDate() {
        assertEquals(LocalDate.now(), cityHall.getFoundingDate());
    }

    @Test
    void testSetDescription() {
        cityHall.setDescription("The heart of the kingdom");
        assertEquals("The heart of the kingdom", cityHall.getDescription());
    }

    @Test
    void testDefaultStatus() {
        assertEquals(KingdomEntity.Status.UNDER_CONSTRUCTION, cityHall.getStatus());
    }

    @Test
    void testSetStatus() {
        cityHall.setStatus(KingdomEntity.Status.OPERATIONAL);
        assertEquals(KingdomEntity.Status.OPERATIONAL, cityHall.getStatus());
    }
}