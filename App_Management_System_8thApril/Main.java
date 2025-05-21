import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<App> appsToProcess = new ArrayList<>();
        appsToProcess.add(new App("GalaxyRunner", "AliceSmith", 320.75, "Games", 12.49));
        appsToProcess.add(new App("ToolBoxPro", "BobJones", 480.0, "Utility", 25.0));
        appsToProcess.add(new App("MoneyMate", "CharlieBrown", 410.0, "Finance", 7.5));
        appsToProcess.add(new App("EnterpriseX", "DeltaCorp", 290.0, "Enterprise", 199.99));

        AppManager.processApps(appsToProcess);
    }
}
