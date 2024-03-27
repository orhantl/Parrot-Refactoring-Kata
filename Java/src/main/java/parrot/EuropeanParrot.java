package parrot;

import static parrot.ParrotTypeEnum.EUROPEAN;

public class EuropeanParrot extends Parrot {

    private EuropeanParrot(int numberOfCoconuts) {
        super(EUROPEAN, numberOfCoconuts);
    }

    public static EuropeanParrot createEuropeanParrot(int numberOfCoconuts) {
        return new EuropeanParrot(numberOfCoconuts);
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
