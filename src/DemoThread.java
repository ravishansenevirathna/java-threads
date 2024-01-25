/**
 * Hi 👋, I'm ravishansenevirathna
 * Project : threads
 * Created date : 1/25/2024
 * Created time : 1:39 PM
 */
public class DemoThread extends Thread{
    @java.lang.Override
    public void run() {
        for (int i=0; i<10; i++){
            System.out.println("Inside the custom thread");
        }

    }

}
