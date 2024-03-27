package parrot;

public abstract class Parrot {

    protected static final double BASE_SPEED = 12.0;

    protected Parrot() {
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
