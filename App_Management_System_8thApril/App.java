public final class App {

    private final String appName;
    private final String developerName;
    private final double appSizeInMB;
    private final String category;
    private final double price;

    public App(String appName, String developerName, double appSizeInMB, String category, double price) {
        if (appSizeInMB < 0) {
            throw new IllegalArgumentException("App size must be non-negative.");
        }
        if (price < 0) {
            throw new IllegalArgumentException("Price must be non-negative.");
        }
        this.appName = appName;
        this.developerName = developerName;
        this.appSizeInMB = appSizeInMB;
        this.category = category;
        this.price = price;
    }

    public String getAppName() {
        return appName;
    }

    public String getDeveloperName() {
        return developerName;
    }

    public double getAppSizeInMB() {
        return appSizeInMB;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format(
            "App[name='%s', developer='%s', size=%.2fMB, category='%s', price=$%.2f]",
            appName, developerName, appSizeInMB, category, price
        );
    }
}
