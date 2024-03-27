package parrot;

public abstract class Parrot {

    public static final double LOAD_FACTOR = 9.0;
    public static final double BASE_SPEED = 12.0;
    protected final ParrotTypeEnum type;

    protected Parrot(ParrotTypeEnum type) {
        this.type = type;
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> EuropeanParrot.createEuropeanParrot();
            case AFRICAN -> AfricanParrot.createAfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE -> NorwegianBlueParrot.createNorwegianBlueParrot(voltage, isNailed);
        };
    }

    public abstract double getSpeed();

    protected abstract String getCry();
}
