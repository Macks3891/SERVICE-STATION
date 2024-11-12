public class Truck extends MotorTransport {
    private double payloadCapacity;

    public Truck(int wheelCount, int maxSpeed, String engineType, double payloadCapacity) {
        super(wheelCount, maxSpeed, engineType);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    public void setPayloadCapacity(double payloadCapacity) {
        this.payloadCapacity = payloadCapacity;
    }

    @Override
    public void service() {
        super.service();
        System.out.println("Обслужен грузовик с грузоподъемностью " + payloadCapacity + " тонн");
    }
}