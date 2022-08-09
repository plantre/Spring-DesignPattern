public class TestDemo{
    public static void main(String[] args) {
        //这个就是静态手动代理，person这个接口的所有方法我们都要实现
        Person person = new Proxy(new Man());
        person.eat();
    }
}