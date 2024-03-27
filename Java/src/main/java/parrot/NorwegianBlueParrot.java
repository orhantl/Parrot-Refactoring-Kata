package parrot;

public class NorwegianBlueParrot extends Parrot {
    private final boolean isNailed;
    private final double voltage;

    private NorwegianBlueParrot(double voltage, boolean isNailed) {
        super();
        this.isNailed = isNailed;
        this.voltage = voltage;
    }

    public static NorwegianBlueParrot createNorwegianBlueParrot(double voltage, boolean isNailed) {
        return new NorwegianBlueParrot(voltage, isNailed);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * BASE_SPEED);
    }
}
