import java.util.TimerTask;
import java.util.Timer;

// class that provides counting down
    public class CountDownTimer {
        //declare timer t
        Timer t;
        int i=0;
        public static Boolean finish;
    RaceCar[] c;
        public CountDownTimer(int seconds, RaceCar[] c)
        {
            t = new Timer();
            this.c=c;
            t.schedule(new rt(), seconds*1000);
        }

        //sub class that extends TimerTask
        class rt extends TimerTask
        {
            public void run()
            {
                System.out.println("\n Run is over..!!! 20 seconds are over -> Our winners are:  ");
                // c[1];
               for(int i=1;i<=20;i++){
                  Winner.winner(i,c);}
               t.cancel(); //stop the thread of timer
            }
        }
    }

