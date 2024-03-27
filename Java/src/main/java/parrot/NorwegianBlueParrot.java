package parrot;

public class NorwegianBlueParrot extends Parrot {
    protected final boolean isNailed;
    protected final double voltage;

    private NorwegianBlueParrot(double voltage, boolean isNailed) {
        super();
        this.isNailed = isNailed;
        this.voltage = voltage;
    }

    public static NorwegianBlueParrot createNorwegianBlueParrot(double voltage, boolean isNailed) {
        return new NorwegianBlueParrot(voltage, isNailed);
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }

}
