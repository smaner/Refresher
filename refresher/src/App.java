import TankFactory.Tank;
import TankFactory.TankType;
import TankFactory.TankFactory;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        
        List<Tank> tAnks = new ArrayList<Tank>();
        tAnks.add(TankFactory.getTank(TankType.HEAVYTANK));
        tAnks.add(TankFactory.getTank(TankType.LIGHTTANK));
        tAnks.add(TankFactory.getTank(TankType.SELFPROPELLEDGUN));

        tAnks.forEach((t) -> System.out.println(t));
    
    }
}
