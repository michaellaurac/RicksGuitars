import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        GuitarSpec whatErinLikes = new GuitarSpec(
                Builder.FENDER,
                "stratocastor",
                Type.ELECTRIC,
                6,
                Wood.ALDER,
                Wood.ALDER
        );

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Guitar guitar:matchingGuitars) {
                GuitarSpec spec = guitar.getGuitarSpec();
                System.out.println("  We have a " +
                        spec.getBuilder() + " " +
                        spec.getModel() + " " +
                        spec.getNumStrings() + "-string " +
                        spec.getType() + " guitar:\n  " +
                        spec.getBackWood() + " back and sides. " +
                        spec.getTopWood() + " top.\n  " +
                        "You can have it for only $" + guitar.getPrice() + "!\n  ----"
                );
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    public static void initializeInventory(Inventory inventory) {
        GuitarSpec stratocastor = new GuitarSpec(
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                6,
                Wood.ALDER,
                Wood.ALDER
        );

        inventory.addGuitar(
                "V95693",
                stratocastor,
                1499.95

        );
        inventory.addGuitar(
                "V9512",
                stratocastor,
                1549.95
        );
    }
}
