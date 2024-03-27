package parrot;

import static parrot.ParrotTypeEnum.EUROPEAN;

public class EuropeanParrot extends Parrot {

    private EuropeanParrot(int numberOfCoconuts, double voltage) {
        super(EUROPEAN, numberOfCoconuts, voltage);
    }

    public static EuropeanParrot createEuropeanParrot(int numberOfCoconuts, double voltage) {
        return new EuropeanParrot(numberOfCoconuts, voltage);
    }

    @Override
    public String getCry() {
        return "Sqoork!";
    }

    @Override
    public double getSpeed() {
        return BASE_SPEED;
    }
}
