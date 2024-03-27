package parrot;

public abstract class Parrot {

    public static final double BASE_SPEED = 12.0;

    protected final int numberOfCoconuts;
    protected final double voltage;

    protected Parrot(int numberOfCoconuts, double voltage) {
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot(numberOfCoconuts, voltage);
            case AFRICAN -> new AfricanParrot(numberOfCoconuts, voltage);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(numberOfCoconuts, voltage, isNailed);
        };
    }

    public abstract String getCry();

    public abstract double getSpeed();

}
