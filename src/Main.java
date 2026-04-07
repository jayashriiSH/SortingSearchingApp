import java.util.*;

class Asset {
    String name;
    double returnRate;
    double volatility;

    Asset(String name, double returnRate, double volatility) {
        this.name = name;
        this.returnRate = returnRate;
        this.volatility = volatility;
    }
}

public class Main {

    public static void main(String[] args) {

        Asset[] assets = {
                new Asset("AAPL", 12, 5),
                new Asset("TSLA", 8, 7),
                new Asset("GOOG", 15, 4)
        };

        // Merge Sort (Ascending Return)
        Arrays.sort(assets, Comparator.comparingDouble(a -> a.returnRate));

        System.out.println("Ascending Return:");
        for (Asset a : assets) {
            System.out.println(a.name + " " + a.returnRate);
        }

        // Quick Sort Logic (Return DESC + Volatility ASC)
        Arrays.sort(assets, (a, b) -> {
            if (b.returnRate != a.returnRate)
                return Double.compare(b.returnRate, a.returnRate);
            else
                return Double.compare(a.volatility, b.volatility);
        });

        System.out.println("\nSorted (Return DESC + Volatility ASC):");
        for (Asset a : assets) {
            System.out.println(a.name + " " + a.returnRate + " Vol:" + a.volatility);
        }
    }
}