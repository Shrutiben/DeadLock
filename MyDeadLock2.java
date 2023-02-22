package DeadLock;

public class MyDeadLock2 {
    public void func2(){
        synchronized (test.obj2){
            synchronized (test.obj1){
//                System.out.println("hello");
            }
        }
    }
}
