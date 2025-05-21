import Exceptions.AppSizeTooLargeException;
import Exceptions.DeveloperBannedException;
import Exceptions.InvalidCategoryException;
import Exceptions.PricingException;

import java.util.Collections;
import java.util.List;

public class AppValidator {

    private static final List<String> ALLOWED_CATEGORIES =
            Collections.unmodifiableList(List.of("Games", "Utility", "Finance", "Enterprise"));

    private static final List<String> BANNED_DEVELOPERS =
            Collections.unmodifiableList(List.of("BadDev", "ScammerInc"));

    public static void validate(App app) throws AppSizeTooLargeException, InvalidCategoryException,
            PricingException, DeveloperBannedException {

        if (app == null) {
            throw new IllegalArgumentException("App cannot be null");
        }

        // Check size
        if (app.getAppSizeInMB() > 500) {
            throw new AppSizeTooLargeException("App size exceeds 500MB limit: " + app.getAppSizeInMB() + "MB");
        }

        // Check category
        if (app.getCategory() == null || !ALLOWED_CATEGORIES.contains(app.getCategory())) {
            throw new InvalidCategoryException("Invalid category: " + app.getCategory());
        }

        // Check price
        double price = app.getPrice();
        if (price < 0) {
            throw new PricingException("Price cannot be negative: " + price);
        }
        if (!"Enterprise".equals(app.getCategory()) && price > 100) {
            throw new PricingException("Price exceeds limit for category '" + app.getCategory() + "': " + price);
        }

        // Check developer
        if (app.getDeveloperName() == null || BANNED_DEVELOPERS.contains(app.getDeveloperName())) {
            throw new DeveloperBannedException("Developer is banned: " + app.getDeveloperName());
        }
    }
}
