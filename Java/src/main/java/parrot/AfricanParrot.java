package parrot;

import static parrot.ParrotTypeEnum.AFRICAN;

public class AfricanParrot extends Parrot {
    public AfricanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(AFRICAN, numberOfCoconuts, voltage, isNailed);
    }

    @Override
    public String getCry() {
        return "Sqaark!";
    }
}
