public class Proxy implements Person {
    //这个就是和装饰者模型的区别，装饰者模型是对Person这个接口进行的功能的拓展
    //但是代理就是单纯的代理某个类
    private Man man;

    public Proxy(Man man){
        this.man = man;
    }

    @Override
    public void eat() {
        man.eat();
    }

    @Override
    public void sleep() {
        man.sleep();
    }

}