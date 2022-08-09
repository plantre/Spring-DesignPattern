import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
/**
 * 这个是jdk的动态代理。只有有个接口，有个实现类，那么我们就可以代理
 * 他的原理就是使用了反射
 */
public class JdkDynamicProxy{
    public static void main(String[] args) {
        Person man = new Man();
        Object proxy = Proxy.newProxyInstance(man.getClass().getClassLoader(), man.getClass().getInterfaces(),
                new InvocationHandler(){

                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("动态代理的信息，你好啊");
                        Object result= method.invoke(man, args);
                        return result;
                    }
                });
        ((Person) proxy).eat();
    }
}