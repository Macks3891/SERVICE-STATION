public class Bicycle extends WheeledTransport {
    private String bikeType;

    public Bicycle(int wheelCount, int maxSpeed, String bikeType) {
        super(wheelCount, maxSpeed);
        this.bikeType = bikeType;
    }

    public String getBikeType() {
        return bikeType;
    }

    public void setBikeType(String bikeType) {
        this.bikeType = bikeType;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужено навесное оборудование велосипеда типа \"" + bikeType + "\"");
    }
}