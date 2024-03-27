package parrot;

public abstract class Parrot {

    private static final double BASE_SPEED = 12.0;

    protected Parrot() {
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        switch (type) {
            case EUROPEAN -> {
                return EuropeanParrot.createEuropeanParrot();
            }
            case AFRICAN -> {
                return AfricanParrot.createAfricanParrot(numberOfCoconuts);
            }
            case NORWEGIAN_BLUE -> {
                return NorwegianBlueParrot.createNorwegianBlueParrot(voltage, isNailed);
            }
            default -> throw new IllegalArgumentException("Should be unreachable");
        }
    }

    public abstract String getCry();

    public abstract double getSpeed();

    protected double getBaseSpeed() {
        return BASE_SPEED;
    }
}
