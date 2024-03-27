package parrot;

import static parrot.ParrotTypeEnum.AFRICAN;

public class AfricanParrot extends Parrot {

    private AfricanParrot(int numberOfCoconuts, double voltage) {
        super(AFRICAN, numberOfCoconuts, voltage);
    }

    public static AfricanParrot createAfricanParrot(int numberOfCoconuts, double voltage) {
        return new AfricanParrot(numberOfCoconuts, voltage);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }

    @Override
    public double getSpeed() {
        return Math.max(0, BASE_SPEED - LOAD_FACTOR * numberOfCoconuts);
    }
}
