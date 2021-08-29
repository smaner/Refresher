package TankFactory;

public class TankFactory {
    
    public static Tank getTank(TankType type) {
        return type.getConstructor().get();
      }
}
