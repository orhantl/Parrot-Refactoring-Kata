package parrot;

public abstract class Parrot {

    public static final double LOAD_FACTOR = 9.0;
    public static final double BASE_SPEED = 12.0;
    protected final ParrotTypeEnum type;
    protected final int numberOfCoconuts;
    protected final double voltage;
    protected final boolean isNailed;

    protected Parrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
        this.voltage = voltage;
        this.isNailed = isNailed;
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> EuropeanParrot.createEuropeanParrot(numberOfCoconuts, voltage, isNailed);
            case AFRICAN -> AfricanParrot.createAfricanParrot(numberOfCoconuts, voltage, isNailed);
            case NORWEGIAN_BLUE -> NorwegianBlueParrot.createNorwegianBlueParrot(numberOfCoconuts, voltage, isNailed);
        };
    }

    public abstract double getSpeed();

    protected abstract String getCry();
}
