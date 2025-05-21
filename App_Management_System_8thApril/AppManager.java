import java.util.List;
import java.util.Objects;
import java.util.logging.Logger;

public class AppManager {

    private static final Logger logger = Logger.getLogger(AppManager.class.getName());

    public static void processApps(List<App> apps) {
        if (apps == null || apps.isEmpty()) {
            logger.warning("No apps to process.");
            return;
        }

        apps.forEach(app -> {
            String appName = app.getAppName();
            try {
                AppValidator.validate(app);
                logger.info(" Approved: " + appName + " by " + app.getDeveloperName());
            } catch (Exception e) {
                logger.severe(" Validation failed for " + appName + ": " + e.getMessage());
            } finally {
                logger.info(" Validation completed for " + appName);
            }
        });
    }
}
