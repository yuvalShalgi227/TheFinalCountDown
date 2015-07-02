package systemtest.nexperience.com.thefinalcountdown;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;


public class StartCountDown extends Activity {

    public Handler mHandler;
    TextView text1;
    static Integer count=11;

    public void setCount()
    {
        this.count=this.count-1;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        mHandler = new Handler();
        text1 = new TextView(this);
        text1 = (TextView) findViewById(R.id.text3);
        text1.setText("Countdown");

    }


    @Override
    public void onResume() {
        super.onResume();
        countDown();

    }

    private void countDown() {
        for(int i=0;i<=10;i++) {
            mHandler.postDelayed(mUpdateUITimerTask, i * 1000);
        }
        mHandler.postDelayed(mUpdateUITimerTask2, 11 * 1000);

    }

    @Override
    public void onPause() {
        super.onPause();
        mHandler.removeCallbacks(mUpdateUITimerTask);
    }

    private final Runnable mUpdateUITimerTask = new Runnable() {
        public void run() {
            // do whatever you want to change here, like:
            setCount();
            String numberAsString=Integer.toString(count);
            System.out.print(numberAsString);
            text1.setText(numberAsString);

        }
    };
    private final Runnable mUpdateUITimerTask2 = new Runnable() {
        public void run() {
            // do whatever you want to change here, like:
            text1.setText("Boom!");

        }
    };
}
