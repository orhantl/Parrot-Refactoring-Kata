package parrot;

public abstract class Parrot {

    public static final double BASE_SPEED = 12.0;

    protected final int numberOfCoconuts;

    protected Parrot(int numberOfCoconuts) {
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public static Parrot createParrot(ParrotTypeEnum type, int numberOfCoconuts, double voltage, boolean isNailed) {
        return switch (type) {
            case EUROPEAN -> new EuropeanParrot(numberOfCoconuts);
            case AFRICAN -> new AfricanParrot(numberOfCoconuts);
            case NORWEGIAN_BLUE -> new NorwegianBlueParrot(numberOfCoconuts, voltage, isNailed);
        };
    }

    public abstract String getCry();

    public abstract double getSpeed();

}
