package design;

/**
 * 单例模式----双重检查锁
 * @author : xutinghao
 * @date : 2023/2/9 07:51
 * @description :
 */
public class Singleton {

    private volatile static Singleton singleton;

    private Singleton(){}

    public static Singleton getSingleton(){
        if(singleton == null){
            synchronized (Singleton.class){
                singleton = new Singleton();
            }
            return singleton;
        }
        return singleton;
    }
}
