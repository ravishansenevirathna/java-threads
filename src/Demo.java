/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : threads
 * Created date : 1/25/2024
 * Created time : 2:04 PM
 */
public class Demo {
    public static void main(String[] args) {
        //Custom thread started
        DemoThread demoThread=new DemoThread();
        demoThread.start();

        for (int i=0; i<10; i++){
            System.out.println("Inside the main thread");
        }

    }
}
