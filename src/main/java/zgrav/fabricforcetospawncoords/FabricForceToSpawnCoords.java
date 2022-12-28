package zgrav.fabricforcetospawncoords;

import net.fabricmc.api.ModInitializer;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FabricForceToSpawnCoords implements ModInitializer {
    private static final String MODID = "zgrav-fabric-spawnpoint-onlogin";

    private static final Logger LOGGER = LogManager.getLogger(MODID);

    @Override
    public void onInitialize() {
        LOGGER.info("Loaded!");
    }
}
