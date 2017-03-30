package it.unibo.studio.savini.gianni.lab05es2;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public static final String INTENT_ACTION_STRING = "it.unibo.savini.gianni.lab05es2.STRING";
    public static final String INTENT_ACTION_INT = "it.unibo.savini.gianni.lab05es2.INT";
    public static final String INTENT_ACTION_LIST = "it.unibo.savini.gianni.lab05es2.STRING";

    private TextView txvInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvInfo = (TextView) findViewById(R.id.text_info);
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction(INTENT_ACTION_STRING);
        intentFilter.addAction(INTENT_ACTION_INT);
        intentFilter.addAction(INTENT_ACTION_LIST);
        registerReceiver(receiver, intentFilter);
    }

    @Override
    protected void onPause() {
        super.onPause();
        unregisterReceiver(receiver);
    }

    private BroadcastReceiver receiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent.getAction().equals(INTENT_ACTION_STRING)) {

            } else if(intent.getAction().equals(INTENT_ACTION_INT)) {


            } else if(intent.getAction().equals(INTENT_ACTION_LIST)) {

            }
        }
    };

}
