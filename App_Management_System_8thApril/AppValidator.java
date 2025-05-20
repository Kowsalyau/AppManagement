import Exceptions.AppSizeTooLargeException;
import Exceptions.DeveloperBannedException;
import Exceptions.InvalidCategoryException;
import Exceptions.PricingException;

import java.util.Arrays;
import java.util.List;

public class AppValidator {
    private static final List<String> ALLOWED_CATEGORIES = Arrays.asList("Games", "Utility", "Finance", "Enterprise");
    private static final List<String> BANNED_DEVELOPERS = Arrays.asList("BadDev", "ScammerInc");

    public static void validate(App app) throws AppSizeTooLargeException, InvalidCategoryException, PricingException, DeveloperBannedException {
        if (app.getAppSizeInMB() > 500) {
            throw new AppSizeTooLargeException("App size exceeds 500MB limit.");
        }
        if (!ALLOWED_CATEGORIES.contains(app.getCategory())) {
            throw new InvalidCategoryException("Invalid category: " + app.getCategory());
        }
        if (app.getPrice() < 0 || (!app.getCategory().equals("Enterprise") && app.getPrice() > 100)) {
            throw new PricingException("Invalid price: " + app.getPrice());
        }
        if (BANNED_DEVELOPERS.contains(app.getDeveloperName())) {
            throw new DeveloperBannedException("Developer is banned: " + app.getDeveloperName());
        }
    }
}
