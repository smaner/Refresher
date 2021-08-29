package TankFactory;

import java.util.function.Supplier;

public enum TankType {
    
    HEAVYTANK(HeavyTank::new),
    LIGHTTANK(LightTank::new),
    MEDIUMTANK(MediumTank::new),
    TANKDESTROYER(TankDestroyer::new),
    SELFPROPELLEDGUN(SelfPropelledGun::new);

    private final Supplier<Tank> constructor;
    
    private TankType(Supplier<Tank> c){
        this.constructor = c;
    }

    public Supplier<Tank> getConstructor(){
        return this.constructor;
    }

}