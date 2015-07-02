package systemtest.nexperience.com.thefinalcountdown;

import android.app.Activity;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
      
        setContentView(R.layout.activity_main);


        TextView t = new TextView(this);
        t = (TextView) findViewById(R.id.text2);
        t.setText("start");
        Button launchActivityTwoButton1 = (Button) findViewById(R.id.Button01);
        launchActivityTwoButton1.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(MainActivity.this, StartCountDown.class);
                startActivity(intent1);
            }
        });
    }





    }



