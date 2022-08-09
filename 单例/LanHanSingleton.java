public class LanHanSingleton{
    private static LanHanSingleton instance;

    private LanHanSingleton(){}

    public static LanHanSingleton getInstance() {
        if(instance==null){
            instance = new LanHanSingleton();
        }
        return instance;
    }

}