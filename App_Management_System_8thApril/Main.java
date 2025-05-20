import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<App> apps = new ArrayList<>();
        apps.add(new App("SuperGame", "JohnDoe", 450, "Games", 20));
        apps.add(new App("MegaTool", "JaneDoe", 550, "Utility", 10));
        apps.add(new App("FinTrack", "BadDev", 400, "Finance", 5));
        apps.add(new App("EnterpriseSuite", "CorpDev", 300, "Enterprise", 150));

        AppManager.processApps(apps);
    }
}
