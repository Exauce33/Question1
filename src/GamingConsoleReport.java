public class GamingConsoleReport {
    public static void main(String[] args) {
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] consoles = {"PS5", "XBOX", "SWITCH"};

        int[][] sales = {
                {1000, 2000, 3000},
                {2000, 3000, 4000},
                {1500, 1100, 1200}
        };

        int[] cityTotals = new int[cities.length];

        // I Calculate total sales for each city
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < consoles.length; j++) {
                cityTotals[i] += sales[i][j];
            }
        }


        int maxIndex = 0;
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > cityTotals[maxIndex]) {
                maxIndex = i;
            }
        }

        // first 1: sales per console per city
        System.out.println("-------------------------------------------------");
        System.out.println("GAMING CONSOLE REPORT");
        System.out.println("-------------------------------------------------");
        System.out.printf("%-18s", "");
        for (String console : consoles) {
            System.out.printf("%-10s", console);
        }
        System.out.println();

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s", cities[i]);
            for (int j = 0; j < consoles.length; j++) {
                System.out.printf("%-10d", sales[i][j]);
            }
            System.out.println();
        }

        // Second 2: totals per city
        System.out.println("-------------------------------------------------");
        System.out.println("CONSOLE SALES TOTALS FOR EACH CITY");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-18s%d%n", cities[i], cityTotals[i]);
        }

        // third 3: top city
        System.out.println("-------------------------------------------------");
        System.out.println("CITY WITH THE MOST SALES: " + cities[maxIndex]);
        System.out.println("-------------------------------------------------");
    }
}