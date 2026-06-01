package kingdom;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;

import java.io.File;
import java.io.IOException;

public class StateManager {
    // Navigate back to the project root's state directory
    private static final String STATE_FILE_PATH = "../state/kingdom.json";
    private final ObjectMapper mapper;

    public StateManager() {
        mapper = new ObjectMapper();
        // Support for LocalDate serialization
        mapper.registerModule(new JavaTimeModule());
        mapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
        // Pretty print output for the frontend
        mapper.enable(SerializationFeature.INDENT_OUTPUT);
    }

    public void saveKingdom(Kingdom kingdom) {
        try {
            File stateFile = new File(STATE_FILE_PATH);
            if (!stateFile.getParentFile().exists()) {
                stateFile.getParentFile().mkdirs();
            }
            mapper.writeValue(stateFile, kingdom);
            System.out.println("Kingdom state saved successfully to: " + stateFile.getAbsolutePath());
        } catch (IOException e) {
            System.err.println("Failed to save kingdom state: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public Kingdom loadKingdom() {
        File stateFile = new File(STATE_FILE_PATH);
        if (stateFile.exists()) {
            try {
                Kingdom kingdom = mapper.readValue(stateFile, Kingdom.class);
                System.out.println("Kingdom state loaded from: " + stateFile.getAbsolutePath());
                return kingdom;
            } catch (IOException e) {
                System.err.println("Failed to load kingdom state: " + e.getMessage());
                e.printStackTrace();
            }
        }
        System.out.println("No existing state found or failed to load. Initializing a new Kingdom...");
        return new Kingdom();
    }
}
