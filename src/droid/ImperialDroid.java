package droid; 


public class ImperialDroid {

    // Instance fields (private)
    private String IDNumber;
    private String droidType;
    private double height;
    private double weight;
    private String manufacturer;
    private Boolean isArmored;

    // Static fields
    public static int droidCount = 0;
    public static final String DROIDCLASS = "Security";

    // Default constructor
    public ImperialDroid() {
        this.IDNumber = "UNKNOWN";
        this.droidType = "UNKNOWN";
        this.height = 0.0;
        this.weight = 0.0;
        this.manufacturer = "UNKNOWN";
        this.isArmored = false;
        droidCount++;
    }

    // Parameterized constructor
    public ImperialDroid(String IDNumber, String droidType, double height,
                         double weight, String manufacturer, Boolean isArmored) {
        this.IDNumber = IDNumber;
        this.droidType = droidType;
        this.height = height;
        this.weight = weight;
        this.manufacturer = manufacturer;
        this.isArmored = isArmored;
        droidCount++;
    }

    // Reports the droid's current status
    public void reportsStatus() {
        System.out.println("=== Droid Status Report ===");
        System.out.println("ID Number   : " + IDNumber);
        System.out.println("Droid Type  : " + droidType);
        System.out.println("Droid Class : " + DROIDCLASS);
        System.out.println("Height      : " + height + " m");
        System.out.println("Weight      : " + weight + " kg");
        System.out.println("Manufacturer: " + manufacturer);
        System.out.println("Armored     : " + isArmored);
        System.out.println("Total Droids: " + droidCount);
    }

    // Moves to a destination; returns true if destination is valid (non-null, non-empty)
    public boolean movesToDestination(String destination) {
        if (destination != null && !destination.isEmpty()) {
            System.out.println(IDNumber + " moving to: " + destination);
            return true;
        }
        System.out.println(IDNumber + " received invalid destination.");
        return false;
    }

    // Communicates a message
    public void communicates(String msg) {
        System.out.println("[" + IDNumber + "]: " + msg);
    }

    // Flies to transport location
    public void flysTransport() {
        System.out.println(IDNumber + " is flying transport.");
    }

    // Static method: compares two droids by height; returns true if d1 is taller
    public static boolean compareDroids(ImperialDroid d1, ImperialDroid d2) {
        return d1.height > d2.height;
    }
}