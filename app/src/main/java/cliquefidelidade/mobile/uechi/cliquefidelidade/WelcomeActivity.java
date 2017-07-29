package cliquefidelidade.mobile.uechi.cliquefidelidade;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public class WelcomeActivity extends AppCompatActivity {

    Timer timer = new  Timer();
    private TimerTask task;
    private final Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        ativaTimer();
    }

    private void ativaTimer(){

            task = new TimerTask() {
                @Override
                public void run() {
                    handler.post(new Runnable() {
                        @Override
                        public void run() {
                            setContentView(R.layout.activity_cadastro);
                            timer.cancel();
                        }
                    });
                }};
            timer.schedule(task,1000,1000);

        }
    }

