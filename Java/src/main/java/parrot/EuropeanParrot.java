package parrot;

import static parrot.ParrotTypeEnum.EUROPEAN;

public class EuropeanParrot extends Parrot {
    public EuropeanParrot(int numberOfCoconuts, double voltage, boolean isNailed) {
        super(EUROPEAN, numberOfCoconuts, voltage, isNailed);
    }
}
