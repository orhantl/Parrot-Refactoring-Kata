package parrot;

public abstract class Parrot {

    public static final double LOAD_FACTOR = 9.0;
    public static final double BASE_SPEED = 12.0;
    protected final ParrotTypeEnum type;
    protected final int numberOfCoconuts;

    protected Parrot(ParrotTypeEnum type, int numberOfCoconuts) {
        this.type = type;
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> EuropeanParrot.createEuropeanParrot(numberOfCoconuts);
            case AFRICAN -> AfricanParrot.createAfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE -> NorwegianBlueParrot.createNorwegianBlueParrot(numberOfCoconuts, voltage, isNailed);
        };
    }

    public abstract double getSpeed();

    protected abstract String getCry();
}
