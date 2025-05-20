import java.util.List;

public class AppManager {
    public static void processApps(List<App> apps) {
        for (App app : apps) {
            try {
                AppValidator.validate(app);
                System.out.println("App " + app.getAppName() + " by " + app.getDeveloperName() + " is approved for publishing.");
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            } finally {
                System.out.println("Validation completed for " + app.getAppName());
            }
        }
    }
}
