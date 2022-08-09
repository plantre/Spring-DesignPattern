public class EHanSingleton{
    //new一个实例对象
    private static EHanSingleton instance = new EHanSingleton();

    //构建一个私有构造方法
    private EHanSingleton(){}

    public static EHanSingleton getInstance() {
        return instance;
    }
}