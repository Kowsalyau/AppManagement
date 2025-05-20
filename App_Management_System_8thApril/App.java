public class App {
    private String appName;
    private String developerName;
    private double appSizeInMB;
    private String category;
    private double price;

    public App(String appName, String developerName, double appSizeInMB, String category, double price) {
        this.appName = appName;
        this.developerName = developerName;
        this.appSizeInMB = appSizeInMB;
        this.category = category;
        this.price = price;
    }

    // Getter methods
    public String getAppName() { return appName; }
    public String getDeveloperName() { return developerName; }
    public double getAppSizeInMB() { return appSizeInMB; }
    public String getCategory() { return category; }
    public double getPrice() { return price; }
}
