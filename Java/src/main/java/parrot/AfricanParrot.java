package parrot;

import static parrot.ParrotTypeEnum.AFRICAN;

public class AfricanParrot extends Parrot {

    protected final int numberOfCoconuts;

    private AfricanParrot(int numberOfCoconuts) {
        super(AFRICAN);
        this.numberOfCoconuts = numberOfCoconuts;
    }

    public static AfricanParrot createAfricanParrot(int numberOfCoconuts) {
        return new AfricanParrot(numberOfCoconuts);
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
