package parrot;

public abstract class Parrot {

    public static final double BASE_SPEED = 12.0;

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

    public abstract double getSpeed();

    public abstract String getCry();

    protected double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * getBaseSpeed());
    }

    protected double getBaseSpeed() {
        return BASE_SPEED;
    }
}
