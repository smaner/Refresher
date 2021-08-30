package TankFactory;

public class TankFactory {
    /** Static Factory Method for building tanks. Options: HEAVYTANK, MEDIUMTANK,
     * SELFPROPELLEDGUN, TANKDESTROYER, LIGHTTANK.
     */
    public static Tank getTank(TankType type) {
        return type.getConstructor().get();
      }
}
