package jvm;

/**
 * @author : xutinghao
 * @date : 2023/2/13 13:06
 * @description :
 */
public class JavaVmStackSOF {

    private int stackLength = 1;

    public void stackLeak(){
        stackLength++;
        stackLeak();
    }

    public static void main(String[] args) {
        JavaVmStackSOF oom = new JavaVmStackSOF();
        try {
            oom.stackLeak();
        }catch (Throwable e){
            System.out.println("stack length==="+oom.stackLength);
            throw e;
        }
    }
}
