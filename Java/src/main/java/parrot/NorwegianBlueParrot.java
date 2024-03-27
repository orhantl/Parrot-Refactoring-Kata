package parrot;

import static parrot.ParrotTypeEnum.NORWEGIAN_BLUE;

public class NorwegianBlueParrot extends Parrot {
    private NorwegianBlueParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(NORWEGIAN_BLUE, numberOfCoconuts, voltage, isNailed);
    }

    public static NorwegianBlueParrot createNorwegianBlueParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        return new NorwegianBlueParrot(numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public String getCry() {
        return voltage > 0 ? "Bzzzzzz" : "...";
    }

    @Override
    public double getSpeed() {
        return (isNailed) ? 0 : getBaseSpeed(voltage);
    }

    private double getBaseSpeed(double voltage) {
        return Math.min(24.0, voltage * BASE_SPEED);
    }
}