import java.util.*;

/**
 * ============================================================
 * Problem 2: Client Risk Score Ranking
 * ============================================================
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("===== PROBLEM 2: Client Risk Sorting =====\n");

        ArrayList<Client> clients = new ArrayList<>();

        clients.add(new Client("clientC", 80));
        clients.add(new Client("clientA", 20));
        clients.add(new Client("clientB", 50));

        // ================= BUBBLE SORT (ASCENDING) =================
        for (int i = 0; i < clients.size() - 1; i++) {
            for (int j = 0; j < clients.size() - i - 1; j++) {
                if (clients.get(j).risk > clients.get(j + 1).risk) {
                    Collections.swap(clients, j, j + 1);
                }
            }
        }

        System.out.println("Bubble Sort (Ascending Risk):");
        for (Client c : clients) {
            System.out.println(c.name + " : " + c.risk);
        }

        // ================= INSERTION SORT (DESCENDING) =================
        for (int i = 1; i < clients.size(); i++) {
            Client key = clients.get(i);
            int j = i - 1;

            while (j >= 0 && clients.get(j).risk < key.risk) {
                clients.set(j + 1, clients.get(j));
                j--;
            }
            clients.set(j + 1, key);
        }

        System.out.println("\nInsertion Sort (Descending Risk):");
        for (Client c : clients) {
            System.out.println(c.name + " : " + c.risk);
        }

        // ================= TOP 3 (OR TOP N) =================
        System.out.println("\nTop Highest Risk Clients:");
        for (int i = 0; i < Math.min(3, clients.size()); i++) {
            Client c = clients.get(i);
            System.out.println(c.name + " : " + c.risk);
        }
    }
}

// ========================= CLIENT CLASS =========================
class Client {
    String name;
    int risk;

    Client(String name, int risk) {
        this.name = name;
        this.risk = risk;
    }
}