import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        // Set up Rick's guitar inventory
        Inventory inventory = new Inventory();
        initializeInventory(inventory);

        Guitar whatErinLikes = new Guitar(
                "",
                0,
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER
        );

        List<Guitar> matchingGuitars = inventory.search(whatErinLikes);
        if (!matchingGuitars.isEmpty()) {
            System.out.println("Erin, you might like these guitars:");
            for (Guitar guitar:matchingGuitars) {
                System.out.println("  We have a " +
                        guitar.getBuilder() + " " +
                        guitar.getModel() + " " +
                        guitar.getType() + " guitar:\n  " +
                        guitar.getBackWood() + " back and sides. " +
                        guitar.getTopWood() + " top.\n  " +
                        "You can have it for only $" + guitar.getPrice() + "!\n  ----"
                );
            }
        } else {
            System.out.println("Sorry, Erin, we have nothing for you.");
        }
    }

    public static void initializeInventory(Inventory inventory) {
        inventory.addGuitar(
                "V95693",
                1499.95,
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER
        );
        inventory.addGuitar(
                "V9512",
                1549.95,
                Builder.FENDER,
                "Stratocastor",
                Type.ELECTRIC,
                Wood.ALDER,
                Wood.ALDER
        );
    }
}
