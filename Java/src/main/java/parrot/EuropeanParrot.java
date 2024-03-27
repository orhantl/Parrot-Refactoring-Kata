package parrot;

import static parrot.ParrotTypeEnum.EUROPEAN;

public class EuropeanParrot extends Parrot {

    private EuropeanParrot() {
        super(EUROPEAN);
    }

    public static EuropeanParrot createEuropeanParrot() {
        return new EuropeanParrot();
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
