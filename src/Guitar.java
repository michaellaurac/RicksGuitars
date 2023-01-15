public class Guitar {

    private String serialNumber;
    private GuitarSpec spec;
    private double price;

    public Guitar(
            String serialNumber,
            GuitarSpec spec,
            double price
    ) {
        this.serialNumber = serialNumber;
        this.spec = spec;
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public GuitarSpec getGuitarSpec() { return spec; }

    public double getPrice() {
        return price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }
}
