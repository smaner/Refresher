package TankFactory;

public abstract class Tank{
    TankType tankType;
    float dpm;
    float weight;
    String nation;


    public void setTankType(TankType tt){
        tankType = tt;
    }

    public abstract String toString();
}

