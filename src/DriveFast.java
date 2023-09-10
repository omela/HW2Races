import java.util.*;
import java.util.concurrent.*;
public class DriveFast  implements Callable<Boolean> {
   private RaceCar car;
    CountDownLatch latch;
    static Timer speedtimer = new Timer();
   private RaceCar[] rc;
    public static void toRun(RaceCar[] rc, CountDownLatch latch) throws InterruptedException
    {
        Future[] f = new Future[10];
        ExecutorService service = Executors.newFixedThreadPool(10); // each car will have its own thread
        for (int i = 0; i < 10; i++)
        {
            f[i] = service.submit(new DriveFast(rc[i], latch));
        }
        latch.countDown(); //start of racing, all threads (cars) starting at once
        new CountDownTimer(20,rc); //this timer is set to 20 sec
        service.shutdownNow();
       for (int i = 0; i < 10; i++)
       {
               f[i].cancel(true);
       }
    }

    public DriveFast(RaceCar c, CountDownLatch latch)
    {
            this.car = c;
            this.latch = latch;
    }

        public void fastDerive ()
        {
            int i=0;
            System.out.println("Car has started  ->" + car.carName);
            speedtimer.schedule(car, 0, 1000);
        }

        @Override
        public Boolean call () throws Exception
        {
            latch.await();
            fastDerive();
            return true;
        }
}


