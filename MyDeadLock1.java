package DeadLock;

public class MyDeadLock1 {
    public void func1(){
        synchronized (test.obj1){
            synchronized (test.obj2){
//                System.out.println("hi");
            }
        }
    }
}
