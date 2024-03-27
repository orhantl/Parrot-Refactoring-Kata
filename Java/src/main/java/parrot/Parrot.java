package parrot;

public abstract class Parrot {

    public static final double BASE_SPEED = 12.0;

    protected Parrot() {
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot();
            case AFRICAN -> new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(voltage, isNailed);
        };
    }

    public abstract String getCry();

    public abstract double getSpeed();

}
