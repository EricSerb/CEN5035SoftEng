import java.util.concurrent.TimeUnit;

/**
 * Created by EricSerbousek on 9/15/2016.
 */

public class HelloWorld {
    public static void main(String[] args) throws InterruptedException {
        char[] loader = {'|', '\\', '-', '/', '|', '/', '-', '\\'};
        System.out.println("Hello Software Engineering World!");
        System.out.print("Never ending loader...");
        while(true){
            int i = 0;
            while(i < 4){
                System.out.print(loader[i]);
                try {
                    TimeUnit.SECONDS.sleep(2);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.print('\b');
                ++i;
            }
        }
    }
}
