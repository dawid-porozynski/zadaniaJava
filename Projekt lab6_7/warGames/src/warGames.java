import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Soldier {
    public enum Rank {
        SZEREGOWY(1),
        KAPRAL(2),
        KAPITAN(3),
        MAJOR(4);

        private final int value;

        Rank(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }

    private Rank rank;
    private int experience;

    public Soldier(Rank rank) {
        this.rank = rank;
        this.experience = 1;
    }

    public Rank getRank() {
        return rank;
    }

    public int getExperience() {
        return experience;
    }

    public void train() {
        experience++;
        if (experience % (rank.getValue() * 5) == 0) {
            int nextRankIndex = rank.ordinal() + 1;
            if (nextRankIndex < Rank.values().length) {
                rank = Rank.values()[nextRankIndex];
            }
        }
    }
}

class Army {
    private final List<Soldier> soldiers;
    private int gold;

    public Army() {
        this.soldiers = new ArrayList<>();
        this.gold = 0;
    }

    public void addGold(int amount) {
        gold += amount;
    }

    public int getGold() {
        return gold;
    }

    public List<Soldier> getSoldiers() {
        return soldiers;
    }

    public int getTotalStrength() {
        int totalStrength = 0;
        for (Soldier soldier : soldiers) {
            totalStrength += soldier.getRank().getValue() * soldier.getExperience();
        }
        return totalStrength;
    }

    public void purchaseSoldiers(Soldier.Rank rank, int quantity) {
        int cost = rank.getValue() * 10;
        int totalCost = cost * quantity;
        if (totalCost <= gold) {
            for (int i = 0; i < quantity; i++) {
                soldiers.add(new Soldier(rank));
            }
            gold -= totalCost;
            System.out.println("Zakupiono " + quantity + " żołnierzy stopnia " + rank.name());
        } else {
            System.out.println("Brak wystarczających środków na zakup żołnierzy");
        }
    }

    public void trainSoldiers() {
        for (Soldier soldier : soldiers) {
            soldier.train();
        }
        System.out.println("Armia przeprowadziła manewry");
    }

    public void attack(Army enemyArmy) {
        if (soldiers.isEmpty() || enemyArmy.getSoldiers().isEmpty()) {
            System.out.println("Przynajmniej jedna z armii nie posiada żołnierzy. Atak niemożliwy.");
            return;
        }

        int ownStrength = getTotalStrength();
        int enemyStrength = enemyArmy.getTotalStrength();

        if (ownStrength > enemyStrength) {
            int loot = (int) Math.floor(enemyArmy.getGold() * 0.1);
            addGold(loot);
            enemyArmy.addGold(-loot);
            for (Soldier soldier : soldiers) {
                soldier.train();
            }
            System.out.println("Atak udany. Wygrana armia otrzymuje 10% łupu.");
        } else if (ownStrength < enemyStrength) {
            for (Soldier soldier : soldiers) {
                soldier.train();
            }
            enemyArmy.addGold(gold);
            gold = 0;
            System.out.println("Atak nieudany. Przegrana armia traci złoto, a żołnierze są szkoleni.");
        } else {
            Random random = new Random();
            Soldier randomSoldier = soldiers.get(random.nextInt(soldiers.size()));
            randomSoldier.train();
            enemyArmy.getSoldiers().remove(random.nextInt(enemyArmy.getSoldiers().size()));
            System.out.println("Atak zakończony remisem. Wylosowano żołnierzy do usunięcia.");
        }
    }
}

class General {
    private String name;
    private Army army;

    public General(String name) {
        this.name = name;
        this.army = new Army();
    }

    public Army getArmy() {
        return army;
    }

    public void purchaseSoldiers(Soldier.Rank rank, int quantity) {
        army.purchaseSoldiers(rank, quantity);
    }

    public void executeManeuvers() {
        army.trainSoldiers();
    }

    public void attackEnemy(General enemyGeneral) {
        army.attack(enemyGeneral.getArmy());
    }
}

class Secretary {
    private General general1;
    private General general2;

    public Secretary(General general1, General general2) {
        this.general1 = general1;
        this.general2 = general2;
    }

    public void writeReport() {
        System.out.println("Raport dla generałów:");
        System.out.println("Generał 1:");
        System.out.println("Złoto: " + general1.getArmy().getGold());
        System.out.println("Siła armii: " + general1.getArmy().getTotalStrength());
        System.out.println("Liczba żołnierzy: " + general1.getArmy().getSoldiers().size());
        System.out.println();
        System.out.println("Generał 2:");
        System.out.println("Złoto: " + general2.getArmy().getGold());
        System.out.println("Siła armii: " + general2.getArmy().getTotalStrength());
        System.out.println("Liczba żołnierzy: " + general2.getArmy().getSoldiers().size());
    }
}

public class warGames {
    public static void main(String[] args) {
        General general1 = new General("Generał 1");
        General general2 = new General("Generał 2");

        general1.getArmy().addGold(100);
        general2.getArmy().addGold(100);

        Secretary secretary = new Secretary(general1, general2);

        general1.purchaseSoldiers(Soldier.Rank.SZEREGOWY, 5);
        general2.purchaseSoldiers(Soldier.Rank.KAPRAL, 3);

        general1.executeManeuvers();
        general2.executeManeuvers();

        general1.attackEnemy(general2);

        secretary.writeReport();
        
    }
}
